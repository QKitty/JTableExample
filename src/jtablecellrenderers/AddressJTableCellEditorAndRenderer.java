/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtablecellrenderers;

import datamodel.Address;
import java.awt.Component;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.EventObject;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Roy
 */
public class AddressJTableCellEditorAndRenderer extends DefaultCellEditor implements TableCellRenderer {

    public AddressJTableCellEditorAndRenderer(JTextField textField) {
        super(textField);
        clickCountToStart = 1;
    }

    public AddressJTableCellEditorAndRenderer(JCheckBox checkBox) {
        super(checkBox);
        clickCountToStart = 1;
    }

    public AddressJTableCellEditorAndRenderer(JComboBox comboBox) {
        super(comboBox);
        clickCountToStart = 1;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component result = new JLabel("ERROR");
        switch (column) {
            case 0:
                Address myAddress = (Address) value;
                Integer myId = myAddress.getId();
                ((JLabel) result).setText(myId.toString());
                break;
            case 1:
                myAddress = (Address) value;
                ((JLabel) result).setText(myAddress.getAddressLine1());
                break;
            case 2:
                myAddress = (Address) value;
                ((JLabel) result).setText(myAddress.getAddressLine2());
                break;
            case 3:
                myAddress = (Address) value;
                ((JLabel) result).setText(myAddress.getTown());
                break;
            case 4:
                myAddress = (Address) value;
                ((JLabel) result).setText(myAddress.getCounty());
                break;
            case 5:
                myAddress = (Address) value;
                ((JLabel) result).setText(myAddress.getPostcode());
                break;
            case 6:
                myAddress = (Address) value;
                String formattedDate = myAddress.getMovedIn().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                ((JLabel) result).setText(formattedDate);
                break;
            case 7:
                myAddress = (Address) value;
                LocalDate movedOut = myAddress.getMovedOut();
                if (null != movedOut) {
                    formattedDate = movedOut.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    ((JLabel) result).setText(formattedDate);
                } else {
                    ((JLabel) result).setText("No Data");
                }
                break;
            case 8:
                if (value instanceof Component) {
                    //The "value" object is in fact a JButton! Use this component.
                    result = (Component) value;
                }
                break;
        }
        return result;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        Component result;
        if (value instanceof Component) {
            result = (Component) value;
        } else {
            result = super.getTableCellEditorComponent(table, value, isSelected, row, column);
        }
        return result;
    }

    @Override
    public boolean shouldSelectCell(EventObject anEvent) {
        return false;
    }

}
