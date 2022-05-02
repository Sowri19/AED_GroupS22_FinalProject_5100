package ui.EventPlannerAdminRole;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.RS_BC_Events;
import model.RS_BusinessCatalogueDirectory;
import model.RS_BC_Entertainment;
import model.RS_BC_Resort;
import model.RS_Supervisor;
import model.RS_ServiceLocation;
import model.RS_BC_Catering;
import model.RS_Administrator;
import ui.main.Validator;

public class RS_BusinessCatalogueSupervisorJPanel extends javax.swing.JPanel {

    private RS_Administrator EPAdmin;
    private Runnable callOnCreateMethod;

    public RS_BusinessCatalogueSupervisorJPanel(RS_Administrator EPAdmin, Runnable callOnCreateMethod) {
        initComponents();
        this.EPAdmin = EPAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        for (RS_ServiceLocation location : EPAdmin.getListOfServiceLocation()) {
            cmbLocation.addItem(location.getName());
        }
        populateTable();
        setBackground(new java.awt.Color(255, 204, 204));

        btnDelete.setBackground(new java.awt.Color(244, 120, 140));
        btnDelete.setOpaque(true);
        btnAdd.setBackground(new java.awt.Color(244, 120, 140));
        btnAdd.setOpaque(true);
        btnUpdate.setBackground(new java.awt.Color(244, 120, 140));
        btnUpdate.setOpaque(true);
        backButton.setBackground(new java.awt.Color(244, 120, 140));
        backButton.setOpaque(true);
    }

