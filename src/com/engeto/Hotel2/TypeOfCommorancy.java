package com.engeto.Hotel2;

public enum TypeOfCommorancy {
    WORK("Pracovni"),
    RECREATION("Rekreacni");

    final String description;

    TypeOfCommorancy(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
