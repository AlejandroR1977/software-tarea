package borrador;

import java.sql.*;

public class MySQL {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3307/hermosillo?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "pepito";

        try {
            Connection conn = DriverManager.getConnection(url,user,password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ciudadano");

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
