/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtablecellrenderers;

import datamodel.Person;
import java.awt.Component;
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
public class PersonJTabelCellEditorAndRenderer extends DefaultCellEditor implements TableCellRenderer {

    public PersonJTabelCellEditorAndRenderer(JTextField textField) {
        super(textField);
        clickCountToStart = 1;
    }

    public PersonJTabelCellEditorAndRenderer(JCheckBox checkBox) {
        super(checkBox);
        clickCountToStart = 1;
    }

    public PersonJTabelCellEditorAndRenderer(JComboBox comboBox) {
        super(comboBox);
        clickCountToStart = 1;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component result = new JLabel("ERROR");
        switch (column) {
            case 0:
                Person myPerson = (Person) value;
                Integer myId = myPerson.getId();
                ((JLabel) result).setText(myId.toString());
                break;
            case 1:
                myPerson = (Person) value;
                ((JLabel) result).setText(myPerson.getfName());
                break;
            case 2:
                myPerson = (Person) value;
                ((JLabel) result).setText(myPerson.getlName());
                break;
            case 3:
                myPerson = (Person) value;
                String formattedDate = myPerson.getBirthday().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                ((JLabel) result).setText(formattedDate);
                break;
            case 4:
            case 5:
                if (value instanceof Component) {
                    //The "value" object is in fact a JButton! Use this component.
                    result = (Component) value;
                }
                break;
            default:
            //Do nothing we have an error label configured
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
