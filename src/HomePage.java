
import java.sql.PreparedStatement;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class HomePage extends javax.swing.JFrame{
    private String accountNumber;
    String s,fullName;
    Conn c=new Conn();
    ResultSet rs=null,rs1=null,rs2=null,rs3=null;
    Date date = new Date();
   
    public HomePage(String accountNumber) {
        this.accountNumber=accountNumber;
        initComponents();
        ImageIcon myImg = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images/icon.png")));
        Image img1 = myImg.getImage();
        Image img2 = img1.getScaledInstance(header.getWidth(), header.getHeight(), Image.SCALE_AREA_AVERAGING);
        ImageIcon i = new ImageIcon(img2);
        header.setIcon(i);

        ImageIcon myImg1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images/bank.jpg")));
        Image imf = myImg1.getImage();
        Image img0 = imf.getScaledInstance(textbox.getWidth(), textbox.getHeight(), Image.SCALE_AREA_AVERAGING);
        ImageIcon ii;
        ii = new ImageIcon(img0);
        textbox.setIcon(ii);
                                          
         try{
             
        String query="select * from sign_up where Account_Number = "+accountNumber;
       
        rs1=c.stm.executeQuery(query); 
       
        while(rs1.next()){  
        String FirstName=rs1.getString("First_Name");
        String LastName=rs1.getString("Last_name");
        String fullName=FirstName+" "+LastName;
        Lname.setText(fullName);
        
         byte[] imageData = rs.getBytes("Image");
        if (imageData != null) {
            ImageIcon imageIcon = new ImageIcon(imageData);
            Limg.setIcon(imageIcon);
        } else {
            System.out.println("Image data is empty or null.");
        }
            System.out.println("FullName of user : "+fullName);
        break;
        }
        
    } catch (Exception e) {
             System.out.println("Something Went Wrong!");
            }
        try{
            
            String query1 = "SELECT Balance FROM balance WHERE Account_Number = "+accountNumber;
             
            rs2=c.stm.executeQuery(query1);
            
            if(rs2.next()){
                
                int bal=rs2.getInt("Balance");
                String newBal=Integer.toString(bal);
                Lbalance.setText(newBal);
                 
        }
        }catch(Exception e){System.out.println("Balance database error!");}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        m1 = new java.awt.MenuItem();
        m2 = new java.awt.MenuItem();
        Lname = new javax.swing.JLabel();
        withdrawBtn = new javax.swing.JButton();
        Lbalance = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Limg = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn = new javax.swing.JButton();
        sendMoney = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textbox = new javax.swing.JLabel();
        newLabel = new javax.swing.JLabel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");

        m1.setLabel("menuItem1");
        menu2.add(m1);

        m2.setLabel("menuItem1");
        menu2.add(m2);

        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(220, 70));
        setMinimumSize(new java.awt.Dimension(890, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lname.setBackground(new java.awt.Color(0, 0, 0));
        Lname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Lname.setForeground(new java.awt.Color(255, 255, 255));
        Lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 230, 30));

        withdrawBtn.setBackground(new java.awt.Color(204, 204, 204));
        withdrawBtn.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        withdrawBtn.setText("Withdraw");
        withdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawBtnActionPerformed(evt);
            }
        });
        getContentPane().add(withdrawBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 230, 40));

        Lbalance.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        Lbalance.setForeground(new java.awt.Color(255, 255, 255));
        Lbalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Lbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 150, 30));

        jLabel2.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BDT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, 70, 30));

        jLabel3.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Balance");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 100, 30));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Logout");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 520, 140, 40));

        Limg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Limg.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                LimgAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(Limg, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 110, 140, 130));
        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 90));

        jPanel1.setBackground(new java.awt.Color(1, 8, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Build Your Dream With Us!");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 440, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 820, 90));

        btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn.setText("Change Profile Pic");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 150, 40));

        sendMoney.setBackground(new java.awt.Color(204, 204, 204));
        sendMoney.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        sendMoney.setText("Send Money");
        sendMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMoneyActionPerformed(evt);
            }
        });
        getContentPane().add(sendMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 210, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Account Holder Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 160, 30));

        textbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bank.jpg"))); // NOI18N
        getContentPane().add(textbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1030, 470));
        getContentPane().add(newLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(924, 310, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        new Login_Panel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void LimgAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_LimgAncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_LimgAncestorAdded

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        
        JFileChooser browseImage = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("png", "jpg", "jpeg");
        browseImage.addChoosableFileFilter(fnef);
        int showDialog = browseImage.showOpenDialog(null);
        try {
            if (showDialog == JFileChooser.APPROVE_OPTION) {
                File selectImageFile = browseImage.getSelectedFile();
                String selectedImagePath = selectImageFile.getAbsolutePath();
                JOptionPane.showMessageDialog(null, "Image Update Success!");

                ImageIcon ii = new ImageIcon(selectedImagePath);
                Image img1 = ii.getImage().getScaledInstance(Limg.getHeight(), Limg.getWidth(), Image.SCALE_SMOOTH);
                Limg.setIcon(new ImageIcon(img1));
                s = selectedImagePath;
            }
            InputStream is = new FileInputStream(new File(s));
            Statement smtl = c.con.createStatement();
            PreparedStatement ps = c.con.prepareStatement("update sign_up set Image = ?");
            ps.setBlob(1, is);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Something Went Wrong!");
        }
    }//GEN-LAST:event_btnActionPerformed

    private void sendMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMoneyActionPerformed
        // TODO add your handling code here:
        ResultSet rss=null,rss1=null,rss0=null;
        String sender = accountNumber;//Get Sender Account Number
       try {
           //Take target/second user Account Number.
    String receiver = JOptionPane.showInputDialog(this, "Enter Account Number", "Transfer Balance", 1);//Take Receiver account Number
    
    String query1 = "SELECT Account_Number FROM sign_up WHERE Account_Number = "+receiver;//Check Receier Account Number
    rss=c.stm.executeQuery(query1);
    
    if (rss.next()) {
        String n = JOptionPane.showInputDialog(this, "Enter Amount", "Transfer Balance", 1);//Take the amount
        int sendAmount = Integer.parseInt(n);
        
        try{
           
         String query = "SELECT Balance FROM balance WHERE Account_Number = "+sender;//Check the sender Account Balance
        rss1=c.stm.executeQuery(query);
        
        if (rss1.next()) {
            
        int currentBalanceofFirstUser = rss1.getInt("Balance");
       
        if(sendAmount<=0){
           
            JOptionPane.showMessageDialog(this, "Sending money should be a more than 0");//Checking the ammount is negative or 0
        }
        else if(currentBalanceofFirstUser<sendAmount){           //Checking the balance is sufficient or not
            JOptionPane.showMessageDialog(this, "Insufficient Balance");
        }
        else if(currentBalanceofFirstUser>=sendAmount){
            
            try{
               String query0 = "SELECT Balance FROM balance WHERE Account_Number = "+receiver;//Take the receiver Account for add sending amount 
        rss0=c.stm.executeQuery(query0);
        if(rss0.next()){
            int CurrentBalanceOfSecondUser = rss0.getInt("Balance");
            int newBalance = CurrentBalanceOfSecondUser + sendAmount;
            
        String updateQuery = "UPDATE balance SET Balance = '"+newBalance+"' WHERE Account_Number = '"+receiver+"'";// Adding the new Balance in receiver account
       int rowsAffected =  c.stm.executeUpdate(updateQuery);
       
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Transfered Tk "+sendAmount+" is Successfull!");
           
            int UpdateBalofFirst =currentBalanceofFirstUser-sendAmount;
            System.out.println("Updated Balance of First user: "+UpdateBalofFirst);
            String updateQueryofSender = "UPDATE balance SET Balance = '"+UpdateBalofFirst+"' WHERE Account_Number = '"+sender+"'";// Adding the new Balance in receiver account
            c.stm.executeUpdate(updateQueryofSender);
            Lbalance.setText(Integer.toString(UpdateBalofFirst));
            try{
                String history01="insert into bank values ('"+sender+"','"+date+"','Send Money','"+sendAmount+"')";
                String history02="insert into bank values ('"+receiver+"','"+date+"','Received Money','"+sendAmount+"')";
                c.stm.executeUpdate(history01);
                c.stm.executeUpdate(history02);
                System.out.println("............");
            }catch(Exception e){
                System.out.println("Failed!");
            }
         
           
        } else {
            JOptionPane.showMessageDialog(this, "Deposit Tk"+sendAmount+" is Failed!");
        }
        } 
            }catch(Exception e){
                System.out.println("Something went wring 01");
            }
        }
        
    } else {
        JOptionPane.showMessageDialog(this, "Account Not Found!");
    }
        }catch(Exception e){
            System.out.println("Something went wrong02");
        } 
    }
    else{
        JOptionPane.showMessageDialog(this,"Invalid Account Number");
    }     
       }   
 catch(Exception e) {
    System.out.println("Database error: ");
}     

    }//GEN-LAST:event_sendMoneyActionPerformed

    private void withdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawBtnActionPerformed
        // TODO add your handling code here:
        ResultSet rsw=null;
        //HomePage hp = new HomePage(accountNumber);
        String getString1 = accountNumber;

        System.out.println("Getting Account Number: " + getString1);
        
       try {
    String n = JOptionPane.showInputDialog(this, "Enter Your Amount", "Withdraw Balance", 1);
    int withdrawAmount = Integer.parseInt(n);


    String query1 = "SELECT Balance FROM balance WHERE Account_Number = "+getString1;
    rsw=c.stm.executeQuery(query1);
    if (rsw.next()) {
        int currentBalance = rsw.getInt("Balance");
        if(currentBalance>withdrawAmount){
            int newBalance = currentBalance - withdrawAmount;
        String updateQuery = "UPDATE balance SET Balance = '"+newBalance+"' WHERE Account_Number = '"+getString1+"'";
       int rowsAffected =  c.stm.executeUpdate(updateQuery);
       
        if (rowsAffected > 0) {
            
            Lbalance.setText(Integer.toString(newBalance));
            JOptionPane.showMessageDialog(this, "Withdraw TK "+withdrawAmount+"is Successfull!");
            try{
                String hello="insert into bank values ('"+getString1+"','"+date+"','Withdraw','"+withdrawAmount+"')";
                c.stm.executeUpdate(hello);
                System.out.println("............");
            }catch(Exception e){
                System.out.println("Failed!");
            }
        }                               
        
        }else if(currentBalance<withdrawAmount){
            JOptionPane.showMessageDialog(this, "Your Withdraw Amount is Higher than Current Balance");
        }
        else {
            JOptionPane.showMessageDialog(this, "Withdraw Tk"+withdrawAmount+" is Failed!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Account Not Found!");
    }
} catch (NumberFormatException e) {
    System.out.println("Invalid input for deposit amount");
} catch (SQLException e) {
    System.out.println("Database error: ");
}
    }//GEN-LAST:event_withdrawBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                new HomePage("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbalance;
    private javax.swing.JLabel Limg;
    private javax.swing.JLabel Lname;
    private javax.swing.JButton btn;
    private javax.swing.JLabel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private java.awt.MenuItem m1;
    private java.awt.MenuItem m2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JLabel newLabel;
    private javax.swing.JButton sendMoney;
    private javax.swing.JLabel textbox;
    private javax.swing.JButton withdrawBtn;
    // End of variables declaration//GEN-END:variables

}
