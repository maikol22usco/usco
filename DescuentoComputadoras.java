import java.util.Scanner;

public class DescuentoComputadoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        final double PRECIO_COMPUTADORA = 500;

        
        System.out.print("Ingrese el número de computadoras que desea comprar: ");
        int cantidad = scanner.nextInt();

        
        double totalSinDescuento = cantidad * PRECIO_COMPUTADORA;

        // Calcular el descuento
        double descuento = 0;
        if (cantidad < 5) {
            descuento = totalSinDescuento * 0.10; // 10% de descuento
        } else if (cantidad >= 5 && cantidad < 10) {
            descuento = totalSinDescuento * 0.20; // 20% de descuento
        } else if (cantidad >= 10) {
            descuento = totalSinDescuento * 0.40; // 40% de descuento
        }

        // Calcular el total con descuento
        double totalConDescuento = totalSinDescuento - descuento;

        // Mostrar los resultados
        System.out.println("\nResumen de la compra:");
        System.out.println("Cantidad de computadoras: " + cantidad);
        System.out.println("Total sin descuento: U$" + totalSinDescuento);
        System.out.println("Descuento aplicado: U$" + descuento);
        System.out.println("Total con descuento: U$" + totalConDescuento);

        scanner.close();
    }
}