package ui.EventPlannerAdminRole;

import java.awt.Color;
import model.RS_Administrator;

public class RS_EventsPlannerAdminJPanel extends javax.swing.JPanel {

    RS_Administrator systems;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;
    private Runnable callOnCreateMethod4;

    public RS_EventsPlannerAdminJPanel(RS_Administrator systems, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3, Runnable callOnCreateMethod4) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
        this.callOnCreateMethod4 = callOnCreateMethod4;
        setBackground(new java.awt.Color(255, 208, 56));

        btnServiceLocations.setBackground(new java.awt.Color(0, 102, 102));
        btnServiceLocations.setOpaque(true);
        btnClients.setBackground(new java.awt.Color(0, 102, 102));
        btnClients.setOpaque(true);
        btnEventSupervisor.setBackground(new java.awt.Color(0, 102, 102));
        btnEventSupervisor.setOpaque(true);
        btnBusinessCatalogue.setBackground(new java.awt.Color(0, 102, 102));
        btnBusinessCatalogue.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnServiceLocations = new javax.swing.JButton();
        btnBusinessCatalogue = new javax.swing.JButton();
        btnClients = new javax.swing.JButton();
        lbleventadmin = new javax.swing.JLabel();
        btnEventSupervisor = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 208, 56));

        btnServiceLocations.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnServiceLocations.setText("SERVICE LOCATIONS");
        btnServiceLocations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiceLocationsActionPerformed(evt);
            }
        });

        btnBusinessCatalogue.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnBusinessCatalogue.setText("BUSINESS CATALOGUE");
        btnBusinessCatalogue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusinessCatalogueActionPerformed(evt);
            }
        });

        btnClients.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnClients.setText("CLIENT");
        btnClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientsActionPerformed(evt);
            }
        });

        lbleventadmin.setFont(new java.awt.Font("Baskerville Old Face", 3, 36)); // NOI18N
        lbleventadmin.setText("EVENTS PLANNER ADMIN");

        btnEventSupervisor.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnEventSupervisor.setText("BUSINESS SUPERVISOR");
        btnEventSupervisor.setMaximumSize(new java.awt.Dimension(225, 27));
        btnEventSupervisor.setMinimumSize(new java.awt.Dimension(225, 27));
        btnEventSupervisor.setPreferredSize(new java.awt.Dimension(225, 27));
        btnEventSupervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventSupervisorActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rs.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(lbleventadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBusinessCatalogue, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(168, 168, 168)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnServiceLocations, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEventSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(372, 372, 372)
                            .addComponent(btnClients, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbleventadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(94, 94, 94)
                .addComponent(btnServiceLocations, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnBusinessCatalogue, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnEventSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnClients, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBusinessCatalogueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusinessCatalogueActionPerformed
        callOnCreateMethod2.run();

    }//GEN-LAST:event_btnBusinessCatalogueActionPerformed

    private void btnServiceLocationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiceLocationsActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_btnServiceLocationsActionPerformed

    private void btnClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientsActionPerformed
        callOnCreateMethod4.run();
    }//GEN-LAST:event_btnClientsActionPerformed

    private void btnEventSupervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventSupervisorActionPerformed
        callOnCreateMethod3.run();
    }//GEN-LAST:event_btnEventSupervisorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusinessCatalogue;
    private javax.swing.JButton btnClients;
    private javax.swing.JButton btnEventSupervisor;
    private javax.swing.JButton btnServiceLocations;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbleventadmin;
    // End of variables declaration//GEN-END:variables
}
