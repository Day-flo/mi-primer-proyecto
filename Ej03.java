import java.util.Scanner;


public class Ej03 {
   public static void main(String[] args) {
       System.out.println("calculo de circunferencia de un circulo");


       Scanner sc = new Scanner (System.in);
      
       final double PI = 3.1416;


       System.out.println("ingresa el radio del circulo para calcular la circunferencia");
       double radio = sc. nextDouble();
       System.out.println("el radio ingresado es: ");


       double longitudCircunferencia = 2 * radio *PI;


       System.out.println("la circunferencia del circulo del radio de " + radio + " es:" + longitudCircunferencia);
      
       sc.close();
   }
  
}



