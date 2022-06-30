package com.company.comparators;

import com.company.Director;
import java.util.Comparator;

public class MoveDirectorNameComparator implements Comparator<Director> {

    @Override
    public int compare(Director director_1, Director director_2) {
        int result = director_1.getFullName().compareTo(director_2.getFullName());
        return result;
    }
}
