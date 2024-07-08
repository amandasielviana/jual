/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import crud.koneksi;
import javax.swing.JOptionPane;
import java.sql.Statement;            
import java.sql.ResultSet;

/**
 *
 * @author acer
 */
public class FrameTanya extends javax.swing.JFrame {
    
    private koneksi crud;

    /**
     * Creates new form FrameTanya
     */
    public FrameTanya() {
        
        crud = new koneksi();
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtidtanya = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtidpenanya = new javax.swing.JTextField();
        txtpertanyaan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtkategori = new javax.swing.JTextField();
        txtwaktu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Cari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("id_tanya");

        jLabel2.setText("id penanya");

        txtpertanyaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpertanyaanActionPerformed(evt);
            }
        });

        jLabel3.setText("pertanyaan");

        jLabel4.setText("kategori");

        txtwaktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwaktuActionPerformed(evt);
            }
        });

        jLabel5.setText("waktu");

        jLabel6.setText("status");

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ubah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Cari.setText("Cari");
        Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cari))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidtanya)
                            .addComponent(txtidpenanya)
                            .addComponent(txtpertanyaan)
                            .addComponent(txtkategori)
                            .addComponent(txtwaktu)
                            .addComponent(txtstatus))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtidtanya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidpenanya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpertanyaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtwaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(Cari))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpertanyaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpertanyaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpertanyaanActionPerformed

    private void txtwaktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwaktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwaktuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            
            if(txtidtanya.getText().equals("")){
                JOptionPane.showMessageDialog(this, "id tanya belum diisi");
                txtidtanya.requestFocus();
            } else if(txtidpenanya.getText().equals("")){
                JOptionPane.showMessageDialog(this, "id penanya belum diisi");
                txtidpenanya.requestFocus();
            } else if(txtpertanyaan.getText().equals("")){
                JOptionPane.showMessageDialog(this, "pertanyaan belum diisi");
                txtpertanyaan.requestFocus();
            } else if(txtkategori.getText().equals("")){
                JOptionPane.showMessageDialog(this, "kategori belum diisi");
                txtkategori.requestFocus();
            } else if(txtwaktu.getText().equals("")){
                JOptionPane.showMessageDialog(this, "waktu belum diisi");
                txtwaktu.requestFocus();
            } else if(txtstatus.getText().equals("")){
                JOptionPane.showMessageDialog(this, "status belum diisi");
                txtstatus.requestFocus();    
            } else {
                crud.simpantanya(txtidtanya.getText(), txtidpenanya.getText(), txtpertanyaan.getText(), txtkategori.getText(), txtwaktu.getText(), txtstatus.getText());
                JOptionPane.showMessageDialog(this, "data berhasil disimpan");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            if (
                 txtidtanya.getText().equals("") &&
                    txtidpenanya.getText().equals("") &&
                    txtpertanyaan.getText().equals("") &&
                    txtkategori.getText().equals("") &&
                    txtwaktu.getText().equals("") &&
                    txtstatus.getText().equals("")
                )
            {
              JOptionPane.showMessageDialog(this, "Silahkan cari data terlebih dahulu");
              txtidtanya.requestFocus();
            } else {
                crud.ubahtanya(txtidtanya.getText(), txtidpenanya.getText(), txtpertanyaan.getText(), txtkategori.getText(), txtwaktu.getText(), txtstatus.getText());
                JOptionPane.showMessageDialog(this, "Data berhasil diubah");
            }    
                
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            if (
                 txtidtanya.getText().equals("") &&
                    txtidpenanya.getText().equals("") &&
                    txtpertanyaan.getText().equals("") &&
                    txtkategori.getText().equals("") &&
                    txtwaktu.getText().equals("") &&
                    txtstatus.getText().equals("")
                )
            {
              JOptionPane.showMessageDialog(this, "Silahkan cari data terlebih dahulu");
              txtidtanya.requestFocus();
            } else {
                crud.hapustanya(txtidtanya.getText());
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
                txtidtanya.setText(null);
                txtidpenanya.setText(null);
                txtpertanyaan.setText(null);
                txtkategori.setText(null);
                txtwaktu.setText(null);
                txtstatus.setText(null);
            }    
                
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariActionPerformed
        // TODO add your handling code here:
        try {        
            String sql = "select * from tanya where id_tanya = '"+txtidtanya.getText()+"' ";
            Statement perintah = crud.koneksidb.createStatement();
            ResultSet data = perintah.executeQuery(sql);
            if (data.next()){
                txtidpenanya.setText(data.getString("id_penanya"));
                txtpertanyaan.setText(data.getString("pertanyaan"));
                txtkategori.setText(data.getString("kategori"));
                txtwaktu.setText(data.getString("waktu"));
                txtstatus.setText(data.getString("status"));
            } else {
                txtidpenanya.setText(null);
                txtpertanyaan.setText(null);
                txtkategori.setText(null);
                txtwaktu.setText(null);
                txtstatus.setText(null);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_CariActionPerformed

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
            java.util.logging.Logger.getLogger(FrameTanya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTanya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTanya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTanya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTanya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cari;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtidpenanya;
    private javax.swing.JTextField txtidtanya;
    private javax.swing.JTextField txtkategori;
    private javax.swing.JTextField txtpertanyaan;
    private javax.swing.JTextField txtstatus;
    private javax.swing.JTextField txtwaktu;
    // End of variables declaration//GEN-END:variables
}
