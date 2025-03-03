import java.util.Scanner;

public class AnalisisAnemia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la edad en meses: ");
        int edadMeses = scanner.nextInt();

        
        System.out.print("Ingrese el nivel de hemoglobina (en g%): ");
        double hemoglobina = scanner.nextDouble();

        
        String sexo = "";
        if (edadMeses > 180) { 
            System.out.print("Ingrese el sexo (M para mujer, H para hombre): ");
            sexo = scanner.next();
        }

        boolean tieneAnemia = false;
        if (edadMeses <= 1) {
            if (hemoglobina < 13 || hemoglobina > 26) {
                tieneAnemia = true;
            }
        } else if (edadMeses <= 6) {
            if (hemoglobina < 10 || hemoglobina > 18) {
                tieneAnemia = true;
            }
        } else if (edadMeses <= 12) {
            if (hemoglobina < 11 || hemoglobina > 15) {
                tieneAnemia = true;
            }
        } else if (edadMeses <= 60) { 
            if (hemoglobina < 11.5 || hemoglobina > 15) {
                tieneAnemia = true;
            }
        } else if (edadMeses <= 120) { 
            if (hemoglobina < 12.6 || hemoglobina > 15.5) {
                tieneAnemia = true;
            }
        } else if (edadMeses <= 180) { 
            if (hemoglobina < 13 || hemoglobina > 15.5) {
                tieneAnemia = true;
            }
        } else {
            if (sexo.equalsIgnoreCase("M")) {
                if (hemoglobina < 12 || hemoglobina > 16) {
                    tieneAnemia = true;
                }
            } else if (sexo.equalsIgnoreCase("H")) {
                if (hemoglobina < 14 || hemoglobina > 18) {
                    tieneAnemia = true;
                }
            }
        }

        
        if (tieneAnemia) {
            System.out.println("Resultado: Positivo para anemia.");
        } else {
            System.out.println("Resultado: Negativo para anemia.");
        }

        scanner.close();
    }
}