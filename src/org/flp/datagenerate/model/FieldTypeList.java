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
public class FieldTypeList  extends DefaultComboBoxModel{
    private ArrayList<FieldType> typeList = new ArrayList<>();

    public FieldTypeList() {
        this.typeList.add(new FieldType("TINYINT","1 bájtos integer, signed tartomány -128 és 127 között, unsigned tartomány 0 és 255 között"));
        this.typeList.add(new FieldType("SMALLINT","2 bájtos integer, signed tartomány -32 768 és 32 767 között, unsigned tartomány 0 és 65 535 között"));
        this.typeList.add(new FieldType("MEDIUMINT","3 bájtos integer, signed tartomány -8 388 608 és 8 388 607 között, unsigned tartomány 0 és 16 777 215 között"));
        this.typeList.add(new FieldType("INT","4 bájtos integer, signed tartomány -2 147 483 648 és 2 147 483 647 közt, unsigned tartomány 0 és 4 294 967 295 közt"));
        this.typeList.add(new FieldType("BIGINT","8 bájtos integer, signed tartomány -9 223 372 036 854 775 808 és 9 223 372 036 854 775 807 között, unsigned tartomány 0 és 18 446 744 073 709 551 615 között"));
        this.typeList.add(new FieldType("DECIMAL","Tizedestört szám - az egész jegyek maximális száma 65 (alapértelmezett a 10), a törtek maximális száma 30 (alapértelmezett a 0)"));
        this.typeList.add(new FieldType("FLOAT","Small floating-point szám, értéktartománya -3.402823466E+38 és -1.175494351E-38 között, 0, 1.175494351E-38 és 3.402823466E+38 között"));
        this.typeList.add(new FieldType("DOUBLE","Double-precision floating-point szám, értéktartománya -1.7976931348623157E+308 és -2.2250738585072014E-308 között, 0, 2.2250738585072014E-308 és 1.7976931348623157E+308 között"));
        this.typeList.add(new FieldType("REAL","DOUBLE-lal egyenértékű (kivéve: REAL_AS_FLOAT SQL módban a FLAT-tal egyenértékű)"));
        this.typeList.add(new FieldType("BIT","Bit-field típus (M), értékenként M darab bit (alapértelmezett: 1, maximum 64)"));
        this.typeList.add(new FieldType("BOOLEAN","TINYINT(1)-gyel egyenértékű, zéró esetén false, nemzéró esetén true érték"));
        this.typeList.add(new FieldType("SERIAL","BIGINT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE"));
        this.typeList.add(new FieldType("DATE","Egy dátum, a támogatott tartomány 1000-01-01 és 9999-12-31 között van"));
        this.typeList.add(new FieldType("DATETIME","Dátum és idő kombináció, értéktartomány 1000-01-01 00:00:00 és 9999-12-31 23:59:59 között"));
        this.typeList.add(new FieldType("TIMESTAMP","Időbélyeg, tartomány 1970-01-01 00:00:01 UTC és 2038-01-09 03:14:07 UTC között, másodpercek számaként tárolva a kezdettől"));
        this.typeList.add(new FieldType("TIME","Egy idő, a tartomány -838:59:59 és 838:59:59 között van"));
        this.typeList.add(new FieldType("YEAR","4 vagy 2 karakteres évszám, megengedett értékei 70 (1970) és 69 (2069), vagy 1901 és 2155 között és 0000"));
        this.typeList.add(new FieldType("CHAR","Fix hosszúságú (0-255, alapértelmezett 1) sztring, amely szóközökkel van jobbról kitöltve a meghatározott hossz eléréséhez"));
        this.typeList.add(new FieldType("VARCHAR","Változó hosszúságú (0-65,535) sztring, a tényleges maximális hossz függ a maximális sormérettől"));
        this.typeList.add(new FieldType("TINYTEXT","TEXT oszlop, maximális hossz 255 karakter, tárolása 1 bájt előtaggal, amely az érték hosszát tartalmazza bájtokban"));
        this.typeList.add(new FieldType("TEXT","TEXT oszlop maximum 65 535 karakterhosszúsággal, 2 bájtos előtaggal tárolva, amely az érték hosszát tartalmazza bájtokban"));
        this.typeList.add(new FieldType("MEDIUMTEXT","TEXT oszlop 16 777 215 maximális hosszúsággal, három bájt előtaggal tárolva, amely az érték hosszát tartalmazza bájtokban"));
        this.typeList.add(new FieldType("LONGTEXT","TEXT oszlop maximum 4 294 967 295 vagy 4 GB hosszal, 4 bájtos előtaggal tárolva, amely az érték hosszát tartalmazza bájtokban"));
        this.typeList.add(new FieldType("BINARY","Hasonló a CHAR típushoz, de bináris bájtláncot tárol nem-bináris karakterláncok helyett"));
        this.typeList.add(new FieldType("VARBINARY","Hasonló a VARCHAR típushoz, de bináris bájtláncot tárol nem-bináris karakterláncok helyett"));
        this.typeList.add(new FieldType("TINYBLOB","BLOB oszlop maximális hossza 255 (2 ^ 8 - 1) bájt, tárolt érték hosszát jelző egybájtos előtaggal"));
        this.typeList.add(new FieldType("MEDIUMBLOB","BLOB-oszlop 16 777 215 maximális hosszal (2 ^ 24 - 1), tárolt érték hosszát jelző három byte-os előtaggal"));
        this.typeList.add(new FieldType("BLOB","BLOB oszlop maximális hossza a 65 535 (2 ^ 16 - 1) bájt, tárolt érték hosszát jelző két byte-os előtaggal"));
        this.typeList.add(new FieldType("LONGBLOB","BLOB oszlop 4 294 967 295 vagy 4 GB maximális hosszal (2 ^ 32 - 1), tárolt érték hosszát jelző négybájtos előtaggal"));
        this.typeList.add(new FieldType("ENUM","Felsorolás, legfeljebb 65 535 értékkel vagy a speciális '' hibaértékkel"));
        this.typeList.add(new FieldType("SET","Egyetlen érték egy 64 tagú készletből"));
        this.typeList.add(new FieldType("GEOMETRY","Típus, amely bármely típus geometriáját tudja tárolni"));
        this.typeList.add(new FieldType("POINT","Pont 2 dimenziós pozícióban"));
        this.typeList.add(new FieldType("LINESTRING","Görbe lineáris interpolációval a pontjai között"));
        this.typeList.add(new FieldType("POLYGON","Egy sokszög"));
        this.typeList.add(new FieldType("MULTIPOINT","Pontok összessége"));
        this.typeList.add(new FieldType("MULTILINESTRING","Görbék összessége lineáris interpolációval a pontjaik közt"));
        this.typeList.add(new FieldType("MULTIPOLYGON","Sokszögek összessége"));
        this.typeList.add(new FieldType("GEOMETRYCOLLECTION","Bármely típusú geometriai tárgyak összessége"));
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
