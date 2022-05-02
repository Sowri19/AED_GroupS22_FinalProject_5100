package ui.confirm;

import javax.swing.table.DefaultTableModel;
import model.RS_HallBooking;
import model.RS_Client;
import model.RS_ClientDirectory;
import model.RS_Supervisor;
import model.RS_Organization;
import model.RS_Administrator;
import RS_Model.services.RS_Service;

public class RS_WorkRequestsForEventPanel extends javax.swing.JPanel {

    private RS_Administrator EPAdmin;
    private String user;
    private String type;

    public RS_WorkRequestsForEventPanel(RS_Administrator EPAdmin, String user, String type) {
        initComponents();
        this.EPAdmin = EPAdmin;
        this.user = user;
        this.type = type;
        lblbookservices.setText(lblbookservices.getText() + type.toUpperCase() + " ORGANIZATION");
        populateTable();
        setBackground(new java.awt.Color(255, 208, 56));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbookservices = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 208, 56));

        lblbookservices.setFont(new java.awt.Font("Baskerville Old Face", 3, 36)); // NOI18N
        lblbookservices.setText("ASSIGNED WORK REQUESTS  ");

        jTable1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTOMER ID", "BOOKING ID", "HOTEL NAME", "DATE", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(lblbookservices)))
                .addContainerGap(444, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblbookservices)
                .addGap(84, 84, 84)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(448, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblbookservices;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        RS_ClientDirectory clientDirectory = EPAdmin.getClientDirectory();
        for (RS_Client client : clientDirectory.getListOfClientDirectory()) {
            for (RS_HallBooking booking : client.getHallbookingList()) {
                for (RS_Service service : booking.getServices()) {
                    for (RS_Organization org : service.getListOfOrganization()) {
                        for (RS_Supervisor man : org.getListOfSupervisor()) {
                            if (man.getUsername().equals(user)) {
                                Object row[] = new Object[5];
                                row[0] = client.getUserName();
                                row[1] = booking.getId();
                                row[2] = booking.getResortService().getBusinessCatalogue().getName();
                                row[3] = service.getDate();
                                row[4] = service.getStatus();

                                model.addRow(row);
                            }

                            System.out.println();
                        }
                    }
                }
            }
        }

    }
}
