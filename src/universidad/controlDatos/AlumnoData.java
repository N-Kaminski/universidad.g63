package universidad.controlDatos;

import universidad.entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Nicolas Kaminski
 */
public class AlumnoData {

    private Connection conec;

    public AlumnoData() {
        conec = Conexion.getConexion();
    }

    public void cargarAlumno(Alumno alumno) {
        String cargarAlumno = "INSERT INTO alumno (dni, apellido, nombre, fechaNac, estado) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = conec.prepareStatement(cargarAlumno, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            // ps.setObject(4, fechaNac);
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                mensaje("El alumno " + alumno.getNombre() + " " + alumno.getApellido() + " se cargo corectamente.");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            mensaje("El alumno " + alumno.getNombre() + " " + alumno.getApellido() + " no se pudo cargar.");
        }
    }

    public void actualizarAlumno(Alumno alumno) {
        String actualizarAlumno = "UPDATE alumno SET dni=?, apellido=?, nombre=?, fechaNac? WHERE idAlumno=?";

        try {
            PreparedStatement ps = conec.prepareStatement(actualizarAlumno);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            // ps.setObject(4, fechaNac);
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getIdAlumno());
            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            mensaje("El alumno " + alumno.getNombre() + " " + alumno.getApellido() + " no se pudo actualizar.");
        }
    }
    
    public Alumno buscarAlumno (int idAlumno){
        Alumno alumno = null;
        String buscarAlumno = "SELECT  dni, apellido, nombre, fechaNac, estado FROM alumno WHERE idAlumno=?";
        PreparedStatement ps;
        try{
            ps = conec.prepareStatement(buscarAlumno);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setApellido(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
            } else {
                mensaje ("El alumno no existe");
            }
             ps.close();
        } catch (SQLException ex) {
           mensaje("El alumno no se pudo cargar.");
        } 
        return alumno;
        
    }
    
    public Alumno buscarAlumnoPorDni (int dni){
        Alumno alumno = null;
        String buscarDni = "SELECT  idAlumno, dni, apellido, nombre, fechaNac FROM alumno WHERE dni=? AND estado =1";
        PreparedStatement ps;
        try{
            ps = conec.prepareStatement(buscarDni);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setApellido(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(true); // VER SI ES IGUAL QUE PONERLO COMO EN EL ANTERIOR METODO
            } else {
                mensaje ("El alumno no existe");
            }
             ps.close();
        } catch (SQLException ex) {
           mensaje("El DNI del alumno no se pudo encontrar.");
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
                mensaje("Error al obtener la lista de las patologias en la BD: " + ex.getMessage());
            }
        } catch (SQLException ex) {
            mensaje("Error al obtener la lista de las patologias en la BD: " + ex.getMessage());
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
           
           if (fila ==1){
               JOptionPane.showMessageDialog(null, "Se dio de baja el alumno");
           }

            ps.close();
        } catch (SQLException ex) {
            mensaje("El alumno  no se pudo dar de baja.");
        }
    }
    
    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

}  // LLAVE DE CLASE
