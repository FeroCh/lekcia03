package com.engeto;

import java.util.logging.Logger;

public class MainExceptionBasics {

    private static Logger logger =  Logger.getLogger("com.engeto.exceptions");

    public static void main(String[] args) {

        try {
            codeWithException();
        } catch (Exception ex) {
            // Postup řešení výjimečeného stavu...
            ex.printStackTrace();
        }
    }
    private static void codeWithException() {
        throw new RuntimeException("Test výjimky!");
    }
}
