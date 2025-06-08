import java.sql.*;

public class UpdateExample {
    public static void main(String[] args) {
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/company", "root", "Adithya!24");
            Statement stmt = conn.createStatement();
            String sql = "UPDATE employees SET department='IT' WHERE id=101";
            int rows = stmt.executeUpdate(sql);
            System.out.println(rows + " row(s) updated.");
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
