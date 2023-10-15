package borrador;

import java.sql.*;

public class MariaDB {

    public static void main(String[] args) {

        String url = "jdbc:mariadb://localhost:3306/persona?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "secret";

        try {
            Connection conn = DriverManager.getConnection(url,user,password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM estudiante");

            while(rs.next()){
                System.out.println("nombre: " + rs.getString(1));
                System.out.println("apellido: " + rs.getString(2));
                System.out.println();
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }
}
