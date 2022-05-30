package com.engeto;

public enum TypeOfStay {
        RECREATIONAL("rekreacny"),
        WORKING("pracovny");

        String descr;

        TypeOfStay(String descr) {
            this.descr = descr;
        }
        @Override
        public String toString() {
            return descr;
        }
}
