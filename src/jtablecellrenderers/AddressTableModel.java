/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtablecellrenderers;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Roy
 */
public class AddressTableModel extends DefaultTableModel {

    public AddressTableModel() {
    }

    public AddressTableModel(int rowCount, int columnCount) {
        super(rowCount, columnCount);
    }

    public AddressTableModel(Vector columnNames, int rowCount) {
        super(columnNames, rowCount);
    }

    public AddressTableModel(Object[] columnNames, int rowCount) {
        super(columnNames, rowCount);
    }

    public AddressTableModel(Vector data, Vector columnNames) {
        super(data, columnNames);
    }

    public AddressTableModel(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        boolean result = false;
        if(column == 8){
            result = true;
        }
        return result;
    }
    
}
