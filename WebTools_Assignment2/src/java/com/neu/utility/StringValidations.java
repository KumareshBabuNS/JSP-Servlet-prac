/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.utility;

/**
 *
 * @author richa
 */
public class StringValidations {

    public static String sanitizeInput(String input) {
        try {
            if (input.length() == 0) {
                return "";

            } else {

                input = input.replaceAll("<", "");
                input = input.replaceAll(">", "");

                input = input.replaceAll("\\%", "");
                input = input.replaceAll(";", "");
                input = input.replaceAll("_", "");
                input = input.replaceAll("\\*", "");
                return input;

            }

        } catch (Exception e) {
            System.err.println("Exception occured in method sanitizeInput with message:" + e.getMessage());
            //e.printStackTrace();
            return "";
        }

    }

}
