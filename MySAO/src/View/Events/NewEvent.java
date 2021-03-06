/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Events;

import Controllers.EventController;
import Entities.Event;
import java.sql.*;
import javax.swing.JOptionPane;
import mysao.Home;

/**
 *
 * @author hp
 */
public class NewEvent extends javax.swing.JFrame {

    EventController eventcont;

    /**
     * Creates new form NewEvent
     */
    public NewEvent() {
        initComponents();
        this.eventcont = new EventController();

        FillClubIDCombo();
        FillLocationCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        EventID_jTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        EvtStart_jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        EvtEnd_jTextField7 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        SAOAPD_jCheckBox = new javax.swing.JCheckBox();
        AdvAPD_jCheckBox = new javax.swing.JCheckBox();
        EvtName_jTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        EvtDesc_jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        EvtBudget_jTextField3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Create_jButton = new javax.swing.JButton();
        Home_jButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        Loc_jComboBox = new javax.swing.JComboBox<>();
        Club_jComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel13.setText("Event Location");

        jLabel14.setText("Event Start");

        jLabel8.setText("Event Code");

        jLabel9.setText("Event Name");

        jLabel15.setText("Event End");

        jLabel16.setText("SAO Approval");

        jLabel17.setText("Advisor Approval");

        SAOAPD_jCheckBox.setText("SAO Approved");

        AdvAPD_jCheckBox.setText("Advisor Approved");

        jLabel10.setText("Event Description");

        jLabel11.setText("Event Budget");

        jLabel12.setText("Club ID");

        Create_jButton.setText("Create");
        Create_jButton.setToolTipText("");
        Create_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_jButtonActionPerformed(evt);
            }
        });

        Home_jButton.setText("Home");
        Home_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_jButtonActionPerformed(evt);
            }
        });

        jLabel18.setText("Create Event");

        Loc_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        Club_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel12)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(EventID_jTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EvtName_jTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EvtDesc_jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EvtBudget_jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EvtStart_jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EvtEnd_jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AdvAPD_jCheckBox)
                                    .addComponent(SAOAPD_jCheckBox))
                                .addGap(86, 86, 86))
                            .addComponent(Loc_jComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Club_jComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Create_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Home_jButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(EventID_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(EvtName_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(EvtDesc_jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(EvtBudget_jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Loc_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(EvtStart_jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(EvtEnd_jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Club_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdvAPD_jCheckBox)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SAOAPD_jCheckBox)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Create_jButton)
                    .addComponent(Home_jButton))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FillLocationCombo() {

        try {
            ResultSet rs = eventcont.getAllLocations();

            while (rs.next()) {
                String loc = rs.getString("Location");
                Loc_jComboBox.addItem(loc);
            }
            //return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "A problem has occured in connexion to the Database!");
        }
    }

    private void FillClubIDCombo() {

        try {

            ResultSet rs = eventcont.getAllClubs();

            while (rs.next()) {
                String Club = rs.getString("Club");
                Club_jComboBox.addItem(Club);
            }
            //return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "A problem has occured in connexion to the Database!");
        }
    }

    public void Clear_Fields() {
        EventID_jTextField.setText("");
        EvtName_jTextField.setText("");
        EvtDesc_jTextField2.setText("");
        EvtBudget_jTextField3.setText("");

        Loc_jComboBox.setSelectedIndex(0);

        EvtStart_jTextField6.setText("");
        EvtEnd_jTextField7.setText("");

        Club_jComboBox.setSelectedIndex(0);
    }

    private void Create_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_jButtonActionPerformed
        // TODO add your handling code here:

        String EvtID = EventID_jTextField.getText();
        String EvtName = EvtName_jTextField.getText();
        String EvtDesc = EvtDesc_jTextField2.getText();
        String EvtBudget = EvtBudget_jTextField3.getText();

        String EvtStart = EvtStart_jTextField6.getText();
        String EvtEnd = EvtEnd_jTextField7.getText();

        String Loc_ID = Loc_jComboBox.getSelectedItem().toString();
        String EvtLoc = "";
        for (int i = 0; i < Loc_ID.length(); ++i) {
            if (Loc_ID.charAt(i) != ',') {
                EvtLoc += Loc_ID.charAt(i);
            } else {
                break;
            }
        }
        System.out.println(EvtLoc);

        String Club_ID_s = Club_jComboBox.getSelectedItem().toString();
        String ClubID = "";
        for (int i = 0; i < Club_ID_s.length(); ++i) {
            if (Club_ID_s.charAt(i) != ',') {
                ClubID += Club_ID_s.charAt(i);
            } else {
                break;
            }
        }
        System.out.println(ClubID);

        String AdvApd = "0";
        if (AdvAPD_jCheckBox.isSelected()) {
            AdvApd = "1";
        }

        String SaoApd = "0";
        if (SAOAPD_jCheckBox.isSelected()) {
            SaoApd = "1";
        }

        

        // Result Set get the result of the SQL query
        eventcont.CreateEvent(new Event(EvtID, EvtName, EvtDesc, EvtBudget, EvtLoc, EvtStart, EvtEnd, ClubID, AdvApd, SaoApd) );
    }//GEN-LAST:event_Create_jButtonActionPerformed

    private void Home_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_jButtonActionPerformed
        // TODO add your handling code here:

        Home frm = new Home();
        frm.setLocation(getLocation());
        frm.setSize(getSize());
        setVisible(false);
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_Home_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AdvAPD_jCheckBox;
    private javax.swing.JComboBox<String> Club_jComboBox;
    private javax.swing.JButton Create_jButton;
    private javax.swing.JTextField EventID_jTextField;
    private javax.swing.JTextField EvtBudget_jTextField3;
    private javax.swing.JTextField EvtDesc_jTextField2;
    private javax.swing.JTextField EvtEnd_jTextField7;
    private javax.swing.JTextField EvtName_jTextField;
    private javax.swing.JTextField EvtStart_jTextField6;
    private javax.swing.JButton Home_jButton;
    private javax.swing.JComboBox<String> Loc_jComboBox;
    private javax.swing.JCheckBox SAOAPD_jCheckBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
