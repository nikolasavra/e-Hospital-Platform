/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectt;

import icons.FontAwesome;
import jiconfont.swing.IconFontSwing;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author alex
 */
public class Patient_App extends javax.swing.JFrame {

    /**
     * Creates new form Patient_App
     */
    public Patient_App() {
        IconFontSwing.register(FontAwesome.getIconFont()); 
        initComponents();
//        getAppointments();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        back_Button1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        app_type = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        app_table = new javax.swing.JTable();
        add_appointment = new javax.swing.JButton();
        cancel_appointment = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(150, 235, 240));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A4AD5659B5D44610AB530DF0BAB8279D.jpeg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/patient.jpg"))); // NOI18N

        back_Button1.setIcon(IconFontSwing.buildIcon(FontAwesome.ARROW_CIRCLE_LEFT, 50, Color.black));
        back_Button1.setBorderPainted(false);
        back_Button1.setContentAreaFilled(false);
        back_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_Button1ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(150, 235, 240));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField1.setText("Ραντεβού Ασθενή");
        jTextField1.setBorder(null);
        jTextField1.setFocusable(false);

        app_type.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        app_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Επίσκεψη", "Εξετάσεις", "Εμβόλιο" }));
        app_type.setSelectedIndex(-1);
        app_type.setToolTipText("");
        app_type.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                app_typeItemStateChanged(evt);
            }
        });

        app_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Ραντεβού", "Γιατρός", "Ραντεβού", "Ημερομηνία"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        app_table.setDefaultEditor(Object.class, null);
        app_table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(app_table);
        if (app_table.getColumnModel().getColumnCount() > 0) {
            app_table.getColumnModel().getColumn(2).setResizable(false);
        }

        add_appointment.setBackground(new java.awt.Color(0, 0, 0));
        add_appointment.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        add_appointment.setForeground(new java.awt.Color(255, 255, 255));
        add_appointment.setText("Δημιουργία Ραντεβού");
        add_appointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_appointmentActionPerformed(evt);
            }
        });

        cancel_appointment.setBackground(new java.awt.Color(0, 0, 0));
        cancel_appointment.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cancel_appointment.setForeground(new java.awt.Color(255, 255, 255));
        cancel_appointment.setText("Ακύρωση Ραντεβού");
        cancel_appointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_appointmentActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel3.setText("Είδος Ραντεβού");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cancel_appointment, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(add_appointment, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                .addGap(0, 53, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(app_type, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(back_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(app_type, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(add_appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(cancel_appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeAppointment() {
        DefaultTableModel tablemodel = (DefaultTableModel) app_table.getModel();

        int row = app_table.getSelectedRow();

        if (row != -1) {

            try {
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");

                switch (app_type.getSelectedIndex()) {
                    case 0: {
                        int id = (int) app_table.getValueAt(row, 0);
                        System.out.println(" " + id);
                        String query = "DELETE FROM appointment WHERE app_id='" + id + "' ";
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.executeUpdate();
                        tablemodel.removeRow(app_table.getSelectedRow());
                        JOptionPane.showMessageDialog(this, "Το ραντεβού ακυρώθηκε με επιτυχία!");
                        break;
                    }
                    case 1: {
                        int id = (int) app_table.getValueAt(row, 0);
                        System.out.println(" " + id);
                        String query = "DELETE FROM appointment WHERE app_id='" + id + "' ";
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.executeUpdate();
                        tablemodel.removeRow(app_table.getSelectedRow());
                        JOptionPane.showMessageDialog(this, "Το ραντεβού ακυρώθηκε με επιτυχία!");
                        break;
                    }
                    default:
                        int id = (int) app_table.getValueAt(row, 0);
                        System.out.println(" " + id);
                        String query = "DELETE FROM appointment WHERE app_id='" + id + "' ";
                        PreparedStatement pst = con.prepareStatement(query);
                        pst.executeUpdate();
                        tablemodel.removeRow(app_table.getSelectedRow());
                        JOptionPane.showMessageDialog(this, "Το ραντεβού ακυρώθηκε με επιτυχία!");
                        break;
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Δεν υπάρχει καταχωρημένο ραντεβού!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Επιλέξτε ραντεβού!");
        }
    }
    
    private void getAppointments() {

            try {
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
                LogIn_Patient patient = new LogIn_Patient();
                String patient_id = patient.patient_userId();

                if (app_type.getSelectedIndex() == 0) {
                    String query = "SELECT visit_id AS ID_Ραντεβού, CONCAT(first_name,' ',last_name) AS Ονοματεπώνυμο, app_type AS Ραντεβού, app_date FROM visit INNER JOIN user ON doctor_id=user_id INNER JOIN appointment on visit_id=app_id";
                    PreparedStatement pst = con.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    if (!rs.isBeforeFirst()) {
                        app_table.setModel(new DefaultTableModel(null, new String[]{"ID_Ραντεβού", "Γιατρός", "Ραντεβού", "Ημερομηνία"}));
                        JOptionPane.showMessageDialog(this, "Δεν υπάρχουν ραντεβού για αυτή την ημερομηνία.");
                    } else {
                        app_table.setModel(DbUtils.resultSetToTableModel(rs));
                    }
                }
                if (app_type.getSelectedIndex() == 1) {
                    String query = "SELECT test_id AS ID_Ραντεβού,CONCAT(first_name,' ',last_name) AS Ονοματεπώνυμο, test_title AS Ραντεβού, app_date FROM tests INNER JOIN user ON lab_id=user_id INNER JOIN appointment on test_id=app_id ";
                    PreparedStatement pst = con.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    if (!rs.isBeforeFirst()) {
                        app_table.setModel(new DefaultTableModel(null, new String[]{"ID_Ραντεβού", "Γιατρός", "Ραντεβού", "Ημερομηνία"}));
                        JOptionPane.showMessageDialog(this, "Δεν υπάρχουν ραντεβού για αυτή την ημερομηνία.");
                    } else {
                        app_table.setModel(DbUtils.resultSetToTableModel(rs));
                    }
                }

                if (app_type.getSelectedIndex() == 2) {
                    String query = "SELECT vacc_app_id AS ID_Ραντεβού, CONCAT(first_name,' ',last_name) AS Ονοματεπώνυμο, vaccine_title AS Ραντεβού, app_date FROM covid_vaccine INNER JOIN user ON vacc_man_id=user_id INNER JOIN appointment on vacc_app_id=app_id  ";
                    PreparedStatement pst = con.prepareStatement(query);
                    ResultSet rs = pst.executeQuery();
                    if (!rs.isBeforeFirst()) {
                        app_table.setModel(new DefaultTableModel(null, new String[]{"ID_Ραντεβού", "Γιατρός", "Ραντεβού", "Ημερομηνία"}));
                        JOptionPane.showMessageDialog(this, "Δεν υπάρχουν ραντεβού για αυτή την ημερομηνία.");
                    } else {
                        app_table.setModel(DbUtils.resultSetToTableModel(rs));
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Δεν υπάρχει καταχωρημένο ραντεβού!");
        }
        
    }
    
    private void createAppointment() {
        switch (app_type.getSelectedIndex()) {
            case 0:
                new Visit_Creation().setVisible(true);
                break;
            case 1:
                new Tests_Creation().setVisible(true);
                break;
            case 2:
                new Covid_Vaccine_Creation().setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Επιλέξτε είδος ραντεβού!");

        }
    }
    
    private void back_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_Button1ActionPerformed
        dispose();
        new Patient().setVisible(true);
    }//GEN-LAST:event_back_Button1ActionPerformed

    private void add_appointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_appointmentActionPerformed
         createAppointment();
    }//GEN-LAST:event_add_appointmentActionPerformed

    private void cancel_appointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_appointmentActionPerformed
        removeAppointment();
    }//GEN-LAST:event_cancel_appointmentActionPerformed

    private void app_typeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_app_typeItemStateChanged
        getAppointments();
    }//GEN-LAST:event_app_typeItemStateChanged
      

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
            java.util.logging.Logger.getLogger(Patient_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_appointment;
    private javax.swing.JTable app_table;
    private javax.swing.JComboBox<String> app_type;
    private javax.swing.JButton back_Button1;
    private javax.swing.JButton cancel_appointment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
