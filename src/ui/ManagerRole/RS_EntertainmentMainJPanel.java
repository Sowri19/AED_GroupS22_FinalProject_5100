/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ManagerRole;

/**
 *
 * @author jaahn
 */
public class RS_EntertainmentMainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HealthMainJPanel
     */
    public RS_EntertainmentMainJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblsysadmin = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jButton1.setText("SUPERVISE EMPLOYEES");

        jButton2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jButton2.setText("<==BACK");

        lblsysadmin.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        lblsysadmin.setText("ENTERTAINMENT CLUB MANAGER");

        jButton3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jButton3.setText("CONFIRM BOOKINGS & ASSIGN ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(332, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(lblsysadmin))
                .addGap(294, 294, 294))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton2)
                .addGap(37, 37, 37)
                .addComponent(lblsysadmin)
                .addGap(111, 111, 111)
                .addComponent(jButton1)
                .addGap(28, 28, 28)
                .addComponent(jButton3)
                .addContainerGap(496, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel lblsysadmin;
    // End of variables declaration//GEN-END:variables
}
