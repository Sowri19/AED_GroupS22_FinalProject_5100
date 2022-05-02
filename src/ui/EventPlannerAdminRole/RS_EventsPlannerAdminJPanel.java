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
        setBackground(new java.awt.Color(255, 204, 204));

        btnServiceLocations.setBackground(new java.awt.Color(244, 120, 140));
        btnServiceLocations.setOpaque(true);
        btnClients.setBackground(new java.awt.Color(244, 120, 140));
        btnClients.setOpaque(true);
        btnEventSupervisor.setBackground(new java.awt.Color(244, 120, 140));
        btnEventSupervisor.setOpaque(true);
        btnBusinessCatalogue.setBackground(new java.awt.Color(244, 120, 140));
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

        btnServiceLocations.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnServiceLocations.setText("SERVICE LOCATIONS");
        btnServiceLocations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiceLocationsActionPerformed(evt);
            }
        });

        btnBusinessCatalogue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBusinessCatalogue.setText("BUSINESS CATALOGUE");
        btnBusinessCatalogue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusinessCatalogueActionPerformed(evt);
            }
        });

        btnClients.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClients.setText("CLIENT");
        btnClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientsActionPerformed(evt);
            }
        });

        lbleventadmin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbleventadmin.setText("EVENTS PLANNER ADMIN");

        btnEventSupervisor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEventSupervisor.setText("EVENT SUPERVISOR");
        btnEventSupervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventSupervisorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(lbleventadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnBusinessCatalogue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(btnServiceLocations, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(btnEventSupervisor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(btnClients, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(lbleventadmin)
                .addGap(76, 76, 76)
                .addComponent(btnServiceLocations, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnBusinessCatalogue, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnEventSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnClients, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
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
    private javax.swing.JLabel lbleventadmin;
    // End of variables declaration//GEN-END:variables
}
