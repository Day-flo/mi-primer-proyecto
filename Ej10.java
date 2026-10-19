import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el capital inicial: ");
        double capitalInicial = sc.nextDouble();

        System.out.print("Introduce el interes anual (%): ");
        double interes = sc.nextDouble();

        System.out.print("Introduce el numero de años: ");
        int anos = sc.nextInt();

        double capitalFinal = capitalInicial * Math.pow(1 + interes / 100, anos);

        System.out.println("El capital final es: " + capitalFinal + " euros");

        sc.close();
    }
}
