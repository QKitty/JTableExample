/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamodel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class represents a "Person" in the system. It also encapsulates a list
 * of the addresses the person has lived at.
 * @author Roy
 */
public class Person {
    
//<editor-fold defaultstate="collapsed" desc="Attributes">
    private int id;
    private String fName;
    private String lName;
    private LocalDate birthday;
    private List<Address> placesPersonHasLived;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Constructors">
    public Person(){
        id = 0;
        fName = "UNKNOWN";
        lName = "UNKNOWN";
        birthday = LocalDate.now();
        placesPersonHasLived = new ArrayList<>();
    }
    
    public Person(int newId, String newFName, String newLName, LocalDate newBirthday){
        this();
        id = newId;
        fName = newFName;
        lName = newLName;
        birthday = newBirthday;
    }
    
    public Person(int newId, String newFName, String newLName, LocalDate newBirthday, List<Address> newAddrList){
        this(newId, newFName, newLName, newBirthday);
        placesPersonHasLived.addAll(newAddrList);
        Collections.sort(placesPersonHasLived);
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Accessor methods">
    public int getId() {
        return id;
    }
    
    public void setId(int id) {    
        this.id = id;
    }

    public String getfName() {
        return fName;
    }
    
    public void setfName(String fName) {
        this.fName = fName;
    }
    
    public String getlName() {
        return lName;
    }
    
    public void setlName(String lName) {
        this.lName = lName;
    }
    
    public LocalDate getBirthday() {
        return birthday;
    }
    
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    
    public List<Address> getPlacesPersonHasLived() {
        return new ArrayList(placesPersonHasLived);
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Class Methods">
    public boolean addAddress(Address newAddress){
        boolean result = placesPersonHasLived.add(newAddress);
        if(result){
            Collections.sort(placesPersonHasLived);
        }
        return result;
    }
    
    public boolean removeAddress(Address oldAddress){
        boolean result = placesPersonHasLived.remove(oldAddress);
        if(result){
            Collections.sort(placesPersonHasLived);
        }
        return result;
    }
    
    public void clearAddressList(){
        placesPersonHasLived.clear();
    }
    
    @Override
    public String toString() {
        return this.lName + ", " + this.fName + " (ID: " + this.id + ")";
    }
//</editor-fold>
}
