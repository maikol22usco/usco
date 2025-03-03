import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("Ingrese números para sumar (ingrese 0 para terminar):");

        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma total es: " + suma);
        scanner.close();
    }
}