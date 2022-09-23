import java.util.Scanner;
class Binario {
  public static void main(String[] args) {
    System.out.println("Cruz Esteban Carlos 3IV8")
    Scanner teclado = new Scanner(System.in);
    String b = "";
    int numero, a;
    System.out.println("Introduce un numero para convertirlo a binario");
    numero = teclado.nextInt();
    while (numero > 0){
      a = Math.floorMod(numero, 2);
      b = a + b;
      numero = numero/2;
    }
    System.out.println("El numero introducido en su forma binaria = "+b);
  }
}