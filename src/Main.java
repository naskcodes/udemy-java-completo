import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repetir = "n";
        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double temperaturaCelsius = sc.nextDouble();
            double fahrenheit = 9 * temperaturaCelsius / 5 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f",fahrenheit);
            System.out.println("\nDeseja repetir? (S/N)");
            repetir = sc.next();
        } while (repetir.equals("s"));
        sc.close();
    }
}