import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce las horas: ");
        int horas = sc.nextInt();

        System.out.print("Introduce los minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Introduce los segundos: ");
        int segundos = sc.nextInt();

        int totalSegundos = horas * 3600 + minutos * 60 + segundos;

        System.out.println("El total de segundos es: " + totalSegundos);

        sc.close();
    }
}