package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erika dlv
 */
public class Conexion {

    String UrlConexion = "jdbc:sqlserver://leona\\LEONA:1433;database=academia;user=sa;password=123456";
    private Connection conexion;

    public Connection getConexion() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion = (Connection) DriverManager.getConnection(UrlConexion);
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
}
