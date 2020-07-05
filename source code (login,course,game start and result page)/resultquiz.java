
package quiz_game;

import javax.swing.JOptionPane;

/**
 *
 * @author Pankaj
 */
public class resultquiz extends javax.swing.JFrame {
int score;

    public resultquiz() {
        initComponents();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        marks = new javax.swing.JLabel();
        correct = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        wrong = new javax.swing.JLabel();
        grade = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RESULT OF QUIZ");
        setPreferredSize(new java.awt.Dimension(661, 415));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        marks.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(marks, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 40, 20));

        correct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        correct.setText("CORRECT  ANSWERS");
        jPanel1.add(correct, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 210, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("WRONG ANSWERS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        wrong.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(wrong, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 40, 20));

        grade.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel1.add(grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 380, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/course1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 620, 250));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/res.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 4, 200, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lastpage.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(resultquiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultquiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultquiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultquiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int res= JOptionPane.showConfirmDialog(null,"You have to login first to play quiz","Error",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
       if(res==JOptionPane.YES_NO_OPTION) 
       {
                new LOGINPAGE().setVisible(true);
                      new resultquiz().setVisible(false);
            }
       
           else if(res==JOptionPane.NO_OPTION)
           {
           System.exit(0);
           }}            
                
            
        });
    }
public void initScore(int x){
        score = x;
        marks.setText(String.valueOf(score));
         wrong.setText(String.valueOf(8-score));
         if(score>6)
                  {
                   grade.setText("Welldone!! Congratulations!!");  
                 }
         else if(score<7 && score>3)
         {
             grade.setText("Work Hard Better luck next time");
         }
           else if(score<4)
         {
             grade.setText("Poor! Need improvement");
         }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel correct;
    private javax.swing.JLabel grade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel marks;
    private javax.swing.JLabel wrong;
    // End of variables declaration//GEN-END:variables
}
