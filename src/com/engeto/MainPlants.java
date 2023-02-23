package com.engeto;

import java.time.LocalDate;


public class MainPlants {
    public static void main(String[] args) throws PlantException {
        PlantList plant = new PlantList();
        try {
            plant = PlantList.importFromFile(PlantSettings.getFilename(), PlantSettings.getDelimiter());
        } catch (PlantException e) {
            System.err.println("Chyba při čtení souboru " + PlantSettings.getFilename()
                    + ":\n" + e.getLocalizedMessage());
        }

        plant.addPlantList(new Plant("Amarila v obyvaku"));
        plant.addPlantList(new Plant("Bazalka v kuchyni", 3, LocalDate.now()));
        plant.removePlantList(2);

        plant.exportToFile(PlantSettings.outFilename(),PlantSettings.getDelimiter());

        try {
            plant = PlantList.importFromFile(PlantSettings.outFilename(), PlantSettings.getDelimiter());
        } catch (PlantException e) {
            System.err.println("Chyba při čtení souboru " + PlantSettings.getFilename()
                    + ":\n" + e.getLocalizedMessage());
        }

        try {
            plant = PlantList.importFromFile("kvetiny-spatne-datum.txt", PlantSettings.getDelimiter());
        } catch (PlantException e) {
            System.err.println("Chyba při čtení souboru " + "kvetiny-spatne-datum.txt"
                    + ":\n" + e.getLocalizedMessage());
        }

        try {
            plant = PlantList.importFromFile("kvetiny-spatne-frekvence.txt", PlantSettings.getDelimiter());
        } catch (PlantException e) {
            System.err.println("Chyba při čtení souboru " + "kvetiny-spatne-frekvence.txt"
                    + ":\n" + e.getLocalizedMessage());
        }


    }
}