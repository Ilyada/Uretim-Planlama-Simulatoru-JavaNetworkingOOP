/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agprogramlamaproje;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ilyada
 */
public class ClientPlanlamaciPanel extends javax.swing.JFrame implements FrameBehavior {

     private static InetAddress host;
     public  Makine server = null; 
      Socket client = null;

    /**
     * Creates new form ClientPlanlamaci
     */
    public ClientPlanlamaciPanel() {
        initComponents();
             
   try {
             host = InetAddress.getByName("127.0.0.1");
          
             client = new Socket(host,5000);
           
             server = new Makine(client, this);
         } catch (Exception ex) {
             Logger.getLogger(ClientPlanlamaciPanel.class.getName()).log(Level.SEVERE, null, ex);
         }

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        btnmakineturlistele = new javax.swing.JButton();
        btnislistele = new javax.swing.JButton();
        btnmakinedurumgoster = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txttargetmakineid = new javax.swing.JTextField();
        btnyapilanislerListele = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtisid = new javax.swing.JTextField();
        txtistur = new javax.swing.JTextField();
        txtisuzunluk = new javax.swing.JTextField();
        btnisekle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMesajlar = new javax.swing.JTextArea();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnmakineturlistele.setText("Makine Türlerini Listele");
        btnmakineturlistele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmakineturlisteleActionPerformed(evt);
            }
        });

        btnislistele.setText("Sunucudaki İş Emirlerini Listele");
        btnislistele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnislisteleActionPerformed(evt);
            }
        });

        btnmakinedurumgoster.setText("Makine Durumunu Göster");
        btnmakinedurumgoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmakinedurumgosterActionPerformed(evt);
            }
        });

        jLabel1.setText("Makine Id:");

        btnyapilanislerListele.setText("Makinenin Yaptığı İşleri Göster");
        btnyapilanislerListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyapilanislerListeleActionPerformed(evt);
            }
        });

        jLabel2.setText("Yeni İş Emri Gir:");

        jLabel3.setText("İş Id:");

        jLabel4.setText("İş Türü:");

        jLabel5.setText("İş Uzunluğu:");

        btnisekle.setText("Ekle");
        btnisekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnisekleActionPerformed(evt);
            }
        });

        txtMesajlar.setColumns(20);
        txtMesajlar.setRows(5);
        jScrollPane1.setViewportView(txtMesajlar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnislistele, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnmakineturlistele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnmakinedurumgoster, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnyapilanislerListele, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttargetmakineid, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnisekle)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtisid)
                                        .addComponent(txtistur)
                                        .addComponent(txtisuzunluk, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(120, 120, 120))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnmakineturlistele)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnislistele)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(btnyapilanislerListele))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txttargetmakineid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnmakinedurumgoster))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtisid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtistur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtisuzunluk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnisekle)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmakinedurumgosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmakinedurumgosterActionPerformed
        // TODO add your handling code here:
        server.myOutputMessages.add("makinedurumgoster&"+txttargetmakineid.getText());

        
        
    }//GEN-LAST:event_btnmakinedurumgosterActionPerformed

    private void btnyapilanislerListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyapilanislerListeleActionPerformed
        // TODO add your handling code here:
        server.myOutputMessages.add("yapilanislerListele&"+txttargetmakineid.getText());
        
        
        
        
    }//GEN-LAST:event_btnyapilanislerListeleActionPerformed

    private void btnmakineturlisteleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmakineturlisteleActionPerformed
        // TODO add your handling code here:
        server.myOutputMessages.add("makineturlistele");
        
        
        
    }//GEN-LAST:event_btnmakineturlisteleActionPerformed

    private void btnisekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnisekleActionPerformed
        // TODO add your handling code here:
        String isid=txtisid.getText();
        String isturu=txtistur.getText();
        String isuzunluk=txtisuzunluk.getText();
        
        
        server.myOutputMessages.add("isekle&" +"ID&"+ isid+"&TUR&" + isturu+"&UZUNLUK&" + isuzunluk);


        
    }//GEN-LAST:event_btnisekleActionPerformed

    private void btnislisteleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnislisteleActionPerformed
        // TODO add your handling code here:
                server.myOutputMessages.add("isListele");

        
    }//GEN-LAST:event_btnislisteleActionPerformed

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
            java.util.logging.Logger.getLogger(ClientPlanlamaciPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientPlanlamaciPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientPlanlamaciPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientPlanlamaciPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientPlanlamaciPanel().setVisible(true);
            }
        });
      
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnisekle;
    private javax.swing.JButton btnislistele;
    private javax.swing.JButton btnmakinedurumgoster;
    private javax.swing.JButton btnmakineturlistele;
    private javax.swing.JButton btnyapilanislerListele;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtMesajlar;
    private javax.swing.JTextField txtisid;
    private javax.swing.JTextField txtistur;
    private javax.swing.JTextField txtisuzunluk;
    private javax.swing.JTextField txttargetmakineid;
    // End of variables declaration//GEN-END:variables

    @Override
    public void makeActionMakine(String msg, Makine sender) {

        printResult(msg+" ");
        repaint();

    }
    
 public void printResult(String msg){
        txtMesajlar.setText(txtMesajlar.getText() + "\n"  + msg);
    }
 
    @Override
    public void makeActionPlanlamaci(String msg, Planlamaci sender) {

        printResult(msg+" ");
        repaint();
    }
}