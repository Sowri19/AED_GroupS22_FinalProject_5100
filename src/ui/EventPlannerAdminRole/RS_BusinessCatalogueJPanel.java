package ui.EventPlannerAdminRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.RS_BC_Events;
import model.RS_BusinessCatalogue;
import model.RS_BusinessCatalogueDirectory;
import model.RS_BC_Entertainment;
import model.RS_BC_Resort;
import model.RS_ServiceLocation;
import model.RS_BC_Catering;
import model.RS_Administrator;

public class RS_BusinessCatalogueJPanel extends javax.swing.JPanel {

    private RS_Administrator EPAdmin;
    private Runnable callOnCreateMethod;

    public RS_BusinessCatalogueJPanel(RS_Administrator EPAdmin, Runnable callOnCreateMethod) {
        initComponents();
        this.EPAdmin = EPAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        for (RS_ServiceLocation location : EPAdmin.getListOfServiceLocation()) {      //populate items in location combobox
            cmbLocation.addItem(location.getName());
        }
        for (RS_ServiceLocation location : EPAdmin.getListOfServiceLocation()) {
            cmbLocationSearch.addItem(location.getName());
        }
        setBackground(new java.awt.Color(255, 208, 56));
        btnDelete.setBackground(new java.awt.Color(0, 102, 102));
        btnDelete.setOpaque(true);
        btnAdd.setBackground(new java.awt.Color(0, 102, 102));
        btnAdd.setOpaque(true);
        BtnUpdate.setBackground(new java.awt.Color(0, 102, 102));
        BtnUpdate.setOpaque(true);
        backButton.setBackground(new java.awt.Color(0, 102, 102));
        backButton.setOpaque(true);
        btnDisplay.setBackground(new java.awt.Color(0, 102, 102));
        btnDisplay.setOpaque(true);
    }

