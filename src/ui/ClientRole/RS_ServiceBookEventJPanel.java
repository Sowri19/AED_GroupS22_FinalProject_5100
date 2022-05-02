package ui.ClientRole;

import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import model.RS_HallBooking;
import model.RS_BC_Events;
import model.RS_Event_BirthdayParty.BirthdayPartyType;
import model.RS_Event_Meetings.MeetingsType;
import model.RS_Event_Wedding.WeddingType;
import model.RS_Administrator;
import RS_Model.services.RS_BC_EventService;
import ui.main.DateUtils;

public class RS_ServiceBookEventJPanel extends javax.swing.JPanel {

    private RS_Administrator systems;
    private Consumer<RS_HallBooking> callOnCreateMethod1;
    private String username;
    private RS_HallBooking booking;

    public RS_ServiceBookEventJPanel(RS_Administrator systems, Consumer<RS_HallBooking> callOnCreateMethod1, String username, RS_HallBooking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;

        orgComboBox.addItem(null);
        for (RS_BC_Events eventOrg : booking.getServiceLocation().getBusinessCatalogueDirectory().getListOfEvents()) {
            orgComboBox.addItem(eventOrg);
        }
        setBackground(new java.awt.Color(255, 204, 204));
        backBtn.setBackground(new java.awt.Color(244, 120, 140));
        backBtn.setOpaque(true);
        totalPrice.setBackground(new java.awt.Color(244, 120, 140));
        totalPrice.setOpaque(true);
        bookEventBtn.setBackground(new java.awt.Color(244, 120, 140));
        bookEventBtn.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        backBtn = new javax.swing.JButton();
        lblbookservices = new javax.swing.JLabel();
        radioWedding = new javax.swing.JRadioButton();
        radioBirthdayParty = new javax.swing.JRadioButton();
        bookEventBtn = new javax.swing.JButton();
        cmbMeeting = new javax.swing.JComboBox();
        cmbWedding = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbBirthdayParty = new javax.swing.JComboBox();
        radioMeeting = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();
        orgComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        lblbookservices.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblbookservices.setText("BOOK EVENTS");

        radioWedding.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radioWedding.setText("WEDDING");
        radioWedding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioWeddingActionPerformed(evt);
            }
        });

        radioBirthdayParty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radioBirthdayParty.setText("BIRTHDAY PARTY");
        radioBirthdayParty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBirthdayPartyActionPerformed(evt);
            }
        });

        bookEventBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bookEventBtn.setText("BOOK EVENT");
        bookEventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookEventBtnActionPerformed(evt);
            }
        });

        cmbMeeting.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        cmbWedding.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("TYPE OF PACKAGE ");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("TYPE OF PACKAGE");

        cmbBirthdayParty.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cmbBirthdayParty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBirthdayPartyActionPerformed(evt);
            }
        });

        radioMeeting.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        radioMeeting.setText("MEETINGS");
        radioMeeting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMeetingActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("TYPE OF PACKAGE");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("DATE ");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("EVENT");

        totalPrice.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        totalPrice.setText("TOTAL PRICE");
        totalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(radioBirthdayParty)
                            .addComponent(radioWedding)
                            .addComponent(radioMeeting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(totalPrice)
                                .addGap(110, 110, 110))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbWedding, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBirthdayParty, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMeeting, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122)
                                .addComponent(bookEventBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(lblbookservices)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backBtn)
                .addGap(18, 18, 18)
                .addComponent(lblbookservices)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(orgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(radioWedding)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbWedding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(radioBirthdayParty)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbBirthdayParty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(radioMeeting)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMeeting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPrice)
                    .addComponent(bookEventBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radioWeddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioWeddingActionPerformed
        if (radioWedding.isSelected()) {
            cmbWedding.removeAllItems();
            for (WeddingType wed : WeddingType.values()) {
                cmbWedding.addItem(wed);
            }
        }
    }//GEN-LAST:event_radioWeddingActionPerformed

    private void bookEventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookEventBtnActionPerformed

        RS_BC_Events businessEvent = (RS_BC_Events) orgComboBox.getSelectedItem();

        if (businessEvent == null) {
            JOptionPane.showMessageDialog(this, "Please select a Business Event organization from the dropdown.");
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

        boolean weddingRadioBtnSelected = radioWedding.isSelected();
        boolean MeetingRadioBtnSelected = radioMeeting.isSelected();
        boolean birthdayPartyRadioBtnSelected = radioBirthdayParty.isSelected();

        if (!weddingRadioBtnSelected && !MeetingRadioBtnSelected && !birthdayPartyRadioBtnSelected) {
            JOptionPane.showMessageDialog(this, "Please select at least one service for Business Event.");
            return;
        }

        int price = 0;
        RS_BC_EventService service = new RS_BC_EventService(businessEvent, date);
        if (weddingRadioBtnSelected) {
            WeddingType weddin = (WeddingType) cmbWedding.getSelectedItem();
            service.addService(RS_BC_EventService.EventServiceType.WEDDING, weddin.getRate());
            price += weddin.getRate();
        }

        if (MeetingRadioBtnSelected) {
            MeetingsType meet = (MeetingsType) cmbMeeting.getSelectedItem();
            service.addService(RS_BC_EventService.EventServiceType.MEETINGS, meet.getRate());
            price += meet.getRate();
        }

        if (birthdayPartyRadioBtnSelected) {
            BirthdayPartyType birthdayParty = (BirthdayPartyType) cmbBirthdayParty.getSelectedItem();
            service.addService(RS_BC_EventService.EventServiceType.BIRTHDAYPARTY, birthdayParty.getRate());
            price += birthdayParty.getRate();
        }

        priceField.setText(String.valueOf(price));
        booking.addService(service);

        JOptionPane.showMessageDialog(this, "Business event service added successfully.");
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_bookEventBtnActionPerformed

    private void cmbBirthdayPartyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBirthdayPartyActionPerformed

    }//GEN-LAST:event_cmbBirthdayPartyActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_backBtnActionPerformed

    private void radioBirthdayPartyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBirthdayPartyActionPerformed
        if (radioBirthdayParty.isSelected()) {
            cmbBirthdayParty.removeAllItems();
            for (BirthdayPartyType catering : BirthdayPartyType.values()) {
                cmbBirthdayParty.addItem(catering);
            }

        }
    }//GEN-LAST:event_radioBirthdayPartyActionPerformed

    private void radioMeetingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMeetingActionPerformed
        if (radioMeeting.isSelected()) {
            cmbMeeting.removeAllItems();
            for (MeetingsType meet : MeetingsType.values()) {
                cmbMeeting.addItem(meet);
            }
        }
    }//GEN-LAST:event_radioMeetingActionPerformed

    private void totalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPriceActionPerformed

        RS_BC_Events businessEvent = (RS_BC_Events) orgComboBox.getSelectedItem();

        if (businessEvent == null) {
            JOptionPane.showMessageDialog(this, "Please select a Business Event organization from the dropdown.");
            return;
        }
        boolean photoRadioBtnSelected = radioWedding.isSelected();
        boolean decorRadioBtnSelected = radioMeeting.isSelected();
        boolean cateringRadioBtnSelected = radioBirthdayParty.isSelected();
        Date date = DateUtils.formatDate(dateField.getDate());

        int price = 0;
        RS_BC_EventService service = new RS_BC_EventService(businessEvent, date);
        if (photoRadioBtnSelected) {
            WeddingType photography = (WeddingType) cmbWedding.getSelectedItem();
            service.addService(RS_BC_EventService.EventServiceType.WEDDING, photography.getRate());
            price += photography.getRate();
        }

        if (decorRadioBtnSelected) {
            MeetingsType decor = (MeetingsType) cmbMeeting.getSelectedItem();
            service.addService(RS_BC_EventService.EventServiceType.MEETINGS, decor.getRate());
            price += decor.getRate();
        }

        if (cateringRadioBtnSelected) {
            BirthdayPartyType catering = (BirthdayPartyType) cmbBirthdayParty.getSelectedItem();
            service.addService(RS_BC_EventService.EventServiceType.BIRTHDAYPARTY, catering.getRate());
            price += catering.getRate();
        }

        priceField.setText(String.valueOf(price));
    }//GEN-LAST:event_totalPriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookEventBtn;
    private javax.swing.JComboBox cmbBirthdayParty;
    private javax.swing.JComboBox cmbMeeting;
    private javax.swing.JComboBox cmbWedding;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JComboBox orgComboBox;
    private javax.swing.JTextField priceField;
    private javax.swing.JRadioButton radioBirthdayParty;
    private javax.swing.JRadioButton radioMeeting;
    private javax.swing.JRadioButton radioWedding;
    private javax.swing.JButton totalPrice;
    // End of variables declaration//GEN-END:variables
}
