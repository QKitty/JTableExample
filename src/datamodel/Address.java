/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamodel;

import java.time.LocalDate;

/**
 * This class represents a persons address
 * @author Roy
 */
public class Address implements Comparable<Address>{
    
//<editor-fold defaultstate="collapsed" desc="Class Attributes">
    private int id;
    private String addressLine1;
    private String addressLine2;
    private String town;
    private String county;
    private String postcode;
    private LocalDate movedIn;
    private LocalDate movedOut;
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Constructors">
    public Address(){
        id = 0;
        addressLine1 = "UNKNOWN";
        addressLine2 = "UNKNOWN";
        town = "UNKNOWN";
        county = "UNKNOWN";
        postcode = "UNKNOWN";
        movedIn = LocalDate.now();
        movedOut = null;
    }
    
    public Address(int newId, String line1, String line2, String newTown, String newCounty, String newPostcode, LocalDate dateMovedIn){
        this();
        id = newId;
        addressLine1 = line1;
        addressLine2 = line2;
        town = newTown;
        county = newCounty;
        postcode = newPostcode;
        movedIn = dateMovedIn;
    }
    
    public Address(int newId, String line1, String line2, String newTown, String newCounty, String newPostcode, LocalDate dateMovedIn, LocalDate dateMovedOut){
        this(newId, line1, line2, newTown, newCounty, newPostcode, dateMovedIn);
        movedOut = dateMovedOut;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Accessors">
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getAddressLine1() {
        return addressLine1;
    }
    
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    
    public String getAddressLine2() {
        return addressLine2;
    }
    
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    
    public String getTown() {
        return town;
    }
    
    public void setTown(String town) {
        this.town = town;
    }
    
    public String getCounty() {
        return county;
    }
    
    public void setCounty(String county) {
        this.county = county;
    }
    
    public String getPostcode() {
        return postcode;
    }
    
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    
    public LocalDate getMovedIn() {
        return movedIn;
    }
    
    public void setMovedIn(LocalDate movedIn) {
        this.movedIn = movedIn;
    }
    
    public LocalDate getMovedOut() {
        return movedOut;
    }
    
    public void setMovedOut(LocalDate movedOut) {
        this.movedOut = movedOut;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Comparable interface implementation">
    @Override
    public int compareTo(Address o) {
        int result = 0;
        if(null != o){
            LocalDate movedIntoO = o.getMovedIn();
            if(movedIn.isAfter(movedIntoO)){
                //This address should go ABOVE O in the table
                result = -1;
            }else{
                //This address should go BELOW O in the table
                result = 1;
            }
        }
        return result;
    }
//</editor-fold>
    
    
}
