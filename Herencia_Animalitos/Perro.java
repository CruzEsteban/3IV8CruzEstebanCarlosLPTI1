public class Perro extends Animal {

    private String ladrido;

    public Perro() {

    }

    public Perro(String nombre, String raza, String alimento, int edad, String ladrido) {
        super(nombre, raza, alimento, edad);
        this.ladrido = ladrido;
    }

    public String getladrido() {
        return ladrido;
    }

    public void setladrido(String ladrido) {
        this.ladrido = ladrido;
    }

    public void mostrarPerro() {
        System.out.println("El nombre del perro es: " + getnombre() + "\n" + "Su raza es: " + getraza() + "\n"
                + "Se alimenta de: " + getalimento() + "\n" + "su edad es: " + getedad() + "\n" + "Su ladrido es: "
                + ladrido + "\n");
    }
}
