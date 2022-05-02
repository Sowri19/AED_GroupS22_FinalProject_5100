package ui.ResortManagerRole;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.RS_HallBooking;
import model.RS_Client;
import model.RS_ClientDirectory;
import model.RS_BC_Resort;
import model.RS_TourGuideORG;
import model.RS_Organization;
import model.RS_Administrator;
import model.RS_CarServiceORG;
import RS_Model.services.RS_BC_ResortService;
import RS_Model.services.RS_Service;

public class RS_DisplayOrderForResort extends javax.swing.JPanel {

    private RS_Administrator EPAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private RS_BC_Resort resort;

    public RS_DisplayOrderForResort(RS_Administrator EPAdmin, Runnable callOnCreateMethod, String user, String type, RS_BC_Resort hotel) {
        initComponents();
        this.EPAdmin = EPAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.resort = hotel;
        populateComboBox();
        populateTable();
        setBackground(new java.awt.Color(255, 204, 204));
        viewTask.setBackground(new java.awt.Color(244, 120, 140));
        viewTask.setOpaque(true);
        backButton.setBackground(new java.awt.Color(244, 120, 140));
        backButton.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tourGuideOrg = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        carServiceOrg = new javax.swing.JComboBox();
        viewTask = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "CUSTOMER NAME", "STATUS", "TOUR GUIDE", "CAR SERVICES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("SELECT A TOUR GUIDE ORG");

        tourGuideOrg.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tourGuideOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tourGuideOrgActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("SELECT A CAR SERVICE ORG");

        viewTask.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewTask.setText("ASSIGN AND CONFIRM TASK");
        viewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setText("DISPALY ORDER DETAILS FOR RESORT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tourGuideOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carServiceOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(719, 719, 719))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))))
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(viewTask)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backButton)
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tourGuideOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carServiceOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(viewTask, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void viewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign tasks.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        RS_HallBooking booking = (RS_HallBooking) model.getValueAt(selectedRowIndex, 0);

        RS_BC_ResortService resortService = null;
        for (RS_Service service : booking.getServices()) {
            if (resort.getName().equals(service.getBusinessCatalogue().getName())) {
                resortService = (RS_BC_ResortService) service;
                break;
            }
        }

        if (resortService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find hotel");
            return;
        }

        if (!resortService.getStatus().equals(RS_Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        RS_TourGuideORG tourGuide = (RS_TourGuideORG) tourGuideOrg.getSelectedItem();
        RS_CarServiceORG carServices = (RS_CarServiceORG) carServiceOrg.getSelectedItem();

        List<RS_Organization> organizations = new ArrayList<>();
        for (RS_BC_ResortService.ResortServiceType type : resortService.getResortServices()) {
            switch (type) {
                case TOURGUIDE:
                    if (tourGuide == null) {
                        JOptionPane.showMessageDialog(this, "Please select tour guide organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(tourGuide);
                    }
                    break;
                case CARSERVICE:
                    if (carServices == null) {
                        JOptionPane.showMessageDialog(this, "Please select car services organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(carServices);
                    }
                    break;
            }
        }

        for (RS_Organization organization : organizations) {
            resortService.addOrganization(organization);
        }
        resortService.setStatus(RS_Service.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all resort services to the booking: " + booking.getId());
        populateTable();
    }//GEN-LAST:event_viewTaskActionPerformed

    private void tourGuideOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tourGuideOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tourGuideOrgActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        RS_ClientDirectory clientDirectory = EPAdmin.getClientDirectory(); //get all customers
        for (RS_Client client : clientDirectory.getListOfClientDirectory()) {
            for (RS_HallBooking booking : client.getHallbookingList()) {      //get booking details each client
                for (RS_Service service : booking.getServices()) {       //get services under booking
                    System.out.println("Enterprise : " + service.getBusinessCatalogue());
                    if (resort.getName().equals(service.getBusinessCatalogue().getName())) {
                        RS_BC_ResortService resortService = (RS_BC_ResortService) service;

                        Object row[] = new Object[10];
                        row[0] = booking;
                        row[1] = client;
                        row[2] = resortService.getStatus();
                        row[3] = "NO";
                        row[4] = "NO";

                        for (RS_BC_ResortService.ResortServiceType type : resortService.getResortServices()) {
                            switch (type) {
                                case TOURGUIDE:
                                    row[3] = "YES";
                                    break;
                                case CARSERVICE:
                                    row[4] = "YES";
                                    break;
                            }
                        }
                        model.addRow(row);
                    }
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox carServiceOrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox tourGuideOrg;
    private javax.swing.JButton viewTask;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {
        tourGuideOrg.addItem(null);
        carServiceOrg.addItem(null);

        for (RS_TourGuideORG tourGuide : resort.getTourGuideORG()) {
            if (tourGuide != null) {
                tourGuideOrg.addItem(tourGuide);
            }
        }
        for (RS_CarServiceORG carServices : resort.getCarServiceORGList()) {
            if (carServices != null) {
                carServiceOrg.addItem(carServices);
            }
        }
    }
}
