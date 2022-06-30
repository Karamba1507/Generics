package com.company.comparators;

import com.company.Film;

import java.util.Comparator;

public class MovieYearComparator implements Comparator<Film> {

    @Override
    public int compare(Film film_1, Film film_2) {

        if (film_1.getYear() > film_2.getYear()) {
            return 1;
        } else if (film_1.getYear() < film_2.getYear()) {
            return -1;
        } else {
            return 0;
        }
    }
}
