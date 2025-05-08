import java.sql.*;

public class UpdateExample {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/company", "root", "root");
            Statement stmt = conn.createStatement();
            String sql = "UPDATE employees SET department='HR' WHERE id=101";
            int rows = stmt.executeUpdate(sql);
            System.out.println(rows + " row(s) updated.");
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
//compile--javac -cp .;mysql-connector-j-9.3.0.jar UpdateExample.java
//run--java -cp .;mysql-connector-j-9.3.0.jar UpdateExample
/*make a database company in mysql and create a table employees with ID,Name,department as parameters and enter some data starting with the ID from 101 */
