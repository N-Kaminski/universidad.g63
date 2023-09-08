
package universidad.controlDatos;

import universidad.entidades.Inscripcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/** @author Nicolas Kaminski */

public class InscripcionData {

private Connection conec;

    public InscripcionData() {
            conec = Conexion.getConexion();
    }

 public void cargarInscripcion(Inscripcion inscripcion) {
        String cargarInscripcion = "INSERT INTO inscripcion  (nota, idAlumno, idMateria) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = conec.prepareStatement(cargarInscripcion, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, inscripcion.getNota());
            ps.setObject(2, inscripcion.getAlumno().getIdAlumno());
             ps.setObject(3, inscripcion.getMateria().getIdMateria());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inscripcion.setIdInscripto(rs.getInt(1));
                mensaje("La inscripcion se cargo corectamente.");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
          mensaje("La inscripcion NO se cargo corectamente.");
        }
    }

 public void buscarNota (double nota){
        Inscripcion ins = null;
        String buscarNota = "SELECT  materia.nombre, materia.nota, alumno.nombre, alumno.apellido FROM inscripcion "
                + "JOIN alumno ON (alumno.idAlumno=inscripcion.idInscripcion) JOIN materia ON (inscripcion.idMateria=materia.idMateria)"
                + "WHERE inscripcion.nota>=?";
        PreparedStatement ps;
        try{
            ps = conec.prepareStatement(buscarNota);
            ps.setDouble(1, nota);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                ins = new Inscripcion();
                ins.setIdInscripto(rs.getInt("idInscripcion"));
                    
// *********     ESTA SIN TERMINAR   ****************

            }
            
        } catch (SQLException ex) {
           mensaje("El alumno no se pudo cargar.");
        } 
        
    }
 
 private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
 
}  // LLAVE DE CLASE
