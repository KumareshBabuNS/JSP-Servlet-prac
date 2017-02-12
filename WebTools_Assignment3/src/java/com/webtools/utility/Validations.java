/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webtools.utility;

/**
 *
 * @author richa
 */
public class Validations {

    public boolean isValid(String a, String b, String c, String d, String e) {
        boolean flag = true;
        try {

            int yr = Integer.parseInt(e);

            if ("".equals(a)) {
                flag = false;

            }
            if ("".equals(b)) {

                flag = false;
            }
            if ("".equals(c)) {
                flag = false;
            }
            if ("".equals(d)) {
                flag = false;
            }
            if (yr == 0) {
                flag = false;
            }

        } catch (Exception ex) {
            flag = false;
            System.out.println("exception occurred in isValid(): " + ex.getMessage());
            ex.printStackTrace();

        } finally {
            return flag;

        }

    }

}
