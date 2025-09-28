package dominio;
import tads.ListaNodos;

public class Usuario implements Comparable {

    private String cedula;
    private String nombre;
    private ListaNodos<Alquiler> alquileres;

    // Getters
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public ListaNodos getAlquileres() {
        return alquileres;
    }

    // Setters
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlquileres(ListaNodos alquileres) {
        this.alquileres = alquileres;
    }

    public Usuario(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.alquileres = new ListaNodos<Alquiler>();
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
