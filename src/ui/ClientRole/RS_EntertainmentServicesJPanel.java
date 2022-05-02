package ui.ClientRole;

import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import model.RS_HallBooking;
import model.RS_BC_Entertainment;
import model.RS_Administrator;
import RS_Model.services.RS_BC_EntertainmentService;
import ui.main.DateUtils;

public class RS_EntertainmentServicesJPanel extends javax.swing.JPanel {

    private RS_Administrator systems;
    private Consumer<RS_HallBooking> callOnCreateMethod1;
    private String username;
    private RS_HallBooking booking;

    public RS_EntertainmentServicesJPanel(RS_Administrator systems, Consumer<RS_HallBooking> callOnCreateMethod1, String username, RS_HallBooking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;

        for (RS_BC_Entertainment entertain : booking.getServiceLocation().getBusinessCatalogueDirectory().getListOfEntertainment()) {
            cmbEntertainment.addItem(entertain);
        }
        setBackground(new java.awt.Color(255, 208, 56));
        backBtn.setBackground(new java.awt.Color(0, 102, 102));
        backBtn.setOpaque(true);
        addServiceBtn.setBackground(new java.awt.Color(0, 102, 102));
        addServiceBtn.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbookservices = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        btnDance = new javax.swing.JCheckBox();
        btnMusic = new javax.swing.JCheckBox();
        btnShow = new javax.swing.JCheckBox();
        addServiceBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        cmbEntertainment = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 208, 56));

        lblbookservices.setFont(new java.awt.Font("Baskerville Old Face", 3, 36)); // NOI18N
        lblbookservices.setText("ENTERTAINMENT SERVICES");

        backBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        backBtn.setText("<==BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        btnDance.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnDance.setText("DANCE ($100)");
        btnDance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanceActionPerformed(evt);
            }
        });

        btnMusic.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnMusic.setText("MUSIC ($150)");
        btnMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusicActionPerformed(evt);
            }
        });

        btnShow.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnShow.setText("SHOWS  ($300)");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        addServiceBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        addServiceBtn.setText("ADD SERVICE");
        addServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addServiceBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("(MONDAY-SUNDAY) 7A.M - 9A.M");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("(MONDAY-SUNDAY) 4P.M-5:30P.M ");

        jLabel6.setText("(MONDAY - SUNDAY) 12P.M-4P.M ");

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel7.setText("SELECT A DATE :");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel4.setText("ENTERTAINMENT:");

        cmbEntertainment.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rs Icon.png"))); // NOI18N
        jLabel8.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(lblbookservices, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(387, 387, 387))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnShow)
                                    .addComponent(btnMusic)
                                    .addComponent(btnDance))
                                .addGap(22, 22, 22)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbEntertainment, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(addServiceBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblbookservices, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEntertainment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnDance)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMusic)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(btnShow)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowActionPerformed

    private void addServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addServiceBtnActionPerformed

        RS_BC_Entertainment entertain = (RS_BC_Entertainment) cmbEntertainment.getSelectedItem();
        if (entertain == null) {
            JOptionPane.showMessageDialog(this, "Please select a Entertainment menu from the dropdown.");
            return;
        }
        Date date = DateUtils.formatDate(dateField.getDate());
        Date checkin = booking.getCheckin();
        Date checkout = booking.getCheckout();

        if (date.compareTo(checkin) < 0 || date.compareTo(checkout) > 0) {
            JOptionPane.showMessageDialog(this, "Selected date should be within check-in date (" + checkin
                    + ") and checkout date (" + checkout + ")");
            return;
        }

        boolean danceBtnSelected = btnDance.isSelected();
        boolean musicRadioBtnSelected = btnMusic.isSelected();
        boolean showRadioBtnSelected = btnShow.isSelected();

        if (!danceBtnSelected && !musicRadioBtnSelected && !showRadioBtnSelected) {
            JOptionPane.showMessageDialog(this, "Please select at least one service for Health Club.");
            return;
        }

        RS_BC_EntertainmentService entertainmentService = new RS_BC_EntertainmentService(entertain, date);
        if (danceBtnSelected) {
            entertainmentService.addService(RS_BC_EntertainmentService.EntertainmentServiceType.CHOREOGRAPHY);
        }

        if (musicRadioBtnSelected) {
            entertainmentService.addService(RS_BC_EntertainmentService.EntertainmentServiceType.SINGER);
        }

        if (showRadioBtnSelected) {
            entertainmentService.addService(RS_BC_EntertainmentService.EntertainmentServiceType.MAGICIAN);
        }

        booking.addService(entertainmentService);
        JOptionPane.showMessageDialog(this, "Your Entertainment appointment is booked for " + date);
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_addServiceBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnDanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanceActionPerformed

    }//GEN-LAST:event_btnDanceActionPerformed

    private void btnMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMusicActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addServiceBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JCheckBox btnDance;
    private javax.swing.JCheckBox btnMusic;
    private javax.swing.JCheckBox btnShow;
    private javax.swing.JComboBox cmbEntertainment;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblbookservices;
    // End of variables declaration//GEN-END:variables
}
