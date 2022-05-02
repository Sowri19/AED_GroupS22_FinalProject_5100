package ui.EventManagerRole;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.RS_HallBooking;
import model.RS_BC_Events;
import model.RS_Event_BirthdayParty;
import model.RS_Client;
import model.RS_ClientDirectory;
import model.RS_Event_Meetings;
import model.RS_Organization;
import model.RS_Event_Wedding;
import model.RS_Administrator;
import RS_Model.services.RS_BC_EventService;
import RS_Model.services.RS_Service;

public class RS_DisplayEventPanel extends javax.swing.JPanel {

    private RS_Administrator EPAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private RS_BC_Events businessEvent;

    public RS_DisplayEventPanel(RS_Administrator EPAdmin, Runnable callOnCreateMethod, String user, String type, RS_BC_Events businessEvent) {
        initComponents();
        this.EPAdmin = EPAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.businessEvent = businessEvent;
        populateComboBox();
        populateTable();
        setBackground(new java.awt.Color(255,208,56));
           backBtn.setBackground(new java.awt.Color(0, 102, 102));
        backBtn.setOpaque(true);
       confirmBtn.setBackground(new java.awt.Color(0, 102, 102));
       confirmBtn.setOpaque(true);
       denyButton.setBackground(new java.awt.Color(0, 102, 102));
       confirmBtn.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        birthdayOrg = new javax.swing.JComboBox();
        meetingOrg = new javax.swing.JComboBox();
        weddingOrg = new javax.swing.JComboBox();
        confirmBtn = new javax.swing.JButton();
        denyButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 208, 56));

        backBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        backBtn.setText("<==BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 3, 36)); // NOI18N
        jLabel1.setText("VIEW ORDER DETAILS FOR EVENTS");

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKING ID", "NAME", "STATUS", "CATERING", "DECOR", "PHOTOGRAPHY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel2.setText("SELECT A BIRTHDAY PARTY ORG:");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel3.setText("SELECT A MEETING ORG:");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel4.setText("SELECT A WEDDING ORG:");

        confirmBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        confirmBtn.setText("CONFIRM REQUEST");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        denyButton.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        denyButton.setText("DENY REQUEST");
        denyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyButtonActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rs Icon.png"))); // NOI18N
        jLabel8.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(birthdayOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(denyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meetingOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(weddingOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(backBtn)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdayOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meetingOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(weddingOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(denyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign tasks.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        RS_HallBooking booking = (RS_HallBooking) model.getValueAt(selectedRowIndex, 0);

        RS_BC_EventService eventService = null;
        for (RS_Service service : booking.getServices()) {
            if (businessEvent.getName().equals(service.getBusinessCatalogue().getName())) {
                eventService = (RS_BC_EventService) service;
                break;
            }
        }

        if (eventService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find business event");
            return;
        }

        if (!eventService.getStatus().equals(RS_Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        RS_Event_BirthdayParty birthdayService = (RS_Event_BirthdayParty) birthdayOrg.getSelectedItem();
        RS_Event_Wedding weddingService = (RS_Event_Wedding) weddingOrg.getSelectedItem();
        RS_Event_Meetings meetingService = (RS_Event_Meetings) meetingOrg.getSelectedItem();

        List<RS_Organization> organizations = new ArrayList<>();
        for (RS_BC_EventService.EventServiceType type : eventService.getEventServiceTypes().keySet()) {
            switch (type) {
                case BIRTHDAYPARTY:
                    if (birthdayService == null) {
                        JOptionPane.showMessageDialog(this, "Please select Birthday party organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(birthdayService);
                    }
                    break;
                case MEETINGS:
                    if (meetingService == null) {
                        JOptionPane.showMessageDialog(this, "Please select Meeting organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(meetingService);
                    }
                    break;
                case WEDDING:
                    if (weddingService == null) {
                        JOptionPane.showMessageDialog(this, "Please select wedding organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(weddingService);
                    }
                    break;
            }
        }

        for (RS_Organization organization : organizations) {
            eventService.addOrganization(organization);
        }
        eventService.setStatus(RS_Service.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all event services to the booking: " + booking.getId());
        populateTable();
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void denyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denyButtonActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to deny request.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        RS_HallBooking booking = (RS_HallBooking) model.getValueAt(selectedRowIndex, 0);

        RS_BC_EventService eventService = null;
        for (RS_Service service : booking.getServices()) {
            if (businessEvent.getName().equals(service.getBusinessCatalogue().getName())) {
                eventService = (RS_BC_EventService) service;
                break;
            }
        }

        if (eventService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find business event");
            return;
        }

        if (!eventService.getStatus().equals(RS_Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be denied.",
                    booking.getId()));
            return;
        }

        eventService.setStatus(RS_Service.Status.REJECTED);
        JOptionPane.showMessageDialog(this, "Denied booking request with id: " + booking.getId());
        populateTable();
    }//GEN-LAST:event_denyButtonActionPerformed

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        RS_ClientDirectory clientDirectory = EPAdmin.getClientDirectory(); //get all customers
        for (RS_Client customer : clientDirectory.getListOfClientDirectory()) {
            for (RS_HallBooking booking : customer.getHallbookingList()) {      //get booking details each customer
                for (RS_Service service : booking.getServices()) {       //get services under booking

                    if (service.getBusinessCatalogue().getName().equals(businessEvent.getName())) {

                        RS_BC_EventService businessEventService = (RS_BC_EventService) service;
                        Object row[] = new Object[10];
                        row[0] = booking;
                        row[1] = customer;
                        row[2] = businessEventService.getStatus();
                        row[3] = "NO";
                        row[4] = "NO";
                        row[5] = "NO";

                        for (RS_BC_EventService.EventServiceType type : businessEventService.getEventServiceTypes().keySet()) {
                            switch (type) {
                                case BIRTHDAYPARTY:
                                    row[3] = "YES";
                                    break;
                                case MEETINGS:
                                    row[4] = "YES";
                                    break;
                                case WEDDING:
                                    row[5] = "YES";
                                    break;
                            }
                        }
                        model.addRow(row);
                    }
                }
            }
        }

    }

    private void populateComboBox() {
        birthdayOrg.removeAllItems();
        meetingOrg.removeAllItems();
        weddingOrg.removeAllItems();

        birthdayOrg.addItem(null);
        meetingOrg.addItem(null);
        weddingOrg.addItem(null);

        for (RS_Event_BirthdayParty catering : businessEvent.getListOfBirthdayParty()) {
            if (catering != null) {
                birthdayOrg.addItem(catering);
            }
        }
        for (RS_Event_Meetings decor : businessEvent.getListOfMeetings()) {
            if (decor != null) {
                meetingOrg.addItem(decor);
            }
        }
        for (RS_Event_Wedding photography : businessEvent.getListOfWeddingServices()) {
            if (photography != null) {
                weddingOrg.addItem(photography);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox birthdayOrg;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JButton denyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox meetingOrg;
    private javax.swing.JComboBox weddingOrg;
    // End of variables declaration//GEN-END:variables
}
