import java.sql.*;

public class MariaDB extends BaseDatos {

    public MariaDB(){
        super.url = "jdbc:mariadb://localhost:3307/unison?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        super.user = "root";
        super.password = "secret";
    }

    @Override
    public void connect() throws SQLException {
        this.conn = DriverManager.getConnection(this.url, this.user, this.password);

        if(isConnected()){
            System.out.println("Conectado Exitosamente a MariaDB");
        }else{
            System.out.println("No se pudo conectar");
        }
    }

}
