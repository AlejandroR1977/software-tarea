import java.sql.SQLException;

public class Principal {

    public static void main(String[] args) {

        BaseDatos baseDatos = new MariaDB();

        try {
            baseDatos.connect();
            baseDatos.select();
            //baseDatos.insert("Pepito", "Pez");
            //baseDatos.delete(7);
            baseDatos.disconnect();
        } catch (SQLException e) {
            System.out.println("Ocurrio un error al intentar conectarse");
        }

    }
}
