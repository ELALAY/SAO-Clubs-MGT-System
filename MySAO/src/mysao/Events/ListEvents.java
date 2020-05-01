/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysao.Events;

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
public class ListEvents extends javax.swing.JFrame {

    /**
     * Creates new form SearchProducts
     */
    public ListEvents() {
        initComponents();

        //Initialize the JTable data model
        ((DefaultTableModel) (jTable1.getModel())).setRowCount(0);
        ((DefaultTableModel) (jTable1.getModel())).setColumnCount(0);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Events");

        jLabel2.setText("Event ID");

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
        jScrollPane2.setViewportView(jTable1);

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(MainMenu_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Exit_btn)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ClubCode_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_btn)
                    .addComponent(Clear_btn)
                    .addComponent(MainMenu_btn)
                    .addComponent(Exit_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_btnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Exit_btnActionPerformed

    private ResultSet theQuery(String qry) {
        String Conn_url = "jdbc:mysql://localhost/saodb?serverTimezone=UTC";
        String Uid = "root";
        String PW = "marrakec";

        try {
            Connection conn = DriverManager.getConnection(Conn_url, Uid, PW);
            //System.out.println("connxion dazet");

            Statement stmt = (Statement) conn.createStatement();

            // Result Set get the result of the SQL query
            ResultSet rs = stmt.executeQuery(qry);
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "A problem has occured in connexion to the Database!");
        }
        return null;
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

        try {

            //String qry = "SELECT ClubID, CName, CDescript, Balance FROM Club";
            
            String qry = "SELECT ClubID, CName, CDescript, CcreationDate, "
                    + "CONCAT(AdvFname, ' ', AdvLname) as Advisor, Balance "
                    + "FROM Club as c JOIN Advisor as a "
                    + "ON c.AdvID = a.AdvID ";
            
            String ClubID = ClubCode_TextField.getText();

            //if (!VendCode.equals("_all")) {
            if (!ClubID.equals("")) {
                qry += " WHERE ClubID = " + ClubID;
            }
            //}s
            // Result Set get the result of the SQL query
            ResultSet rs = theQuery(qry);

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

            //}
        } catch (SQLException ex) {
            Logger.getLogger(ListEvents.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Search_btnActionPerformed

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
            java.util.logging.Logger.getLogger(ListEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListEvents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear_btn;
    private javax.swing.JTextField ClubCode_TextField;
    private javax.swing.JButton Exit_btn;
    private javax.swing.JButton MainMenu_btn;
    private javax.swing.JButton Search_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}