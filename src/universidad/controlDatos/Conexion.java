
package universidad.controlDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/** @author Nicolas Kaminski */

public class Conexion {

private static String url = "jdbc:mariadb://localhost/universidad.g63";    // cambiar nombre a base de datos: todo lo de la ultima barra /
private static String usuario = "root";
private static String password = "";
private static Conexion conexion = null;


private Conexion (){
    try {
        Class.forName("org.mariadb.jdbc.Driver");
    } catch (ClassNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "Error en cargar Drivers");
    }
}

    public static Connection getConexion() {
        Connection conec = null;
        
        if(conexion == null){
            conexion = new Conexion();
        }
        
        try {
            conec = DriverManager.getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"+ "&user=" + usuario + "&password="+password);
        } catch (SQLException ex) {
       JOptionPane.showMessageDialog(null, "error de conexion");
    }
        return conec;
    }

}  // LLAVE DE CLASE
