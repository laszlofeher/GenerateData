/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.datagenerate.generator;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author feherlaszlo
 */

public class DateGenerator {
    public static LocalDate genDate(int fromYear , int toYear){
        Random rand = new Random();
        int  year   = rand.nextInt(toYear-fromYear)+(fromYear);
        int  dayOfYear = rand.nextInt(364)+1;
        //int  month  = rand.nextInt(12) + 1;
        //int  day    = rand.nextInt(28) + 1;
        return LocalDate.ofYearDay(year, dayOfYear);
    }

    public static int genYear(int fromYear , int toYear){
        Random rand = new Random();
        return rand.nextInt(toYear-fromYear)+(fromYear);
    }
    
    public static int genMonth(){
        Random rand = new Random();
        return rand.nextInt(11)+1;
    }
    
    public static int genDay(int month){
        Random rand = new Random();
        switch (month) {
            case 1:
                return rand.nextInt(30)+1;
            case 2:
                return rand.nextInt(27)+1;
            case 3:
                return rand.nextInt(30)+1;
            case 4:
                return rand.nextInt(29)+1;
            case 5:
                return rand.nextInt(30)+1;
            case 6:
                return rand.nextInt(27)+1;
            case 7:
                return rand.nextInt(30)+1;
            case 8:
                return rand.nextInt(30)+1;
            case 9:
                return rand.nextInt(29)+1;
            case 10:
                return rand.nextInt(30)+1;
            case 11:
                return rand.nextInt(29)+1;
            case 12:
                return rand.nextInt(30)+1;
            default:
                return -1;
        }
    }
}
