import java.util.Scanner;

public class PromocionLlantas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la cantidad de llantas que desea comprar: ");
        int cantidad = scanner.nextInt();

        
        double precioUnitario;
        if (cantidad < 5) {
            precioUnitario = 100; 
        } else if (cantidad >= 5 && cantidad <= 10) {
            precioUnitario = 75; 
        } else {
            precioUnitario = 50; 
        }

        
        double costoTotal = cantidad * precioUnitario;

        
        System.out.println("\nResumen de la compra:");
        System.out.println("Cantidad de llantas: " + cantidad);
        System.out.println("Precio por llanta: U$" + precioUnitario);
        System.out.println("Costo total: U$" + costoTotal);

        scanner.close();
    }
}