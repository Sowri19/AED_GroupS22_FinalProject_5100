package ui.ClientRole;

import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import model.RS_HallBooking;
import model.RS_Administrator;
import RS_Model.services.RS_BC_ResortService;
import ui.main.DateUtils;

public class RS_OtherServicePanel extends javax.swing.JPanel {

    private RS_Administrator systems;
    private Consumer<RS_HallBooking> callOnCreateMethod1;
    private String username;
    private RS_HallBooking booking;

    public RS_OtherServicePanel(RS_Administrator systems, Consumer<RS_HallBooking> callOnCreateMethod1, String username, RS_HallBooking booking) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.username = username;
        this.booking = booking;
        setBackground(new java.awt.Color(255, 208, 56));
        backBtn.setBackground(new java.awt.Color(0, 102, 102));
        backBtn.setOpaque(true);
        placeRequest.setBackground(new java.awt.Color(0, 102, 102));
        placeRequest.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        RbtnTourGuide = new javax.swing.JRadioButton();
        RBtnCarService = new javax.swing.JRadioButton();
        placeRequest = new javax.swing.JButton();
        dateField = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 208, 56));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 3, 36)); // NOI18N
        jLabel1.setText("HOTEL SERVICE PANEL");

        backBtn.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        backBtn.setText("<==BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        RbtnTourGuide.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        RbtnTourGuide.setText("TOUR GUIDE ($100)");
        RbtnTourGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnTourGuideActionPerformed(evt);
            }
        });

        RBtnCarService.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        RBtnCarService.setText("CAR SERVICE ($100)");

        placeRequest.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        placeRequest.setText("PLACE REQUEST");
        placeRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeRequestActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel3.setText("DATE");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rs Icon.png"))); // NOI18N
        jLabel8.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(166, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(84, 84, 84)))
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RbtnTourGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(RBtnCarService)))
                .addGap(216, 216, 216))
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(placeRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbtnTourGuide)
                    .addComponent(RBtnCarService))
                .addGap(50, 50, 50)
                .addComponent(placeRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(380, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_backBtnActionPerformed

    private void placeRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeRequestActionPerformed
        boolean tourGuideBtnSelected = RbtnTourGuide.isSelected();
        boolean carServiceBtnSelected = RBtnCarService.isSelected();
        Date date = DateUtils.formatDate(dateField.getDate());
        Date checkin = booking.getCheckin();
        Date checkout = booking.getCheckout();
        if (date.compareTo(checkin) < 0 || date.compareTo(checkout) > 0) {
            JOptionPane.showMessageDialog(this, "Selected date should be within check-in date (" + checkin
                    + ") and checkout date (" + checkout + ")");
            return;
        }

        RS_BC_ResortService resortService = booking.getResortService();
        if (tourGuideBtnSelected) {
            resortService.addService(RS_BC_ResortService.ResortServiceType.TOURGUIDE);
        }
        if (carServiceBtnSelected) {
            resortService.addService(RS_BC_ResortService.ResortServiceType.CARSERVICE);
        }

        resortService.setDate(date);
        JOptionPane.showMessageDialog(this, "Your hotel services are been added.");
        callOnCreateMethod1.accept(booking);
    }//GEN-LAST:event_placeRequestActionPerformed

    private void RbtnTourGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtnTourGuideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbtnTourGuideActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RBtnCarService;
    private javax.swing.JRadioButton RbtnTourGuide;
    private javax.swing.JButton backBtn;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton placeRequest;
    // End of variables declaration//GEN-END:variables
}
