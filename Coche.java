public class Coche {
    private String marca;
    private String modelo;

    public Coche() {
        this.marca = "Desconocida";
        this.modelo = "Estándar";
    }


    public Coche(String marca) {
        this.marca = marca;
        this.modelo = "Sin Especificar";
    }


    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInformacion() {
        System.out.println("Coche - Marca: " + marca + ", Modelo: " + modelo);
    }}
