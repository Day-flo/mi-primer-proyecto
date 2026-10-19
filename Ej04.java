import java.util.Scanner;


public class Ej04 {
   public static void main(String[] args) {
       System.out.println("convertir kilometros en millas");

   
       //creamos en scanner
       Scanner sc = new Scanner(System.in);
      
       System.out.println("ingresamos una cantidad en kilometros para convertirla en millas");
       double cifraKilometro = sc.nextDouble();


       final double millasEquivalente = 1.609;


       //calculamos
       double kilometrosEnmillas = cifraKilometro / millasEquivalente;


       //mostrar el resultado
       System.err.println(cifraKilometro + "kilometros convertidos en millas equivalen a " + kilometrosEnmillas + "millas. ");


       sc.close();
   }


  
}


