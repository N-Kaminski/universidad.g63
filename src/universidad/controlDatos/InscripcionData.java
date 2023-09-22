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
import universidad.g63.Utileria;

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

    // FALTA CHEQUEAR
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
                Utileria.mensaje("La inscripcion se cargo corectamente.");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
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

    //      COMPLETADO!!!
    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
        ArrayList<Materia> lista = new ArrayList<>();
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion,"
                    + " materia WHERE inscripcion.idMateria = materia.idMateria\n"
                    + "AND inscripcion.idAlumno = ?";
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            Materia matt;
            while (rs.next()) {
                matt = new Materia();
                matt.setIdMateria(rs.getInt("idMateria"));
                matt.setNombre(rs.getString("nombre"));
                matt.setAño(rs.getInt("año"));
                lista.add(matt);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    //      COMPLETADO!!!
    public List<Materia> obtenerMateriasNoCursadas(int idAlumno) {
        ArrayList<Materia> lista = new ArrayList<>();

        try {
            String sql = "SELECT materia.idMateria, nombre, año \n"
                    + "FROM materia \n"
                    + "WHERE idMateria not in (SELECT materia.idMateria FROM inscripcion JOIN materia ON(materia.idMateria=inscripcion.idMateria) WHERE inscripcion.idAlumno = ?)";
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            Materia matt;
            while (rs.next()) {
                matt = new Materia();
                matt.setIdMateria(rs.getInt("idMateria"));
                matt.setNombre(rs.getString("nombre"));
                matt.setAño(rs.getInt("año"));
                lista.add(matt);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public List<Materia> listaMaterias() {
        ArrayList<Materia> lista = new ArrayList<>();
        String sql = "SELECT idMateria, nombre, año FROM materia";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Materia matt;
            while (rs.next()) {
                matt = new Materia();
                matt.setIdMateria(rs.getInt("idMateria"));
                matt.setNombre(rs.getString("nombre"));
                matt.setAño(rs.getInt("año"));
                lista.add(matt);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

}  // LLAVE DE CLASE
