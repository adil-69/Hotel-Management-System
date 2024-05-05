import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {

    public static void update_table1(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
            Statement st = con.createStatement();
            String sql = "select * from room";
            ResultSet rs = st.executeQuery(sql);
            ((javax.swing.table.DefaultTableModel)MainGUI2.jTable1.getModel()).setNumRows(0);
            while(rs.next()){
                String no = rs.getString("no");
                String type = rs.getString("type");          
                String price = rs.getString("price");
                String available = rs.getString("available");
                String[] tbData = {no,type,price,available};
                javax.swing.table.DefaultTableModel tbModel;
                tbModel = (javax.swing.table.DefaultTableModel)MainGUI2.jTable1.getModel();
                tbModel.addRow(tbData);
            }
            con.close();
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void update_table2(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
            Statement st = con.createStatement();
            String sql = "select * from customer";
            ResultSet rs = st.executeQuery(sql);
            ((javax.swing.table.DefaultTableModel)MainGUI2.jTable2.getModel()).setNumRows(0);
            while(rs.next()){
                String no = rs.getString("roomNo");
                String name = rs.getString("firstName")+" "+rs.getString("lastName");
                String phone = rs.getString("phoneNo");
                String price = rs.getString("price");
                String sprice = rs.getString("submittedMoney");
                String check = rs.getString("checkin");
                String[] tbData = {no,name,phone,price,sprice,check};
                javax.swing.table.DefaultTableModel tbModel;
                tbModel = (javax.swing.table.DefaultTableModel)MainGUI2.jTable2.getModel();
                tbModel.addRow(tbData);
            }
            con.close();
        }
        catch(ClassNotFoundException | SQLException e){e.printStackTrace();
        }        
    }
    
    public static void update_table3(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
            Statement st = con.createStatement();
            String sql = "select * from employee";
            ResultSet rs = st.executeQuery(sql);
            ((javax.swing.table.DefaultTableModel)MainGUI2.jTable3.getModel()).setNumRows(0);
            while(rs.next()){
                String no = rs.getString("empId");
                String name = rs.getString("firstName")+" "+rs.getString("lastName");          
                String work = rs.getString("work");
                String phone = rs.getString("phoneNo");
                String email = rs.getString("emailId");
                String[] tbData = {no,name,work,phone,email};
                javax.swing.table.DefaultTableModel tbModel;
                tbModel = (javax.swing.table.DefaultTableModel)MainGUI2.jTable3.getModel();
                tbModel.addRow(tbData);
            }
            con.close();
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void update_table4(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
            Statement st = con.createStatement();
            String sql = "select * from account";
            ResultSet rs = st.executeQuery(sql);
            ((javax.swing.table.DefaultTableModel)MainGUI2.jTable4.getModel()).setNumRows(0);
            while(rs.next()){
                String name = rs.getString("userName");          
                String gender = rs.getString("gender");
                String phone = rs.getString("Phoneno");
                String email = rs.getString("emailid");
                String[] tbData = {name,email,phone,gender};
                javax.swing.table.DefaultTableModel tbModel;
                tbModel = (javax.swing.table.DefaultTableModel)MainGUI2.jTable4.getModel();
                tbModel.addRow(tbData);
            }
            con.close();
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void update_table5(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
            Statement st = con.createStatement();
            String sql = "select * from restaurant";
            ResultSet rs = st.executeQuery(sql);
            ((javax.swing.table.DefaultTableModel)MainGUI2.jTable5.getModel()).setNumRows(0);
            while(rs.next()){
                String name = rs.getString("foodName");          
                String price = rs.getString("foodPrice");
                String[] tbData = {name,price};
                javax.swing.table.DefaultTableModel tbModel;
                tbModel = (javax.swing.table.DefaultTableModel)MainGUI2.jTable5.getModel();
                tbModel.addRow(tbData);
            }
            con.close();
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void update_dashBoard(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system?serverTimezone=Africa/Casablanca","root","passroot");
            Statement st = con.createStatement();
            String sql1 = "select count(*) from room";
            ResultSet rs1 = st.executeQuery(sql1);
            if (rs1.next())
                MainGUI2.jLabel16.setText(rs1.getString("count(*)"));
            String sql2 = "select count(*) from room where available = 'No'";
            ResultSet rs2 = st.executeQuery(sql2);
            if (rs2.next())
                MainGUI2.jLabel15.setText(rs2.getString("count(*)"));
            String sql3 = "select count(*) from room where available = 'Yes'";
            ResultSet rs3 = st.executeQuery(sql3);
            if (rs3.next())
                MainGUI2.jLabel14.setText(rs3.getString("count(*)"));
            String sql4 = "select count(*) from employee";
            ResultSet rs4 = st.executeQuery(sql4);
            if (rs4.next())
                MainGUI2.jLabel27.setText(rs4.getString("count(*)"));
            
            String sql5 = "select count(*) from employee where work = 'Manager'";
            ResultSet rs5 = st.executeQuery(sql5);
            if (rs5.next())
                MainGUI2.jLabel116.setText(rs5.getString("count(*)"));
            
            String sql13 = "select count(*) from employee where work = 'Accountant'";
            ResultSet rs13 = st.executeQuery(sql13);
            if (rs13.next())
                MainGUI2.jLabel118.setText(rs13.getString("count(*)"));
            
            String sql6 = "select count(*) from employee where work = 'Employee'";
            ResultSet rs6 = st.executeQuery(sql6);
            if (rs6.next())
                MainGUI2.jLabel115.setText(rs6.getString("count(*)"));
            
            String sql7 = "select count(*) from employee where work = 'Worker'";
            ResultSet rs7 = st.executeQuery(sql7);
            if (rs7.next())
                MainGUI2.jLabel102.setText(rs7.getString("count(*)"));
            
            String sql8 = "select count(*) from employee where work = 'Driver'";
            ResultSet rs8 = st.executeQuery(sql8);
            if (rs8.next())
                MainGUI2.jLabel117.setText(rs8.getString("count(*)"));
            
            String sql9 = "select count(*) from room where type = 'Luxury Room' and available ='Yes'";
            ResultSet rs9 = st.executeQuery(sql9);
            if (rs9.next())
                MainGUI2.jLabel32.setText(rs9.getString("count(*)"));
            String sql10 = "select count(*) from room where type = 'AC Room' and available ='Yes'";
            ResultSet rs10 = st.executeQuery(sql10);
            if (rs10.next())
                MainGUI2.jLabel33.setText(rs10.getString("count(*)"));                
            String sql11 = "select count(*) from room where type = 'N-AC Room' and available ='Yes'";
            ResultSet rs11 = st.executeQuery(sql11);
            if (rs11.next())
                MainGUI2.jLabel34.setText(rs11.getString("count(*)"));                
            String sql12 = "select count(*) from room where type = 'Classic Room' and available ='Yes'";
            ResultSet rs12 = st.executeQuery(sql12);
            if (rs12.next())
                MainGUI2.jLabel35.setText(rs12.getString("count(*)"));
            con.close();
        }       
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}
