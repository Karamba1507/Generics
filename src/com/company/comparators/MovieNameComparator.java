package com.company.comparators;

import com.company.Film;

import java.util.Comparator;

public class MovieNameComparator implements Comparator<Film> {

    @Override
    public int compare(Film film_1, Film film_2) {

        int result = film_1.getName().compareTo(film_2.getName());
        return result;
    }
}
