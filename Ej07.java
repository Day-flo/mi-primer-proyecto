import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de menus de adulto: ");
        int adultos = sc.nextInt();

        System.out.print("Numero de menus infantiles: ");
        int infantiles = sc.nextInt();

        System.out.print("Numero de bebidas: ");
        int bebidas = sc.nextInt();

        double total = adultos * 12 + infantiles * 8 + bebidas * 1.5;

        System.out.println("Total a pagar: " + total + " euros");

        System.out.print("Cantidad abonada por el cliente: ");
        double abonado = sc.nextDouble();

        double cambio = abonado - total;

        System.out.println("El cambio a devolver es: " + cambio + " euros");

        sc.close();
    }
}
