import java.util.Scanner;


public class Ej01 {
   public static void main(String[] args) {
       //Creamos el escaner
       Scanner Scanner = new Scanner(System.in);


       //pedir numero entero
       System.out.println("Introduce un numero entero");
       int numeroEntero = Scanner.nextInt();


       //calculamos el numero doble
       int multiplicar = numeroEntero * 2;


       //mostrar el doble
       System.out.println("el double de " + numeroEntero + " es " + multiplicar);


       //pedir numero decimal
       System.out.println("Ingresar el numero decimal para ver el resultado de dividir entre 10");
       double numeroDecimal = Scanner.nextDouble();


       //calcular la division
       double division = numeroDecimal/10;


       //mostar solucion
       System.out.println("el resultado el divir " + numeroDecimal + "entre 10 es: " + division);
       Scanner.close();
   }  
}
