package ui.ResortManagerRole;

import model.RS_Administrator;

public class RS_ResortMainPanel extends javax.swing.JPanel {

    private RS_Administrator EPAdmin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;
    private Runnable callOnCreateMethod4;

    public RS_ResortMainPanel(RS_Administrator EPAdmin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3, Runnable callOnCreateMethod4) {
        initComponents();
        this.EPAdmin = EPAdmin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
        this.callOnCreateMethod4 = callOnCreateMethod4;
        setBackground(new java.awt.Color(255, 208, 56));
        viewTask.setBackground(new java.awt.Color(0, 102, 102));
        viewTask.setOpaque(true);
        orgBtn.setBackground(new java.awt.Color(0, 102, 102));
        orgBtn.setOpaque(true);
        orgAdminBtn.setBackground(new java.awt.Color(0, 102, 102));
        orgAdminBtn.setOpaque(true);
        manageRooms.setBackground(new java.awt.Color(0, 102, 102));
        manageRooms.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblsysadmin = new javax.swing.JLabel();
        orgAdminBtn = new javax.swing.JButton();
        orgBtn = new javax.swing.JButton();
        viewTask = new javax.swing.JButton();
        manageRooms = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 208, 56));
        setLayout(null);

        lblsysadmin.setFont(new java.awt.Font("Baskerville Old Face", 3, 36)); // NOI18N
        lblsysadmin.setText("RESORT SUPERVISOR");
        add(lblsysadmin);
        lblsysadmin.setBounds(130, 90, 410, 40);

        orgAdminBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        orgAdminBtn.setText("ORGANIZATION ADMIN");
        orgAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgAdminBtnActionPerformed(evt);
            }
        });
        add(orgAdminBtn);
        orgAdminBtn.setBounds(110, 330, 260, 40);

        orgBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        orgBtn.setText("SUPERVISE ORGANIZATION ");
        orgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgBtnActionPerformed(evt);
            }
        });
        add(orgBtn);
        orgBtn.setBounds(360, 260, 300, 40);

        viewTask.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        viewTask.setText("TASK DASHBOARD");
        viewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskActionPerformed(evt);
            }
        });
        add(viewTask);
        viewTask.setBounds(120, 200, 240, 40);

        manageRooms.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        manageRooms.setText("SUPERVISE RESORT");
        manageRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRoomsActionPerformed(evt);
            }
        });
        add(manageRooms);
        manageRooms.setBounds(360, 410, 270, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rs.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(600, 30, 110, 130);
    }// </editor-fold>//GEN-END:initComponents

    private void orgAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgAdminBtnActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_orgAdminBtnActionPerformed

    private void viewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_viewTaskActionPerformed

    private void orgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgBtnActionPerformed
        callOnCreateMethod2.run();
    }//GEN-LAST:event_orgBtnActionPerformed

    private void manageRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRoomsActionPerformed
        callOnCreateMethod4.run();
    }//GEN-LAST:event_manageRoomsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JButton manageRooms;
    private javax.swing.JButton orgAdminBtn;
    private javax.swing.JButton orgBtn;
    private javax.swing.JButton viewTask;
    // End of variables declaration//GEN-END:variables
}
