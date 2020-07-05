
package quiz_game;

import java.awt.Component;
import static java.lang.ProcessBuilder.Redirect.to;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
 *
 * @author Pankaj
 */
public class java_Ques1 extends javax.swing.JFrame {
    Timer time;
int score;
    
    public java_Ques1() {
        initComponents();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        opt1 = new javax.swing.JRadioButton();
        opt2 = new javax.swing.JRadioButton();
        opt3 = new javax.swing.JRadioButton();
        opt4 = new javax.swing.JRadioButton();
        current = new javax.swing.JLabel();
        marks = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JAVA QUESTION 1");
        setMinimumSize(new java.awt.Dimension(0, 415));
        setPreferredSize(new java.awt.Dimension(661, 415));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 283, -1, 30));

        jButton1.setText("EXIT");
        jButton1.setMaximumSize(new java.awt.Dimension(69, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(69, 23));
        jButton1.setPreferredSize(new java.awt.Dimension(69, 23));
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 70, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/james.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 150, 130));

        opt1.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(opt1);
        opt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opt1.setText("James Gosling");
        opt1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(opt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 120, -1));

        buttonGroup1.add(opt2);
        opt2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opt2.setText("Anders Hejsberg");
        jPanel3.add(opt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        buttonGroup1.add(opt3);
        opt3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opt3.setText("Bjarne Stroustrup");
        jPanel3.add(opt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        buttonGroup1.add(opt4);
        opt4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opt4.setText("Tim-Berners-Lee");
        jPanel3.add(opt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        current.setText("CURRENT SCORE :-");
        jPanel3.add(current, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));
        jPanel3.add(marks, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        jLabel5.setText("    Identify the person in picture");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 150, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/queback.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 662, 417));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

       int res= JOptionPane.showConfirmDialog(this,"Are you sure to submit answer?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       if(res==JOptionPane.YES_NO_OPTION)
           
       {
        if(opt1.isSelected())
{
    Component frame=null;
    score=score+1;
java_Ques2 q2=new java_Ques2();
q2.setSize(661,415);
q2.setVisible(true);
this.setVisible(false);

q2.initScore(score);
    }//GEN-LAST:event_jButton2ActionPerformed
    if (opt2.isSelected()|| opt3.isSelected() || opt4.isSelected())
    {
        Component frame=null;
        java_Ques2 obj1=new java_Ques2();
obj1.setSize(661,415);
obj1.setVisible(true);
this.setVisible(false);
/*this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
this.dispose();*/
obj1.initScore(score);
        }
    }
    
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
            java.util.logging.Logger.getLogger(java_Ques1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(java_Ques1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(java_Ques1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(java_Ques1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int res= JOptionPane.showConfirmDialog(null,"You have to login first to play quiz","Error",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
       if(res==JOptionPane.YES_NO_OPTION) 
       {
                new LOGINPAGE().setVisible(true);
                       new java_Ques1().setVisible(false);
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
    private javax.swing.JLabel current;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel marks;
    private javax.swing.JRadioButton opt1;
    private javax.swing.JRadioButton opt2;
    private javax.swing.JRadioButton opt3;
    private javax.swing.JRadioButton opt4;
    // End of variables declaration//GEN-END:variables
}
