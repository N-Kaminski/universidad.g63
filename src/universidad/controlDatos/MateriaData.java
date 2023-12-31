package universidad.controlDatos;

import universidad.entidades.Materia;
import java.sql.Connection;
import java.sql.*;
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
                Utileria.mensaje("Materia cargada");
            }
            rs.close();
            ps.close();
        } catch (SQLIntegrityConstraintViolationException ex) {
            Utileria.mensaje("Ya existe una materia con ese nombre");
//            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
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
            Utileria.mensaje("Materia modificada exitosamente");
            ps.close();
        } catch (SQLIntegrityConstraintViolationException ex) {
            Utileria.mensaje("No se pudo modificar");
//            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
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
                materia.setEstado(rs.getBoolean("estado")); 
            } else {
                Utileria.mensaje("La materia no existe con ese codigo");
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
                materia.setEstado(rs.getBoolean("estado"));
            } else {
                Utileria.mensaje("La materia no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materia;
    }

    public Materia buscarMateria(Materia mat) {
        String bm = "";
        String aux = "";
        if (mat.getIdMateria() != 0) {
            bm = "SELECT  idMateria, nombre, año, estado FROM materia WHERE idMateria=?";
            aux = "" + mat.getIdMateria();
        } else if (!mat.getNombre().equals("")) {
            bm = "SELECT  idMateria, nombre, año, estado FROM materia WHERE nombre=?";
            aux = mat.getNombre();
        }
        PreparedStatement ps;
        try {
            ps = conec.prepareStatement(bm);
            ps.setString(1, aux);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mat.setIdMateria(rs.getInt("idMateria"));
                mat.setNombre(rs.getString("nombre"));
                mat.setAño(rs.getInt("año"));
                mat.setEstado(rs.getBoolean("estado"));
            } else {
                bm = "SELECT  idMateria, nombre, año, estado FROM materia WHERE nombre=?";
                aux = mat.getNombre();
                try {
                    ps = conec.prepareStatement(bm);
                    ps.setString(1, aux);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        mat.setIdMateria(rs.getInt("idMateria"));
                        mat.setNombre(rs.getString("nombre"));
                        mat.setAño(rs.getInt("año"));
                        mat.setEstado(rs.getBoolean("estado"));
                    } else {
                        Utileria.mensaje("La materia no existe");
                        mat.setIdMateria(0);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            ps.close();
        } catch (SQLSyntaxErrorException ex) {
            Utileria.mensaje("No existe materia con codigo '0'");
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mat;
    }

    public void eliminarMateria(int id) {
        String eliminarMateria = "UPDATE materia SET  estado = 0 WHERE idMateria =?";
        try {
            PreparedStatement ps = conec.prepareStatement(eliminarMateria);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Materia> listarMateria() {
        ArrayList<Materia> listaMat = new ArrayList<>();
        try (PreparedStatement ps = conec.prepareStatement("SELECT idMateria, nombre, año, estado FROM materia WHERE estado = 1")) {;
            try (ResultSet rs = ps.executeQuery();) {
                while (rs.next()) {
                    Materia materia = new Materia();
                    materia.setIdMateria(rs.getInt("idMateria"));
                    materia.setNombre(rs.getString("nombre"));
                    materia.setAño(rs.getInt("año"));
                    materia.setEstado(rs.getBoolean("estado"));
                    listaMat.add(materia);
                }
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaMat;
    }

}  // LLAVE DE CLASE
