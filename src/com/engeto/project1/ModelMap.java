package com.engeto.project1;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

//public class ModelMap {
//    HashMap<Double, State> stateVats = new HashMap<>();
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
//                stateVats.put(vat, state);
//            }
//            scanner.close();
//        } catch (Exception ex) {
//            System.err.println("Error while reading file: "+filename+"!");
//            System.err.println("Error message: "+ex.getLocalizedMessage());
//        }
//    }
//
//    public TreeMap<Double, State> getSorted() {
//        TreeMap<Double, State> result = new TreeMap<>(stateVats);
//        return result;
//    }
//}