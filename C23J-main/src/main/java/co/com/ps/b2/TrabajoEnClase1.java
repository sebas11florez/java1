package co.com.ps.b2;

public class TrabajoEnClase1 {

    private int tamano;
    private String capacidad;
    private boolean encendido;
    private double precio;
    private char tipo;
    private long identificador;
    private float peso;

    public TrabajoEnClase1(int tamano, String capacidad, boolean encendido,
                           double precio, char tipo, long identificador, float peso) {
        this.tamano = tamano;
        this.capacidad = capacidad;
        this.encendido = encendido;
        this.precio = precio;
        this.tipo = tipo;
        this.identificador = identificador;
        this.peso = peso;
    }

    public void cargar() {
        System.out.println("Cargando...");
    }

    public String obtenerInformacion() {
        return "Este objeto tiene capacidad: " + capacidad + ", precio: $" + precio;
    }

    public double calcularImpuesto(double tasa) {
        return precio * tasa;
    }

    public static void main(String[] args) {
        TrabajoEnClase1 miObjeto = new TrabajoEnClase1(10, "Alta", true, 99.99,
                'A', 123456789L, 5.5f);

        miObjeto.cargar();
        System.out.println(miObjeto.obtenerInformacion());
        System.out.println("Impuesto calculado: $" + miObjeto.calcularImpuesto(0.1));
    }
}
