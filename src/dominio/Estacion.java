package dominio;

public class Estacion {

    private static int id = 1;
    private String nombre;
    private String barrio;
    private int capacidad;
    private int anclajesOcupados;
    private boolean tieneAnclajes;

    public static void main(String[] args) {
        Estacion e = new Estacion("ee", "333", 4);
        System.out.println(e);
    }

    // Getters
    public static int getId() {
        return id;
    }

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
    public static void setId(int id) {
        Estacion.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setAnclajesOcupados(int anclajesOcupados) {
        this.anclajesOcupados = anclajesOcupados;
    }

    public void setTieneAnclajes(boolean tieneAnclajes) {
        this.tieneAnclajes = tieneAnclajes;
    }

    public Estacion(String nombre, String barrio, int capacidad) {
        this.id = id++;
        this.nombre = nombre;
        this.barrio = barrio;
        this.capacidad = capacidad;
        this.anclajesOcupados = 0;
        this.tieneAnclajes = true;
    }

    // Metodos
    @Override
    public String toString() {
        return "ID: " + id + "Estacion:" + "nombre=" + nombre + ", barrio=" + barrio + ", capacidad=" + capacidad + ", anclajesOcupados=" + anclajesOcupados + '}';
    }

    public boolean tieneAnclajesLibres() {
        return this.getAnclajesOcupados() == this.getCapacidad();
    }
}
