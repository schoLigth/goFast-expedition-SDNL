// Menu yg dipakai
// Kelompok 2 : GOFAST EKSPEDISI
// Juni 04, 2023. Y O G Y A K A R T A
package ProjekSDNL;

import ProjekSDNL.Graphh.ShortestPathResult;
import java.util.ArrayList;
import java.util.List;

public class Menu extends javax.swing.JDialog {

    int vertices = 7;
    Graphh graph = new Graphh(vertices);

    public Menu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Pengiriman Barang dengan Rute Terpendek");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelAsal = new javax.swing.JLabel();
        labelTujuan = new javax.swing.JLabel();
        boxAsal = new javax.swing.JComboBox<>();
        boxTujuan = new javax.swing.JComboBox<>();
        chek = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelJarak = new javax.swing.JLabel();
        labelBiaya = new javax.swing.JLabel();
        jarak = new javax.swing.JTextField();
        biaya = new javax.swing.JTextField();
        labelRute = new javax.swing.JLabel();
        rute = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel1.setText("GoFast");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(154, 154, 154))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setForeground(new java.awt.Color(153, 153, 153));

        labelAsal.setBackground(new java.awt.Color(102, 102, 102));
        labelAsal.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        labelAsal.setText("Asal");

        labelTujuan.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        labelTujuan.setText("Tujuan");

        boxAsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bayumas", "Cilacap", "Kebumen", "Magelang", "Purbalingga", "Purworejo", "Wonosobo" }));
        boxAsal.setSelectedIndex(-1);
        boxAsal.setSelectedItem(-1);
        boxAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxAsalActionPerformed(evt);
            }
        });

        boxTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bayumas", "Cilacap", "Kebumen", "Magelang", "Purbalingga", "Purworejo", "Wonosobo" }));
        boxTujuan.setSelectedIndex(-1);
        boxTujuan.setSelectedItem(-1);

        chek.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 11)); // NOI18N
        chek.setText("Chek");
        chek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chekActionPerformed(evt);
            }
        });

        jLabel2.setText("Informasi pengiriman dengan rute terpendek:");

        labelJarak.setBackground(new java.awt.Color(204, 204, 204));
        labelJarak.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        labelJarak.setText("Jarak");

        labelBiaya.setBackground(new java.awt.Color(204, 204, 204));
        labelBiaya.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        labelBiaya.setText("Biaya");

        jarak.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jarak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jarakActionPerformed(evt);
            }
        });

        biaya.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        biaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biayaActionPerformed(evt);
            }
        });

        labelRute.setBackground(new java.awt.Color(204, 204, 204));
        labelRute.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        labelRute.setText("Rute");

        rute.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        rute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(labelBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(biaya, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(labelJarak, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jarak))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(labelRute, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rute)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jarak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelJarak))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBiaya)
                    .addComponent(biaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRute)
                    .addComponent(rute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(boxAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(boxTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chek)
                        .addGap(34, 34, 34))))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAsal)
                    .addComponent(boxAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTujuan)
                    .addComponent(boxTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chek))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chekActionPerformed
        int source = 0;
        int destination = 0;

        if (boxAsal.getSelectedItem() == null || boxTujuan.getSelectedItem() == null) {
            chek.setEnabled(false);

            jarak.isVisible();
            biaya.isEnabled();
            rute.isEnabled();
        } else {
            // Mengambil model combo box
            javax.swing.ComboBoxModel<String> model = boxAsal.getModel();
            javax.swing.ComboBoxModel<String> model2 = boxTujuan.getModel();

            // Mengambil item terpilih
            String asal = model.getSelectedItem().toString().toLowerCase();
            String tujuan = model2.getSelectedItem().toString().toLowerCase();
            System.out.println("asal " + asal);
            System.out.println("tujuan " + tujuan);

            String[] daerah = {"cilacap", "bayumas", "purbalingga", "kebumen", "purworejo", "wonosobo", "magelang"};

            graph.addEdge(0, 1, 41);        // Cilacap - Bayumas
            graph.addEdge(0, 2, 82);      // Cilacap - Purbalingga
            graph.addEdge(0, 6, 167);        // Cilacap - Magelang
            graph.addEdge(0, 4, 124);        // Cilacap - Purworejo
            graph.addEdge(1, 2, 42);         // Bayumas -  Purbalingga
            graph.addEdge(1, 4, 117);       // Bayumas - Purworejo
            graph.addEdge(2, 3, 75);        // Purbalingga - Kebumen
            graph.addEdge(3, 4, 42);        // Kebumen - Purworejo
            graph.addEdge(4, 5, 54);        // Purworejo - Wonosobo
            graph.addEdge(5, 6, 61);        // Wonosobo - Magelang    
            graph.addEdge(6, 2, 128);     // Magelang - Purbalingga
            graph.addEdge(6, 3, 86);         // Magelang - Kebumen
            graph.addEdge(1, 3, 77);        // Bayumas - Kebumen

            for (int i = 0; i < daerah.length; i++) {
                if (asal.equalsIgnoreCase(daerah[i])) {
                    source = i;
                }
                if (tujuan.equalsIgnoreCase(daerah[i])) {
                    destination = i;
                }
            }
            ShortestPathResult result = graph.getShortestPath(source, destination);

            // Mengisi field jarak
            jarak.setText(String.valueOf(result.getCost()) + " Km");

            // Mengisi field rute yang dilalui
            // Mendapatkan isi List<Integer> dalam bentuk array
            List<Integer> path = result.getPath();
            Integer[] data = path.toArray(new Integer[path.size()]);
            List<String> ruteku = new ArrayList<>();

            for (int i = 0; i < data.length; i++) {
                System.out.println("data ku : " + data[i]);
                for (int j = 0; j < daerah.length; j++) {
                    if (data[i] == j) {
                        ruteku.add(String.valueOf(daerah[j]));
                    }
                }
            }
            rute.setText(String.valueOf(ruteku));

            // Mengisi field biaya pengiriman
            int cost = result.getCost() * 5 / 100 * 2000;
            System.out.println("cost " + cost);
            biaya.setText(String.valueOf("Rp" + cost));
        }
    }//GEN-LAST:event_chekActionPerformed

    private void biayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biayaActionPerformed
        // Chek biaya pengiriman
    }//GEN-LAST:event_biayaActionPerformed

    private void ruteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruteActionPerformed
        // Chek rute yang dilalui dari tempat asal ke tujuan
    }//GEN-LAST:event_ruteActionPerformed

    private void jarakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jarakActionPerformed
        // Chek jarak yang ditempuh dari asal ke tujuan

    }//GEN-LAST:event_jarakActionPerformed

    private void boxAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxAsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxAsalActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu dialog = new Menu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField biaya;
    private javax.swing.JComboBox<String> boxAsal;
    private javax.swing.JComboBox<String> boxTujuan;
    private javax.swing.JButton chek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jarak;
    private javax.swing.JLabel labelAsal;
    private javax.swing.JLabel labelBiaya;
    private javax.swing.JLabel labelJarak;
    private javax.swing.JLabel labelRute;
    private javax.swing.JLabel labelTujuan;
    private javax.swing.JTextField rute;
    // End of variables declaration//GEN-END:variables

}
