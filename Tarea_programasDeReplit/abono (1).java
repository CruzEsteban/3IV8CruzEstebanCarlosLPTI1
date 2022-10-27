import java.util.Scanner;
class abono{
  public static void main(String[] args) {
    System.out.println("Cruz Esteban Carlos");
    System.out.println("3IV8");
    Scanner teclado = new Scanner(System.in);
    int Edad, Respuesta;
    System.out.println("Introduce tu edad");
    Edad = teclado.nextInt();
    if (Edad >= 65){
      System.out.println("Tu abono tendra 40% de descuento");
    }else if (Edad <= 21){
      System.out.println("¿Tus padres son socios? (Si tu respuesta es si escribe 1 y si tu respuesta es no escribe 2)");
      Respuesta = teclado.nextInt();
      if(Respuesta == 1){
        System.out.println("Tu abono tendra 45% de descuento");
      }else if (Respuesta == 2){
        System.out.println("Tu abono tendra 25% de descuento");
      }
      
    }else if (65 >= Edad && Edad >= 21){
      System.out.println("Tu abono no tendra descuento");
    } 
  }
}