import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StatementOfTransaction extends javax.swing.JFrame {

  Conn c = new Conn();
  ResultSet rs=null,rs1=null,rs2=null;
    public StatementOfTransaction(String acNumber) {
        initComponents();
        DefaultTableModel tblModel = (DefaultTableModel)Jtable.getModel();
        initComponents();
        ImageIcon myImg = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images/icon.png")));
        Image img1=myImg.getImage();
        Image img2 =img1.getScaledInstance(header.getWidth(), header.getHeight(), Image.SCALE_AREA_AVERAGING);
        ImageIcon i = new ImageIcon(img2);
        header.setIcon(i);
        LacNumber.setText(acNumber);
        
         
        try{
         String query="select * from bank where Account_Number = "+acNumber;
        rs=c.stm.executeQuery(query);
        while(rs.next())
            { 
            String date = rs.getString("Date");
            String type = rs.getString("Type");
            int amount = rs.getInt("Ammount");
            String bal=Integer.toString(amount);
            System.out.println("Date: "+date+"\nType: "+type+"\nAmount: "+bal);
            
             String rowData[] = {date, type, bal};
        
        tblModel.addRow(rowData); 
    }
        }catch(Exception e){
            
        }
        try{
           
        String query="select * from sign_up where Account_Number = "+acNumber; 
        
        rs1=c.stm.executeQuery(query); 
       
        while(rs1.next()){
           
        String FirstName=rs1.getString("First_Name");
        String LastName=rs1.getString("Last_name");
        String phone=rs1.getString("Phone");
        
        String fullName=FirstName+" "+LastName;
      
        name(fullName);
       
            System.out.println("FullName of user : "+fullName);
        break;
        }
        }catch(Exception e){
            System.out.println("Something wernt wrong at getting Name");
        }
        try{
            System.out.println("Test 01");
            String query1 = "SELECT Balance FROM balance WHERE Account_Number = "+acNumber;
             System.out.println("Test 02");
            rs2=c.stm.executeQuery(query1);
             System.out.println("Test 03");
            if(rs2.next()){
                 System.out.println("Test 04");
                int bal=rs2.getInt("Balance");
                String newBal=Integer.toString(bal);
                Lbalance.setText(newBal);
                 System.out.println("Test 05");
        }
        }catch(Exception e){System.out.println("Balance database error!");}
       
    }
 public void Transaction(String amount){
     //Lbalance.setText(amount);
      
 }
   public void name(String n){
       Lname.setText(n);
   } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        LacNumber = new javax.swing.JLabel();
        Lbalance = new javax.swing.JLabel();
        Lname = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Statement of Transcation");
        setLocation(new java.awt.Point(100, 50));
        setMinimumSize(new java.awt.Dimension(300, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(1, 8, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Statement of Your Transaction");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 5, 440, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 870, 90));
        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 90));

        LacNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(LacNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 230, 20));

        Lbalance.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Lbalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Lbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 490, 130, 20));

        Lname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 230, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("BDT");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 490, 70, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Account Number :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Account Holder :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 90, 80, -1));

        Jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Type", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Jtable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1080, 280));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 80, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Avaible Balance");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, 110, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
    Jtable.print(JTable.PrintMode.FIT_WIDTH);
} catch (Exception e) {
            System.out.println("Something wernt wrong at print function");
}
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StatementOfTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatementOfTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatementOfTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatementOfTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatementOfTransaction("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtable;
    private javax.swing.JLabel LacNumber;
    private javax.swing.JLabel Lbalance;
    private javax.swing.JLabel Lname;
    private javax.swing.JLabel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
