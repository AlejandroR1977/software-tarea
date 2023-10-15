import java.sql.*;

public class MySQL extends BaseDatos {

    public MySQL(){
        super.url = "jdbc:mysql://localhost:3306/unison?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        super.user = "root";
        super.password = "secret";
    }

    @Override
    public void connect() throws SQLException {
        this.conn = DriverManager.getConnection(this.url, this.user, this.password);

        if(isConnected()){
            System.out.println("Conectado Exitosamente a MySQL");
        }else{
            System.out.println("No se pudo conectar");
        }
    }

}
