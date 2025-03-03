import java.util.Scanner;

public class CompraPiezas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el monto total de la compra (en $): ");
        double montoTotal = scanner.nextDouble();

       
        double inversionPropia = 0;
        double prestamoBanco = 0;
        double creditoFabricante = 0;
        double intereses = 0;

        
        if (montoTotal > 500000) {
            inversionPropia = montoTotal * 0.55;
            prestamoBanco = montoTotal * 0.30;
            creditoFabricante = montoTotal * 0.15;
        } else {
            inversionPropia = montoTotal * 0.70;
            creditoFabricante = montoTotal * 0.30;
        }

        
        intereses = creditoFabricante * 0.20;

       
        System.out.println("\nResumen de la compra:");
        System.out.println("Monto total de la compra: $" + montoTotal);
        System.out.println("Inversión propia: $" + inversionPropia);
        if (montoTotal > 500000) {
            System.out.println("Préstamo al banco: $" + prestamoBanco);
        }
        System.out.println("Crédito al fabricante: $" + creditoFabricante);
        System.out.println("Intereses cobrados por el fabricante: $" + intereses);

        scanner.close();
    }
}