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

// Método load_file()
try {
    String archivo = Files.readString(Paths.get("archivo.txt"));
    System.out.println(archivo); // Contenido del archivo
} catch (IOException e) {
    System.err.println("Error al cargar el archivo: " + e.getMessage());
}

// Ejemplo de uso del método sha1() con un try-catch
String cadena = "Hola, mundo!";
try {
    byte[] hash = MessageDigest.getInstance("SHA-1").digest(cadena.getBytes());
    String hex = new String(Hex.encodeHex(hash));
    System.out.println(hex); // 5c41176b65ae3720e3e9c897c129c565b9798c81
} catch (NoSuchAlgorithmException e) {
    System.err.println("Error al calcular el hash: " + e.getMessage());
}

// Ejemplo de uso del método sha256()
String cadena = "Hola, mundo!";
try {
    byte[] hash = MessageDigest.getInstance("SHA-256").digest(cadena.getBytes());
    String hex = new String(Hex.encodeHex(hash));
    System.out.println(hex); // da39a3ee5e6b4b0d3255bfef95601890afd80709
} catch (NoSuchAlgorithmException e) {
    System.err.println("Error al calcular el hash: " + e.getMessage());
}

// Ejemplo de uso del método sha512() con un try-catch
String cadena = "Hola, mundo!";
try {
    byte[] hash = MessageDigest.getInstance("SHA-512").digest(cadena.getBytes());
    String hex = new String(Hex.encodeHex(hash));
    System.out.println(hex); // 356a22a50f54c07644e0f2404b7c37326638283f47488d7688b5580971c5f9b5f587800178a56558d0b982702a505c88ce3089d03a5784859e29542753e71
} catch (NoSuchAlgorithmException e) {
    System.err.println("Error al calcular el hash: " + e.getMessage());
}

// Ejemplo de uso del método uuid() con un try-catch
try {
    UUID uuid = UUID.randomUUID();
    System.out.println(uuid); // 763b645b-683f-4421-a84a-1b7e0315a81
} catch (Exception e) {
    System.err.println("Error al generar el UUID: " + e.getMessage());
}
    }

}
