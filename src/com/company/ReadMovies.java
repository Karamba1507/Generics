package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadMovies {

    private static final Gson gson=new GsonBuilder().setPrettyPrinting().create();
    private static final Path path=Paths.get("./move.json");

    public static Movi readString() {
        String json;
        try {
            json=Files.readString(path);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Movi movi=gson.fromJson(json, Movi.class);
        return movi;
    }

    public void readJsonCast() {
        List<Cast> castList=new ArrayList<>();
        castList.add(new Cast("Michael Sheen", "Raphaela"));
        castList.add(new Cast("David Tenant", "Crowley"));
        castList.add(new Cast("Orlando Bloom", "Detective"));
        castList.add(new Cast("Some Girl", "Angry Fae"));
        castList.add(new Cast("David Tenant", "Barty Crouch Junior"));
        castList.add(new Cast("Daniel Radcliffe", "Harry Potter"));
        String jsonStr=new Gson().toJson(castList);
        System.out.print(jsonStr);
    }
}
