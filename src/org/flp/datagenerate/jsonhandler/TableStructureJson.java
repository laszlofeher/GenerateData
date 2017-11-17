/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.datagenerate.jsonhandler;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author feherlaszlo
 */
public class TableStructureJson {
    private Table table = new Table();
    private ArrayList<TableField> tableFields = new ArrayList();
    
    /**
     * 
     * @param fileName 
     */
    public void save(String fileName){
        this.createTableStructure(this.table.getTableName(), this.tableFields, fileName);
    }
    /**
     * 
     * @param fileName 
     */
    public void load(String fileName){
        getTableStructure(fileName);
    }
    /**
     * 
     * @return 
     */
    public Table getTable() {
        return table;
    }

    /**
     * 
     * @param table 
     */
    public void setTable(Table table) {
        this.table = table;
    }

    /**
     * 
     * @return 
     */
    public ArrayList<TableField> getTableFields() {
        return tableFields;
    }

    /**
     * 
     * @param tableFields 
     */
    public void setTableFields(ArrayList<TableField> tableFields) {
        this.tableFields = tableFields;
    }

    /**
     * 
     * @param fileName 
     */
    private void getTableStructure(String fileName){
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(fileName));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);
            String tableName = (String) jsonObject.get("tablename");
            JSONArray msg = (JSONArray) jsonObject.get("structure");
            Iterator<TableField> iterator = msg.iterator();
            while (iterator.hasNext()) {
                this.tableFields.add(iterator.next());
            }
            this.table.setTableName(tableName);
            this.table.addAll(tableFields);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TableStructureJson.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ParseException ex) {
            Logger.getLogger(TableStructureJson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * 
     * 
     * @param tableName
     * @param tableFieldlist
     * @param fileName 
     */
    
    private void createTableStructure(String tableName, ArrayList<TableField> tableFieldlist, String fileName){
        JSONObject obj = new JSONObject();
        obj.put("tablename", tableName);
        JSONArray list = new JSONArray();
        for (TableField tableField : tableFieldlist) {
            Map m = new HashMap();
            m.put("columnname", tableField.getColumnName());
            m.put("type", tableField.getType());
            m.put("length", tableField.getLength());
            m.put("precizion", tableField.getPrecizion());
            m.put("generatetype", tableField.getType());
            list.add(m);
        }
        String jsonString = JSONValue.toJSONString(list);
        obj.put("structure", jsonString);

        try (FileWriter file = new FileWriter(fileName)) {
            file.write(obj.toJSONString().replace("\\", "").replace("\"[", "[").replace("]\"", "]"));
            file.flush();
        } catch (IOException ex) {
            Logger.getLogger(TableStructureJson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public static void main(String[] args) {
        ArrayList<TableField> alist = new ArrayList();
        TableField tf1 = new  TableField();
        tf1.setColumnName("test1");
        tf1.setLength(10);
        tf1.setPrecizion(2);
        tf1.setType("dfsd");
        alist.add(tf1);
       
        TableField tf2 = new  TableField();
        tf2.setColumnName("test2");
        tf2.setLength(23);
        tf2.setPrecizion(3);
        tf2.setType("jkhjkhj");
        alist.add(tf2);
        //createTableStructure("tablanev",alist,"valami.json");
        //getTableStructure("valami.json");
    }
}