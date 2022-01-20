/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author RAFIKI
 */
public class PertambahanAplikasiDuaAngka extends javax.swing.JFrame {
        int hasil = 0;
    /**
     * Creates new form PertambahanAplikasiDuaAngka
     */
    public PertambahanAplikasiDuaAngka() {
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

        jPanel2 = new javax.swing.JPanel();
        textAngkaPertama = new javax.swing.JTextField();
        textAngkaKedua = new javax.swing.JTextField();
        textHasil = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelOperator = new javax.swing.JLabel();
        buttonTambah = new javax.swing.JButton();
        buttonKurang = new javax.swing.JButton();
        buttonKali = new javax.swing.JButton();
        buttonBagi = new javax.swing.JButton();
        ButtonHapus = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operasi Dua Angka");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operasi Dua Angka"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("=");

        labelOperator.setText("+");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(textAngkaPertama, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAngkaKedua, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAngkaPertama, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAngkaKedua, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonKurang.setText("Kurang");
        buttonKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKurangActionPerformed(evt);
            }
        });

        buttonKali.setText("Kali");
        buttonKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKaliActionPerformed(evt);
            }
        });

        buttonBagi.setText("Bagi");
        buttonBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBagiActionPerformed(evt);
            }
        });

        ButtonHapus.setText("Hapus");
        ButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHapusActionPerformed(evt);
            }
        });

        buttonKeluar.setText("Keluar");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonKurang)
                        .addGap(43, 43, 43)
                        .addComponent(buttonKali, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(ButtonHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonKeluar)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTambah)
                    .addComponent(buttonKurang)
                    .addComponent(buttonBagi)
                    .addComponent(buttonKali))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonKeluar)
                    .addComponent(ButtonHapus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
       hasil = getAngkaPertama() + getAngkaKedua();
       textHasil.setText(hasil+"");
       labelOperator.setText("+");
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKurangActionPerformed
       hasil = getAngkaPertama() - getAngkaKedua();
       textHasil.setText(hasil+"");
       labelOperator.setText("-");
    }//GEN-LAST:event_buttonKurangActionPerformed

    private void buttonKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKaliActionPerformed
       hasil = getAngkaPertama() * getAngkaKedua();
       textHasil.setText(hasil+"");
       labelOperator.setText("*");
    }//GEN-LAST:event_buttonKaliActionPerformed

    private void buttonBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBagiActionPerformed
       hasil = getAngkaPertama() / getAngkaKedua();
       textHasil.setText(hasil+"");
       labelOperator.setText("/");
    }//GEN-LAST:event_buttonBagiActionPerformed

    private void ButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHapusActionPerformed
       textAngkaPertama.setText("");
       textAngkaKedua.setText("");
       textHasil.setText("");
       textAngkaPertama.requestFocus();
       
    }//GEN-LAST:event_ButtonHapusActionPerformed

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
      String tanya = "Apakah anda yakin ingin keluar Aplikasi?";
        boolean yakin = JOptionPane.showConfirmDialog(rootPane, tanya)== JOptionPane.YES_OPTION;
        if(yakin){
            System.exit(0);
        }
        
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private int getAngkaPertama(){
        return Integer.valueOf(textAngkaPertama.getText());
    }
    
     private int getAngkaKedua(){
        return Integer.valueOf(textAngkaKedua.getText());
    }
    
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
            java.util.logging.Logger.getLogger(PertambahanAplikasiDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PertambahanAplikasiDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PertambahanAplikasiDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PertambahanAplikasiDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PertambahanAplikasiDuaAngka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonHapus;
    private javax.swing.JButton buttonBagi;
    private javax.swing.JButton buttonKali;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonKurang;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelOperator;
    private javax.swing.JTextField textAngkaKedua;
    private javax.swing.JTextField textAngkaPertama;
    private javax.swing.JTextField textHasil;
    // End of variables declaration//GEN-END:variables
}
