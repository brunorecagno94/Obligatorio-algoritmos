package dominio;

public class Bicicleta implements Comparable {

    private static int id = 0;
    private String codigo;
    private String tipo;
    private String estado;
    private boolean enDeposito;
    private Estacion estacionAsignada;
    private String usuarioAsignado;

    // Getters
   
    public Bicicleta(String codigo, String tipo) {
        this.id = id++;
        this.codigo = codigo;
        this.tipo = tipo;
        this.estado = "Disponible";
        this.enDeposito = true;
        this.estacionAsignada = null;
       this.usuarioAsignado = null;
    }

    // VALIDAR

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
