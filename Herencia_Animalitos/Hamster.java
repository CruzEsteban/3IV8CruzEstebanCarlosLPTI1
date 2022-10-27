public class Hamster extends Animal {
    private String estres;

    public Hamster() {

    }

    public Hamster(String nombre, String raza, String alimento, int edad, String estres) {
        super(nombre, raza, alimento, edad);
        this.estres = estres;
    }

    public String estres() {
        return estres;
    }

    public void setestres(String estres) {
        this.estres = estres;
    }

    public void mostrarHamster() {
        System.out.println(
                "El nombre del Hamster es: " + getnombre() + "\n" + "Su raza es: " + getraza() + "\n" + "Se alimenta de: "
                        + getalimento() + "\n" + "su edad es: " + getedad() + "\n" + "Sus nivel de estres es: " + estres + "\n");
    }

}