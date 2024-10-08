/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

import Dao.ConnectionProvider;
import Utility.BDUtility;
import java.awt.Color;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Sadini Kavindya
 */
public class ViewAttendence extends javax.swing.JFrame {

    /**
     * Creates new form ViewAttendence
     */
    public ViewAttendence() {
        initComponents();
        BDUtility.setImage(this, "images/abc1.jpg", 1101, 501);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));

        dateChooserFrom.setDateFormatString("yyyy-MM-dd");
        dateChooserFrom.setDateFormatString("yyyy-MM-dd");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        dateChooserTo = new com.toedter.calendar.JDateChooser();
        dateChooserFrom = new com.toedter.calendar.JDateChooser();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Presentlbl = new javax.swing.JLabel();
        Absentlbl = new javax.swing.JLabel();
        lblAbsent = new javax.swing.JLabel();
        lblPresent = new javax.swing.JLabel();
        checkBoxContact = new javax.swing.JCheckBox();
        checkBoxState = new javax.swing.JCheckBox();
        checkBoxAddress = new javax.swing.JCheckBox();
        checkBoxCountry = new javax.swing.JCheckBox();
        checkBoxUniqueRegId = new javax.swing.JCheckBox();
        btnResetFilters = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Attendence Track");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(UserTable);

        dateChooserTo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateChooserToPropertyChange(evt);
            }
        });

        dateChooserFrom.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateChooserFromPropertyChange(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(0, 0, 0));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("On/From");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("To");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Search");

        Presentlbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Presentlbl.setForeground(new java.awt.Color(0, 0, 0));
        Presentlbl.setText("Present");

        Absentlbl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Absentlbl.setForeground(new java.awt.Color(0, 0, 0));
        Absentlbl.setText("Absent");

        lblAbsent.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblAbsent.setForeground(new java.awt.Color(204, 0, 0));
        lblAbsent.setText("--------");

        lblPresent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPresent.setForeground(new java.awt.Color(0, 153, 0));
        lblPresent.setText("--------");

        checkBoxContact.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        checkBoxContact.setForeground(new java.awt.Color(0, 0, 0));
        checkBoxContact.setText("Contact");
        checkBoxContact.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxContactItemStateChanged(evt);
            }
        });

        checkBoxState.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        checkBoxState.setForeground(new java.awt.Color(0, 0, 0));
        checkBoxState.setText("State");
        checkBoxState.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxStateItemStateChanged(evt);
            }
        });

        checkBoxAddress.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        checkBoxAddress.setForeground(new java.awt.Color(0, 0, 0));
        checkBoxAddress.setText("Address");
        checkBoxAddress.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxAddressItemStateChanged(evt);
            }
        });

        checkBoxCountry.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        checkBoxCountry.setForeground(new java.awt.Color(0, 0, 0));
        checkBoxCountry.setText("Country");
        checkBoxCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxCountryItemStateChanged(evt);
            }
        });

        checkBoxUniqueRegId.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        checkBoxUniqueRegId.setForeground(new java.awt.Color(0, 0, 0));
        checkBoxUniqueRegId.setText("Unique Reg ID");
        checkBoxUniqueRegId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxUniqueRegIdItemStateChanged(evt);
            }
        });

        btnResetFilters.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnResetFilters.setForeground(new java.awt.Color(0, 0, 0));
        btnResetFilters.setText("Reset Filters");
        btnResetFilters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetFiltersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(437, 437, 437)
                        .addComponent(btnExit))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkBoxContact)
                                            .addComponent(checkBoxUniqueRegId)
                                            .addComponent(checkBoxAddress)
                                            .addComponent(checkBoxState)
                                            .addComponent(checkBoxCountry))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnResetFilters)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Absentlbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblAbsent))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Presentlbl)
                                        .addGap(39, 39, 39)
                                        .addComponent(lblPresent)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateChooserFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateChooserTo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(Presentlbl)
                    .addComponent(lblPresent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbsent)
                    .addComponent(Absentlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooserTo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooserFrom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(checkBoxContact)
                        .addGap(26, 26, 26)
                        .addComponent(checkBoxAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkBoxState)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkBoxCountry)
                        .addGap(27, 27, 27)
                        .addComponent(checkBoxUniqueRegId)
                        .addGap(105, 105, 105)
                        .addComponent(btnResetFilters)
                        .addGap(14, 14, 14))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnResetFiltersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetFiltersActionPerformed
         txtSearch.setText("");

    // Reset date pickers to null
    dateChooserFrom.setDate(null);
    dateChooserTo.setDate(null);

    // Unselect all checkboxes
    checkBoxContact.setSelected(false);
    checkBoxAddress.setSelected(false);
    checkBoxState.setSelected(false);
    checkBoxCountry.setSelected(false);
    checkBoxUniqueRegId.setSelected(false);

    // Reload the data in the table
    loadDataInTable();
    }//GEN-LAST:event_btnResetFiltersActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    loadDataInTable();
    }//GEN-LAST:event_formComponentShown

    private void checkBoxContactItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxContactItemStateChanged
     loadDataInTable();   
    }//GEN-LAST:event_checkBoxContactItemStateChanged

    private void checkBoxAddressItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxAddressItemStateChanged
        // TODO add your handling code here:
         loadDataInTable();
    }//GEN-LAST:event_checkBoxAddressItemStateChanged

    private void checkBoxStateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxStateItemStateChanged
        // TODO add your handling code here:
         loadDataInTable();
    }//GEN-LAST:event_checkBoxStateItemStateChanged

    private void checkBoxCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxCountryItemStateChanged
        // TODO add your handling code here:
         loadDataInTable();
    }//GEN-LAST:event_checkBoxCountryItemStateChanged

    private void checkBoxUniqueRegIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxUniqueRegIdItemStateChanged
        // TODO add your handling code here:
         loadDataInTable();
    }//GEN-LAST:event_checkBoxUniqueRegIdItemStateChanged

    private void dateChooserFromPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateChooserFromPropertyChange
        // TODO add your handling code here:
        loadDataInTable();
    }//GEN-LAST:event_dateChooserFromPropertyChange

    private void dateChooserToPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateChooserToPropertyChange
        // TODO add your handling code here:
        loadDataInTable();
    }//GEN-LAST:event_dateChooserToPropertyChange

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        loadDataInTable();
    }//GEN-LAST:event_txtSearchKeyReleased

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
            java.util.logging.Logger.getLogger(ViewAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAttendence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Absentlbl;
    private javax.swing.JLabel Presentlbl;
    private javax.swing.JTable UserTable;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnResetFilters;
    private javax.swing.JCheckBox checkBoxAddress;
    private javax.swing.JCheckBox checkBoxContact;
    private javax.swing.JCheckBox checkBoxCountry;
    private javax.swing.JCheckBox checkBoxState;
    private javax.swing.JCheckBox checkBoxUniqueRegId;
    private com.toedter.calendar.JDateChooser dateChooserFrom;
    private com.toedter.calendar.JDateChooser dateChooserTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAbsent;
    private javax.swing.JLabel lblPresent;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

  private void loadDataInTable() {
    List<String> columns = new ArrayList<>(Arrays.asList("ID", "Name", "Gender", "Email", "Date", "CheckIn", "CheckOut", "Work Duration"));
    String searchText = txtSearch.getText().trim();
    Date fromDateFromCal = dateChooserFrom.getDate();
    LocalDate fromDate = null;
    if (fromDateFromCal != null) {
        fromDate = fromDateFromCal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
    Date toDateFromCal = dateChooserTo.getDate();
    LocalDate toDate = null;
    if (toDateFromCal != null) {
        toDate = toDateFromCal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
    Long daysBetween = null;
    if (fromDate != null && toDate != null) {
        daysBetween = countWeekdays(fromDate, toDate);
    }
    Boolean contactIncluded = checkBoxContact.isSelected();
    Boolean addressIncluded = checkBoxAddress.isSelected();
    Boolean stateIncluded = checkBoxState.isSelected();
    Boolean countryIncluded = checkBoxCountry.isSelected();
    Boolean uniqueRegIdIncluded = checkBoxUniqueRegId.isSelected();

    String sqlQuery = "SELECT ud.id, ud.name, ud.gender, ud.email, ua.date, ua.checkin, ua.checkout, ua.workduration";
    if (contactIncluded) {
        columns.add("Contact");
        sqlQuery += ", ud.contract";
    }
    if (addressIncluded) {
        columns.add("Address");
        sqlQuery += ", ud.address";
    }
    if (stateIncluded) {
        columns.add("State");
        sqlQuery += ", ud.state";
    }
    if (countryIncluded) {
        columns.add("Country");
        sqlQuery += ", ud.country";
    }
    if (uniqueRegIdIncluded) {
        columns.add("Unique Reg ID");
        sqlQuery += ", ud.uniqueregid";
    }
    sqlQuery += " FROM userdetails AS ud INNER JOIN userattendence AS ua ON ud.id = ua.userid";

    boolean hasCondition = false;
    if (searchText != null && !searchText.isEmpty()) {
        sqlQuery += " WHERE (ud.name LIKE '%" + searchText + "%' OR ud.email LIKE '%" + searchText + "%')";
        hasCondition = true;
    }

    if (fromDate != null && toDate != null) {
        sqlQuery += hasCondition ? " AND" : " WHERE";
        sqlQuery += " ua.date BETWEEN '" + fromDate + "' AND '" + toDate + "'";
    } else if (fromDate != null) {
        sqlQuery += hasCondition ? " AND" : " WHERE";
        sqlQuery += " ua.date = '" + fromDate + "'";
    }

    DefaultTableModel model = new DefaultTableModel();
    model.setColumnIdentifiers(columns.toArray());
    UserTable.setModel(model);

    try {
        Connection con = ConnectionProvider.getCon();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sqlQuery);

        Long presentCount = 0L;
        Long absentCount = 0L;
        Set<String> emailList = new HashSet<>();

        while (rs.next()) {
            List<Object> row = new ArrayList<>();
            row.add(rs.getString("id"));
            row.add(rs.getString("name"));
            row.add(rs.getString("gender"));
            row.add(rs.getString("email"));
            row.add(rs.getString("date"));
            row.add(rs.getString("checkin"));
            row.add(rs.getString("checkout"));
            row.add(rs.getString("workduration"));
            if (contactIncluded) {
                row.add(rs.getString("contract"));
            }
            if (addressIncluded) {
                row.add(rs.getString("address"));
            }
            if (stateIncluded) {
                row.add(rs.getString("state"));
            }
            if (countryIncluded) {
                row.add(rs.getString("country"));
            }
            if (uniqueRegIdIncluded) {
                row.add(rs.getString("uniqueregid"));
            }

            emailList.add(rs.getString("email")); // Add email to the set

            if (rs.getString("checkout") == null) {
                absentCount++;
            } else {
                presentCount++;
            }
            model.addRow(row.toArray());
        }

        if (emailList.size() == 1) {
            lblPresent.setVisible(true);
            lblAbsent.setVisible(true);
            Presentlbl.setVisible(true);
            Absentlbl.setVisible(true);
            lblPresent.setText(presentCount.toString());
            if (daysBetween != null && daysBetween > 0) {
                absentCount = daysBetween - presentCount;
            }
            lblAbsent.setText(absentCount.toString());
        } else {
            lblPresent.setVisible(false);
            lblAbsent.setVisible(false);
            Presentlbl.setVisible(false);
            Absentlbl.setVisible(false);
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Something Went Wrong: " + ex.getMessage());
    }
}

private Long countWeekdays(LocalDate start, LocalDate end) {
    long count = 0;
    LocalDate date = start;
    while (date.isBefore(end) || date.equals(end)) {
        if (!(date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY)) {
            count++;
        }
        date = date.plusDays(1);
    }
    return count;
}}