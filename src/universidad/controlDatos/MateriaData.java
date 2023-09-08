
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

/** @author Nicolas Kaminski */

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
                mensaje("La materia " + materia.getNombre() + " " + " se cargo corectamente.");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            mensaje("La materia " + materia.getNombre() + " no se pudo cargar.");
        }
    }
    
    public void actualizarMateria(Materia materia) {
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
            mensaje("La materia " + materia.getNombre() + " no se pudo actualizar.");
        }
    }
      
      public Materia buscarMateria (int idMateria){
        Materia materia = null;
        String buscarMateria = "SELECT  nombre, año, estado FROM materia WHERE idMateria=?";
        PreparedStatement ps;
        try{
            ps = conec.prepareStatement(buscarMateria);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado")); // ver si en lugar de "estado" va= materia.setEstado(true)
            } else {
                mensaje ("La materia no existe");
            }
             ps.close();
        } catch (SQLException ex) {
           mensaje("La materia no se pudo cargar.");
        } 
        return materia;
    }

      public void eliminarMateria(int id) {
        String eliminarMateria = "UPDATE materia SET  estado = 0 WHERE idMateria =?";

        try {
            PreparedStatement ps = conec.prepareStatement(eliminarMateria);
            ps.setInt(1, id);
           int fila = ps.executeUpdate();
           
           if (fila ==1){
               JOptionPane.showMessageDialog(null, "Se dio de baja la materia");
           }

            ps.close();
        } catch (SQLException ex) {
            mensaje("La materia  no se pudo dar de baja.");
        }
    }
      
      public List <Materia> listarMateria (){
          
          List <Materia> materias = new ArrayList<>();
          
          try{
              String lista = "SELECT * FROM materia WHERE estado = 1";
              PreparedStatement ps = conec.prepareStatement(lista);
              ResultSet rs = ps.executeQuery();
              
              while (rs.next()){
                  Materia materia = new Materia();
                  materia.setIdMateria(rs.getInt("idMateria"));
                  materia.setNombre(rs.getString("nombre"));
                   materia.setIdMateria(rs.getInt("año"));
                   materia.setEstado(rs.getBoolean("estado"));
              }
              
              ps.close();
          } catch (SQLException ex) {
                 mensaje("Error al obtener la lista de las materias: " + ex.getMessage());
          }
          return materias;
      }
      
private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

}  // LLAVE DE CLASE
