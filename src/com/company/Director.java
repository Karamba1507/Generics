package com.company;

public class Director {

    String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName=fullName;
    }

    @Override
    public String toString() {
        return "Director: |" +
                "Full name: |" + fullName + " | ";
    }
}
