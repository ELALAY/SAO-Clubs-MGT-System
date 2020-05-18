/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Clubs;

import Controllers.ClubControleler;
import Entities.Club;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mysao.Home;

/**
 *
 * @author hp
 */
public class ListClubs extends javax.swing.JFrame {

    String ClubID_Searched;
    ClubControleler clubCont;

    /**
     * Creates new form SearchProducts
     */
    public ListClubs() {
        initComponents();
        FillAdvCombo();
        clubCont = new ClubControleler();

        //Initialize the JTable data model
        ((DefaultTableModel) (jTable1.getModel())).setRowCount(0);
        ((DefaultTableModel) (jTable1.getModel())).setColumnCount(0);
        ClubID_jTextField.setEnabled(false);
    }

    public ListClubs(String ClubID_Searched) {
        initComponents();
        FillAdvCombo();
        this.ClubID_Searched = ClubID_Searched;

        ClubCode_TextField.setText((String) ClubID_Searched);

        //Initialize the JTable data model
        ((DefaultTableModel) (jTable1.getModel())).setRowCount(0);
        ((DefaultTableModel) (jTable1.getModel())).setColumnCount(0);
        ClubID_jTextField.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ClubCode_TextField = new javax.swing.JTextField();
        Search_btn = new javax.swing.JButton();
        Clear_btn = new javax.swing.JButton();
        MainMenu_btn = new javax.swing.JButton();
        Exit_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ClubID_jTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CName_jTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CDescript_jTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CDate_jTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Balance_jLabel = new javax.swing.JLabel();
        Update_jButton = new javax.swing.JButton();
        ClearClub_jButton = new javax.swing.JButton();
        CPass_jTextField = new javax.swing.JTextField();
        Balance_jTextField = new javax.swing.JTextField();
        Delete_jButton = new javax.swing.JButton();
        Dialog_jLabel = new javax.swing.JLabel();
        Adv_jComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Clubs");

        jLabel2.setText("Club Code");

        Search_btn.setText("Search");
        Search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_btnActionPerformed(evt);
            }
        });

        Clear_btn.setText("Clear");
        Clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_btnActionPerformed(evt);
            }
        });

        MainMenu_btn.setText("Main Menu");
        MainMenu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenu_btnActionPerformed(evt);
            }
        });

        Exit_btn.setText("Exit");
        Exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_btnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel3.setText("Club Name");

        jLabel4.setText("Description");

        jLabel5.setText("Creation Date");

        jLabel6.setText("Advisor  ID");

        jLabel7.setText("Passwor");

        jLabel8.setText("Club Code");

        jLabel9.setText("yyyy-mm-dd");

        Balance_jLabel.setText("Balance");

        Update_jButton.setText("Save Update");
        Update_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_jButtonActionPerformed(evt);
            }
        });

        ClearClub_jButton.setText("Clear");
        ClearClub_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearClub_jButtonActionPerformed(evt);
            }
        });

        Delete_jButton.setText("Delete");
        Delete_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_jButtonActionPerformed(evt);
            }
        });

        Dialog_jLabel.setText("Result:");

        Adv_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        Adv_jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adv_jComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ClubCode_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Clear_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MainMenu_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Exit_btn)
                        .addGap(17, 17, 17))))
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(55, 55, 55)
                            .addComponent(ClubID_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(50, 50, 50)
                            .addComponent(CDescript_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(Balance_jLabel))
                                    .addGap(60, 60, 60)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CPass_jTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(Balance_jTextField)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(39, 39, 39))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(51, 51, 51)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CDate_jTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(Adv_jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(53, 53, 53)
                        .addComponent(CName_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Update_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ClearClub_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Delete_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dialog_jLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ClubCode_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_btn)
                    .addComponent(Clear_btn)
                    .addComponent(MainMenu_btn)
                    .addComponent(Exit_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dialog_jLabel)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ClubID_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update_jButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CName_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearClub_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CDescript_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete_jButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CDate_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Adv_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Balance_jLabel)
                    .addComponent(Balance_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CPass_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FillAdvCombo() {

        try {
           
            // Result Set get the result of the SQL query
            ResultSet rs = clubCont.getAllAdvisors();
            while (rs.next()) {
                String Adv = rs.getString("Advisor");
                Adv_jComboBox.addItem(Adv);
            }
            //return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "A problem has occured in connexion to the Database!");
        }
    }

    private void Exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_btnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Exit_btnActionPerformed

    private ResultSet theQuery(String qry) {
        String Conn_url = "jdbc:mysql://localhost/saodb?serverTimezone=UTC";
        String Uid = "root";
        String PW = "marrakec";
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection(Conn_url, Uid, PW);
            //System.out.println("connxion dazet");

            Statement stmt = (Statement) conn.createStatement();

            // Result Set get the result of the SQL query
            rs = stmt.executeQuery(qry);
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "A problem has occured in connexion to the Database!");
        }
        return rs;
    }

    private void MainMenu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenu_btnActionPerformed
        // TODO add your handling code here:
        Home frm = new Home();
        frm.setLocation(getLocation());
        frm.setSize(getSize());
        setVisible(false);
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_MainMenu_btnActionPerformed

    private void Clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_btnActionPerformed
        // TODO add your handling code here:
        ClubCode_TextField.setText("");
    }//GEN-LAST:event_Clear_btnActionPerformed

    private void Search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_btnActionPerformed
        // TODO add your handling code here:
        String ClubID = ClubCode_TextField.getText();

        try {

            ResultSet rs;
            if (ClubID.equals("")) {
                rs = clubCont.GetAllClubs();
            } else {
                rs = clubCont.SearchClub_ByClubID(ClubID);
            }

            ResultSetMetaData rsmd = rs.getMetaData();
            int c = rsmd.getColumnCount();

            DefaultTableModel dtm = new DefaultTableModel();
            for (int i = 1; i <= c; ++i) {
                dtm.addColumn(rsmd.getColumnName(i));
            }

            Object[] row;
            while (rs.next()) {
                row = new Object[c];
                for (int i = 0; i < c; ++i) {
                    row[i] = rs.getString(i + 1);
                }
                dtm.addRow(row);
            }
            jTable1.setModel(dtm);
            Dialog_jLabel.setText("Resulting Rows: " + jTable1.getRowCount());

            //}
        } catch (SQLException ex) {
            Logger.getLogger(ListClubs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Search_btnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int rowIndex = jTable1.getSelectedRow();

        ClubID_jTextField.setText(model.getValueAt(rowIndex, 0).toString());
        CName_jTextField.setText(model.getValueAt(rowIndex, 1).toString());
        CDescript_jTextField.setText(model.getValueAt(rowIndex, 2).toString());
        CDate_jTextField.setText(model.getValueAt(rowIndex, 3).toString());
        // Advisor_jTextField.setText(model.getValueAt(rowIndex, 4).toString());

        int adv_index = 0;
        adv_index = Integer.parseInt(model.getValueAt(rowIndex, 4).toString());
        Adv_jComboBox.setSelectedIndex(adv_index);

        Balance_jTextField.setText(model.getValueAt(rowIndex, 5).toString());
        CPass_jTextField.setText(model.getValueAt(rowIndex, 6).toString());


    }//GEN-LAST:event_jTable1MouseClicked

    private void Clear_Fields() {
        ClubID_jTextField.setText("");
        CName_jTextField.setText("");
        CDescript_jTextField.setText("");
        CDate_jTextField.setText("");
        // Advisor_jTextField.setText("");

        Adv_jComboBox.setSelectedIndex(0);
        Balance_jTextField.setText((""));
        CPass_jTextField.setText("");
    }

    private void ClearClub_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearClub_jButtonActionPerformed
        // TODO add your handling code here:
        Clear_Fields();

    }//GEN-LAST:event_ClearClub_jButtonActionPerformed

    private void Update_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_jButtonActionPerformed
        // TODO add your handling code here:

        String ClubID = ClubID_jTextField.getText();
        String CDesc = CDescript_jTextField.getText();
        String CName = CName_jTextField.getText();
        String CDate = CDate_jTextField.getText();
        //String Adv = Advisor_jTextField.getText();
        String Balance = Balance_jTextField.getText();
        String CPass = CPass_jTextField.getText();
        
        String Adv_ID = Adv_jComboBox.getSelectedItem().toString();
        String AdvID = "";
        for (int i = 0; i < Adv_ID.length(); ++i) {
            if (Adv_ID.charAt(i) != ',') {
                AdvID += Adv_ID.charAt(i);
            } else {
                break;
            }
        }
        System.out.println(AdvID);
        
        clubCont.UpdateClub_ByID(new Club(ClubID, CName, CDesc, CDate, AdvID, Balance, CPass));

    }//GEN-LAST:event_Update_jButtonActionPerformed

    private void Delete_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_jButtonActionPerformed
        // TODO add your handling code here:
        String ClubID = ClubID_jTextField.getText();
        String CName = CName_jTextField.getText();

        clubCont.DeleteClub_ByID(ClubID);

    }//GEN-LAST:event_Delete_jButtonActionPerformed

    private void Adv_jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adv_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Adv_jComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(ListClubs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListClubs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListClubs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListClubs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListClubs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Adv_jComboBox;
    private javax.swing.JLabel Balance_jLabel;
    private javax.swing.JTextField Balance_jTextField;
    private javax.swing.JTextField CDate_jTextField;
    private javax.swing.JTextField CDescript_jTextField;
    private javax.swing.JTextField CName_jTextField;
    private javax.swing.JTextField CPass_jTextField;
    private javax.swing.JButton ClearClub_jButton;
    private javax.swing.JButton Clear_btn;
    private javax.swing.JTextField ClubCode_TextField;
    private javax.swing.JTextField ClubID_jTextField;
    private javax.swing.JButton Delete_jButton;
    private javax.swing.JLabel Dialog_jLabel;
    private javax.swing.JButton Exit_btn;
    private javax.swing.JButton MainMenu_btn;
    private javax.swing.JButton Search_btn;
    private javax.swing.JButton Update_jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
