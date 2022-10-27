
public class Conejo extends Animal {
    private int salto;

    public Conejo() {

    }

    public Conejo(String nombre, String raza, String alimento, int edad, int salto) {
        super(nombre, raza, alimento, edad);
        this.salto = salto;
    }

    public int getsalto() {
        return salto;
    }

    public void setsalto(int salto) {
        this.salto = salto;
    }

   public void mostrarConejo() {
        System.out.println(
                "El nombre del Conejo es: " + getnombre() + "\n" + "Su raza es: " + getraza() + "\n" + "Se alimenta de: "
                        + getalimento() + "\n" + "su edad es: " + getedad() + "\n" + "La altura de su salto es: " + salto + "\n");
    }

}