/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.datagenerate.generator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author feherlaszlo
 */
public class Generator {
    
//  private String insert           = "INSERT INTO Pedagogus (nev, szuletesi_datum ) VALUES (";
    private String insert           = "INSERT INTO kompetenciafejlesztes (kompetencia, 	kompetencianeve, pedagogus_id ) VALUES (";
    private String nev              = "Anonymus";
    private String szuletesi_datum  = "1980.01.01";
    private int[] kompetencia       = {1,2,3,4,5,6,7,8};
    private String[] kompetenciaNev = {"kompetencia1",
                                       "kompetencia2",
                                       "kompetencia3",
                                       "kompetencia4",
                                       "kompetencia5",
                                       "kompetencia6",
                                       "kompetencia7",
                                       "kompetencia8"};
    
    public ArrayList<String> gen(long dataCount){
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        ArrayList<String> insertList = new ArrayList();
        //generálni kell 1-8 ig egy számot
        
        Random rand = new Random();
        
        
        for (int i = 0; i < dataCount; i++) {
            //insertList.add(insert+"'"+nev+i+"','"+genDate(1980 , 1998).format(formatter)+"');");
            int count = rand.nextInt(5);
            for (int j = 0; j < count; j++) {
                insertList.add(insert+"'"+(j+1)+"','"+kompetenciaNev[j]+"',"+i+");");
            }
        }
        return insertList;
    }
    
    /**
     * @param fromYear
     * @param toYear
     * @return 
     * 
     * 
     * 
     * 
     */
    
    public LocalDate genDate(int fromYear , int toYear){
        Random rand = new Random();
        int  year   = rand.nextInt(toYear-fromYear)+(fromYear);
        int  month  = rand.nextInt(12) + 1;
        int  day    = rand.nextInt(28) + 1;
        return LocalDate.of(year, month, day);
    }
    
    
    
    
    
    
    
}
