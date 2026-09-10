public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante() {
        this.nombre = "Estudiante NN";
        this.edad = 15;
        this.curso = "Sin Asignar";
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad =  edad ;
    }

    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); 
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante [Nombre: " + nombre + ", Edad: " + edad + " años, Curso: " + curso + "]";
    }
}
