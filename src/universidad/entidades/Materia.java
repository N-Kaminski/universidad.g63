package universidad.entidades;

/**
 * @author Nicolas Kaminski
 */
public class Materia {

    private int idMateria;
    private String nombre;
    private int año;
    private boolean estado;

    public Materia(int idMateria, String nombre, int año, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.año = año;
        this.estado = estado;
    }

    public Materia(String nombre, int año, boolean estado) {
        this.nombre = nombre;
        this.año = año;
        this.estado = estado;
    }

    public Materia() {
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        if (nombre.equals("Seleccione una materia")) {
            return nombre; // Para la materia vacía, solo mostrar el nombre
        } else {
            return nombre + " - " + año + "° año"; // Para otras materias, mostrar nombre y año
        }
    }
    
}  // LLAVE DE CLASE
