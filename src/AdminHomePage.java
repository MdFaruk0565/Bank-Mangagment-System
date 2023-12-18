
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;



public class AdminHomePage extends javax.swing.JFrame implements ActionListener{

    Conn c=new Conn();
    Date date = new Date();
    public AdminHomePage() {
        
        initComponents();
        ImageIcon myImg = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images/icon.png")));
        Image img1=myImg.getImage();
        Image img2 =img1.getScaledInstance(header.getWidth(), header.getHeight(), Image.SCALE_AREA_AVERAGING);
        ImageIcon i = new ImageIcon(img2);
        header.setIcon(i);
        
        ImageIcon myImg1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images/bank.jpg")));
        Image imf = myImg1.getImage();
        Image img0 = imf.getScaledInstance(textbox.getWidth(), textbox.getHeight(), Image.SCALE_AREA_AVERAGING);
        ImageIcon ii;
        ii = new ImageIcon(img0);
        textbox.setIcon(ii);
        
        
        
        AutoCompleteDecorator.decorate(acNum);
        ResultSet rs,rs1;
        
        
         try {
   
    String query = "SELECT * FROM sign_up";
    rs=c.stm.executeQuery(query);
    while(rs.next())
    {
        String account=rs.getString("Account_Number");
        acNum.addItem(account);
    }
    
} catch (Exception E) {
   
}
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        balance = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lBalance = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        setProfile = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        acNum = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        submit = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();
        deposit = new javax.swing.JButton();
        sendMoney = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        lBalance1 = new javax.swing.JLabel();
        statement = new javax.swing.JButton();
        textbox = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Panel of FARUK ISLAMI BANK LTD.");
        setLocation(new java.awt.Point(200, 20));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        balance.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        balance.setForeground(new java.awt.Color(255, 0, 51));
        balance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 150, 30));

        jLabel2.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BDT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 140, 80, 30));

        lBalance.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        lBalance.setForeground(new java.awt.Color(255, 255, 255));
        lBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 220, 30));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Logout");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 620, 170, 40));

        setProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        setProfile.setForeground(new java.awt.Color(255, 255, 255));
        setProfile.setText("Manager");
        setProfile.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                setProfileAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(setProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 130, 110, 40));
        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 90));

        jPanel1.setBackground(new java.awt.Color(1, 8, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Dashboard");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 5, 440, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 870, 90));

        acNum.setBackground(new java.awt.Color(153, 153, 153));
        acNum.setEditable(true);
        acNum.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        acNum.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                acNumItemStateChanged(evt);
            }
        });
        acNum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acNumMouseClicked(evt);
            }
        });
        acNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acNumActionPerformed(evt);
            }
        });
        getContentPane().add(acNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 220, 40));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Account Number List");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 170, 40));

        table.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Account Number", "Phone", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setEnabled(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 1070, 150));

        submit.setBackground(new java.awt.Color(0, 0, 0));
        submit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 180, 40));

        withdraw.setBackground(new java.awt.Color(255, 153, 153));
        withdraw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        withdraw.setForeground(new java.awt.Color(255, 255, 255));
        withdraw.setText("Withdraw");
        withdraw.setEnabled(false);
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });
        getContentPane().add(withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 200, 30));

        deposit.setBackground(new java.awt.Color(0, 204, 0));
        deposit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deposit.setForeground(new java.awt.Color(255, 255, 255));
        deposit.setText("Deposit");
        deposit.setEnabled(false);
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });
        getContentPane().add(deposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 200, 30));

        sendMoney.setBackground(new java.awt.Color(0, 0, 0));
        sendMoney.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sendMoney.setForeground(new java.awt.Color(204, 204, 204));
        sendMoney.setText("Send Money");
        sendMoney.setEnabled(false);
        sendMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMoneyActionPerformed(evt);
            }
        });
        getContentPane().add(sendMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 210, 30));

        clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clear.setText("Clear All");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 443, 90, 30));

        lBalance1.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        lBalance1.setForeground(new java.awt.Color(255, 255, 255));
        lBalance1.setText("Balance");
        getContentPane().add(lBalance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 110, 30));

        statement.setBackground(new java.awt.Color(0, 153, 153));
        statement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        statement.setForeground(new java.awt.Color(255, 255, 255));
        statement.setText("Statement");
        statement.setEnabled(false);
        statement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statementActionPerformed(evt);
            }
        });
        getContentPane().add(statement, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 160, 30));
        getContentPane().add(textbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 90, 1080, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        new AdminLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void setProfileAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_setProfileAncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_setProfileAncestorAdded

    private void acNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acNumActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_acNumActionPerformed

    private void acNumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_acNumItemStateChanged
        // TODO add your handling code here:

        
    }//GEN-LAST:event_acNumItemStateChanged

    private void acNumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acNumMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_acNumMouseClicked

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
        
        String getString1 = acNum.getSelectedItem().toString();
        String FirstName=null,LastName=null,phone,address,fullName;
        
        Connection con;
        ResultSet rs=null,rs1=null;
        Statement stm,stm1;
        PreparedStatement psmt;
         try {
        String query = "SELECT * FROM sign_up WHERE Account_Number = '"+getString1+"'";
        rs=c.stm.executeQuery(query);
        while(rs.next())
        {   FirstName=rs.getString("First_Name");
            LastName=rs.getString("Last_name");
            phone=rs.getString("Phone");
            address=rs.getString("Address");
            fullName=FirstName+" "+LastName;
            System.out.println(fullName+"\n"+getString1+"\n"+phone+"\n"+address);

            String data[]={fullName,getString1,phone,address};
            lBalance.setText(fullName);
        
        tblModel.addRow(data);
        break;
    }
    String bal, query1 = "select * From balance where Account_Number = "+getString1;
    
    rs1=c.stm.executeQuery(query1);
     while(rs1.next()){
         bal=rs1.getString("Balance");
         System.out.println(bal+"Balance");
         balance.setText(bal);
     }
    
    deposit.setEnabled(true);
    withdraw.setEnabled(true);
    sendMoney.setEnabled(true);
    statement.setEnabled(true);
    //balance.setText("5000");
    
} catch (Exception e) {
    e.printStackTrace();
}
        
    }//GEN-LAST:event_submitActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        // TODO add your handling code here:
        ResultSet rs=null;
        String getString1 = acNum.getSelectedItem().toString();
       try {
   
    String n = JOptionPane.showInputDialog(this, "Enter Your Amount", "Withdraw Balance", 1);
    int withdrawAmount = Integer.parseInt(n);


    String query1 = "SELECT Balance FROM balance WHERE Account_Number = "+getString1;
    rs=c.stm.executeQuery(query1);
    if (rs.next()) {
        int currentBalance = rs.getInt("Balance");
        if(currentBalance>withdrawAmount){
            int newBalance = currentBalance - withdrawAmount;
        String updateQuery = "UPDATE balance SET Balance = '"+newBalance+"' WHERE Account_Number = '"+getString1+"'";
       int rowsAffected =  c.stm.executeUpdate(updateQuery);
       
        if (rowsAffected > 0) {
            
            balance.setText(Integer.toString(newBalance));
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
        
    }//GEN-LAST:event_withdrawActionPerformed

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        // TODO add your handling code here:
       
        ResultSet rs=null,rs1=null;
        String getString1 = acNum.getSelectedItem().toString();
       try {
   
    String n = JOptionPane.showInputDialog(this, "Enter Your Amount", "Deposit Balance", 1);
    int depositAmount = Integer.parseInt(n);


    String query1 = "SELECT Balance FROM balance WHERE Account_Number = "+getString1;
    rs=c.stm.executeQuery(query1);
    if (rs.next()) {
        int currentBalance = rs.getInt("Balance");
        
        int newBalance = currentBalance + depositAmount;
        String updateQuery = "UPDATE balance SET Balance = '"+newBalance+"' WHERE Account_Number = '"+getString1+"'";
       int rowsAffected =  c.stm.executeUpdate(updateQuery);
       
        if (rowsAffected > 0) {
            
            balance.setText(Integer.toString(newBalance));
            JOptionPane.showMessageDialog(this, "Deposit TK "+depositAmount+" is Successfully!");
            System.out.println("Test 01");
            try{
                String hello="insert into bank values ('"+getString1+"','"+date+"','Deposit','"+depositAmount+"')";
                c.stm.executeUpdate(hello);
//                System.out.println("............");
            }catch(Exception e){
                System.out.println("Failed!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Deposit Tk "+depositAmount+" is Failed!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Account Not Found!");
    }
} catch (NumberFormatException e) {
    System.out.println("Invalid input for deposit amount");
} catch (SQLException e) {
    System.out.println("Database error: ");
}

    }//GEN-LAST:event_depositActionPerformed

    private void sendMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMoneyActionPerformed
        // TODO add your handling code here:
        ResultSet rs=null,rs1=null,rs0=null;
        String sender = acNum.getSelectedItem().toString();//Get Sender Account Number
       try {
           //Take target/second user Account Number.
    String receiver = JOptionPane.showInputDialog(this, "Enter Account Number", "Transfer Balance", 1);//Take Receiver account Number
    
    String query1 = "SELECT Account_Number FROM sign_up WHERE Account_Number = "+receiver;//Check Receier Account Number
    rs=c.stm.executeQuery(query1);
    
    if (rs.next()) {
        String n = JOptionPane.showInputDialog(this, "Enter Amount", "Transfer Balance", 1);//Take the amount
        int sendAmount = Integer.parseInt(n);
        
        try{
           
         String query = "SELECT Balance FROM balance WHERE Account_Number = "+sender;//Check the sender Account Balance
        rs1=c.stm.executeQuery(query);
        
        if (rs1.next()) {
            
        int currentBalanceofFirstUser = rs1.getInt("Balance");
       
        if(sendAmount<=0){
           
            JOptionPane.showMessageDialog(this, "Sending money should be a more than 0");//Checking the ammount is negative or 0
        }
        else if(currentBalanceofFirstUser<sendAmount){           //Checking the balance is sufficient or not
            JOptionPane.showMessageDialog(this, "Insufficient Balance");
        }
        else if(currentBalanceofFirstUser>=sendAmount){
            
            try{
               String query0 = "SELECT Balance FROM balance WHERE Account_Number = "+receiver;//Take the receiver Account for add sending amount 
        rs0=c.stm.executeQuery(query0);
        if(rs0.next()){
            int CurrentBalanceOfSecondUser = rs0.getInt("Balance");
            int newBalance = CurrentBalanceOfSecondUser + sendAmount;
            
        String updateQuery = "UPDATE balance SET Balance = '"+newBalance+"' WHERE Account_Number = '"+receiver+"'";// Adding the new Balance in receiver account
       int rowsAffected =  c.stm.executeUpdate(updateQuery);
       
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Transfered Tk "+sendAmount+" is Successfull!");
           
            int UpdateBalofFirst =currentBalanceofFirstUser-sendAmount;
            System.out.println("Updated Balance of First user: "+UpdateBalofFirst);
            String updateQueryofSender = "UPDATE balance SET Balance = '"+UpdateBalofFirst+"' WHERE Account_Number = '"+sender+"'";// Adding the new Balance in receiver account
            c.stm.executeUpdate(updateQueryofSender);
            balance.setText(Integer.toString(UpdateBalofFirst));
            try{
                String history01="insert into bank values ('"+sender+"','"+date+"','Send Money','"+sendAmount+"')";
                String history02="insert into bank values ('"+receiver+"','"+date+"','Received Money ','"+sendAmount+"')";
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

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AdminHomePage().setVisible(true);
    }//GEN-LAST:event_clearActionPerformed

    private void statementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statementActionPerformed
         String acNumber =acNum.getSelectedItem().toString();
        new StatementOfTransaction(acNumber).setVisible(true);

    }//GEN-LAST:event_statementActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    @Override
     public void actionPerformed(ActionEvent ae) {
        
    }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminHomePage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> acNum;
    private javax.swing.JLabel balance;
    private javax.swing.JButton clear;
    private javax.swing.JButton deposit;
    private javax.swing.JLabel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lBalance;
    private javax.swing.JLabel lBalance1;
    private javax.swing.JButton sendMoney;
    private javax.swing.JLabel setProfile;
    private javax.swing.JButton statement;
    private javax.swing.JButton submit;
    private javax.swing.JTable table;
    private javax.swing.JLabel textbox;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables

    
   
}
