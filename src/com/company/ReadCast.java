package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadCast {

    private static final Gson gson=new GsonBuilder().setPrettyPrinting().create();
    private static final Path path=Paths.get("./move.json");

    public static Cast readString() {
        String json;
        try {
            json=Files.readString(path);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Cast cast=gson.fromJson(json, Cast.class);
        return cast;
    }
}
