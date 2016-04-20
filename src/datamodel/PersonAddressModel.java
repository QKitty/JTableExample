/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamodel;

import guiforms.AddressTableWindow;
import guiforms.EditAddressDialog;
import guiforms.EditPersonDialog;
import guiforms.IRefreshable;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.table.TableModel;
import jtablecellrenderers.AddressTableModel;
import jtablecellrenderers.PersonTableModel;

/**
 * This is the data model "wrapper" class that will control access to the model
 *
 * @author Roy
 */
public class PersonAddressModel {

    private final List<Person> myPeople;

    public PersonAddressModel() {
        myPeople = new ArrayList<>();
        createTestData();
    }

    public TableModel getPeopleTableModel(IRefreshable aTargetToRefresh) {
        PersonTableModel model = null;
        int noOfRows = myPeople.size();
        int noOfColumns = 6; //There are 4 pieces of data in the Person class plus room for edit button and a view addresses button
        String[] headings = {"ID No:", "First Name", "Last Name", "Birthday:", "Edit Person:", "View Addresses:"};
        Object[][] data = new Object[noOfRows][noOfColumns];
        int x = 0;
        for (Person currPerson : myPeople) {
            data[x][0] = currPerson;
            data[x][1] = currPerson;
            data[x][2] = currPerson;
            data[x][3] = currPerson;
            data[x][4] = PersonAddressModel.createEditButton(currPerson, aTargetToRefresh);
            data[x][5] = PersonAddressModel.createViewPersonAddressesButton(currPerson, aTargetToRefresh);
            x++;
        }
        model = new PersonTableModel(data, headings);
        return model;
    }

    public static TableModel getAddressTableModelForPerson(Person aPerson, IRefreshable aTargetToRefresh) {
        AddressTableModel model = null;
        if (null != aPerson) {
            List<Address> myAddresses = aPerson.getPlacesPersonHasLived();
            int noOfRows = myAddresses.size();
            int noOfColumns = 9; //There are 8 pieces of data in the Address class plus room for edit button
            String[] headings = {"ID No:", "Address Line 1:", "Address Line 2:", "Town", "County", "Postcode:", "Date moved in:", "Date moved out:", "Edit..."};
            Object[][] data = new Object[noOfRows][noOfColumns];
            int x = 0;
            for(Address currAddress : myAddresses){
                data[x][0] = currAddress;
                data[x][1] = currAddress;
                data[x][2] = currAddress;
                data[x][3] = currAddress;
                data[x][4] = currAddress;
                data[x][5] = currAddress;
                data[x][6] = currAddress;
                data[x][7] = currAddress;
                data[x][8] = PersonAddressModel.createEditButton(currAddress, aTargetToRefresh);
                x++;
            }
            model = new AddressTableModel(data, headings);
        }
        return model;
    }

    private static JButton createEditButton(Person currPerson, IRefreshable aTargetToRefresh) {
        JButton result = new JButton("Edit Person...");
        if(null != currPerson){
            result.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    EditPersonDialog dialog = new EditPersonDialog(null, true);
                    dialog.setPerson(currPerson);
                    dialog.setRefreshCallback(aTargetToRefresh);
                    dialog.setVisible(true);
                }
            });
            result.setMinimumSize(new Dimension(65, 23));
        }
        return result;
    }

    private static JButton createEditButton(Address currAddress, IRefreshable aTargetToRefresh) {
        JButton result = new JButton("Edit Address...");
        if(null != currAddress){
            result.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    EditAddressDialog dialog = new EditAddressDialog(null, true);
                    dialog.setAddress(currAddress);
                    dialog.setRefreshCallback(aTargetToRefresh);
                    dialog.setVisible(true);
                }
            });
        }
        return result;
    }
    
    private static JButton createViewPersonAddressesButton(Person currPerson, IRefreshable aTargetToRefresh) {
        JButton result = new JButton("View Address...");
        if(null != currPerson){
            result.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    AddressTableWindow window = new AddressTableWindow();
                    window.setPerson(currPerson);
                    window.setRefreshCallback(aTargetToRefresh);
                    window.setVisible(true);
                }
            });
        }
        return result;
    }

    private void createTestData() {
        Person me = new Person(1, "Roy", "Tucker", LocalDate.of(1970, Month.AUGUST, 6));
        Address myAddress = new Address(1, "12 Kathleaven St", "St Budeaux", "Plymouth", "Devon", "PL5 1PZ", LocalDate.of(1978, Month.MARCH, 13));
        me.addAddress(myAddress);
        myAddress = new Address(1, "53 Pendeen Crescent", "Southway", "Plymouth", "Devon", "PL6 6RE", LocalDate.of(1970, Month.AUGUST, 6), LocalDate.of(1978, Month.MARCH, 13));
        me.addAddress(myAddress);
        Person brother = new Person(1, "Alan", "Tucker", LocalDate.of(1970, Month.AUGUST, 6));
        myAddress = new Address(2, "53 Pendeen Crescent", "Southway", "Plymouth", "Devon", "PL6 6RE", LocalDate.of(1970, Month.AUGUST, 6), LocalDate.of(1978, Month.MARCH, 13));
        brother.addAddress(myAddress);
        myAddress = new Address(3, "12 Kathleaven St", "St Budeaux", "Plymouth", "Devon", "PL5 1PZ", LocalDate.of(1978, Month.MARCH, 13), LocalDate.of(1995, Month.AUGUST, 6));
        brother.addAddress(myAddress);
        myAddress = new Address(4, "7 Torr Close", "", "Ivybridge", "Devon", "PL21 0BX", LocalDate.of(1995, Month.AUGUST, 6));
        brother.addAddress(myAddress);
        myPeople.add(me);
        myPeople.add(brother);
    }

}
