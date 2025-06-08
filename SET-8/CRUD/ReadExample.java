import java.sql.*;
public class ReadExample {
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","Adithya!24");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from employees");
        while(rs.next()){
            int id=rs.getInt("id");
            String name=rs.getString("name");
            String dept=rs.getString("department");
            System.out.println(id+"|"+name+"|"+dept);
            con.close();
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
}
}
//complite->  javac -cp ".;mysql-connector-j-9.3.0.jar" ReadExample.java
//run->  java -cp ".;mysql-connector-j-9.3.0.jar" ReadExample
