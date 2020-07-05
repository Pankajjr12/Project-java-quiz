
package quiz_game;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Pankaj
 */
public class java_Ques7 extends javax.swing.JFrame {
int score;
    
    public java_Ques7() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        opt1 = new javax.swing.JRadioButton();
        opt2 = new javax.swing.JRadioButton();
        opt3 = new javax.swing.JRadioButton();
        opt4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        marks = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JAVA QUESTION 7");
        setPreferredSize(new java.awt.Dimension(661, 415));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Which of the below is not unchecked exceptions in java? ");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 70, -1, -1));

        buttonGroup1.add(opt1);
        opt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opt1.setText("Runtime Exception");
        jPanel1.add(opt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        buttonGroup1.add(opt2);
        opt2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opt2.setText("ClassCast Exception");
        jPanel1.add(opt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        buttonGroup1.add(opt3);
        opt3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opt3.setText("NullPointer Exception");
        jPanel1.add(opt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        buttonGroup1.add(opt4);
        opt4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opt4.setText("IO Exception");
        jPanel1.add(opt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel3.setText("CURRENT SCORE :-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));
        jPanel1.add(marks, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 283, -1, 30));

        jButton2.setText("EXIT");
        jButton2.setMaximumSize(new java.awt.Dimension(69, 23));
        jButton2.setMinimumSize(new java.awt.Dimension(69, 23));
        jButton2.setPreferredSize(new java.awt.Dimension(69, 23));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/queback.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 int res=JOptionPane.showConfirmDialog(this,"Are you sure to submit answer?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
if(res==JOptionPane.YES_NO_OPTION)
           
       {     
        if(opt4.isSelected())
{
    Component frame=null;
    score=score+1;
java_Ques8 q3=new java_Ques8();
q3.setSize(661,415);
q3.setVisible(true);
this.setVisible(false);

q3.initScore(score);
    }                                        
    if (opt2.isSelected()|| opt3.isSelected() || opt1.isSelected())
    {
        Component frame=null;
        java_Ques8 q3=new java_Ques8();
q3.setSize(661,415);
q3.setVisible(true);
this.setVisible(false);
/*this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
this.dispose();*/
q3.initScore(score);
        }            
    }//GEN-LAST:event_jButton1ActionPerformed
else if(res==JOptionPane.NO_OPTION)
    {
        this.setVisible(true);
    }
}
    
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
            java.util.logging.Logger.getLogger(java_Ques7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(java_Ques7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(java_Ques7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(java_Ques7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int res= JOptionPane.showConfirmDialog(null,"You have to login first to play quiz","Error",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
       if(res==JOptionPane.YES_NO_OPTION) 
       {
                new LOGINPAGE().setVisible(true);
                       new java_Ques7().setVisible(false);
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
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel marks;
    private javax.swing.JRadioButton opt1;
    private javax.swing.JRadioButton opt2;
    private javax.swing.JRadioButton opt3;
    private javax.swing.JRadioButton opt4;
    // End of variables declaration//GEN-END:variables
}
