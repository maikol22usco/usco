import java.util.Scanner;

public class ClasificacionJubilacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad de la persona
        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        // Solicitar la antigüedad en el empleo
        System.out.print("Ingrese la antigüedad en el empleo (en años): ");
        int antiguedad = scanner.nextInt();

        
        String tipoJubilacion = "";
        if (edad >= 60 && antiguedad < 25) {
            tipoJubilacion = "Jubilación por edad";
        } else if (edad < 60 && antiguedad >= 25) {
            tipoJubilacion = "Jubilación por antigüedad joven";
        } else if (edad >= 60 && antiguedad >= 25) {
            tipoJubilacion = "Jubilación por antigüedad adulta";
        } else {
            tipoJubilacion = "No cumple con los requisitos para jubilación";
        }

        
        System.out.println("La persona tiene derecho a: " + tipoJubilacion);

        scanner.close();
    }
}