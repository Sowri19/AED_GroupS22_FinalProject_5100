package ui.EntertainmentsupervisorRole;

import model.RS_Administrator;

public class RS_EntertainmentSupervisorPanel extends javax.swing.JPanel {

    private RS_Administrator EPAdmin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;

    public RS_EntertainmentSupervisorPanel(RS_Administrator EPAdmin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3) {
        initComponents();
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
       setBackground(new java.awt.Color(255, 208, 56));
        btnDisplayDashboard.setBackground(new java.awt.Color(0, 102, 102));
        btnDisplayDashboard.setOpaque(true);
        btnSuperviseEvent.setBackground(new java.awt.Color(0, 102, 102));
        btnSuperviseEvent.setOpaque(true);
        btnSuperviseEventAdmin.setBackground(new java.awt.Color(0, 102, 102));
        btnSuperviseEventAdmin.setOpaque(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnDisplayDashboard = new javax.swing.JButton();
        btnSuperviseEvent = new javax.swing.JButton();
        btnSuperviseEventAdmin = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 208, 56));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 3, 36)); // NOI18N
        jLabel1.setText("ENTERTAINMENT SUPERVISOR PANEL ");

        btnDisplayDashboard.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnDisplayDashboard.setText("DISPLAY DASHBOARD");
        btnDisplayDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayDashboardActionPerformed(evt);
            }
        });

        btnSuperviseEvent.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnSuperviseEvent.setText("SUPERVISE EVENT");
        btnSuperviseEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuperviseEventActionPerformed(evt);
            }
        });

        btnSuperviseEventAdmin.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnSuperviseEventAdmin.setText("SUPERVISE EVENT ADMIN");
        btnSuperviseEventAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuperviseEventAdminActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rs Icon.png"))); // NOI18N
        jLabel8.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(365, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSuperviseEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSuperviseEventAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDisplayDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(btnDisplayDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnSuperviseEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnSuperviseEventAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisplayDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayDashboardActionPerformed
                 callOnCreateMethod1.run();
    }//GEN-LAST:event_btnDisplayDashboardActionPerformed

    private void btnSuperviseEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuperviseEventActionPerformed
         callOnCreateMethod2.run();
    }//GEN-LAST:event_btnSuperviseEventActionPerformed

    private void btnSuperviseEventAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuperviseEventAdminActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_btnSuperviseEventAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisplayDashboard;
    private javax.swing.JButton btnSuperviseEvent;
    private javax.swing.JButton btnSuperviseEventAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
