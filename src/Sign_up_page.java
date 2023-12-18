import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Sign_up_page extends javax.swing.JFrame {
    Conn c=new Conn();
    String s;
    public Sign_up_page() {
        initComponents();
        ImageIcon myImg = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images/icon.png")));
        Image img1=myImg.getImage();
        Image img2 =img1.getScaledInstance(header.getWidth(), header.getHeight(), Image.SCALE_AREA_AVERAGING);
        
        ImageIcon i = new ImageIcon(img2);
        header.setIcon(i);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        header = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        f_name = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        show = new javax.swing.JLabel();
        hide = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        nid = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        f_name_label = new javax.swing.JLabel();
        f_name_label1 = new javax.swing.JLabel();
        f_name_label2 = new javax.swing.JLabel();
        f_name_label3 = new javax.swing.JLabel();
        f_name_label4 = new javax.swing.JLabel();
        f_name_label5 = new javax.swing.JLabel();
        f_name_label6 = new javax.swing.JLabel();
        l_name = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        f_name_label7 = new javax.swing.JLabel();
        passCheck = new javax.swing.JLabel();
        emailCheck = new javax.swing.JLabel();
        nidCheck = new javax.swing.JLabel();
        phoneCheck = new javax.swing.JLabel();
        checkLname = new javax.swing.JLabel();
        checkFname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        imgLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 0));
        setMinimumSize(new java.awt.Dimension(800, 900));
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 680, 90));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0), null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        f_name.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        f_name.setToolTipText("First Name");
        f_name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        f_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_nameActionPerformed(evt);
            }
        });
        f_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f_nameKeyReleased(evt);
            }
        });
        jPanel3.add(f_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 220, 40));

        submitBtn.setBackground(new java.awt.Color(3, 115, 54));
        submitBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Submit");
        submitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitBtnMouseClicked(evt);
            }
        });
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel3.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 240, 40));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon("P:\\Crome Download\\icons8-eye-90.png")); // NOI18N
        jPanel3.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 30, 40));

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
        jPanel3.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 30, 40));

        pass.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        pass.setToolTipText("Enter Password");
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
        });
        jPanel3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 220, 40));

        nid.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        nid.setToolTipText("Enter NID Number");
        nid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nidActionPerformed(evt);
            }
        });
        nid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nidKeyReleased(evt);
            }
        });
        jPanel3.add(nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 220, 40));

        email.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        email.setToolTipText("Email");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 220, 40));

        btnGroup.add(female);
        female.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        female.setText("Female");
        female.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        female.setName(""); // NOI18N
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel3.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        btnGroup.add(male);
        male.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        male.setText("Male");
        male.setNextFocusableComponent(female);
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel3.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        f_name_label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        f_name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_name_label.setText("Gender");
        jPanel3.add(f_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 100, 30));

        f_name_label1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        f_name_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_name_label1.setText("Password");
        jPanel3.add(f_name_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 100, 30));

        f_name_label2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        f_name_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_name_label2.setText("First Name");
        jPanel3.add(f_name_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 100, 30));

        f_name_label3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        f_name_label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_name_label3.setText("Last Name");
        jPanel3.add(f_name_label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 100, 30));

        f_name_label4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        f_name_label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_name_label4.setText("NID Number");
        jPanel3.add(f_name_label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 100, 30));

        f_name_label5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        f_name_label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_name_label5.setText("Phone");
        jPanel3.add(f_name_label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 80, 30));

        f_name_label6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        f_name_label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_name_label6.setText("Email");
        jPanel3.add(f_name_label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 100, 30));

        l_name.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        l_name.setToolTipText("Last Name");
        l_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_nameActionPerformed(evt);
            }
        });
        l_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                l_nameKeyReleased(evt);
            }
        });
        jPanel3.add(l_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 220, 40));

        phone.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        phone.setToolTipText("Phone");
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneKeyReleased(evt);
            }
        });
        jPanel3.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 220, 40));

        address.setColumns(20);
        address.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 360, 60));

        jLabel3.setBackground(new java.awt.Color(51, 51, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Already Have an Account?");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 180, 40));

        f_name_label7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        f_name_label7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        f_name_label7.setText("Address");
        jPanel3.add(f_name_label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 100, 30));

        passCheck.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passCheck.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(passCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 190, 30));

        emailCheck.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailCheck.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(emailCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 170, 30));

        nidCheck.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nidCheck.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(nidCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 170, 30));

        phoneCheck.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phoneCheck.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(phoneCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 190, 30));

        checkLname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkLname.setForeground(new java.awt.Color(255, 0, 0));
        checkLname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                checkLnameKeyReleased(evt);
            }
        });
        jPanel3.add(checkLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 150, 30));

        checkFname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkFname.setForeground(new java.awt.Color(255, 0, 0));
        checkFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                checkFnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkFnameKeyTyped(evt);
            }
        });
        jPanel3.add(checkFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 140, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 10, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("*");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 10, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("*");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 10, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("*");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 10, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("*");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 10, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("*");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 10, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 10, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 10, -1));

        jPanel2.setBackground(new java.awt.Color(17, 104, 27));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Doppio One", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("User Registration");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 130, 30));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 590, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 430, 100, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Select Your Image");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 120, 30));
        jPanel3.add(imgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 150, 120));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 650, 540));
        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void f_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f_nameActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitBtnActionPerformed

    private void submitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMouseClicked
        
       if (f_name.getText().equals("") || phone.getText().equals("") || email.getText().equals("") ||
                nid.getText().equals("") || pass.getText().equals("") || address.getText().equals("") ||
                btnGroup.getSelection() == null) {
            JOptionPane.showMessageDialog(this, "Please Enter Every Field");
        } else {
            String n1 = f_name.getText();
            String n2 = l_name.getText();
            String id = nid.getText();
            String mob = phone.getText();
            String mail = email.getText();
            String pas = new String(pass.getPassword());
            String gender = male.isSelected() ? "Male" : "Female";
            String addr = address.getText();

            int a = 200000000;
            int id1 = Integer.parseInt(id);
            int acNum = (id1 + a);

            // For image handling
            byte[] imageBytes = null;
            try {
                Path imagePath = Paths.get(s);
                imageBytes = Files.readAllBytes(imagePath);
            } catch (IOException ex) {
                Logger.getLogger(Sign_up_page.class.getName()).log(Level.SEVERE, null, ex);
            }

            String query = "INSERT INTO sign_up (Account_Number, First_Name, Last_Name, NID, Phone, Email, " +
                    "Password, Gender, Address, Image) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = c.con.prepareStatement(query)) {
                pstmt.setString(1, String.valueOf(acNum));
                pstmt.setString(2, n1);
                pstmt.setString(3, n2);
                pstmt.setString(4, id);
                pstmt.setString(5, mob);
                pstmt.setString(6, mail);
                pstmt.setString(7, pas);
                pstmt.setString(8, gender);
                pstmt.setString(9, addr);
                pstmt.setBytes(10, imageBytes);

                int success = pstmt.executeUpdate();

                if (success != 0) {
                    JOptionPane.showMessageDialog(this, "Registration Susscessfull");
                    JOptionPane.showInputDialog(this, "Your Account Number is: ",Integer.toString(acNum),1);
                }
            } catch (Exception e) {
                System.out.println("Something Went Wrong");
            }
        }
     
        
    }//GEN-LAST:event_submitBtnMouseClicked

    private void nidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nidActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_emailActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void l_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l_nameActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
       
        
    }//GEN-LAST:event_maleActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new Login_Panel().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        // TODO add your handling code here:
         Pattern mailPtr = Pattern.compile("^([\\w]+)@([\\w]+)\\.([\\w]+)$");
          Matcher mcr = mailPtr.matcher(email.getText());
          boolean isValid=mcr.matches();
          if(!isValid){emailCheck.setText("Invalid Email");}else{emailCheck.setText(null);}       
    }//GEN-LAST:event_emailKeyReleased

    private void emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyPressed
        // TODO add your handling code here:
       
          //mdfaruk@gmail.com
        
    }//GEN-LAST:event_emailKeyPressed

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped
        // TODO add your handling code here:
