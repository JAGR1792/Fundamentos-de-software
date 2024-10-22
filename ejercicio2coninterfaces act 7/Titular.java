package ejercicio2coninterfaces;

public class Titular {
    private int id;
    private String nombre;
    private String apellido;
    private String correoElectronico;

    public Titular(int id, String nombre, String apellido, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    @Override
    public String toString() {
        return "Titular [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", correo electrónico=" + correoElectronico + "]";
    }
}
