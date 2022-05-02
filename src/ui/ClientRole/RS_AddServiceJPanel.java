package ui.ClientRole;

import java.util.function.Consumer;
import model.RS_HallBooking;
import model.RS_Administrator;

public class RS_AddServiceJPanel extends javax.swing.JPanel {

    private RS_Administrator systems;
    private Consumer<RS_HallBooking> callOnEventBooking;
    private Consumer<RS_HallBooking> callOnCateringBooking;
    private Consumer<RS_HallBooking> callOnEntertainmentBooking;
    private Consumer<RS_HallBooking> callOnResortServiceBooking;
    private Runnable backButton4;
    private String username;
    private String hotelName;
    private RS_HallBooking booking;

    public RS_AddServiceJPanel(RS_Administrator systems, Consumer<RS_HallBooking> callOnEventBooking, Consumer<RS_HallBooking> callOnOrderBooking,
            Consumer<RS_HallBooking> callOnEntertainmentBooking, Consumer<RS_HallBooking> callOnResortServiceBooking, Runnable backButton, String username, RS_HallBooking booking) {
        initComponents();
        this.systems = systems;
        this.callOnEventBooking = callOnEventBooking;
        this.callOnCateringBooking = callOnOrderBooking;
        this.callOnEntertainmentBooking = callOnEntertainmentBooking;
        this.callOnResortServiceBooking = callOnResortServiceBooking;
        this.backButton4 = backButton;
        this.username = username;
        this.booking = booking;
        setBackground(new java.awt.Color(255, 204, 204));
        backBtn.setBackground(new java.awt.Color(244, 120, 140));
        backBtn.setOpaque(true);
        btnEvent.setBackground(new java.awt.Color(244, 120, 140));
        btnEvent.setOpaque(true);
        btnCatering.setBackground(new java.awt.Color(244, 120, 140));
        btnCatering.setOpaque(true);
        btnEntertainment.setBackground(new java.awt.Color(244, 120, 140));
        btnEntertainment.setOpaque(true);
        btnOthers.setBackground(new java.awt.Color(244, 120, 140));
        btnOthers.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        btnEvent = new javax.swing.JButton();
        btnCatering = new javax.swing.JButton();
        btnEntertainment = new javax.swing.JButton();
        btnOthers = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("VIEW SERVICES DETAILS");

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        btnEvent.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnEvent.setText("EVENT");
        btnEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventActionPerformed(evt);
            }
        });

        btnCatering.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnCatering.setText("CATERING");
        btnCatering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCateringActionPerformed(evt);
            }
        });

        btnEntertainment.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnEntertainment.setText("ENTERTAINMENT");
        btnEntertainment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntertainmentActionPerformed(evt);
            }
        });

        btnOthers.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnOthers.setText("OTHERS");
        btnOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOthersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(299, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCatering, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(180, 180, 180))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(259, 259, 259)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnOthers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEntertainment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(btnEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnCatering, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnEntertainment, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnOthers)
                .addContainerGap(272, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventActionPerformed
        callOnEventBooking.accept(booking);
    }//GEN-LAST:event_btnEventActionPerformed

    private void btnCateringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCateringActionPerformed
        callOnCateringBooking.accept(booking);
    }//GEN-LAST:event_btnCateringActionPerformed

    private void btnEntertainmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntertainmentActionPerformed
        callOnEntertainmentBooking.accept(booking);
    }//GEN-LAST:event_btnEntertainmentActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        backButton4.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOthersActionPerformed
        callOnResortServiceBooking.accept(booking);
    }//GEN-LAST:event_btnOthersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnCatering;
    private javax.swing.JButton btnEntertainment;
    private javax.swing.JButton btnEvent;
    private javax.swing.JButton btnOthers;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
