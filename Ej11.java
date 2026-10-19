import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Introduce el valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Introduce el valor de c: ");
        double c = sc.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("El valor de a no puede ser 0.");
        } else if (discriminante < 0) {
            System.out.println("No hay soluciones reales");
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("La primera solucion es: " + x1);
            System.out.println("La segunda solucion es: " + x2);
        }

        sc.close();
    }
}
