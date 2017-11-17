/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.datagenerate.jsonhandler;

/**
 *
 * @author feherlaszlo
 */
public class TableField {
    private String  columnName;
    private String  type;
    private int     length;
    private int     precizion;
    private String  generatetype;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPrecizion() {
        return precizion;
    }

    public void setPrecizion(int precizion) {
        this.precizion = precizion;
    }

    public String getGeneratetype() {
        return generatetype;
    }

    public void setGeneratetype(String generatetype) {
        this.generatetype = generatetype;
    }

    @Override
    public String toString() {
        return "columname:" + columnName + ", type:" + type + ", length:" + length + ", precizion:" + precizion + ", generatetype:" + generatetype;
    }
    
    
    
    
    
    
    
    
}