package universidad.controlDatos;

import universidad.entidades.Materia;
import java.sql.Connection;
import java.sql.Date;
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
public class MateriaData {

    private Connection conec;

    public MateriaData() {
        conec = Conexion.getConexion();
    }

    public void cargarMateria(Materia materia) {
        String cargarMateria = "INSERT INTO materia  (nombre, año, estado) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = conec.prepareStatement(cargarMateria, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                Utileria.mensaje("La materia " + materia.getNombre() + " " + " se cargo corectamente.");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarMateria(Materia materia) {
        String actualizarMateria = "UPDATE materia SET nombre=?, año=?, estado=? WHERE idMateria=?";

        try {
            PreparedStatement ps = conec.prepareStatement(actualizarMateria);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
            ps.executeUpdate();

            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia buscarMateria(int idMateria) {
        Materia materia = null;
        String buscarMateria = "SELECT  idMateria, nombre, año, estado FROM materia WHERE idMateria=?";
        PreparedStatement ps;
        try {
            ps = conec.prepareStatement(buscarMateria);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado")); // ver si en lugar de "estado" va= materia.setEstado(true)
            } else {
                Utileria.mensaje("La materia no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materia;
    }

    public Materia buscarMateria(String nombre) {
        Materia materia = null;
        String bm = "SELECT  idMateria, nombre, año, estado FROM materia WHERE nombre=?";
        PreparedStatement ps;
        try {
            ps = conec.prepareStatement(bm);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado")); // ver si en lugar de "estado" va= materia.setEstado(true)
            } else {
                Utileria.mensaje("La materia no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materia;
    }

    public void eliminarMateria(int id) {
        String eliminarMateria = "UPDATE materia SET  estado = 0 WHERE idMateria =?";

        try {
            PreparedStatement ps = conec.prepareStatement(eliminarMateria);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
/*
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja la materia");
            }
*/
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Materia> listarMateria() {

        List<Materia> materias = new ArrayList<>();

        try {
            String lista = "SELECT * FROM materia WHERE estado = 1";
            PreparedStatement ps = conec.prepareStatement(lista);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setIdMateria(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
            }

            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materias;
    }

}  // LLAVE DE CLASE
