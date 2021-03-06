/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitap_yayinciligi;

import java.util.ArrayList;

/**
 *
 * @author CASPER
 */
public class Tarih_Arayuz extends javax.swing.JFrame {

    /**
     * Creates new form Tarih_Arayuz
     */
    public Tarih_Arayuz() {
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

        Tarih_Arayuz_back_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        yazdirma_ekrani = new javax.swing.JTextArea();
        combo_box_button = new java.awt.Button();
        ekle_sil_combo_box = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Tarih_Arayuz_back_button.setBackground(new java.awt.Color(255, 10, 10));
        Tarih_Arayuz_back_button.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Tarih_Arayuz_back_button.setText("Back");
        Tarih_Arayuz_back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tarih_Arayuz_back_buttonActionPerformed(evt);
            }
        });

        yazdirma_ekrani.setBackground(new java.awt.Color(220, 220, 220));
        yazdirma_ekrani.setColumns(20);
        yazdirma_ekrani.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        yazdirma_ekrani.setRows(5);
        yazdirma_ekrani.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yazdirma_ekraniMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(yazdirma_ekrani);

        combo_box_button.setBackground(new java.awt.Color(255, 255, 0));
        combo_box_button.setLabel("YAP");
        combo_box_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_box_buttonActionPerformed(evt);
            }
        });

        ekle_sil_combo_box.setMaximumRowCount(3);
        ekle_sil_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[--Islemler--]", "Kitap Ekle", "Kitap Sil" }));

        jLabel1.setFont(new java.awt.Font("Meiryo", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TARIH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tarih_Arayuz_back_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(60, 60, 60)
                        .addComponent(ekle_sil_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_box_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(combo_box_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(ekle_sil_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Tarih_Arayuz_back_button)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tarih_Arayuz_back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tarih_Arayuz_back_buttonActionPerformed
        KategorilerArayuz screen = new KategorilerArayuz();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Tarih_Arayuz_back_buttonActionPerformed

    private void yazdirma_ekraniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yazdirma_ekraniMouseClicked
        DataBase db = new DataBase();
        
        ArrayList<String> kitap_database = new ArrayList<>();
        
        Class<Tarih> veri_tipi_tarih = Tarih.class;
        
        kitap_database = db.veri_cekme(veri_tipi_tarih.getTypeName() , 1);
        Kitap cecen = new Tarih(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8) ) ;
       
        kitap_database = db.veri_cekme(veri_tipi_tarih.getTypeName() , 2);
        Kitap hititler = new Tarih( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)) ;
        
        kitap_database = db.veri_cekme(veri_tipi_tarih.getTypeName() , 3);
        Kitap guzel_tarih = new Tarih( kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)) ;
        
        kitap_database = db.veri_cekme(veri_tipi_tarih.getTypeName() , 4);
        Kitap hayatim = new Tarih(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8) ) ;
        
        kitap_database = db.veri_cekme(veri_tipi_tarih.getTypeName() , 5);
        Kitap turklerin_tarihi = new Tarih(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8)) ;
        
        ArrayList<Kitap> tarih = new ArrayList<>() ;
        tarih = KategorilerArayuz.listelenecekler_arayuz(cecen, hititler, guzel_tarih, hayatim, turklerin_tarihi);
       
        if ( 1 == db.eklenen_kitap_sayisi(veri_tipi_tarih.getTypeName()) )
        {
            kitap_database = db.veri_cekme_eklenenler(veri_tipi_tarih.getTypeName()) ;
            Kitap kitap_t = new Tarih(kitap_database.get(1),kitap_database.get(2),kitap_database.get(3) , Integer.parseInt(kitap_database.get(4)) , Integer.parseInt(kitap_database.get(5)) , kitap_database.get(6) , Integer.parseInt(kitap_database.get(7)) , kitap_database.get(8));
            tarih.add(kitap_t);
        }
        
        String ekrana_yazilacak = KategorilerArayuz.listele_arayuz(veri_tipi_tarih.getTypeName(),tarih);
        
        yazdirma_ekrani.append(ekrana_yazilacak);
    }//GEN-LAST:event_yazdirma_ekraniMouseClicked

    private void combo_box_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_box_buttonActionPerformed
        if ( ekle_sil_combo_box.getSelectedIndex() == 1 )
        {
            Kitap_Ekleme_Arayuz screen = new Kitap_Ekleme_Arayuz();
            screen.setVisible(true);
            this.setVisible(false);           
        }
        else if ( ekle_sil_combo_box.getSelectedIndex() == 2 )
        {
            Kitap_Silme_Arayuz screen = new Kitap_Silme_Arayuz();
            screen.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_combo_box_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Tarih_Arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tarih_Arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tarih_Arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tarih_Arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tarih_Arayuz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tarih_Arayuz_back_button;
    private java.awt.Button combo_box_button;
    private javax.swing.JComboBox<String> ekle_sil_combo_box;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea yazdirma_ekrani;
    // End of variables declaration//GEN-END:variables
}
