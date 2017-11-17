/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.datagenerate.model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author feherlaszlo
 */
public class FieldType {
    private String name;
    private String memo;
    private ArrayList<GenerateType> generateTypeList;
    private int length;
    private int precision;
    
    
    
    public FieldType() {
    }

    public FieldType(String name, String memo) {
        this.name = name;
        this.memo = memo;
    }
    
    public FieldType(String name, String memo, GenerateType... generateTypes) {
        this.name = name;
        this.memo = memo;
        this.generateTypeList.addAll(Arrays.asList(generateTypes));
    }
    
    public FieldType(String name, String memo, int length, int precision, GenerateType... generateTypes) {
        this.name = name;
        this.memo = memo;
        this.generateTypeList.addAll(Arrays.asList(generateTypes));
        this.length = length;
        this.precision = precision;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public ArrayList<GenerateType> getGenerateTypeList() {
        return generateTypeList;
    }

    public void setGenerateTypeList(ArrayList<GenerateType> generateTypeList) {
        this.generateTypeList = generateTypeList;
    }
    
    
}