/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.datagenerate.jsonhandler;

import java.util.ArrayList;

/**
 *
 * @author feherlaszlo
 */
public class Table {
    private String tableName ;
    private ArrayList<TableField> fieldList = new ArrayList();

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ArrayList<TableField> getFieldList() {
        return fieldList;
    }

    public void setFieldList(ArrayList<TableField> fieldList) {
        this.fieldList = fieldList;
    }
   
    public void addTableField(TableField tf){
        this.fieldList.add(tf);
    }
    
    public TableField getTableField(int index){
        if(index < this.fieldList.size()){
            return this.fieldList.get(index);
        }
        return null;
    }
    
    public int getTableFieldsCount(){
        return this.fieldList.size();
    }
    
    public void addAll(ArrayList<TableField> tflist){
        this.fieldList.addAll(tflist);
    }
}