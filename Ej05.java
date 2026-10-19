import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Precio por hora de trabajo: ");
        double precioHora = sc.nextDouble();

        System.out.print("Numero de horas trabajadas: ");
        double horas = sc.nextDouble();

        double subtotal = precioHora * horas;
        double iva = subtotal * 0.21;
        double total = subtotal + iva;

        System.out.println("Subtotal: " + subtotal + " euros");
        System.out.println("IVA (21%): " + iva + " euros");
        System.out.println("Total a pagar: " + total + " euros");

        sc.close();
    }
}