//         Pattern mailPtr = Pattern.compile("^([\\w]+)@([\\w]+)\\.([\\w]+)$");
//          Matcher mcr = mailPtr.matcher(email.getText());
//          boolean isEmailValid=mcr.matches();
//          if(isEmailValid==false){CheckValidationMail.setText("Invalid Email");}
    }//GEN-LAST:event_emailKeyTyped

    private void phoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyReleased
        // TODO add your handling code here:
        Pattern mailPtr = Pattern.compile("^[0-9]{11}$");
          Matcher mcr = mailPtr.matcher(phone.getText());
          boolean isValid=mcr.matches();
          if(!isValid){phoneCheck.setText("Phone Digit must be 11");}else{phoneCheck.setText(null);}
    }//GEN-LAST:event_phoneKeyReleased

    private void nidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nidKeyReleased
        // TODO add your handling code here:
         Pattern mailPtr = Pattern.compile("^[0-9]{10,18}$");
          Matcher mcr = mailPtr.matcher(nid.getText());
          boolean isValid=mcr.matches();
          if(!isValid){nidCheck.setText("Must be 10 to 18 Digit");}else{nidCheck.setText(null);}
    }//GEN-LAST:event_nidKeyReleased

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
        // TODO add your handling code here:
         String password=pass.getText();
         if(password.length()<8){
             passCheck.setText("Password at least 8 Character");
         }
          else{passCheck.setText(null);}
        
    }//GEN-LAST:event_passKeyReleased

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
        pass.setEchoChar('*');
    }//GEN-LAST:event_hideMouseReleased

    private void checkFnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkFnameKeyTyped
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_checkFnameKeyTyped

    private void checkFnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkFnameKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_checkFnameKeyReleased

    private void checkLnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkLnameKeyReleased
        // TODO add your handling code here:
  
    }//GEN-LAST:event_checkLnameKeyReleased

    private void f_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_nameKeyReleased
        // TODO add your handling code here:
          Pattern mailPtr = Pattern.compile("^[a-zA-Z ]{1,15}$");
          Matcher mcr = mailPtr.matcher(f_name.getText());
          boolean isValid=mcr.matches();
          if(!isValid){checkFname.setText("Invalid Name");}else{checkFname.setText(null);}
    }//GEN-LAST:event_f_nameKeyReleased

    private void l_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_l_nameKeyReleased
        // TODO add your handling code here:
          Pattern mailPtr = Pattern.compile("^[a-zA-Z ]{1,15}$");
          Matcher mcr = mailPtr.matcher(l_name.getText());
          boolean isValid=mcr.matches();
          if(!isValid){checkLname.setText("Invalid Name");}else{checkLname.setText(null);}
    }//GEN-LAST:event_l_nameKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
       JFileChooser browseImage = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("png", "jpg", "jpeg");
        browseImage.addChoosableFileFilter(fnef);
        int showDialog = browseImage.showOpenDialog(null);
        try {
            if (showDialog == JFileChooser.APPROVE_OPTION) {
                File selectedImageFile = browseImage.getSelectedFile();
                String selectedImagePath = selectedImageFile.getAbsolutePath();

                ImageIcon ii = new ImageIcon(selectedImagePath);
                Image img1 = ii.getImage().getScaledInstance(imgLabel.getHeight(), imgLabel.getWidth(), Image.SCALE_SMOOTH);
                imgLabel.setIcon(new ImageIcon(img1));
                s = selectedImagePath;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sign_up_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_up_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_up_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_up_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_up_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JLabel checkFname;
    private javax.swing.JLabel checkLname;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailCheck;
    private javax.swing.JTextField f_name;
    private javax.swing.JLabel f_name_label;
    private javax.swing.JLabel f_name_label1;
    private javax.swing.JLabel f_name_label2;
    private javax.swing.JLabel f_name_label3;
    private javax.swing.JLabel f_name_label4;
    private javax.swing.JLabel f_name_label5;
    private javax.swing.JLabel f_name_label6;
    private javax.swing.JLabel f_name_label7;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel header;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField l_name;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField nid;
    private javax.swing.JLabel nidCheck;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel passCheck;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel phoneCheck;
    private javax.swing.JLabel show;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
