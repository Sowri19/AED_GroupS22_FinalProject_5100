package ui.EntertainmentsupervisorRole;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.RS_HallBooking;
import model.RS_Client;
import model.RS_ClientDirectory;
import model.RS_BC_Entertainment;
import model.RS_Organization;
import model.RS_Entertainment_MagicianORG;
import model.RS_Administrator;
import model.RS_Entertainment_SingerORG;
import model.RS_Entertainment_ChoreographerORG;
import RS_Model.services.RS_BC_EntertainmentService;
import RS_Model.services.RS_Service;

public class RS_DisplayDashboardPanel extends javax.swing.JPanel {

    private RS_Administrator EPAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private RS_BC_Entertainment entertainment;

    public RS_DisplayDashboardPanel(RS_Administrator EPAdmin, Runnable callOnCreateMethod, String user, String type, RS_BC_Entertainment entertainment) {
        initComponents();
        this.EPAdmin = EPAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.entertainment = entertainment;
        populateComboBox();
        populateTable();
        setBackground(new java.awt.Color(255,208,56));
        backButton.setBackground(new java.awt.Color(0, 102, 102));
        backButton.setOpaque(true);
        btnassignWork.setBackground(new java.awt.Color(0, 102, 102));
        btnassignWork.setOpaque(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmbsingerORG = new javax.swing.JComboBox();
        cmbmagicianORG = new javax.swing.JComboBox();
        cmbchoreographerORG = new javax.swing.JComboBox();
        btnassignWork = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 208, 56));

        jTable1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "NAME", "STATUS", "SINGER", "MAGICIAN", "CHOREOGRAPHER"
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

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 3, 36)); // NOI18N
        jLabel1.setText("DISPLAY DASHBOARD ");

        cmbsingerORG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cmbmagicianORG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cmbchoreographerORG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbchoreographerORG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbchoreographerORGActionPerformed(evt);
            }
        });

        btnassignWork.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnassignWork.setText("ADD AND CONFIRM");
        btnassignWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignWorkActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        backButton.setText("<==BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel2.setText("SELECT A SINGER");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel3.setText("SELECT A MAGICIAN");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel4.setText("SELECT A CHOREOGRAPHER");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rs Icon.png"))); // NOI18N
        jLabel8.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(cmbsingerORG, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(124, 124, 124)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(211, 211, 211)
                                        .addComponent(cmbmagicianORG, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(cmbchoreographerORG, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(btnassignWork)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbsingerORG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbmagicianORG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cmbchoreographerORG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnassignWork, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void btnassignWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignWorkActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to assign tasks.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        RS_HallBooking booking = (RS_HallBooking) model.getValueAt(selectedRowIndex, 0);

        RS_BC_EntertainmentService entertainmentService = null;
        for (RS_Service service : booking.getServices()) {
            if (entertainment.getName().equals(service.getBusinessCatalogue().getName())) {
                entertainmentService = (RS_BC_EntertainmentService) service;
                break;
            }
        }

        if (entertainmentService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find Entertainment");
            return;
        }
        if (!entertainmentService.getStatus().equals(RS_Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Booking '%s' should be 'PENDING' state to be accepted.",
                    booking.getId()));
            return;
        }

        RS_Entertainment_SingerORG singer = (RS_Entertainment_SingerORG) cmbsingerORG.getSelectedItem();
        RS_Entertainment_MagicianORG magician = (RS_Entertainment_MagicianORG) cmbmagicianORG.getSelectedItem();
        RS_Entertainment_ChoreographerORG choreographer = (RS_Entertainment_ChoreographerORG) cmbchoreographerORG.getSelectedItem();

        List<RS_Organization> organizations = new ArrayList<>();
        for (RS_BC_EntertainmentService.EntertainmentServiceType type : entertainmentService.getEntertainmentServices()) {
            switch (type) {
                case SINGER:
                    if (singer == null) {
                        JOptionPane.showMessageDialog(this, "Please select singer organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(singer);
                    }
                    break;
                case MAGICIAN:
                    if (magician == null) {
                        JOptionPane.showMessageDialog(this, "Please select magician organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(magician);
                    }
                    break;
                case CHOREOGRAPHY:
                    if (choreographer == null) {
                        JOptionPane.showMessageDialog(this, "Please select choreographer organization to be assinged for the booking.");
                        return;
                    } else {
                        organizations.add(choreographer);
                    }
                    break;
            }
        }

        for (RS_Organization organization : organizations) {
            entertainmentService.addOrganization(organization);
        }
        entertainmentService.setStatus(RS_Service.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all entertainment services to the booking: " + booking.getId());

        return;

    }//GEN-LAST:event_btnassignWorkActionPerformed

    private void cmbchoreographerORGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbchoreographerORGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbchoreographerORGActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnassignWork;
    private javax.swing.JComboBox cmbchoreographerORG;
    private javax.swing.JComboBox cmbmagicianORG;
    private javax.swing.JComboBox cmbsingerORG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        Object row[] = new Object[10];
        RS_ClientDirectory customerDirec = EPAdmin.getClientDirectory(); //get all customers
        for (RS_Client customer : customerDirec.getListOfClientDirectory()) {
            for (RS_HallBooking booking : customer.getHallbookingList()) {      //get booking details each customer
                for (RS_Service service : booking.getServices()) {       //get services under booking

                    if (service.getBusinessCatalogue().getName().equals(entertainment.getName())) {

                        RS_BC_EntertainmentService entertainmentService = (RS_BC_EntertainmentService) service;

                        row[0] = booking;
                        row[1] = customer;
                        row[2] = entertainmentService.getStatus();
                        row[3] = "NO";
                        row[4] = "NO";
                        row[5] = "NO";

                        for (RS_BC_EntertainmentService.EntertainmentServiceType type : entertainmentService.getEntertainmentServices()) {
                            switch (type) {
                                case SINGER:
                                    row[3] = "YES";
                                    break;
                                case MAGICIAN:
                                    row[4] = "YES";
                                    break;
                                case CHOREOGRAPHY:
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
        cmbsingerORG.addItem(null);
        cmbmagicianORG.addItem(null);
        cmbchoreographerORG.addItem(null);

        for (RS_Entertainment_SingerORG singer : entertainment.getListOfSingerORG()) {
            if (singer != null) {
                cmbsingerORG.addItem(singer);
            }
        }
        for (RS_Entertainment_MagicianORG magician : entertainment.getListOfMagicianORG()) {
            if (magician != null) {
                cmbmagicianORG.addItem(magician);
            }
        }
        for (RS_Entertainment_ChoreographerORG choreographer : entertainment.getListOfChoreographerORG()) {
            if (choreographer != null) {
                cmbchoreographerORG.addItem(choreographer);
            }
        }
    }

}
