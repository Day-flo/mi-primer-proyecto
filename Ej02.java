import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dinero que hay en la caja: ");
        double dinero = sc.nextDouble();

        System.out.print("Gastos de este mes: ");
        double gastos = sc.nextDouble();

        double restante = dinero - gastos;

        System.out.println("Dinero que queda en la caja: " + restante);

        sc.close();
    }
}
