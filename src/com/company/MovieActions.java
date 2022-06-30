package com.company;

import com.company.comparators.MovieNameComparator;
import com.company.comparators.MovieYearComparator;

import java.util.*;

public class MovieActions {

    private Movi movi;
    private Cast cast;

    public MovieActions(Movi movi) {
        this.movi=movi;
        this.cast = cast;
    }

    Film[] filmByName(String filmName) {

        String searchName=filmName.toLowerCase();

        Film[] result=new Film[movi.getMovies().length];
        int index=0;

        for (Film film : movi.getMovies()) {

            if (film.getName().toLowerCase().contains(searchName)) {
                result[index]=film;
                index++;
            }

            System.out.println(film);
        }

        return result;

    }

    Cast[] actorByName(String actorName) {

        String searchName=actorName.toLowerCase();

        Cast[] result=new Cast[movi.getCasts().length];
        int index=0;

        for (Cast cast : cast.getCasts()) {

            if (cast.getFullName().toLowerCase().equals(searchName)) {
                result[index]=cast;
                index++;
            }

            System.out.println(cast);
        }

        return result;
    }



    public void sortByYear() {

        List<Film> list=Arrays.asList(movi.getMovies());

        for (Film film : list) {
            System.out.print(film.getYear() + " | ");
        }

        System.out.println("====================");

        MovieYearComparator movieYearComparator=new MovieYearComparator();
        list.sort(movieYearComparator);

        for (Film film : list) {
            System.out.print(film.getYear() + " | ");
        }
    }


    public void sortByName() {
        List<Film> list2=Arrays.asList(movi.getMovies());

        for (Film film : list2) {
            System.out.println(film.getName() + " | ");
        }

        System.out.println("====================");

        MovieNameComparator movieNameComparator=new MovieNameComparator();
        list2.sort(movieNameComparator);

        for (Film film : list2) {
            System.out.println(film.getName() + " | ");
        }
    }


    public void sortByDirectorName() {
        List<Film> list3=Arrays.asList(movi.getMovies());

        for (Film film : list3) {
            System.out.println(film.getDirector().fullName + " | ");
        }

        System.out.println("====================");

        MovieNameComparator movieNameComparator=new MovieNameComparator();
        list3.sort(movieNameComparator);

        for (Film film : list3) {
            System.out.println(film.getDirector().fullName + " | ");
        }
    }


    public static void main(String[] args) {

        Movi movi=ReadMovies.readString();

        MovieActions movieActions=new MovieActions(movi);

        Movi film=ReadMovies.readString();

        movieActions.filmByName("");
    }
}
