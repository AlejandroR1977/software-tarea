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
        // Ejemplo de uso de la función LOAD_FILE()
String archivo = null;
try {
    archivo = Files.readString(Paths.get("archivo.txt"));
} catch (IOException e) {
    System.err.println("Error al cargar el archivo: " + e.getMessage());
}

// Ejemplo de uso de la función PASSWORD()
String contrasena = "contrasena";
String hash = null;
try {
    hash = Password.hash(contrasena);
} catch (NoSuchAlgorithmException e) {
    System.err.println("Error al generar el hash de la contraseña: " + e.getMessage());
}

// Ejemplo de uso de la función PASSWORD_VERIFY()
String contrasena = "contrasena";
String hash = "hash";
boolean valido = false;
try {
    valido = Password.verify(contrasena, hash);
} catch (NoSuchAlgorithmException e) {
    System.err.println("Error al verificar la contraseña: " + e.getMessage());
}

// Ejemplo de uso de la función PASSWORD_DEFAULT()
String contrasena = "contrasena";
String hash = null;
try {
    hash = Password.defaultHash(contrasena);
} catch (NoSuchAlgorithmException e) {
    System.err.println("Error al generar el hash predeterminado de la contraseña: " + e.getMessage());
}

// Ejemplo de uso de la función REGEXP_LIKE()
String cadena = "Juan Pérez";
String patron = "^[A-Z]{1,}[a-z]+ [A-Z]{1,}[a-z]+$";
boolean resultado = false;
try {
    resultado = Pattern.matches(patron, cadena);
} catch (PatternSyntaxException e) {
    System.err.println("Error al validar la expresión regular: " + e.getMessage());
}

// Ejemplo de uso de la función REGEXP_EXTRACT()
String cadena = "Juan Pérez es un programador de PHP";
String patron = "/(?P<nombre>\w+) (?P<apellido>\w+)/";
Map<String, String> resultado = null;
try {
    resultado = Pattern.compile(patron).matcher(cadena).namedGroups();
} catch (PatternSyntaxException e) {
    System.err.println("Error al validar la expresión regular: " + e.getMessage());
}

System.out.println(archivo); // Contenido del archivo
System.out.println(hash); // $2y$10$t00000000000000000000000000000000000000000000000000000000000000
System.out.println(valido); // true
System.out.println(hash); // $2y$10$t00000000000000000000000000000000000000000000000000000000000000
System.out.println(resultado.get("nombre")); // Juan
System.out.println(resultado.get("apellido")); // Pérez

    }

}