    public boolean validateName() {
        if (txtSuprName.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public boolean PasswordName() {
        if (passwordField.getText().matches("[a-zA-Z]{3}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : password should contain only 3 inputs");
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        lblBCSupr = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBusinessCatalogue = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        txtSuprName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbLocation = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        cmbBCType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbBCName = new javax.swing.JComboBox<>();

        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        lblBCSupr.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBCSupr.setText("BUSINESS CATALOGUE SUPERVISOR");

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblBusinessCatalogue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblBusinessCatalogue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LOCATION NAME", "BUSINESS CATALOGUE TYPE", "BUSINESS CATALOGUE NAME", "NAME", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBusinessCatalogue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBusinessCatalogueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBusinessCatalogue);

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtSuprName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtSuprName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuprNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("BUSINESS CATALOGUE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("LOCATION");

        cmbLocation.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Location" }));
        cmbLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLocationActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("SUPERVISOR NAME");

        usernameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("USERNAME");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("PASSWORD");

        passwordField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        cmbBCType.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbBCType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Business Catalogue", "Entertainment", "Catering", "Resort", "Event" }));
        cmbBCType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBCTypeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("BUSINESS CATALOGUE NAME");

        cmbBCName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbBCName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecte name of enterprise" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(backButton)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(105, 105, 105))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(34, 34, 34))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGap(16, 16, 16)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(46, 46, 46)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbBCType, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSuprName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbBCName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(142, 142, 142)
                                            .addComponent(btnDelete)
                                            .addGap(8, 8, 8))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnUpdate))))
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(lblBCSupr, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBCSupr)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(cmbBCType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addComponent(jLabel7))
                            .addComponent(cmbBCName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSuprName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(165, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRowIndex = tblBusinessCatalogue.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblBusinessCatalogue.getModel();
        String locationName = (String) model.getValueAt(selectedRowIndex, 0);
        String enterpriseType = (String) model.getValueAt(selectedRowIndex, 1);
        String enterpriseName = (String) model.getValueAt(selectedRowIndex, 2);
        String selectedUser = (String) model.getValueAt(selectedRowIndex, 4);
        RS_ServiceLocation location = EPAdmin.findServiceLocation(locationName);
        RS_BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        if (enterpriseType.equals("Event")) {
            for (RS_BC_Events event : businessCatalogueDirectory.getListOfEvents()) {
                for (RS_Supervisor supr : event.getListOfSupervisor()) {
                    if (supr.getName().equals(selectedUser)) {
                        event.deleteSupervisor(supr);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                        populateTable();
                    }
                }
            }
        } else if (enterpriseType.equals("Catering")) {
            for (RS_BC_Catering cat : businessCatalogueDirectory.getListOfCatering()) {
                for (RS_Supervisor supr : cat.getListOfSupervisor()) {
                    if (supr.getName().equals(selectedUser)) {
                        cat.deleteSupervisor(supr);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                        populateTable();
                    }
                }
            }
        } else if (enterpriseType.equals("Resort")) {
            for (RS_BC_Resort resort : businessCatalogueDirectory.getListOfResort()) {
                for (RS_Supervisor supr : resort.getListOfSupervisor()) {
                    if (supr.getName().equals(selectedUser)) {
                        resort.deleteSupervisor(supr);
                        JOptionPane.showMessageDialog(this, "Deleted successfully");
                        populateTable();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSuprNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuprNameActionPerformed

    }//GEN-LAST:event_txtSuprNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblBusinessCatalogue.getModel();
        Object row[] = new Object[10];
        String name = txtSuprName.getText();
        String userName = usernameField.getText();
        String password = passwordField.getText();
        String locationName = cmbLocation.getSelectedItem().toString();
        String enterpriseType1 = cmbBCType.getSelectedItem().toString();   //type of enterprises eg:healthclub
        String enterpriseName1 = cmbBCName.getSelectedItem().toString();

        if (!Validator.validateName(this, name) || !Validator.validateUserName(this, userName)
                || !Validator.validatePassword(this, password)) {
            return;
        }

        if (!EPAdmin.userExistsInSystem(userName)) {
            RS_ServiceLocation location = EPAdmin.findServiceLocation(locationName);  //finiding location
            RS_BusinessCatalogueDirectory businessCatelogDirectory = location.getBusinessCatalogueDirectory();
            if (enterpriseType1.equals("Entertainment") && businessCatelogDirectory != null) {
                RS_BC_Entertainment entertainmentName1 = businessCatelogDirectory.findEntertainment(enterpriseName1);
                entertainmentName1.addSupervisor(name, userName, password);
                EPAdmin.getUserNamePasswordMap();
                EPAdmin.addUser(userName, password, "Entertainment");
                row[0] = locationName;
                row[1] = "Entertainment";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
                return;
            } else if (enterpriseType1.equals("Event") && businessCatelogDirectory != null) {
                RS_BC_Events event1 = businessCatelogDirectory.findEvents(enterpriseName1);
                event1.addSupervisor(name, userName, password);
                EPAdmin.addUser(userName, password, "Event");
                row[0] = locationName;
                row[1] = "Event";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
            } else if (enterpriseType1.equals("Catering") && businessCatelogDirectory != null) {
                RS_BC_Catering res1 = businessCatelogDirectory.findCatering(enterpriseName1);
                res1.addSupervisor(userName, userName, password);
                EPAdmin.addUser(userName, password, "Catering");

                row[0] = locationName;
                row[1] = "Catering";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
            } else if (enterpriseType1.equals("Resort") && businessCatelogDirectory != null) {
                RS_BC_Resort hotel1 = businessCatelogDirectory.findResort(enterpriseName1);
                hotel1.addSupervisor(name, userName, password);
                EPAdmin.addUser(userName, password, "Resort");
                row[0] = locationName;
                row[1] = "Resort";
                row[2] = enterpriseName1;
                row[3] = name;
                row[4] = userName;
                row[5] = password;
                model.addRow(row);
            }
        } else {
            JOptionPane.showMessageDialog(this, String.format("This username '%s' already exists", userName));
        }
        JOptionPane.showMessageDialog(this, "Manager added successfully");
        txtSuprName.setText("");
        usernameField.setText("");
        passwordField.setText("");
        cmbBCName.setSelectedIndex(0);
        cmbBCType.setSelectedIndex(0);
        cmbLocation.setSelectedIndex(0);
    }//GEN-LAST:event_btnAddActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void cmbLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLocationActionPerformed

    }//GEN-LAST:event_cmbLocationActionPerformed

    private void cmbBCTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBCTypeActionPerformed
        cmbBCName.removeAllItems();
        String locationName = cmbLocation.getSelectedItem().toString();
        RS_ServiceLocation location = EPAdmin.findServiceLocation(locationName);
        RS_BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();
        String enterpriseType1 = cmbBCType.getSelectedItem().toString();
        if (enterpriseType1.equals("Entertainment")) {
            for (RS_BC_Entertainment entertainment : businessCatalogueDirectory.getListOfEntertainment()) {
                cmbBCName.addItem(entertainment.getName());
            }
        } else if (enterpriseType1.equals("Event")) {
            for (RS_BC_Events event : businessCatalogueDirectory.getListOfEvents()) {
                cmbBCName.addItem(event.getName());
            }
        } else if (enterpriseType1.equals("Catering")) {
            for (RS_BC_Catering cat : businessCatalogueDirectory.getListOfCatering()) {
                cmbBCName.addItem(cat.getName());
            }
        } else if (enterpriseType1.equals("Resort")) {
            for (RS_BC_Resort res : businessCatalogueDirectory.getListOfResort()) {
                cmbBCName.addItem(res.getName());
            }
        } else {
            return;
        }

    }//GEN-LAST:event_cmbBCTypeActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if (tblBusinessCatalogue.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }

        String locationkName = cmbLocation.getSelectedItem().toString();
        String enterpriseType1 = cmbBCType.getSelectedItem().toString();
        String enterpriseName1 = cmbBCName.getSelectedItem().toString();
        String managerUserName = usernameField.getText();

        String password = passwordField.getText();
        String name = txtSuprName.getText();

        RS_ServiceLocation location = EPAdmin.findServiceLocation(locationkName);  //finiding location
        RS_BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();

        if (enterpriseType1.equals("Entertainment")) {
            RS_BC_Entertainment entertainmentName1 = businessCatalogueDirectory.findEntertainment(enterpriseName1);
            for (RS_Supervisor ent : entertainmentName1.getListOfSupervisor()) {
                if (ent.getUsername().equals(managerUserName)) {

                    ent.setName(name);
                    ent.setPassword(password);

                    EPAdmin.updateUser(managerUserName, password);
                    populateTable();
                    JOptionPane.showMessageDialog(this, " Updated successfully ");
                    return;
                }
            }
        } else if (enterpriseType1.equals("Event")) {
            RS_BC_Events event1 = businessCatalogueDirectory.findEvents(enterpriseName1);
            for (RS_Supervisor man : event1.getListOfSupervisor()) {
                if (man.getUsername().equals(managerUserName)) {

                    man.setName(name);
                    man.setPassword(password);

                    EPAdmin.updateUser(managerUserName, password);
                    populateTable();
                    JOptionPane.showMessageDialog(this, " Updated successfully ");
                    return;
                }
            }
        } else if (enterpriseType1.equals("Resort")) {
            RS_BC_Resort resort = businessCatalogueDirectory.findResort(enterpriseName1);
            for (RS_Supervisor man : resort.getListOfSupervisor()) {
                if (man.getUsername().equals(managerUserName)) {

                    man.setName(name);
                    man.setPassword(password);

                    EPAdmin.updateUser(managerUserName, password);
                    populateTable();
                    JOptionPane.showMessageDialog(this, " Updated successfully ");
                    return;
                }
            }
        } else if (enterpriseType1.equals("Catering")) {
            RS_BC_Catering cat = businessCatalogueDirectory.findCatering(enterpriseName1);
            for (RS_Supervisor man : cat.getListOfSupervisor()) {
                if (man.getUsername().equals(managerUserName)) {
                    man.setName(name);
                    man.setPassword(password);

                    EPAdmin.updateUser(managerUserName, password);

                    populateTable();
                    JOptionPane.showMessageDialog(this, "Updated successfully ");
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid enterprise [" + enterpriseType1 + "]");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblBusinessCatalogueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBusinessCatalogueMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblBusinessCatalogue.getModel();
        if (tblBusinessCatalogue.getSelectedRowCount() != 1) {
            return;
        }

        String locationName = model.getValueAt(tblBusinessCatalogue.getSelectedRow(), 0).toString();

        String eType = model.getValueAt(tblBusinessCatalogue.getSelectedRow(), 1).toString();
        String eName = model.getValueAt(tblBusinessCatalogue.getSelectedRow(), 2).toString();

        String managerName = model.getValueAt(tblBusinessCatalogue.getSelectedRow(), 3).toString();
        String managerUserName = model.getValueAt(tblBusinessCatalogue.getSelectedRow(), 4).toString();
        String managerPassword = model.getValueAt(tblBusinessCatalogue.getSelectedRow(), 5).toString();

        txtSuprName.setText(managerName);
        usernameField.setText(managerUserName);
        passwordField.setText(managerPassword);

        cmbLocation.setSelectedItem(locationName);
        cmbBCName.setSelectedItem(eName);
        cmbBCType.setSelectedItem(eType);
    }//GEN-LAST:event_tblBusinessCatalogueMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbBCName;
    private javax.swing.JComboBox<String> cmbBCType;
    private javax.swing.JComboBox<String> cmbLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBCSupr;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTable tblBusinessCatalogue;
    private javax.swing.JTextField txtSuprName;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblBusinessCatalogue.getModel();
        model.setRowCount(0);
        Object row[] = new Object[10];
        for (RS_ServiceLocation location : EPAdmin.getListOfServiceLocation()) {        //populate location
            row[0] = location.getName();
            RS_BusinessCatalogueDirectory businessCatalogueDirectory = location.getBusinessCatalogueDirectory();  //populate enterpirse name
            for (RS_BC_Events event : businessCatalogueDirectory.getListOfEvents()) {   //poplulate events enterprise
                row[1] = "Event";
                row[2] = event.getName();
                for (RS_Supervisor supervisor : event.getListOfSupervisor()) {
                    row[0] = location.getName();
                    row[1] = "Event";
                    row[2] = event.getName();
                    row[3] = supervisor.getName();
                    row[4] = supervisor.getUsername();
                    row[5] = supervisor.getPassword();
                    model.addRow(row);
                }
            }
            for (RS_BC_Catering cat : businessCatalogueDirectory.getListOfCatering()) {   //poplulate restauarant enterprise
                row[1] = "Catering";
                row[2] = cat.getName();
                for (RS_Supervisor supervisor : cat.getListOfSupervisor()) {
                    row[0] = location.getName();
                    row[1] = "Catering";
                    row[2] = cat.getName();
                    row[3] = supervisor.getName();
                    row[4] = supervisor.getUsername();
                    row[5] = supervisor.getPassword();
                    model.addRow(row);
                }
            }
            for (RS_BC_Resort resort : businessCatalogueDirectory.getListOfResort()) {   //poplulate resort enterprise
                row[1] = "Resort";
                row[2] = resort.getName();
                for (RS_Supervisor supervisor : resort.getListOfSupervisor()) {
                    row[0] = location.getName();
                    row[1] = "Resort";
                    row[2] = resort.getName();
                    row[3] = supervisor.getName();
                    row[4] = supervisor.getUsername();
                    row[5] = supervisor.getPassword();
                    model.addRow(row);
                }
            }
            for (RS_BC_Entertainment entertainment : businessCatalogueDirectory.getListOfEntertainment()) {   //poplulate resort enterprise
                row[1] = "Entertainment";
                row[2] = entertainment.getName();
                for (RS_Supervisor supervisor : entertainment.getListOfSupervisor()) {
                    row[0] = location.getName();
                    row[1] = "Entertainment";
                    row[2] = entertainment.getName();
                    row[3] = supervisor.getName();
                    row[4] = supervisor.getUsername();
                    row[5] = supervisor.getPassword();
                    model.addRow(row);
                }
            }

        }
    }

}
