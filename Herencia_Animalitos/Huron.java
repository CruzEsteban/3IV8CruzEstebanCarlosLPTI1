public class Huron extends Animal {
    private int sueno;

    public Huron() {

    }

    public Huron(String nombre, String raza, String alimento, int edad, int sueno) {
        super(nombre, raza, alimento, edad);
        this.sueno = sueno;
    }

    public int getsueno() {
        return sueno;
    }

    public void setsueno(int sueno) {
        this.sueno = sueno;
    }

    public void mostrarHuron() {
        System.out.println(
                "El nombre del Huron es: " + getnombre() + "\n" + "Su raza es: " + getraza() + "\n" + "Se alimenta de: "
                        + getalimento() + "\n" + "su edad es: " + getedad() + "\n" + "Duerme durante: " + sueno +"hrs " + "\n");
    }

}