package com.engeto;

public enum type {
    employee,
    contractor,
    quest;

    type() {
    }

    @Override
    public String toString() {
        return "type{}";
    }
}
