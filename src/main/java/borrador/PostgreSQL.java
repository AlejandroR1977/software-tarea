package borrador;

import java.sql.*;

public class PostgreSQL {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/prueba?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        String user = "postgres";
        String password = "1234";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM alumno");

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
