public class Libro {
    private String titulo;
    private String autor;
    private int numeropaginas;

    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.numeropaginas = 0;
    }

    public Libro(String titulo) {
        this.titulo = titulo;
        this.autor = "Desconocido";
        this.numeropaginas = 0;
    }

    public Libro(String titulo, String autor, int numeropaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeropaginas = numeropaginas;
    }


    public void mostrarInformacion() {
        System.out.println("Libro - Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeropaginas);
    }
}
    