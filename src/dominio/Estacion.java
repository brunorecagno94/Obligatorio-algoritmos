package dominio;

public class Estacion {
    private String nombre;
    private String barrio;
    private int capacidad;
    private int anclajesLibres;
    private ListaNodos<Bicicleta> listaBicis;
    //private ColaNodos<Usuario> listaEsperaAlquiler;
    //private ColaNodos<Usuario> listaEsperaAnclaje;

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getBarrio() {
        return barrio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getAnclajesOcupados() {
        return anclajesOcupados;
    }

    public boolean tieneAnclajes() {
        return tieneAnclajes;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setAnclajesLibres(int anclajesLibres) {
        this.anclajesLibres = anclajesLibres;
    }

    public void setTieneAnclajes(boolean tieneAnclajes) {
        this.tieneAnclajes = tieneAnclajes;
    }

    public Estacion(String nombre, String barrio, int capacidad, int anclajesLibres) {
        this.nombre = nombre;
        this.barrio = barrio;
        this.capacidad = capacidad;
        this.anclajesLibres = anclajesLibres;
        this.listaBicis = new ListaNodos<Bicicleta>;
    }

    // Metodos
    @Override
    public String toString() {
        return "Estacion:" + "nombre=" + nombre + ", barrio=" + barrio + ", capacidad=" + capacidad + ", anclajesLibres=" + anclajesLibres + '}';
    }

    public boolean tieneAnclajesLibres() {
        return this.getAnclajesLibres() - this.getCapacidad() == 0;
    }
}
