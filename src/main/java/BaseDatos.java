import java.sql.*;

public abstract class BaseDatos {

    //Atributos
    protected String url;
    protected String user;
    protected String password;
    protected Connection conn;
    protected PreparedStatement ps;
    protected ResultSet rs;

    //Métodos abstractos
    protected abstract void connect() throws SQLException;


    //Métodos comunes
    protected boolean isConnected(){
        return this.conn != null;
    }
    protected void disconnect(){

        if(!isConnected()){
            System.out.println("No estas conectado");
        }else{
            try{
                if(this.rs != null){
                    this.rs.close();
                }
                if(this.ps != null){
                    this.ps.close();
                }
                if(this.conn != null){
                    this.conn.close();
                }
                System.out.println("Conexion cerrada");
            }catch(SQLException ex){
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }
        }
    }
    protected void select(){
        if(!isConnected()){
            System.out.println("Necesitas conectarte a la base de datos");
        } else {

            Statement stmt = null;

            try {
                stmt = this.conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM alumno");

                while (rs.next()) {
                    int id = rs.getInt(1);
                    String nombre = rs.getString(2);
                    String apellido = rs.getString(3);
                    System.out.println(id + "\t" + nombre + "\t" + apellido);
                }


            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }
        }
    }
    protected int insert(String nombre, String apellido){

        if(!isConnected()){
            System.out.println("Necesitas conectarte a la base de datos");
            return 0;
        }

        String SQL_INSERT = "INSERT INTO alumno(nombre, apellido) VALUES(?,?)";

        try{
            this.ps = this.conn.prepareStatement(SQL_INSERT);
            this.ps.setString(1, nombre);
            this.ps.setString(2, apellido);
            int filasAfectadas = this.ps.executeUpdate();
            System.out.println("Se inserto " + filasAfectadas + " registro");
            return filasAfectadas;
        }catch(SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        System.out.println("Hubo un error");
        return 0;
    }
    protected int delete(int id){

        if(!isConnected()){
            System.out.println("Necesitas conectarte a la base de datos");
            return 0;
        }

        String SQL_DELETE = "DELETE FROM alumno WHERE id = ?";

        try{
            this.ps = this.conn.prepareStatement(SQL_DELETE);
            this.ps.setInt(1, id);
            int filasAfectadas = this.ps.executeUpdate();
            System.out.println("Se elimino " + filasAfectadas + " registro");
            return filasAfectadas;
        }catch(SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        System.out.println("Ocurrio un error");
        return 0;
    }
}
