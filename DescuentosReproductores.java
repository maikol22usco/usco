import java.util.Scanner;

public class DescuentosReproductores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el precio sin IVA del reproductor de música (en U$): ");
        double precioSinIVA = scanner.nextDouble();

        
        System.out.print("Ingrese la marca del reproductor de música: ");
        String marca = scanner.next();

        
        double descuento = 0;

        
        if (precioSinIVA >= 500) {
            descuento += precioSinIVA * 0.10;
        }

        
        if (marca.equalsIgnoreCase("NOSY")) {
            descuento += precioSinIVA * 0.05;
        }

        
        double precioConDescuento = precioSinIVA - descuento;

        
        double iva = precioConDescuento * 0.19;

        
        double precioFinal = precioConDescuento + iva;

        
        System.out.println("\nResumen de la compra:");
        System.out.println("Precio sin IVA: U$" + precioSinIVA);
        System.out.println("Descuentos aplicados: U$" + descuento);
        System.out.println("Precio con descuento: U$" + precioConDescuento);
        System.out.println("IVA (19%): U$" + iva);
        System.out.println("Precio final (con IVA incluido): U$" + precioFinal);

        scanner.close();
    }
}
