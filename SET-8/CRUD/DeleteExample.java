import java.sql.*;
public class DeleteExample {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","Adithya!24");
            Statement stmt=con.createStatement();
            String s="Delete from employees where id=102 and name='Jashu'";
            int row=stmt.executeUpdate(s);
            System.out.println(row+"row(s) deleted");
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
//complie->  javac -cp ".;mysql-connector-j-9.3.0.jar" DeleteExample.java
//run ->  java -cp ".;mysql-connector-j-9.3.0.jar" DeleteExample