    public boolean validateName() {
        if (txtBCName.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public boolean validateContactNum() {
        if (txtMobile.getText().matches("[0-9]{10}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid contact: contact should contain only 10 digits");
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLBC = new javax.swing.JLabel();
        BtnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        txtBCName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbLocation = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbLocationType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        cmbLocationSearch = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnDisplay = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 208, 56));

        lbLBC.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        lbLBC.setText("BUSINESS CATALOGUE");

        BtnUpdate.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        BtnUpdate.setText("UPDATE");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LOCATION NAME", "BUSINESS CATALOGUE", "BUSINESS CATALOGUE TYPE", "MOBILE NO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnAdd.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtBCName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel1.setText("CATALOGUE:");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel2.setText("LOCATION:");

        cmbLocation.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        cmbLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one" }));
        cmbLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLocationActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel3.setText("BUSNIESS CATALOGUE NAME:");

        cmbLocationType.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        cmbLocationType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one", "Event", "Resort", "Catering", "Entertainment" }));
        cmbLocationType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLocationTypeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel6.setText("MOBILE NO:");

        txtMobile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cmbLocationSearch.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        cmbLocationSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one " }));

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jLabel7.setText("SELECT A LOCATION");

        btnDisplay.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnDisplay.setText("VIEW");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        backButton.setText("<==BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
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
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(230, 230, 230)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(471, 471, 471)
                                .addComponent(cmbLocationType, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtBCName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(176, 176, 176)
                                        .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(187, 187, 187)
                                        .addComponent(cmbLocationSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel7)))
                                .addGap(60, 60, 60)
                                .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(backButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(273, 273, 273)
                                        .addComponent(lbLBC, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(209, 209, 209)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbLBC)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbLocationSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnDisplay)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(BtnUpdate)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLocationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBCName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(368, 368, 368))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String locationName = (String) model.getValueAt(selectedRowIndex, 0);
        String businessCatalogueType = (String) model.getValueAt(selectedRowIndex, 2);
        String businessCatalogueName = (String) model.getValueAt(selectedRowIndex, 1);
        RS_ServiceLocation network = EPAdmin.findServiceLocation(locationName);
        RS_BusinessCatalogueDirectory enterpriseDirec = network.getBusinessCatalogueDirectory();
        if (businessCatalogueType.equals("Event") && enterpriseDirec.getListOfEvents() != null) {
            for (RS_BC_Events event : enterpriseDirec.getListOfEvents()) {
                if (event.getName().equals(businessCatalogueName)) {
                    enterpriseDirec.deleteBusinessCatalogueEvents(event);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else if (businessCatalogueType.equals("Resort") && enterpriseDirec.getListOfResort() != null) {
            for (RS_BC_Resort resort : enterpriseDirec.getListOfResort()) {
                if (resort.getName().equals(businessCatalogueName)) {
                    enterpriseDirec.deleteBusinessCatalogueResort(resort);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else if (businessCatalogueType.equals("Catering") && enterpriseDirec.getListOfCatering() != null) {
            for (RS_BC_Catering cat : enterpriseDirec.getListOfCatering()) {
                if (cat.getName().equals(businessCatalogueName)) {
                    enterpriseDirec.deleteBusinessCatalogueCatering(cat);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else if (businessCatalogueType.equals("Entertainment") && enterpriseDirec.getListOfEntertainment() != null) {
            for (RS_BC_Entertainment ent : enterpriseDirec.getListOfEntertainment()) {
                if (ent.getName().equals(businessCatalogueName)) {
                    enterpriseDirec.deleteBusinessCatalogueEntertainment(ent);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "not found");
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cmbLocationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLocationTypeActionPerformed

    }//GEN-LAST:event_cmbLocationTypeActionPerformed

    private void cmbLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLocationActionPerformed

    }//GEN-LAST:event_cmbLocationActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String contact = txtMobile.getText();
        String name = txtBCName.getText();
        String locationName = cmbLocation.getSelectedItem().toString();
        String businessCatalogueType1 = cmbLocationType.getSelectedItem().toString();
        RS_ServiceLocation network = EPAdmin.findServiceLocation(locationName);

        if (name == null || name.length() < 2) {
            JOptionPane.showMessageDialog(this, "Invalid input: Enterprise name should be atleast 2 characters long.");
            return;
        }

        RS_BusinessCatalogueDirectory businessCatalogueDirectory = network.getBusinessCatalogueDirectory();
        if (businessCatalogueType1.equals("Entertainment") && businessCatalogueDirectory != null) {
            businessCatalogueDirectory.addEntertainment(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");
            return;
        } else if (businessCatalogueType1.equals("Catering") && businessCatalogueDirectory != null) {
            businessCatalogueDirectory.addCatering(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");

            return;
        } else if (businessCatalogueType1.equals("Event") && businessCatalogueDirectory != null) {
            businessCatalogueDirectory.addEvents(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");

            return;
        } else if (businessCatalogueType1.equals("Resort") && businessCatalogueDirectory != null) {
            businessCatalogueDirectory.addResort(name, contact);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");
            return;
        }
        txtBCName.setText("");
        txtMobile.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        populateTable();
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        if (jTable1.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select 1 row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String locationName = cmbLocation.getSelectedItem().toString();
        String businessCatalogueType1 = cmbLocationType.getSelectedItem().toString();
        String businessCatalogueName = model.getValueAt(jTable1.getSelectedRow(), 1).toString();

        RS_ServiceLocation location = EPAdmin.findServiceLocation(locationName);
        RS_BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();

        RS_BusinessCatalogue BCToUpdate = null;
        if (businessCatalogueType1.equals("Entertainment") && businessCatalogueDirectory != null) {

            for (RS_BC_Entertainment list : businessCatalogueDirectory.getListOfEntertainment()) {
                if (list.getName().equals(businessCatalogueName)) {  //if enterprise name matches 
                    BCToUpdate = list;
                }
            }
            JOptionPane.showMessageDialog(this, "Enterprise updated successfully");
            return;
        } else if (businessCatalogueType1.equals("Event") && businessCatalogueDirectory != null) {
            for (RS_BC_Events list : businessCatalogueDirectory.getListOfEvents()) {
                if (list.getName().equals(businessCatalogueName)) {
                    BCToUpdate = list;
                }
            }
        } else if (businessCatalogueType1.equals("Resort") && businessCatalogueDirectory != null) {
            for (RS_BC_Resort list : businessCatalogueDirectory.getListOfResort()) {
                if (list.getName().equals(businessCatalogueName)) {           //if enterprise name matches 
                    BCToUpdate = list;
                }
            }
        } else if (businessCatalogueType1.equals("Catering") && businessCatalogueDirectory != null) {
            for (RS_BC_Catering list : businessCatalogueDirectory.getListOfCatering()) {
                if (list.getName().equals(businessCatalogueName)) {           //if enterprise name matches 
                    BCToUpdate = list;
                }
            }
        }

        if (BCToUpdate == null) {
            JOptionPane.showMessageDialog(this, "Unknown Business Catalogue.");
            return;
        }

        BCToUpdate.setName(txtBCName.getText());
        BCToUpdate.setContact(txtMobile.getText());
        populateTable();
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (jTable1.getSelectedRowCount() != 1) {
            return;
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String locationName = model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String bcName = model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String bcType1 = model.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String bcContact = model.getValueAt(jTable1.getSelectedRow(), 3).toString();

        cmbLocation.setSelectedItem(locationName);
        cmbLocationType.setSelectedItem(bcType1);
        txtBCName.setText(bcName);
        txtMobile.setText(bcContact);
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JComboBox<String> cmbLocation;
    private javax.swing.JComboBox<String> cmbLocationSearch;
    private javax.swing.JComboBox<String> cmbLocationType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbLBC;
    private javax.swing.JTextField txtBCName;
    private javax.swing.JTextField txtMobile;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        String locationItem = cmbLocationSearch.getSelectedItem().toString();
        RS_ServiceLocation location = EPAdmin.findServiceLocation(locationItem);

        List<RS_BC_Events> eventList = location.getBusinessCatalogueDirectory().getListOfEvents();
        if (eventList != null) {
            for (int i = 0; i < eventList.size(); i++) {
                row[0] = locationItem;
                row[1] = eventList.get(i).getName();
                row[2] = "Event";
                row[3] = eventList.get(i).getContact();
                model.addRow(row);
            }
        }

        List<RS_BC_Catering> cateringList = location.getBusinessCatalogueDirectory().getListOfCatering();
        if (cateringList != null) {
            for (int i = 0; i < cateringList.size(); i++) {
                row[0] = locationItem;
                row[1] = cateringList.get(i).getName();
                row[2] = "Catering";
                row[3] = cateringList.get(i).getContact();
                model.addRow(row);
            }
        }

        List<RS_BC_Entertainment> entertainmentList = location.getBusinessCatalogueDirectory().getListOfEntertainment();
        if (entertainmentList != null) {
            for (int i = 0; i < entertainmentList.size(); i++) {
                row[0] = locationItem;
                row[1] = entertainmentList.get(i).getName();
                row[2] = "Entertainment";
                row[3] = entertainmentList.get(i).getContact();
                model.addRow(row);
            }
        }

        List<RS_BC_Resort> resortList = location.getBusinessCatalogueDirectory().getListOfResort();
        if (resortList != null) {
            for (int i = 0; i < resortList.size(); i++) {
                row[0] = locationItem;
                row[1] = resortList.get(i).getName();
                row[2] = "Resort";
                row[3] = resortList.get(i).getContact();
                model.addRow(row);
            }
        }

    }
}
