import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public final class Login_Panel extends javax.swing.JFrame {
   
    Connection con;
    ResultSet rs;
    
    
    public Login_Panel() {
        initComponents();
        ImageIcon myImg = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images/icon.png")));
        Image img1=myImg.getImage();
        Image img2 =img1.getScaledInstance(header.getWidth(), header.getHeight(), Image.SCALE_AREA_AVERAGING);
        //Image img2=img1.getScaledInstance(header.getHeight(), 50, Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        header.setIcon(i);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hide = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        acNum = new javax.swing.JTextField();
        error = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 0, 0));
        setIconImages(getIconImages());
        setLocation(new java.awt.Point(300, 30));
        setMaximizedBounds(new java.awt.Rectangle(100, 100, 500, 400));
        setMinimumSize(new java.awt.Dimension(780, 670));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 90));

        jPanel1.setBackground(new java.awt.Color(2, 71, 49));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Build Your Dream With Us!");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 5, 440, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 620, 90));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), null));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 140, 50));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Don't Have any Account");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 320, 40));

        jButton2.setBackground(new java.awt.Color(21, 109, 23));
        jButton2.setFont(new java.awt.Font("Dubai", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Login");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 210, 50));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jCheckBox1.setText("Remeber Password");
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Forgot Password?");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 150, 50));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        jLabel3.setText("Account Number");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 170, 50));

        hide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide.setIcon(new javax.swing.ImageIcon("P:\\Crome Download\\hide.png")); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hideMouseReleased(evt);
            }
        });
        jPanel2.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 30, 50));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon("P:\\Crome Download\\icons8-eye-90.png")); // NOI18N
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 30, 50));

        pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pass.setText("Faruk12345");
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 260, 50));

        acNum.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        acNum.setText("2003021051");
        jPanel2.add(acNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 260, 50));

        error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        error.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 410, 30));

        jPanel3.setBackground(new java.awt.Color(17, 104, 27));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Doppio One", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("User Login Panel");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 130, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 520, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 540, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        if(acNum.getText().equals("")||acNum.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please Enter Every Field");
        }
        else{
            String ac = acNum.getText();
            char[] passwordChars = pass.getPassword();
            String pass = new String(passwordChars);

            Connection con = null;
            PreparedStatement preparedStatement = null;
            ResultSet rs = null;
    try {

    Class.forName("com.mysql.cj.jdbc.Driver");
    
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fibl", "root", "");
    
    String query = "SELECT Account_Number, Password FROM sign_up WHERE Account_Number = ? AND Password = ?";
    preparedStatement = con.prepareStatement(query);
    preparedStatement.setString(1, ac);
    preparedStatement.setString(2, pass);
    
    // Execute the query
    rs = preparedStatement.executeQuery();

    if (rs.next()) {
    String acNumber = rs.getString("Account_Number");
    
    new HomePage(acNumber).setVisible(true);
    this.setVisible(false);
    
    } else {
        error.setText("Account Number or Password was incorrect!");
    }
} catch (ClassNotFoundException | SQLException e) {
        System.out.println("Check Database Connection");
} finally {
    try {
        // Close the result set, prepared statement, and connection
        if (rs != null) {
            rs.close();
        }
        if (preparedStatement != null) {
            preparedStatement.close();
        }
        if (con != null) {
            con.close();
        }
    } catch (SQLException e) {
            }
}
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        new Sign_up_page().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
        // TODO add your handling code here:
        show.setVisible(true);
        hide.setVisible(false);
        pass.setEchoChar((char)0);
    }//GEN-LAST:event_hideMousePressed

    private void hideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseReleased
        // TODO add your handling code here:
        show.setVisible(false);
        hide.setVisible(true);
        pass.setEchoChar('•');
    }//GEN-LAST:event_hideMouseReleased

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        new underConstruction().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acNum;
    private javax.swing.JLabel error;
    private javax.swing.JLabel header;
    private javax.swing.JLabel hide;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
