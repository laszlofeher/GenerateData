/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.datagenerate.model;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author feherlaszlo
 */
public class GenerateTypeList extends DefaultComboBoxModel{
    
    private ArrayList<GenerateType> typeList = new ArrayList<>();

    public GenerateTypeList() {
        this.typeList.add(new GenerateType("Generate date from to"));
        this.typeList.add(new GenerateType("Generate month"));
        this.typeList.add(new GenerateType("Generate day"));
        this.typeList.add(new GenerateType("Generate lastname"));
        this.typeList.add(new GenerateType("Generate firstname"));
        this.typeList.add(new GenerateType("Generate from list"));
    }

    @Override
    public int getSize() {
        return this.typeList.size();
    }

    @Override
    public Object getElementAt(int i) {
        return this.typeList.get(i);
    }

   
}