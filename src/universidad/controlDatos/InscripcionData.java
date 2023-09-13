package universidad.controlDatos;

import universidad.entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Nicolas Kaminski
 */
public class InscripcionData {

    private Connection conec;
    private AlumnoData aluData;
    private MateriaData matData;

    public InscripcionData() {
        conec = Conexion.getConexion();
    }

    public void cargarInscripcion(Inscripcion inscripcion) {
        String cargarInscripcion = "INSERT INTO inscripcion  (nota, idAlumno, idMateria) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = conec.prepareStatement(cargarInscripcion, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, inscripcion.getNota());
            ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(3, inscripcion.getMateria().getIdMateria());
            //ps.setObject(2, inscripcion.getAlumno().getIdAlumno());
            //ps.setObject(3, inscripcion.getMateria().getIdMateria());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inscripcion.setIdInscripto(rs.getInt(1));
                mensaje("La inscripcion se cargo corectamente.");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            mensaje("La inscripcion NO se cargo corectamente.  **55**");
        }
    }

    //  INCOMPLETO
    public List<Inscripcion> obtenerInscripciones() {
        ArrayList<Inscripcion> lista = new ArrayList<>();

        return lista;
    }

    //  INCOMPLETO
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
        ArrayList<Inscripcion> lista = new ArrayList<>();

        return lista;
    }

    //  INCOMPLETO
    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
        ArrayList<Materia> lista = new ArrayList<>();

        return lista;
    }

    //  INCOMPLETO
    public List<Materia> obtenerMateriasNoCursadas(int idAlumno) {
        ArrayList<Materia> lista = new ArrayList<>();

        return lista;
    }

    //  FALTA CHEQUEAR
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String borrarInscripcion = "UPDATE inscripcion SET estado=0 WHERE idAlumno=? AND idMateria =?";

        try {
            PreparedStatement ps = conec.prepareStatement(borrarInscripcion);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            mensaje("Fallo de conexion a la tabla");
        }
    }

    //  FALTA CHEQUEAR
    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String actualizarNota = "UPDATE inscripcion SET nota=? WHERE idAlumno=? AND idMateria =?";

        try {
            PreparedStatement ps = conec.prepareStatement(actualizarNota);
            ps.setInt(2, idAlumno);
            ps.setDouble(1, nota);  //auch
            ps.setInt(3, idMateria);
            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            mensaje("Fallo de conexion a la tabla.07");
        }
    }

    //  INCOMPLETO
    public List<Alumno> obtenerAlumnosPorMateria(int idMateria) {
        ArrayList<Alumno> lista = new ArrayList<>();
            String obtenerAlumno = "SELECT  alumno.dni, alumno.apellido, alumno.nombre FROM inscripcion JOIN "
                    + "alumno ON (inscripcion.idAlumno=alumno.idAlumno) Where idMateria=?";
        try {           
            PreparedStatement ps = conec.prepareStatement(obtenerAlumno);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               //     lista.add(new Alumno(rs.getInt("dni"), rs.getString("apellido"), rs.getString("nombre"));
                }
                ps.close();
            
            
            
        } catch (SQLException ex) {
           mensaje("Fallo de conexion a la tabla.08");
        }
        return lista;
    }

    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

}  // LLAVE DE CLASE
