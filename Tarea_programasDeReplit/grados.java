import java.util.Scanner;
class grados {
  public static void main(String[] args) {
    System.out.println("Cruz Esteban Carlos 3IV8");
    System.out.println(" ");
    Scanner teclado = new Scanner(System.in);
    Double f, r, b = 273.15, c = 459.67;
    int a;
    System.out.println("Ingrese la temperatura que quiera transformar, esta estará en grados Farenheit (°F)");
    f = teclado.nextDouble();
    System.out.println("¿A que tipo de grado lo quiere transformar? ingrese el número correspondiente al tipo de grado que quiera");
    System.out.println("Celsius (°c) -> 1");
    System.out.println("Kelvin (°K) -> 2");
    System.out.println("Rankine (°R) -> 3");
    
    a = teclado.nextInt();

    if (a == 1){
      r = (f - 32) * 5/9;
      System.out.println(f+"°F = "+r+"°C");
    }else if (a == 2) {
      r = (f - 32) * 5/9 + b;
      System.out.println(f+"°F = "+r+"°K");  
    }else if (a == 3){
      r = f + c;
      System.out.println(f+"°F = "+r+"°R");
    }   
  }
}