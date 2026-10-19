import java.util.Scanner;

public class Ej09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = sc.nextDouble();

        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El area es: " + area);

        sc.close();
    }
}