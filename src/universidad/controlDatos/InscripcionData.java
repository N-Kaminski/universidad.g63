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

    //      COMPLETADO!!!
    public void cargarInscripcion(Inscripcion inscripcion) {
        String cargarInscripcion = "INSERT INTO inscripcion  (nota, idAlumno, idMateria) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = conec.prepareStatement(cargarInscripcion, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, inscripcion.getNota());
            ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(3, inscripcion.getMateria().getIdMateria());
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

    //      COMPLETADO!!!
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
        List<Inscripcion> lista = new ArrayList<>();
        Inscripcion inscrip = new Inscripcion();
        AlumnoData adata = new AlumnoData();
        Alumno alum = new Alumno();
        alum = adata.buscarAlumno(idAlumno);
       // inscrip.setAlumno(alum);      | NOSE PARA QUE ESTA PERO FUNCIONA IGUAL XD |
        String sql = "SELECT inscripcion.idMateria, materia.nombre, inscripcion.nota\n"
                + "FROM inscripcion JOIN materia ON(inscripcion.idMateria=materia.idMateria)\n"
                + "WHERE inscripcion.idAlumno = ?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            Materia matt;
            while (rs.next()) {
                inscrip = new Inscripcion();    //  | TUBE QUE AGREGARLO PARA CREAR LA INSTANCIA DE INSCRIP PARA CADA NUEVA MATERIA |
                matt = new Materia();
                matt.setIdMateria(rs.getInt("idMateria"));
                matt.setNombre(rs.getString("nombre"));
                inscrip.setMateria(matt);
                inscrip.setNota(rs.getDouble("nota"));
                lista.add(inscrip);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    //      COMPLETADO!!!
    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
        ArrayList<Materia> lista = new ArrayList<>();
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, año, estado FROM inscripcion,"
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
                matt.setEstado(rs.getBoolean("estado"));
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
                    + "WHERE idMateria not in (SELECT materia.idMateria FROM inscripcion JOIN materia ON(materia.idMateria=inscripcion.idMateria) WHERE inscripcion.idAlumno = ?) \n"
                    + "AND estado = 1";
//            String sql = "SELECT materia.idMateria, nombre, año, estado \n"
//                    + "FROM materia \n"
//                    + "WHERE idMateria not in (SELECT materia.idMateria FROM inscripcion JOIN materia ON(materia.idMateria=inscripcion.idMateria) WHERE inscripcion.idAlumno = ?)";
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            Materia matt;
            while (rs.next()) {
                matt = new Materia();
                matt.setIdMateria(rs.getInt("idMateria"));
                matt.setNombre(rs.getString("nombre"));
                matt.setAño(rs.getInt("año"));
//                matt.setEstado(rs.getBoolean("estado"));
//                if (matt.isEstado() == true) {
                lista.add(matt);
//                }
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    //      COMPLETADO!!!
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno=? AND idMateria =?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            ps.executeUpdate();
            Utileria.mensaje("La inscripcion fue anulada correctamente");
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //      COMPLETADO!!!
    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String actualizarNota = "UPDATE inscripcion SET nota=? WHERE idAlumno=? AND idMateria =?";
        try {
            PreparedStatement ps = conec.prepareStatement(actualizarNota);
            ps.setInt(2, idAlumno);
            ps.setDouble(1, nota);
            ps.setInt(3, idMateria);
            ps.executeUpdate();
            Utileria.mensaje("Se actualizo la nota correctamente");
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //  INCOMPLETO
    public List<Alumno> obtenerAlumnosPorMateria(int idMateria) {
        ArrayList<Alumno> lista = new ArrayList<>();
        String obtenerAlumno = "SELECT  alumno.dni, alumno.apellido, alumno.nombre, alumno.estado FROM inscripcion JOIN "
                + "alumno ON (inscripcion.idAlumno=alumno.idAlumno) Where idMateria=?";
        try {
            PreparedStatement ps = conec.prepareStatement(obtenerAlumno);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            Alumno alum;
            while (rs.next()) {
                alum = new Alumno();
                alum.setDni(rs.getInt("dni"));
                alum.setApellido(rs.getString("apellido"));
                alum.setNombre(rs.getString("nombre"));
                alum.setEstado(rs.getBoolean("estado"));
                lista.add(alum);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    //
    // SIN USO DE MOMENTO
    public List<Materia> listaMaterias() {
        ArrayList<Materia> lista = new ArrayList<>();
        String sql = "SELECT idMateria, nombre, año, estado FROM materia";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Materia matt;
            while (rs.next()) {
                matt = new Materia();
                matt.setIdMateria(rs.getInt("idMateria"));
                matt.setNombre(rs.getString("nombre"));
                matt.setAño(rs.getInt("año"));
                matt.setEstado(rs.getBoolean("estado"));
                lista.add(matt);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

}  // LLAVE DE CLASE
