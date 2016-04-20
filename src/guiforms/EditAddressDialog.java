/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiforms;

import datamodel.Address;
import java.time.LocalDate;

/**
 *
 * @author Roy
 */
public class EditAddressDialog extends javax.swing.JDialog {

    private Address myAddress;
    private IRefreshable target;

    /**
     * Creates new form EditAddressDialog
     */
    public EditAddressDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        refreshDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnId = new javax.swing.JSpinner();
        lblIDNo = new javax.swing.JLabel();
        lblLine1 = new javax.swing.JLabel();
        lblLine2 = new javax.swing.JLabel();
        lblTown = new javax.swing.JLabel();
        lblPostcode = new javax.swing.JLabel();
        spnYear = new javax.swing.JSpinner();
        spnMonth = new javax.swing.JSpinner();
        spnDay = new javax.swing.JSpinner();
        lblMovedIn = new javax.swing.JLabel();
        lblDay = new javax.swing.JLabel();
        lblMonth = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblMovedIn1 = new javax.swing.JLabel();
        lblDay1 = new javax.swing.JLabel();
        lblMonth1 = new javax.swing.JLabel();
        lblYear1 = new javax.swing.JLabel();
        spnDayOut = new javax.swing.JSpinner();
        spnMonthOut = new javax.swing.JSpinner();
        spnYearOut = new javax.swing.JSpinner();
        lblHasMovedOut = new javax.swing.JLabel();
        cbxOut = new javax.swing.JCheckBox();
        txtLine1 = new javax.swing.JTextField();
        txtLine2 = new javax.swing.JTextField();
        txtTown = new javax.swing.JTextField();
        txtPostcode = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        spnId.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnId.setEnabled(false);

        lblIDNo.setText("Set the address ID number:");

        lblLine1.setText("Enter address line 1:");

        lblLine2.setText("Enter address line 2:");
        lblLine2.setToolTipText("");

        lblTown.setText("Enter address town:");
        lblTown.setToolTipText("");

        lblPostcode.setText("Enter address postcode:");
        lblPostcode.setToolTipText("");

        spnYear.setModel(new javax.swing.SpinnerNumberModel(1970, 1, null, 1));

        spnMonth.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        spnDay.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        lblMovedIn.setText("Enter date moved in:");
        lblMovedIn.setToolTipText("");

        lblDay.setText("Day:");

        lblMonth.setText("Month:");

        lblYear.setText("Year:");

        lblMovedIn1.setText("Enter date moved out:");
        lblMovedIn1.setToolTipText("");

        lblDay1.setText("Day:");

        lblMonth1.setText("Month:");

        lblYear1.setText("Year:");

        spnDayOut.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        spnMonthOut.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        spnYearOut.setModel(new javax.swing.SpinnerNumberModel(1970, 1, null, 1));

        lblHasMovedOut.setText("Record date moved out:");

