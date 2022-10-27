import java.util.Scanner;

class Menu {
  
  Scanner entrada = new Scanner(System.in);
  char op;

  public void menu() {
    System.out.println("Bienvenido/a a la tienda de mascotas");

    System.out.println("elije una de las mascotas para saber su información");
    System.out.println(" ");
    System.out.println("a- Perro");
    System.out.println("b- Gato");
    System.out.println("c- Conejo");
    System.out.println("d- Hamster");
    System.out.println("e- Huron");
    op = entrada.next().charAt(0);
    System.out.println(" ");
    

    switch (op) {
      case 'a':
      Perro dog = new Perro("manchas", "chihuahua", "croquetas", 3, "hace guaf pero bien castroso");
      dog.mostrarPerro();
        break;
      case 'b':
      Gato cat = new Gato("Kitty", "Balinés", "Whiskas", 6, 5);
      cat.mostrarGato();
        break;
      case 'c':
      Conejo rab = new Conejo("Bola de nieve", "Belier", "Heno", 2, 1);
        
      rab.mostrarConejo();
        break;
      case 'd':
      Hamster ham = new Hamster("Pelusa", "enano ruso", "Frutas", 1, "Muuuuuuy alto");
      ham.mostrarHamster();
        break;
      case 'e':
      Huron hur= new Huron("Renni", "de Angora","CONEJOOOS!!!", 7, 15);
      hur.mostrarHuron();
        break;
      default:
        System.out.println("opcion no valida");
    }
  }


}