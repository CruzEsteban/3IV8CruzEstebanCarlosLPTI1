public class Gato extends Animal {
    private int vidas;

    public Gato() {

    }

    public Gato(String nombre, String raza, String alimento, int edad, int vidas) {
        super(nombre, raza, alimento, edad);
        this.vidas = vidas;
    }

    public int getvidas() {
        return vidas;
    }

    public void setvidas(int vidas) {
        this.vidas = vidas;
    }

    public void mostrarGato() {
        System.out.println(
                "El nombre del Gato es: " + getnombre() + "\n" + "Su raza es: " + getraza() + "\n" + "Se alimenta de: "
                        + getalimento() + "\n" + "su edad es: " + getedad() + "\n" + "Sus vidas son: " + vidas + "\n");
    }

}