        cbxOut.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbxOutStateChanged(evt);
            }
        });

        txtLine1.setText("UNKNOWN");

        txtLine2.setText("UNKNOWN");

        txtTown.setText("UNKNOWN");

        txtPostcode.setText("UNKNOWN");

        btnSave.setText("Save Data");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIDNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spnId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLine1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLine2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTown)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTown, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPostcode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblHasMovedOut)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxOut))
                                    .addComponent(lblMovedIn1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(172, 172, 172)
                                        .addComponent(lblYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(173, 173, 173)
                                        .addComponent(spnYearOut, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lblMovedIn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(spnDay, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                            .addComponent(lblDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(spnDayOut)
                                            .addComponent(lblDay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(spnMonth, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                                .addComponent(lblMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(lblMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spnMonthOut, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(155, 155, 155)
                                                .addComponent(btnCancel))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnSave)
                                                .addGap(137, 137, 137)))))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDNo)
                    .addComponent(spnId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLine1)
                    .addComponent(txtLine1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLine2)
                    .addComponent(txtLine2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTown)
                    .addComponent(txtTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPostcode)
                    .addComponent(txtPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMovedIn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYear)
                            .addComponent(lblMonth)
                            .addComponent(lblDay))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDay1)
                            .addComponent(lblMonth1)
                            .addComponent(lblYear1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHasMovedOut)
                            .addComponent(cbxOut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnDayOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnMonthOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnYearOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMovedIn1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxOutStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbxOutStateChanged
        dateOutStateChange();
    }//GEN-LAST:event_cbxOutStateChanged

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveData();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        doCallback();
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditAddressDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditAddressDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditAddressDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditAddressDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditAddressDialog dialog = new EditAddressDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox cbxOut;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblDay1;
    private javax.swing.JLabel lblHasMovedOut;
    private javax.swing.JLabel lblIDNo;
    private javax.swing.JLabel lblLine1;
    private javax.swing.JLabel lblLine2;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JLabel lblMonth1;
    private javax.swing.JLabel lblMovedIn;
    private javax.swing.JLabel lblMovedIn1;
    private javax.swing.JLabel lblPostcode;
    private javax.swing.JLabel lblTown;
    private javax.swing.JLabel lblYear;
    private javax.swing.JLabel lblYear1;
    private javax.swing.JSpinner spnDay;
    private javax.swing.JSpinner spnDayOut;
    private javax.swing.JSpinner spnId;
    private javax.swing.JSpinner spnMonth;
    private javax.swing.JSpinner spnMonthOut;
    private javax.swing.JSpinner spnYear;
    private javax.swing.JSpinner spnYearOut;
    private javax.swing.JTextField txtLine1;
    private javax.swing.JTextField txtLine2;
    private javax.swing.JTextField txtPostcode;
    private javax.swing.JTextField txtTown;
    // End of variables declaration//GEN-END:variables

    public void setAddress(Address aAddress) {
        myAddress = aAddress;
        refreshDetails();
    }

    public void setRefreshCallback(IRefreshable aTargetToRefresh) {
        target = aTargetToRefresh;
    }

    public final void refreshDetails() {
        if (null != myAddress) {
            spnId.setValue(myAddress.getId());
            txtLine1.setText(myAddress.getAddressLine1());
            txtLine2.setText(myAddress.getAddressLine2());
            txtTown.setText(myAddress.getTown());
            txtPostcode.setText(myAddress.getPostcode());
            LocalDate dateIn = myAddress.getMovedIn();
            spnDay.setValue(dateIn.getDayOfMonth());
            spnMonth.setValue(dateIn.getMonthValue());
            spnYear.setValue(dateIn.getYear());
            LocalDate movedOut = myAddress.getMovedOut();
            if (null != movedOut) {
                cbxOut.setSelected(true);
            } else {
                cbxOut.setSelected(false);
            }
        } else {
            cbxOut.setSelected(false);
        }
        dateOutStateChange();
    }

    private void doCallback() {
        if (null != target) {
            target.refresh();
        }
    }

    private void dateOutStateChange() {
        if (cbxOut.isSelected()) {
            spnDayOut.setEnabled(true);
            spnMonthOut.setEnabled(true);
            spnYearOut.setEnabled(true);
            LocalDate movedOut = myAddress.getMovedOut();
            if (null != movedOut) {
                spnDayOut.setValue(movedOut.getDayOfMonth());
                spnMonthOut.setValue(movedOut.getMonthValue());
                spnYearOut.setValue(movedOut.getYear());
            }
        } else {
            spnDayOut.setEnabled(false);
            spnMonthOut.setEnabled(false);
            spnYearOut.setEnabled(false);
            spnDayOut.setValue(0);
            spnMonthOut.setValue(0);
            spnYearOut.setValue(0);
        }
    }

    private void saveData() {
        if (null != myAddress) {
            myAddress.setAddressLine1(txtLine1.getText());
            myAddress.setAddressLine2(txtLine2.getText());
            myAddress.setTown(txtTown.getText());
            myAddress.setPostcode(txtPostcode.getText());
            int newDay, newMonth, newYear;
            newDay = (int) spnDay.getValue();
            newMonth = (int) spnMonth.getValue();
            newYear = (int) spnYear.getValue();
            LocalDate newMoveIn = LocalDate.of(newYear, newMonth, newDay);
            myAddress.setMovedIn(newMoveIn);
            if (cbxOut.isSelected()) {
                newDay = (int) spnDayOut.getValue();
                newMonth = (int) spnMonthOut.getValue();
                newYear = (int) spnYearOut.getValue();
                LocalDate newMoveOut = LocalDate.of(newYear, newMonth, newDay);
                myAddress.setMovedOut(newMoveOut);
            }
        }
        doCallback();
        this.dispose();
    }
}