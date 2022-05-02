package ui.ClientRole;

import java.util.List;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.RS_HallBooking;
import model.RS_Client;
import model.RS_ClientDirectory;
import model.RS_Administrator;

public class RS_ManageBooking extends javax.swing.JPanel {

    private RS_Administrator EPAdmin;
    private Runnable callOnCreateMethod1;
    private Consumer<RS_HallBooking> callOnAddServiceMethod;
    private Consumer<RS_HallBooking> callOnViewServiceMethod;
    private String username;

    public RS_ManageBooking(RS_Administrator EPAdmin, Runnable callOnCreateMethod1, Consumer<RS_HallBooking> callOnCreateMethod2, Consumer<RS_HallBooking> callOnViewServiceMethod, String username) {
        initComponents();
        this.EPAdmin = EPAdmin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnAddServiceMethod = callOnCreateMethod2;
        this.callOnViewServiceMethod = callOnViewServiceMethod;
        this.username = username;

        populateTable();
        setBackground(new java.awt.Color(255, 208, 56));
        backBtn.setBackground(new java.awt.Color(0, 102, 102));
        backBtn.setOpaque(true);
        addServiceBtn.setBackground(new java.awt.Color(0, 102, 102));
        addServiceBtn.setOpaque(true);
        viewOrder.setBackground(new java.awt.Color(0, 102, 102));
        viewOrder.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addServiceBtn = new javax.swing.JButton();
        viewOrder = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 208, 56));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 3, 36)); // NOI18N
        jLabel1.setText("BOOKING DETAILS");

        backBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        backBtn.setText("<==BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Baskerville Old Face", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RESORT NAME", "BOOKING ID", "PRICE", "STATUS", "CHECK_IN", "CHECK OUT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        addServiceBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        addServiceBtn.setText("ADD SERVICES");
        addServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addServiceBtnActionPerformed(evt);
            }
        });

        viewOrder.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        viewOrder.setText("VIEW SERVICE DETAILS");
        viewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rs Icon.png"))); // NOI18N
        jLabel8.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(addServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(viewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 200, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(383, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void addServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addServiceBtnActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to add services.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String bookingId = (String) model.getValueAt(selectedRowIndex, 1);

        System.out.println(bookingId + " is selected");

        RS_ClientDirectory clientDirectory = EPAdmin.getClientDirectory();
        RS_Client client = clientDirectory.findClientUsername(username);

        List<RS_HallBooking> list = client.getHallbookingList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(bookingId)) {
                callOnAddServiceMethod.accept(list.get(i));
                return;
            }
        }
    }//GEN-LAST:event_addServiceBtnActionPerformed

    private void viewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking to view its details.");
            return;
        }
        String bookingId = (String) model.getValueAt(selectedRowIndex, 1);

        System.out.println(bookingId + " is selected");

        RS_ClientDirectory clientDirectory = EPAdmin.getClientDirectory();
        RS_Client client = clientDirectory.findClientUsername(username);

        List<RS_HallBooking> list = client.getHallbookingList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(bookingId)) {
                callOnViewServiceMethod.accept(list.get(i));
                return;
            }
        }
    }//GEN-LAST:event_viewOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addServiceBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton viewOrder;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        RS_ClientDirectory clientDirectory = EPAdmin.getClientDirectory();
        RS_Client client = clientDirectory.findClientUsername(username);
        System.out.println("customer found is " + client.getName() + " username is " + username);
        for (RS_HallBooking bookingList : client.getHallbookingList()) {
            row[0] = bookingList.getResortService().getBusinessCatalogue();
            row[1] = bookingList.getId();
            row[2] = bookingList.getTotalCost();
            row[3] = bookingList.getStatus();
            row[4] = bookingList.getCheckin();
            row[5] = bookingList.getCheckout();
            model.addRow(row);
        }

    }
}
