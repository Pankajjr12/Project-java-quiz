
package quiz_game;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Pankaj
 */
public class LOGINPAGE extends javax.swing.JFrame {

    public LOGINPAGE() {
        initComponents();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jusername = new javax.swing.JTextField();
        jpassword = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN PAGE");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 170, -1));
        jPanel1.add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 170, -1));

        submit.setBackground(new java.awt.Color(153, 153, 0));
        submit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(51, 51, 0));
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        reset.setBackground(new java.awt.Color(102, 102, 0));
        reset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(51, 51, 0));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        exit.setBackground(new java.awt.Color(102, 102, 0));
        exit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(51, 51, 0));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 70, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("PASSWORD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("USERNAME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/firstback.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 390));

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

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
System.exit(0);        
    }//GEN-LAST:event_exitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
jusername.setText(null);
jpassword.setText(null);
    }//GEN-LAST:event_resetActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
try
{
    Class.forName("com.mysql.cj.jdbc.Driver");
    
   Connection con  =  DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb","root", "");
String sql="Select *from logintable where username=? and password=?";
PreparedStatement  pst =con.prepareStatement(sql);
pst.setString(1,jusername.getText());
pst.setString(2,jpassword.getText());
ResultSet rs=pst.executeQuery();
if(rs.next())
{
   JOptionPane.showMessageDialog(null,"Username and password matched");
gamestart  obj=new gamestart();
obj.setSize(661,415);
obj.setVisible(true);
this.setVisible(false);
this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
this.dispose(); 
}
else
{
    JOptionPane.showMessageDialog(null,"Username and password don't matched");
jusername.setText("");
jpassword.setText("");
}

con.close();
}
catch(Exception ex)
{
   JOptionPane.showMessageDialog(null,ex); 
}
    
        
    }//GEN-LAST:event_submitActionPerformed
  
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
            java.util.logging.Logger.getLogger(LOGINPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGINPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGINPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGINPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGINPAGE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jusername;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
