package universidad.controlDatos;

import universidad.entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidad.g63.Utileria;

/**
 * @author Nicolas Kaminski
 */
public class AlumnoData {

    private Connection conec;

    public AlumnoData() {
        conec = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alumno) {
        String ssql = "INSERT INTO alumno (dni, apellido, nombre, fechaNac, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conec.prepareStatement(ssql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
            }
            rs.close();
            ps.close();
            Utileria.mensaje("Se cargo el alumno correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarAlumno(Alumno alumno) {
        String ssql = "UPDATE alumno SET dni=?, apellido=?, nombre=?, fechaNac=?, estado=? WHERE idAlumno=?";
        try {
            PreparedStatement ps = conec.prepareStatement(ssql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isEstado());
            ps.setInt(6, alumno.getIdAlumno());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno buscarAlumno(int idAlumno) {
        Alumno alumno = null;
        String buscarAlumno = "SELECT  dni, apellido, nombre, fechaNac, estado FROM alumno WHERE idAlumno=?";
        PreparedStatement ps;
        try {
            ps = conec.prepareStatement(buscarAlumno);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setApellido(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
            } else {
                Utileria.mensaje("El alumno no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alumno;

    }

    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno alumno = null;
        //String buscarDni = "SELECT  idAlumno, dni, apellido, nombre, fechaNac FROM alumno WHERE dni=? AND estado =1";
        String buscarDni = "SELECT  idAlumno, dni, apellido, nombre, fechaNac, estado FROM alumno WHERE dni=?";
        PreparedStatement ps;
        try {
            ps = conec.prepareStatement(buscarDni);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                //alumno.setEstado(true); // VER SI ES IGUAL QUE PONERLO COMO EN EL ANTERIOR METODO
                alumno.setEstado(rs.getBoolean("estado"));
            } else {
                Utileria.mensaje("No se encontro un alumno con ese numero de documento");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alumno;
    }

    public ArrayList<Alumno> obtenerAlumnos() {
        ArrayList<Alumno> lista = new ArrayList<>();
        try (PreparedStatement ps = conec.prepareStatement("SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE estado =1")) {
            try (ResultSet rs = ps.executeQuery();) {
                while (rs.next()) {
                    /*int idAlumno = rs.getInt("idAlumno");
                    String dni = rs.getString("dni");
                    String apellido = rs.getString("apellido");
                    String nombre = rs.getString("nombre");
                    LocalDate fechaNacimiento = rs.getDate("fechaNacimiento").toLocalDate();
                    boolean estado = rs.getBoolean("estado");*/
                    lista.add(new Alumno(rs.getInt("idAlumno"), rs.getInt("dni"), rs.getString("apellido"), rs.getString("nombre"), rs.getDate("fechaNacimiento").toLocalDate(), rs.getBoolean("estado")));
                }
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Collections.sort(lista);
        return lista;
    }

    public void eliminarAlumno(int id) {
        String eliminarAlumno = "UPDATE alumno SET  estado = 0 WHERE idAlumno =?";

        try {
            PreparedStatement ps = conec.prepareStatement(eliminarAlumno);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

//            if (fila == 1) {
//                JOptionPane.showMessageDialog(null, "Se dio de baja el alumno");
//            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}  // LLAVE DE CLASE
