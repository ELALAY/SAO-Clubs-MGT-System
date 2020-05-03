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
        EvtCode_TextField = new javax.swing.JTextField();
        Search_btn = new javax.swing.JButton();
        Clear_btn = new javax.swing.JButton();
        MainMenu_btn = new javax.swing.JButton();
        Exit_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        UnApprovedEvt_jButton = new javax.swing.JButton();
        AllEvts_jButton = new javax.swing.JButton();
        StartDate_jTextField = new javax.swing.JTextField();
        EndDate_jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SearchDate_jButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        EventID_jTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        EvtName_jTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        EvtDesc_jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        EvtBudget_jTextField3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ClubID_jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        EvtLocation_jTextField5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        EvtStart_jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        EvtEnd_jTextField7 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        SAOAPD_jCheckBox = new javax.swing.JCheckBox();
        AdvAPD_jCheckBox = new javax.swing.JCheckBox();
        Update_jButton = new javax.swing.JButton();
        Clear_jButton = new javax.swing.JButton();
        Delete_jButton = new javax.swing.JButton();

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        UnApprovedEvt_jButton.setText("Approve Events");
        UnApprovedEvt_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnApprovedEvt_jButtonActionPerformed(evt);
            }
        });

        AllEvts_jButton.setText("All Eventt");
        AllEvts_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllEvts_jButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Start Date");

        jLabel4.setText("End Date");

        SearchDate_jButton.setText("Search Dates");
        SearchDate_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchDate_jButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("yyyy-mm-dd");

        jLabel8.setText("Event Code");

        jLabel9.setText("Event Name");

        jLabel10.setText("Event Description");

        jLabel11.setText("Event Budget");

        jLabel12.setText("Club ID");

        jLabel13.setText("Event Location");

        jLabel14.setText("Event Start");

        jLabel15.setText("Event End");

        jLabel16.setText("SAO Approval");

        jLabel17.setText("Advisor Approval");

        SAOAPD_jCheckBox.setText("SAO Approved");

        AdvAPD_jCheckBox.setText("Advisor Approved");

        Update_jButton.setText("Update");
        Update_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_jButtonActionPerformed(evt);
            }
        });

        Clear_jButton.setText("Clear");
        Clear_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_jButtonActionPerformed(evt);
            }
        });

        Delete_jButton.setText("Delete");

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StartDate_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EndDate_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SearchDate_jButton)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AllEvts_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UnApprovedEvt_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EvtCode_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Search_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Clear_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MainMenu_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Exit_btn)))
                        .addGap(17, 17, 17))))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
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
                    .addComponent(jLabel16))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(EventID_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EvtName_jTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EvtDesc_jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EvtBudget_jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EvtLocation_jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EvtStart_jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EvtEnd_jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClubID_jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdvAPD_jCheckBox)
                            .addComponent(SAOAPD_jCheckBox))
                        .addGap(86, 86, 86)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Update_jButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Clear_jButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delete_jButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MainMenu_btn)
                            .addComponent(Exit_btn))
                        .addGap(18, 20, Short.MAX_VALUE)
                        .addComponent(AllEvts_jButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UnApprovedEvt_jButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(StartDate_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(EvtCode_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Search_btn)
                                    .addComponent(Clear_btn))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EndDate_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(SearchDate_jButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(EventID_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update_jButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(EvtName_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear_jButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(EvtDesc_jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete_jButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(EvtBudget_jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(EvtLocation_jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(ClubID_jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdvAPD_jCheckBox)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SAOAPD_jCheckBox)
                    .addComponent(jLabel16))
                .addGap(52, 52, 52))
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
        EvtCode_TextField.setText("");
    }//GEN-LAST:event_Clear_btnActionPerformed

    private void Search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_btnActionPerformed
        // TODO add your handling code here:

        try {

            String qry = "SELECT * FROM Event";
            /*String qry = "SELECT e.EvtID, e.EvtName, e.EvtDescript, CONCAT(l.LocBldg, ' ', l.LocRoom) as 'Location', e.EvtStart, e.EvtEnd, c.CName, e.AdvApproval, e.SAOApproval "
                    + "FROM Event as e JOIN Club as c ON e.ClubID = c.ClubID "
                    + "JOIN Location as l ON l.LocID = e.EvtLocation "; */

            String EvtCode = EvtCode_TextField.getText();

            //if (!VendCode.equals("_all")) {
            if (!EvtCode.equals("")) {
                qry += " WHERE EvtID = " + EvtCode;
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

    private void AllEvts_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllEvts_jButtonActionPerformed
        // TODO add your handling code here:

        try {

            String qry = "SELECT * FROM Event";
            /*String qry = "SELECT e.EvtID, e.EvtName, e.EvtDescript, CONCAT(l.LocBldg, ' ', l.LocRoom) as 'Location', e.EvtStart, e.EvtEnd, c.CName, e.AdvApproval, e.SAOApproval "
                    + "FROM Event as e JOIN Club as c ON e.ClubID = c.ClubID "
                    + "JOIN Location as l ON l.LocID = e.EvtLocation "; */

            String EvtCode = EvtCode_TextField.getText();

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

    }//GEN-LAST:event_AllEvts_jButtonActionPerformed

    private void UnApprovedEvt_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnApprovedEvt_jButtonActionPerformed
        // TODO add your handling code here:
        try {

            String qry = "SELECT * FROM Event "
                    + "WHERE AdvApproval = 0 OR SAOApproval = 0";
            /*String qry = "SELECT e.EvtID, e.EvtName, e.EvtDescript, CONCAT(l.LocBldg, ' ', l.LocRoom) as 'Location', e.EvtStart, e.EvtEnd, c.CName, e.AdvApproval, e.SAOApproval "
                    + "FROM Event as e JOIN Club as c ON e.ClubID = c.ClubID "
                    + "JOIN Location as l ON l.LocID = e.EvtLocation "
                    + "WHERE AdvApproval = 0 OR SAOApproval = 0"; */

            String EvtCode = EvtCode_TextField.getText();

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
    }//GEN-LAST:event_UnApprovedEvt_jButtonActionPerformed

    private void SearchDate_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchDate_jButtonActionPerformed
        // TODO add your handling code here:

        try {
            String startDate = StartDate_jTextField.getText();
            String endDate = EndDate_jTextField1.getText();

            String qry = "SELECT * FROM Event"
                    + "WHERE EvtStart BETWEEN '" + startDate + "' AND '" + endDate + "'";
            /*tring qry = "SELECT e.EvtID, e.EvtName, e.EvtDescript, CONCAT(l.LocBldg, ' ', l.LocRoom) as 'Location', e.EvtStart, e.EvtEnd, c.CName, e.AdvApproval, e.SAOApproval "
                    + "FROM Event as e JOIN Club as c ON e.ClubID = c.ClubID "
                    + "JOIN Location as l ON l.LocID = e.EvtLocation "
                    + "WHERE EvtStart BETWEEN '" + startDate + "' AND '" + endDate + "'";
             */

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
    }//GEN-LAST:event_SearchDate_jButtonActionPerformed

    private void Clear_Fields() {
        EventID_jTextField.setText("");
        EvtName_jTextField.setText("");
        EvtDesc_jTextField2.setText("");
        EvtBudget_jTextField3.setText("");
        EvtLocation_jTextField5.setText("");
        EvtStart_jTextField6.setText("");
        EvtEnd_jTextField7.setText("");
        ClubID_jTextField4.setText("");
        AdvAPD_jCheckBox.setSelected(false);
        SAOAPD_jCheckBox.setSelected(false);
    }

    private void Clear_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_jButtonActionPerformed
        // TODO add your handling code here:
        Clear_Fields();
    }//GEN-LAST:event_Clear_jButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int rowIndex = jTable1.getSelectedRow();

        EventID_jTextField.setText(model.getValueAt(rowIndex, 0).toString());
        EvtName_jTextField.setText(model.getValueAt(rowIndex, 1).toString());
        EvtDesc_jTextField2.setText(model.getValueAt(rowIndex, 2).toString());
        EvtBudget_jTextField3.setText(model.getValueAt(rowIndex, 3).toString());
        EvtLocation_jTextField5.setText(model.getValueAt(rowIndex, 4).toString());
        EvtStart_jTextField6.setText(model.getValueAt(rowIndex, 5).toString());
        EvtEnd_jTextField7.setText(model.getValueAt(rowIndex, 6).toString());
        ClubID_jTextField4.setText(model.getValueAt(rowIndex, 7).toString());

        int AdvApd = Integer.parseInt(model.getValueAt(rowIndex, 8).toString());
        if (AdvApd == 1) {
            AdvAPD_jCheckBox.setSelected(true);
        } else {
            AdvAPD_jCheckBox.setSelected(false);
        }

        int SaoApd = Integer.parseInt(model.getValueAt(rowIndex, 9).toString());
        if (SaoApd == 1) {
            SAOAPD_jCheckBox.setSelected(true);
        } else {
            SAOAPD_jCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void Update_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_jButtonActionPerformed
        // TODO add your handling code here:
        String EvtID     = EventID_jTextField.getText();
        String EvtName   = EvtName_jTextField.getText();
        String EvtDesc   = EvtDesc_jTextField2.getText();
        String EvtBudget = EvtBudget_jTextField3.getText();
        String EvtLoc    = EvtLocation_jTextField5.getText();
        String EvtStart  = EvtStart_jTextField6.getText();
        String EvtEnd    = EvtEnd_jTextField7.getText();
        String ClubID    = ClubID_jTextField4.getText();

        int AdvApd = 0;
        if (AdvAPD_jCheckBox.isSelected()) {
            AdvApd = 1;
        }

        int SaoApd = 0;
        if (SAOAPD_jCheckBox.isSelected()) {
            AdvApd = 1;
        }

        String qry = "UPDATE Event "
                + "SET "
                + "EvtID        = "   + EvtID     + ", "
                + "EvtName      = '"  + EvtName   + "', "
                + "EvtDescript  = '"  + EvtDesc   + "', "
                + "EvtBudget    = "   + EvtBudget + ", "
                + "EvtLocation  = '"  + EvtLoc    + "', "
                + "EvtStart     = '"  + EvtStart  + "', "
                + "EvtEnd       = '"  + EvtEnd    + "', "
                + "ClubID       = "   + ClubID    + ", "
                + "AdvApproval  = "   + AdvApd    + ", "
                + "SAOApproval  = "   + SaoApd    
                + "WHERE EvtID  = "   + EvtID     ;

        String Conn_url = "jdbc:mysql://localhost/saodb?serverTimezone=UTC";
        String Uid = "root";
        String PW = "marrakec";
        //ResultSet rs = null;

        try {
            Connection conn = DriverManager.getConnection(Conn_url, Uid, PW);
            //System.out.println("connxion dazet");

            Statement stmt = (Statement) conn.createStatement();

            // Result Set get the result of the SQL query
            stmt.executeUpdate(qry);

            JOptionPane.showMessageDialog(this, "Updated successfully!");

        } catch (SQLException ex) {
            Logger.getLogger(ListEvents.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "A problem has occured in connexion to the Database!");
        }

    }//GEN-LAST:event_Update_jButtonActionPerformed

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


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListEvents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AdvAPD_jCheckBox;
    private javax.swing.JButton AllEvts_jButton;
    private javax.swing.JButton Clear_btn;
    private javax.swing.JButton Clear_jButton;
    private javax.swing.JTextField ClubID_jTextField4;
    private javax.swing.JButton Delete_jButton;
    private javax.swing.JTextField EndDate_jTextField1;
    private javax.swing.JTextField EventID_jTextField;
    private javax.swing.JTextField EvtBudget_jTextField3;
    private javax.swing.JTextField EvtCode_TextField;
    private javax.swing.JTextField EvtDesc_jTextField2;
    private javax.swing.JTextField EvtEnd_jTextField7;
    private javax.swing.JTextField EvtLocation_jTextField5;
    private javax.swing.JTextField EvtName_jTextField;
    private javax.swing.JTextField EvtStart_jTextField6;
    private javax.swing.JButton Exit_btn;
    private javax.swing.JButton MainMenu_btn;
    private javax.swing.JCheckBox SAOAPD_jCheckBox;
    private javax.swing.JButton SearchDate_jButton;
    private javax.swing.JButton Search_btn;
    private javax.swing.JTextField StartDate_jTextField;
    private javax.swing.JButton UnApprovedEvt_jButton;
    private javax.swing.JButton Update_jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
