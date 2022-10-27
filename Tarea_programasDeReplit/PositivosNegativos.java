import java.util.Scanner;
class PositivosNegativos{
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numero, cantidad, p = 0, n = 0, ne = 0;
    System.out.println("Introduce la cantidad de numeros que conofrmaran tu serie");
    cantidad = teclado.nextInt();
    System.out.println(" ");
    System.out.println("importante: da click en enter por cada numero que digites, el programa te pedira que digites un numero hasta que digites la cantidad de numero que le indicaste al programa ");
    System.out.println(" ");
    for(int i = 0; i < cantidad; i++){
      System.out.println("Escriba un numero");
      numero = teclado.nextInt();
      if(numero > 0){
        p++;
      }else if(numero < 0){
        n++;
      }else if(numero == 0){
        ne++;
      }
      }
    System.out.println("hay "+ p+" numeros postivos");
    System.out.println("hay "+ n+" numeros negativos");
    System.out.println("hay "+ ne+" numeros neutros (0)");
  }
}