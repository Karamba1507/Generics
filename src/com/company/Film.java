package com.company;

import java.util.Arrays;

public class Film implements Comparable<Film> {

    String name;
    int year;
    String description;
    Director director;
    Cast[] cast;






    public Film(String name, int year, String description, String director, String fullName) {
        this.name=name;
        this.year=year;
        this.description=description;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year=year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description=description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director=director;
    }

    public Cast[] getCast() {
        return cast;
    }

    public void setCast(Cast[] cast) {
        this.cast=cast;
    }

    @Override
    public String toString() {
        return "Film name: " +  name + " | " +
                 year +" year |"+ description + " | " +
                 director +
                 Arrays.toString(cast);
    }

    @Override
    public int compareTo(Film o) {
        return 0;
    }
}

