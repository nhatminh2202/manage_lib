package Form;

import QuanLy.qlMuonTra;
import QuanLy.qlSach;
import QuanLy.qlThuThu;


public class choiceForm extends javax.swing.JFrame {

    public choiceForm() {
        initComponents();
        setTitle("Choice");
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnQLS = new javax.swing.JButton();
        btnQLMT = new javax.swing.JButton();
        btnQLTT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(154, 123, 180));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Chức năng hệ thống");

        btnQLS.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnQLS.setForeground(new java.awt.Color(0, 51, 51));
        btnQLS.setText("Quản lý sách thư viện");
        btnQLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSActionPerformed(evt);
            }
        });

        btnQLMT.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnQLMT.setForeground(new java.awt.Color(0, 51, 51));
        btnQLMT.setText("Quản lý mượn trả");
        btnQLMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLMTActionPerformed(evt);
            }
        });

        btnQLTT.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnQLTT.setForeground(new java.awt.Color(0, 51, 51));
        btnQLTT.setText("Quản lý thủ thư");
        btnQLTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLTTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQLTT, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQLMT, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQLS, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQLS, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQLMT, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQLTT, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQLMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLMTActionPerformed
        // TODO add your handling code here:
        qlMuonTra mt = new qlMuonTra();
        mt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQLMTActionPerformed

    private void btnQLTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLTTActionPerformed
        // TODO add your handling code here:
        qlThuThu dg = new qlThuThu();
        dg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQLTTActionPerformed

    private void btnQLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSActionPerformed
        // TODO add your handling code here:
        qlSach qls = new qlSach();
        qls.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQLSActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(choiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(choiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(choiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(choiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new choiceForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQLMT;
    private javax.swing.JButton btnQLS;
    private javax.swing.JButton btnQLTT;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
