package com.engeto.project1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//public class Model {
//    ArrayList<State> stateVats = new ArrayList<>();
//
//    public void readFromFile(String filename) {
//        stateVats.clear();
//        try {
//            Scanner scanner = new Scanner(new File(filename));
//            while (scanner.hasNext()) {
//                String abbrev = scanner.next();
//                String name = scanner.next();
//                double vat = scanner.nextDouble();
//                double vatReduced = scanner.nextDouble();
//                boolean useParking = scanner.nextBoolean();
//                State state = new State(abbrev, name, vat, vatReduced, useParking);
//                // Debugging only: System.out.println("Read: "+state.toString());
//                stateVats.add(state);
//            }
//            scanner.close();
//        } catch (Exception ex) {
//            System.err.println("Error while reading file: "+filename+"!");
//            System.err.println("Error message: "+ex.getLocalizedMessage());
//        }
//    }
//
//    public ArrayList<State> findStatesWithVatOver(double limit) {
//        ArrayList<State> result = new ArrayList<>();
//        for (State state : stateVats) {
//            if (state.vat > limit) {
//                result.add(state);
//            }
//        }
//        return result;
//    }
//
//    public ArrayList<State> getStatesSorted() {
//        ArrayList<State> result = new ArrayList<>(stateVats);
//        Collections.sort(result);
//        return result;
//    }
//}