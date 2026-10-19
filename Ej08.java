import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Introduce el porcentaje de descuento: ");
        double porcentaje = sc.nextDouble();

        double descuento = precio * porcentaje / 100;
        double precioFinal = precio - descuento;

        System.out.println("La cantidad descontada es: " + descuento + " euros");
        System.out.println("El precio final es: " + precioFinal + " euros");

        sc.close();
    }
}