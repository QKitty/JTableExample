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
public class PersonTableModel extends DefaultTableModel {

    public PersonTableModel() {
        super();
    }

    public PersonTableModel(int rowCount, int columnCount) {
        super(rowCount, columnCount);
    }

    public PersonTableModel(Vector columnNames, int rowCount) {
        super(columnNames, rowCount);
    }

    public PersonTableModel(Object[] columnNames, int rowCount) {
        super(columnNames, rowCount);
    }

    public PersonTableModel(Vector data, Vector columnNames) {
        super(data, columnNames);
    }

    public PersonTableModel(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        boolean result = false;
        if(column > 3){
            result = true;
        }
        return result;
    }
    
}
