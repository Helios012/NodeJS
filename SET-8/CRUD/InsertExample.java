import java.sql.*;
public class InsertExample {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
            Statement stmt=con.createStatement();
            String s="insert into employees values(102,'Drake','CSE')";
            int row=stmt.executeUpdate(s);
            System.out.println(row + " row(s) inserted.");
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
//compile-> javac -cp ".;mysql-connector-j-9.3.0.jar" InsertExample.java
//run->  java -cp ".;mysql-connector-j-9.3.0.jar" InsertExample
