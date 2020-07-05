
package quiz_game;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author Pankaj
 */
public class gamestart extends javax.swing.JFrame {

    
    public gamestart() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        quit = new javax.swing.JButton();
        about = new javax.swing.JButton();
        play = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZ GAME");
        setPreferredSize(new java.awt.Dimension(661, 415));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quiz_game/quit.png"))); // NOI18N
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });
        jPanel1.add(quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 80, 30));

        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quiz_game/about.png"))); // NOI18N
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jPanel1.add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 110, 30));

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quiz_game/play.png"))); // NOI18N
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });
        jPanel1.add(play, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameui.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(661, 416));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 660, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
System.exit(0);       
    }//GEN-LAST:event_quitActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
  try {
					Desktop.getDesktop().browse(new URI("https://k8q0lqyzzzpyhkj9oufbxw-on.drv.tw/www.pankaj.cf/about-us.html"));
				} catch (IOException | URISyntaxException e1) {
				}
			   
    }//GEN-LAST:event_aboutActionPerformed

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
Cousepage obj=new Cousepage();
obj.setSize(661,415);
obj.setVisible(true);
this.setVisible(false);
this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
this.dispose();       
    }//GEN-LAST:event_playActionPerformed

    public static void main(String args[]) {
    
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
            java.util.logging.Logger.getLogger(gamestart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gamestart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gamestart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gamestart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gamestart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton play;
    private javax.swing.JButton quit;
    // End of variables declaration//GEN-END:variables
}
