import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Dzikri Alif A
 * dzikrialif99@gmail.com
 * Quiz 2 PBO
 */

/**
 *
 * @author HP
 */
public class FramePembelian extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public FramePembelian() {
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kodeBarangText = new javax.swing.JTextField();
        barangComboBox = new javax.swing.JComboBox<>();
        jumlahBarangText = new javax.swing.JTextField();
        newBUTTON = new javax.swing.JButton();
        addBUTTON = new javax.swing.JButton();
        deleteBUTTON = new javax.swing.JButton();
        saveBUTTON = new javax.swing.JButton();
        cancelBUTTON = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz 2 Pemrograman Berbasis Objek");
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pembelian Barang", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N

        jLabel1.setText("Kode Barang");

        jLabel2.setText("Jenis Barang");

        jTable1.setBackground(new java.awt.Color(153, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Barang", "Harga Barang", "Jumlah Barang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        kodeBarangText.setEnabled(false);

        barangComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Barang", "Gula", "Kopi", "Susu" }));
        barangComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        barangComboBox.setEnabled(false);
        barangComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barangComboBoxActionPerformed(evt);
            }
        });

        jumlahBarangText.setToolTipText("");
        jumlahBarangText.setEnabled(false);

        newBUTTON.setText("New");
        newBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBUTTONActionPerformed(evt);
            }
        });

        addBUTTON.setText("Tambah");
        addBUTTON.setEnabled(false);
        addBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBUTTONActionPerformed(evt);
            }
        });

        deleteBUTTON.setText("Hapus");
        deleteBUTTON.setEnabled(false);
        deleteBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBUTTONActionPerformed(evt);
            }
        });

        saveBUTTON.setText("Simpan");
        saveBUTTON.setEnabled(false);
        saveBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBUTTONActionPerformed(evt);
            }
        });

        cancelBUTTON.setText("Cancel");
        cancelBUTTON.setEnabled(false);
        cancelBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBUTTONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(saveBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(barangComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jumlahBarangText))
                            .addComponent(kodeBarangText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(deleteBUTTON, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(newBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addBUTTON, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kodeBarangText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newBUTTON))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(barangComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahBarangText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addBUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBUTTON))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBUTTON)
                    .addComponent(cancelBUTTON))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jMenu1.setText("Menu");

        jMenu3.setText("Keluar");
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBUTTONActionPerformed
        nonaktif();
    }//GEN-LAST:event_cancelBUTTONActionPerformed

    private void saveBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBUTTONActionPerformed
        BarangInfo binfo = new BarangInfo();
        binfo.setJumlahBarang(jumlahBarangText.getText()); // mengambil nilai dari jum
        // proses pemilihan barang
        Object barangItem = barangComboBox.getSelectedItem();
        binfo.setPilihItem((barangItem != null ) ? barangItem.toString() : null );
        
        JOptionPane.showMessageDialog(this, binfo);
    }//GEN-LAST:event_saveBUTTONActionPerformed

    private void addBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBUTTONActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
   
        model.addRow(new Object[]{barangComboBox.getSelectedItem().toString() ,jumlahBarangText.getText()});
        
    }//GEN-LAST:event_addBUTTONActionPerformed

    private void barangComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barangComboBoxActionPerformed
 
    }//GEN-LAST:event_barangComboBoxActionPerformed

    private void deleteBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBUTTONActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.removeRow(jTable1.getSelectedRow());
    }//GEN-LAST:event_deleteBUTTONActionPerformed

    private void newBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBUTTONActionPerformed
        if (!newBUTTON.isSelected()) {
            aktif();
        }
    }//GEN-LAST:event_newBUTTONActionPerformed

    private void aktif(){
        // enable button & textField
        addBUTTON.setEnabled(true);
        deleteBUTTON.setEnabled(true);
        saveBUTTON.setEnabled(true);
        cancelBUTTON.setEnabled(true);
        //-------------------------------------
        jumlahBarangText.setEnabled(true);
        kodeBarangText.setEnabled(true);
        barangComboBox.setEnabled(true);
    }
    private void nonaktif(){
        // disable button & textField
        addBUTTON.setEnabled(false);
        deleteBUTTON.setEnabled(false);
        saveBUTTON.setEnabled(false);
        cancelBUTTON.setEnabled(false);
        //-------------------------------------
        jumlahBarangText.setEnabled(false);
        kodeBarangText.setEnabled(false);
        barangComboBox.setEnabled(false);
    }
    
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
            java.util.logging.Logger.getLogger(FramePembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBUTTON;
    private javax.swing.JComboBox<String> barangComboBox;
    private javax.swing.JButton cancelBUTTON;
    private javax.swing.JButton deleteBUTTON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jumlahBarangText;
    private javax.swing.JTextField kodeBarangText;
    private javax.swing.JButton newBUTTON;
    private javax.swing.JButton saveBUTTON;
    // End of variables declaration//GEN-END:variables
}
