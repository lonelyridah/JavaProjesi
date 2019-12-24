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
public class KategorilerArayuz extends javax.swing.JFrame 
{

    /**
     * Creates new form Arayuz
     */
    public KategorilerArayuz() {
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

        kategoriler_panel = new javax.swing.JPanel();
        klasikler_panel = new javax.swing.JPanel();
        klasik_kategori_button = new javax.swing.JButton();
        tarih_panel = new javax.swing.JPanel();
        tarih_kategori_button = new javax.swing.JButton();
        egitim_panel = new javax.swing.JPanel();
        egitim_kategori_button = new javax.swing.JButton();
        bilgisayar_panel = new javax.swing.JPanel();
        bilgisayar_kategori_button = new javax.swing.JButton();
        felsefe_panel = new javax.swing.JPanel();
        felsefe_kategori_button = new javax.swing.JButton();
        dini_panel = new javax.swing.JPanel();
        dini_kategori_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 480));

        kategoriler_panel.setBackground(new java.awt.Color(200, 200, 200));
        kategoriler_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Kategoriler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Narkisim", 1, 36))); // NOI18N
        kategoriler_panel.setToolTipText("");

        klasikler_panel.setBackground(new java.awt.Color(139, 200, 170));
        klasikler_panel.setPreferredSize(new java.awt.Dimension(150, 150));

        klasik_kategori_button.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        klasik_kategori_button.setText("Klasikler");
        klasik_kategori_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klasik_kategori_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout klasikler_panelLayout = new javax.swing.GroupLayout(klasikler_panel);
        klasikler_panel.setLayout(klasikler_panelLayout);
        klasikler_panelLayout.setHorizontalGroup(
            klasikler_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(klasikler_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(klasik_kategori_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        klasikler_panelLayout.setVerticalGroup(
            klasikler_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, klasikler_panelLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(klasik_kategori_button)
                .addGap(54, 54, 54))
        );

        tarih_panel.setBackground(new java.awt.Color(139, 200, 170));
        tarih_panel.setPreferredSize(new java.awt.Dimension(150, 150));

        tarih_kategori_button.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        tarih_kategori_button.setText("Tarih");
        tarih_kategori_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarih_kategori_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tarih_panelLayout = new javax.swing.GroupLayout(tarih_panel);
        tarih_panel.setLayout(tarih_panelLayout);
        tarih_panelLayout.setHorizontalGroup(
            tarih_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tarih_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tarih_kategori_button)
                .addGap(33, 33, 33))
        );
        tarih_panelLayout.setVerticalGroup(
            tarih_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tarih_panelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(tarih_kategori_button)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        egitim_panel.setBackground(new java.awt.Color(139, 200, 170));
        egitim_panel.setPreferredSize(new java.awt.Dimension(150, 150));

        egitim_kategori_button.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        egitim_kategori_button.setText("Egitim");
        egitim_kategori_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egitim_kategori_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout egitim_panelLayout = new javax.swing.GroupLayout(egitim_panel);
        egitim_panel.setLayout(egitim_panelLayout);
        egitim_panelLayout.setHorizontalGroup(
            egitim_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, egitim_panelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(egitim_kategori_button)
                .addGap(18, 18, 18))
        );
        egitim_panelLayout.setVerticalGroup(
            egitim_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(egitim_panelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(egitim_kategori_button)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        bilgisayar_panel.setBackground(new java.awt.Color(139, 200, 170));
        bilgisayar_panel.setPreferredSize(new java.awt.Dimension(150, 150));

        bilgisayar_kategori_button.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        bilgisayar_kategori_button.setText("Bilgisayar");
        bilgisayar_kategori_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilgisayar_kategori_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bilgisayar_panelLayout = new javax.swing.GroupLayout(bilgisayar_panel);
        bilgisayar_panel.setLayout(bilgisayar_panelLayout);
        bilgisayar_panelLayout.setHorizontalGroup(
            bilgisayar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bilgisayar_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bilgisayar_kategori_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bilgisayar_panelLayout.setVerticalGroup(
            bilgisayar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bilgisayar_panelLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(bilgisayar_kategori_button)
                .addGap(53, 53, 53))
        );

        felsefe_panel.setBackground(new java.awt.Color(139, 200, 170));
        felsefe_panel.setForeground(new java.awt.Color(139, 200, 170));
        felsefe_panel.setPreferredSize(new java.awt.Dimension(150, 150));

        felsefe_kategori_button.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        felsefe_kategori_button.setText("Felsefe");
        felsefe_kategori_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                felsefe_kategori_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout felsefe_panelLayout = new javax.swing.GroupLayout(felsefe_panel);
        felsefe_panel.setLayout(felsefe_panelLayout);
        felsefe_panelLayout.setHorizontalGroup(
            felsefe_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(felsefe_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(felsefe_kategori_button)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        felsefe_panelLayout.setVerticalGroup(
            felsefe_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(felsefe_panelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(felsefe_kategori_button)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        dini_panel.setBackground(new java.awt.Color(139, 200, 170));
        dini_panel.setPreferredSize(new java.awt.Dimension(150, 150));

        dini_kategori_button.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        dini_kategori_button.setText("Dini");
        dini_kategori_button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dini_kategori_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dini_kategori_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dini_panelLayout = new javax.swing.GroupLayout(dini_panel);
        dini_panel.setLayout(dini_panelLayout);
        dini_panelLayout.setHorizontalGroup(
            dini_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dini_panelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(dini_kategori_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dini_panelLayout.setVerticalGroup(
            dini_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dini_panelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(dini_kategori_button)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kategoriler_panelLayout = new javax.swing.GroupLayout(kategoriler_panel);
        kategoriler_panel.setLayout(kategoriler_panelLayout);
        kategoriler_panelLayout.setHorizontalGroup(
            kategoriler_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kategoriler_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kategoriler_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(klasikler_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(dini_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addGap(97, 97, 97)
                .addGroup(kategoriler_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bilgisayar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tarih_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(kategoriler_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(felsefe_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(egitim_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        kategoriler_panelLayout.setVerticalGroup(
            kategoriler_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kategoriler_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kategoriler_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bilgisayar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klasikler_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(felsefe_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(kategoriler_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tarih_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dini_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(egitim_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kategoriler_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kategoriler_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static ArrayList<Kitap> listelenecekler_arayuz( Kitap kitap_1 , Kitap kitap_2 , Kitap kitap_3 , Kitap kitap_4 , Kitap kitap_5 )
    {
        ArrayList<Kitap> books_in_method = new ArrayList<>() ;
        
        books_in_method.add(kitap_1) ;
        books_in_method.add(kitap_2) ;
        books_in_method.add(kitap_3) ;
        books_in_method.add(kitap_4) ;
        books_in_method.add(kitap_5) ;
        
        return books_in_method ;
    }
    public static String listele_arayuz( String veri_tipi , ArrayList<Kitap> kitap) 
    {
        String veri = "" ;
        
        for (int i = 0; i < kitap.size() ; i++)
        {
            Kitap gecici_nesne = kitap.get(i);
            veri = veri + gecici_nesne.ozellikleri_yazdir_arayuz(veri_tipi,i);
        }
        
        return veri ;
    }
    private void klasik_kategori_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klasik_kategori_buttonActionPerformed
        Klasik_Arayuz screen = new Klasik_Arayuz();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_klasik_kategori_buttonActionPerformed

    private void bilgisayar_kategori_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilgisayar_kategori_buttonActionPerformed
        Bilgisayar_Arayuz screen = new Bilgisayar_Arayuz();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bilgisayar_kategori_buttonActionPerformed

    private void felsefe_kategori_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_felsefe_kategori_buttonActionPerformed
        Felsefe_Arayuz screen = new Felsefe_Arayuz();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_felsefe_kategori_buttonActionPerformed

    private void dini_kategori_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dini_kategori_buttonActionPerformed
        Dini_Arayuz screen = new Dini_Arayuz();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_dini_kategori_buttonActionPerformed

    private void tarih_kategori_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarih_kategori_buttonActionPerformed
        Tarih_Arayuz screen = new Tarih_Arayuz();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tarih_kategori_buttonActionPerformed

    private void egitim_kategori_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egitim_kategori_buttonActionPerformed
        Egitim_Arayuz screen = new Egitim_Arayuz();
        screen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_egitim_kategori_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(KategorilerArayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KategorilerArayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KategorilerArayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KategorilerArayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new KategorilerArayuz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bilgisayar_kategori_button;
    private javax.swing.JPanel bilgisayar_panel;
    private javax.swing.JButton dini_kategori_button;
    private javax.swing.JPanel dini_panel;
    private javax.swing.JButton egitim_kategori_button;
    private javax.swing.JPanel egitim_panel;
    private javax.swing.JButton felsefe_kategori_button;
    private javax.swing.JPanel felsefe_panel;
    private javax.swing.JPanel kategoriler_panel;
    private javax.swing.JButton klasik_kategori_button;
    private javax.swing.JPanel klasikler_panel;
    private javax.swing.JButton tarih_kategori_button;
    private javax.swing.JPanel tarih_panel;
    // End of variables declaration//GEN-END:variables
    
    
}
