public class Animal {
  
  private String nombre, raza, alimento;
  private int edad;
  
  public Animal() {

  }

  public Animal(String nombre, String raza, String alimento, int edad) {

  this.nombre = nombre;
  this.raza = raza;
  this.alimento = alimento;
  this.edad = edad;
  }

  public String getnombre() {
    return nombre;
  }

  public void setnombre(String nombre) {
    this.nombre = nombre;
  }

  public String getraza() {
    return raza;
  }

  public void setraza(String raza) {
    this.raza = raza;
  }

  public String getalimento() {
    return alimento;
  }

  public void setalimento(String alimento) {
    this.alimento = alimento;
  }

  public int getedad() {
    return edad;
  }

  public void setedad(int edad) {
    this.edad = edad;
  }
}
