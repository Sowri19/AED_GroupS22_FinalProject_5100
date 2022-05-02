package ui.ClientRole;

import model.RS_Administrator;

public class RS_ClientJPanel extends javax.swing.JPanel {

    private RS_Administrator EPAdmin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private String user;

    public RS_ClientJPanel(RS_Administrator EPAdmin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2) {
        initComponents();
        this.EPAdmin = EPAdmin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        setBackground(new java.awt.Color(255, 204, 204));
        backBtn.setBackground(new java.awt.Color(244, 120, 140));
        backBtn.setOpaque(true);
        btnBookResort.setBackground(new java.awt.Color(244, 120, 140));
        btnBookResort.setOpaque(true);
        manageBooking.setBackground(new java.awt.Color(244, 120, 140));
        manageBooking.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBookResort = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        manageBooking = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("CLIENT PANEL ");

        btnBookResort.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBookResort.setText("RESORT BOOKING AND SERVICES");
        btnBookResort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookResortActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setText("BACK");

        manageBooking.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageBooking.setText("MANAGE BOOKING");
        manageBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(373, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBookResort, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(332, 332, 332))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(btnBookResort, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(manageBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(458, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageBookingActionPerformed
        callOnCreateMethod2.run();
    }//GEN-LAST:event_manageBookingActionPerformed

    private void btnBookResortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookResortActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnBookResortActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnBookResort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageBooking;
    // End of variables declaration//GEN-END:variables
}
