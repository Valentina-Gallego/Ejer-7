

public class Estudiante {

    private String nombre;
    private String calificacion;

    public Estudiante(String nombre, String calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCalificacion() {
        return calificacion;
    }

    @Override
    public String toString() {
        return nombre + " - " + calificacion;
    }
}
