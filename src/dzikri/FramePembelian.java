package dzikri;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import dzikri.*;
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

    private int id = 0; // setting variable id untuk kode transaksi
    private String kode; // setting kode variable untuk kode transaksi
    private DefaultTableModel dtmodel; // model tabel
    private DefaultComboBoxModel cbModel; // combo box model
    private ArrayList<Item> belanja = new ArrayList<>(); // variable untuk menampilkan daftar transaksi
    
    
    public FramePembelian() {
        PriceComboModel model = new PriceComboModel();
        this.cbModel = new DefaultComboBoxModel<> (model.getNamaItem().toArray());
        
        TabelItem models = new TabelItem();
        this.dtmodel = new DefaultTableModel(models.getNamaKolom(), 0);
        
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
        kodeBarangText = new javax.swing.JTextField();
        jumlahBarangText = new javax.swing.JTextField();
        newBUTTON = new javax.swing.JButton();
        addBUTTON = new javax.swing.JButton();
        deleteBUTTON = new javax.swing.JButton();
        saveBUTTON = new javax.swing.JButton();
        cancelBUTTON = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableitemlist = new javax.swing.JTable();
        barangComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quiz 2 Pemrograman Berbasis Objek");
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pembelian Barang", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15))); // NOI18N

        jLabel1.setText("Kode Barang");

        jLabel2.setText("Jenis Barang");

        kodeBarangText.setEnabled(false);

        jumlahBarangText.setToolTipText("");
        jumlahBarangText.setEnabled(false);

        newBUTTON.setText("New");
        newBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBUTTONActionPerformed(evt);
            }
        });

        addBUTTON.setText("Add");
        addBUTTON.setEnabled(false);
        addBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBUTTONActionPerformed(evt);
            }
        });

        deleteBUTTON.setText("Delete");
        deleteBUTTON.setEnabled(false);
        deleteBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBUTTONActionPerformed(evt);
            }
        });

        saveBUTTON.setText("Save");
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

        tableitemlist.setModel(this.dtmodel);
        jScrollPane2.setViewportView(tableitemlist);

        barangComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gula", "Kopi", "Susu" }));
        barangComboBox.setSelectedIndex(-1);

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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(barangComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(jumlahBarangText))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(kodeBarangText, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(deleteBUTTON, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(newBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addBUTTON, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(29, 29, 29))
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
                    .addComponent(jumlahBarangText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barangComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(addBUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBUTTON))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBUTTON)
                    .addComponent(cancelBUTTON))
                .addContainerGap(219, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBUTTONActionPerformed
        TransaksiBaru();
        this.kurangkodeId();
    }//GEN-LAST:event_cancelBUTTONActionPerformed
    
    
    // -- mengecek jika ada item double yang dipilih pada item sebelumnya
    private boolean isDuplicate(String nama){
        boolean hasil = false;
        ArrayList<String> item = new ArrayList<>();
        for (int i = 0; i < dtmodel.getRowCount(); i++) {
            item.add(dtmodel.getValueAt(i, 0).toString());
        }
        for (String index : item) {
            if (index.equals(nama)) {
                hasil = true;
            }
        }
        return hasil;
    }
    
    // -- mengecek table apakah kosong
    private boolean isEmpty(){
        return this.tableitemlist.getModel().getRowCount() <= 0;
    }
    
    
    // -- disable button remove dan save jika table kosong
    private void belanja(){
        if (isEmpty()) {
            this.saveBUTTON.setEnabled(false);
            this.deleteBUTTON.setEnabled(false);
        } else {
            this.saveBUTTON.setEnabled(true);
            this.deleteBUTTON.setEnabled(true);
        }
    }
    
    
    // -- dapat melakukan transaksi baru jika sudah menyelesaikan transaksi 
    private void TransaksiBaru(){
        this.jumlahBarangText.setText(" ");
        this.kodeBarangText.setText(" ");
        this.newBUTTON.setEnabled(true);
        this.saveBUTTON.setEnabled(false);
        this.cancelBUTTON.setEnabled(false);
        this.addBUTTON.setEnabled(false);
        this.deleteBUTTON.setEnabled(false);
        this.jumlahBarangText.setEnabled(false);
        this.barangComboBox.setEnabled(false);
        this.dtmodel.setRowCount(0);
        this.belanja.clear();
    }
    
    
    private void saveBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBUTTONActionPerformed
        try {
            for (int i = 0; i < dtmodel.getRowCount(); i++) {
                // menyimpan nama barang dan jumlah 
                String nama = dtmodel.getValueAt(i, 0).toString();
                float harga = new Float(dtmodel.getValueAt(i, 1).toString()) ;
                int jumlah  = new Integer(dtmodel.getValueAt(i, 2).toString());
                this.belanja.add(new Item(nama, jumlah, harga));
            }
            // instansiasi class Transaksi dengan kode dan comitted belanja
            Transaksi trnsksi = new Transaksi(this.kode, this.belanja);
            StringBuilder sbuilder = new StringBuilder();
            
            sbuilder.append(trnsksi.Pembayaran());
            
            JOptionPane.showMessageDialog(this, sbuilder, "Transaksi", JOptionPane.INFORMATION_MESSAGE);
            TransaksiBaru();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }//GEN-LAST:event_saveBUTTONActionPerformed

    private void addBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBUTTONActionPerformed
        
        String nama = this.barangComboBox.getSelectedItem().toString();
        int jumlah = new Integer(this.jumlahBarangText.getText());
        if (isDuplicate(nama)) {
            updateJumlah(nama, jumlah);
        } else {
            dtmodel.addRow(addItem(nama, jumlah));
        }
        this.belanja();
        
    }//GEN-LAST:event_addBUTTONActionPerformed

    private void deleteBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBUTTONActionPerformed
        if (tableitemlist.getSelectedRow() < 0) {
            String menu = "Pilih item yang mau dihapus";
            JOptionPane.showMessageDialog(this, menu, "Informasi",JOptionPane.INFORMATION_MESSAGE);
        } else {
            // jika ada baris yang dipilih
            int jumlah = tableitemlist.getSelectedRows().length;
            for (int i = 0; i < jumlah; i++) {
                dtmodel.removeRow(tableitemlist.getSelectedRow());
            }
        }
        this.belanja();
    }//GEN-LAST:event_deleteBUTTONActionPerformed

    private void newBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBUTTONActionPerformed
        this.jumlahBarangText.setText("1");
        this.newBUTTON.setEnabled(false);
        this.cancelBUTTON.setEnabled(true);
        this.addBUTTON.setEnabled(true);
        this.jumlahBarangText.setEnabled(true);
        this.barangComboBox.setEnabled(true);
        this.kodeBarangText.setText(this.setKode());
        
    }//GEN-LAST:event_newBUTTONActionPerformed
    public static String now(){
        String DATE_FORMAT_NOW = "yyMMdd";
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTime());
    
    }    
    
    // -- penambahan id / kode barang
    private void tambahkodeId(){
        this.id += 1;
    }
    // -- penambahan id / kode barang
    private void kurangkodeId(){
        this.id -= 1;
    }
    
    
    // -- fungsi untuk setting code
    private String setKode(){
        this.tambahkodeId();
        // -- setting tanggal
        String date = new SimpleDateFormat("yyMMdd").format(new Date());
        this.kode = String.format(date + "%02d", this.id);
        return kode;
    }
    private Object[] addItem(String nama,int jumlah){
        float harga = 0;
        PriceComboModel item = new PriceComboModel();
        for (int i = 0; i < item.getHargaItem().size() ; i++) {
            if (nama.equalsIgnoreCase(item.getNamaItem().get(i))) {
                harga = item.getHargaItem().get(i);
            }
        }
        Object[] objek = { nama,harga,jumlah,};
        return objek;
    }
    
    
    // --- fungsi untuk update jumlah 
    private void updateJumlah(String nama,int add){
        ArrayList<String> item = new ArrayList<>();
        for (int i = 0; i < dtmodel.getRowCount(); i++) {
            item.add(dtmodel.getValueAt(i, 0).toString());
        }
        for (int i = 0; i < item.size(); i++) {
            if (item.get(i).equals(nama)) {
                int jumlah = new Integer(dtmodel.getValueAt(i, 2).toString());
                dtmodel.setValueAt(jumlah + add , i, 2);
            }
        }   
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jumlahBarangText;
    private javax.swing.JTextField kodeBarangText;
    private javax.swing.JButton newBUTTON;
    private javax.swing.JButton saveBUTTON;
    private javax.swing.JTable tableitemlist;
    // End of variables declaration//GEN-END:variables
}
