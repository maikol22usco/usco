import java.util.Scanner;

public class CalculoUtilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el salario mensual del trabajador (en U$): ");
        double salario = scanner.nextDouble();

        
        System.out.print("Ingrese la antigüedad en la empresa (en años): ");
        double antiguedad = scanner.nextDouble();

        double porcentajeUtilidad = 0;
        if (antiguedad < 1) {
            porcentajeUtilidad = 0.05; // 5%
        } else if (antiguedad >= 1 && antiguedad < 2) {
            porcentajeUtilidad = 0.07; // 7%
        } else if (antiguedad >= 2 && antiguedad < 5) {
            porcentajeUtilidad = 0.10; // 10%
        } else if (antiguedad >= 5 && antiguedad < 10) {
            porcentajeUtilidad = 0.15; // 15%
        } else if (antiguedad >= 10) {
            porcentajeUtilidad = 0.20; // 20%
        }
        double utilidad = salario * porcentajeUtilidad;

        
        System.out.println("\nResumen de la utilidad:");
        System.out.println("Salario mensual: U$" + salario);
        System.out.println("Antigüedad en la empresa: " + antiguedad + " años");
        System.out.println("Porcentaje de utilidad: " + (porcentajeUtilidad * 100) + "%");
        System.out.println("Utilidad anual: U$" + utilidad);

        scanner.close();
    }
}