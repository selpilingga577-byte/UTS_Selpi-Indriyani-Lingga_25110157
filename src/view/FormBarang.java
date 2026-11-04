
package view;
import dao.BarangDAO;
import model.Barang;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormBarang extends javax.swing.JFrame {
    private BarangDAO dao = new BarangDAO();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormBarang.class.getName());

    
    public FormBarang() {
    initComponents();

    setLocationRelativeTo(null);
    setTitle("Data Inventori Barang");

    jComboBox1.setModel(
        new javax.swing.DefaultComboBoxModel<>(
            new String[]{
                "Komputer",
                "Jaringan",
                "Alat Ukur"
            }
        )
    );

    jTable1.setModel(
        new DefaultTableModel(
            new Object[][]{},
            new String[]{
                "Kode Barang",
                "Nama Barang",
                "Kategori",
                "Stok"
            }
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
    );

    tampilData();
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data Iventori Barang");

        jLabel2.setText("Kode Barang");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Stok");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Komputer", "Jaringan", "Alat Ukur" }));

        jButton1.setText("Simpan");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Ubah");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setText("Hapus");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setText("Bersihkan");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setText("jLabel5");

        jLabel6.setText("DAFTAR BARANG");

        jLabel7.setText("Kategori");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(32, 32, 32)
                                .addComponent(jButton3)
                                .addGap(33, 33, 33)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
    String kode = jTextField1.getText().trim();
    String nama = jTextField2.getText().trim();
    String stokText = jTextField3.getText().trim();

    if (kode.isEmpty() || nama.isEmpty() || stokText.isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Semua data harus diisi!");
        return;
    }

    if (kode.length() > 10 || nama.length() > 50) {
        JOptionPane.showMessageDialog(this,
                "Kode maksimal 10 dan nama maksimal 50 karakter!");
        return;
    }

    try {
        int stok = Integer.parseInt(stokText);

        if (stok < 0) {
            JOptionPane.showMessageDialog(this,
                    "Stok tidak boleh negatif!");
            return;
        }

        Barang b = new Barang(
                kode,
                nama,
                jComboBox1.getSelectedItem().toString(),
                stok
        );

        if (dao.simpan(b)) {
            JOptionPane.showMessageDialog(this,
                    "Data berhasil disimpan!");

            tampilData();
            bersihkan();

        } else {
            JOptionPane.showMessageDialog(this,
                    "Data gagal disimpan! Periksa kode barang.");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this,
                "Stok harus berupa angka!");
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    String kode = jTextField1.getText().trim();
    String nama = jTextField2.getText().trim();
    String stokText = jTextField3.getText().trim();

    if (kode.isEmpty() || nama.isEmpty() || stokText.isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Pilih data yang ingin diubah!");
        return;
    }

    if (nama.length() > 50) {
        JOptionPane.showMessageDialog(this,
                "Nama maksimal 50 karakter!");
        return;
    }

    try {
        int stok = Integer.parseInt(stokText);

        if (stok < 0) {
            JOptionPane.showMessageDialog(this,
                    "Stok tidak boleh negatif!");
            return;
        }

        Barang b = new Barang(
                kode,
                nama,
                jComboBox1.getSelectedItem().toString(),
                stok
        );

        if (dao.ubah(b)) {
            JOptionPane.showMessageDialog(this,
                    "Data berhasil diubah!");

            tampilData();
            bersihkan();

        } else {
            JOptionPane.showMessageDialog(this,
                    "Kode barang tidak ditemukan!");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this,
                "Stok harus berupa angka!");
    }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
    String kode = jTextField1.getText().trim();

    if (kode.isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Pilih barang yang ingin dihapus!");
        return;
    }

    int pilih = JOptionPane.showConfirmDialog(
            this,
            "Yakin ingin menghapus barang " + kode + "?",
            "Konfirmasi Hapus",
            JOptionPane.YES_NO_OPTION
    );

    if (pilih == JOptionPane.YES_OPTION) {

        if (dao.hapus(kode)) {
            JOptionPane.showMessageDialog(this,
                    "Data berhasil dihapus!");

            tampilData();
            bersihkan();

        } else {
            JOptionPane.showMessageDialog(this,
                    "Data gagal dihapus!");
        }
    }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
    bersihkan();


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    

    int baris = jTable1.getSelectedRow();

    if (baris >= 0) {

        jTextField1.setText(
                jTable1.getValueAt(baris, 0).toString()
        );

        jTextField2.setText(
                jTable1.getValueAt(baris, 1).toString()
        );

        jComboBox1.setSelectedItem(
                jTable1.getValueAt(baris, 2).toString()
        );

        jTextField3.setText(
                jTable1.getValueAt(baris, 3).toString()
        );

        jTextField1.setEditable(false);
}

    }//GEN-LAST:event_jTable1MouseClicked
private void tampilData() {

        DefaultTableModel model =
                (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);

        List<Barang> data = dao.tampilkan();

        for (Barang b : data) {

            model.addRow(new Object[]{
                b.getKodeBarang(),
                b.getNamaBarang(),
                b.getKategori(),
                b.getStok()
            });
        }
    }

    // METHOD BERSIHKAN
    private void bersihkan() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jComboBox1.setSelectedIndex(0);
        

    jTextField1.setEditable(true);

    jTable1.clearSelection();

    jTextField1.requestFocus();
    }

    // initComponents() otomatis dari NetBeans


    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormBarang().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
