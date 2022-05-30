package com.engeto.project1;

//public class State implements Comparable<State> {
//    String abbrev;
//    String name;
//    double vat;
//    double vatReduced;
//    boolean useParking;
//
//    public State(String abbrev, String name, double vat, double vatReduced, boolean useParking) {
//        this.abbrev = abbrev;
//        this.name = name;
//        this.vat = vat;
//        this.vatReduced = vatReduced;
//        this.useParking = useParking;
//    }
//
//    public String getAbbrev() {
//        return abbrev;
//    }
//
//    public void setAbbrev(String abbrev) {
//        this.abbrev = abbrev;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getVat() {
//        return vat;
//    }
//
//    public void setVat(double vat) {
//        this.vat = vat;
//    }
//
//    public double getVatReduced() {
//        return vatReduced;
//    }
//
//    public void setVatReduced(double vatReduced) {
//        this.vatReduced = vatReduced;
//    }
//
//    public boolean isUseParking() {
//        return useParking;
//    }
//
//    public void setUseParking(boolean useParking) {
//        this.useParking = useParking;
//    }
//
//    @Override
//    public String toString() {
//        return "["+abbrev+"] "+name+": "+vat+" %, red.: "+vatReduced+" %, "+useParking;
//    }
//
//    @Override
//    public int compareTo(State another) {
//        Double vatAsDouble = vat;
//        Double anotherVat = another.vat;
//        return vatAsDouble.compareTo(anotherVat);
//    }
//}