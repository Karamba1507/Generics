package com.company;

import java.util.Arrays;

public class Cast {

    String fullName;
    String role;


    @Override
    public String toString() {
        return "Cast: | " + fullName + " | " +
                "role: |" + role + " | ";
    }


    private Cast[] casts;

    public Cast(String fullName, String role) {
        this.fullName=fullName;
        this.role = role;
    }

    public Cast[] getCasts() {
        return casts;
    }

    public void setCasts(Cast[] casts) {
        this.casts = casts;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName=fullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role=role;
    }
}
