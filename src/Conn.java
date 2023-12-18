import java.sql.*;

public class Conn {
    Connection con;
    Statement stm;
    PreparedStatement psmt;
    public Conn(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fibl","root","");
            stm = con.createStatement();
            //psmt=con.prepareStatement("");
            
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    
}