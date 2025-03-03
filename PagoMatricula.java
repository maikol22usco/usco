import java.util.Scanner;

public class PagoMatricula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el tipo de programa (T para tecnología, P para profesional): ");
        String tipoPrograma = scanner.next();

        
        System.out.print("Ingrese el promedio del alumno: ");
        double promedio = scanner.nextDouble();

        
        int materiasReprobadas = 0;
        if (tipoPrograma.equalsIgnoreCase("T") && promedio <= 7) {
            System.out.print("Ingrese el número de materias reprobadas: ");
            materiasReprobadas = scanner.nextInt();
        }

        
        int creditos = 0;
        double descuento = 0;

        
        if (tipoPrograma.equalsIgnoreCase("T")) {
            if (promedio >= 9.5) {
                creditos = 55;
                descuento = 0.25;
            } else if (promedio >= 9) {
                creditos = 50;
                descuento = 0.10;
            } else if (promedio > 7) {
                creditos = 50;
                descuento = 0;
            } else if (materiasReprobadas <= 3) {
                creditos = 45;
                descuento = 0;
            } else {
                creditos = 40;
                descuento = 0;
            }
        } else if (tipoPrograma.equalsIgnoreCase("P")) {
            if (promedio >= 9.5) {
                creditos = 55;
                descuento = 0.20;
            } else {
                creditos = 55;
                descuento = 0;
            }
        }

        
        double costoPorCincoCreditos = tipoPrograma.equalsIgnoreCase("T") ? 18000 : 30000;
        double costoTotal = (creditos / 5) * costoPorCincoCreditos;
        double costoConDescuento = costoTotal * (1 - descuento);

        
        System.out.println("\nResumen de la matrícula:");
        System.out.println("Créditos a cursar: " + creditos);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Costo total de la matrícula: $" + costoConDescuento);

        scanner.close();
    }
}