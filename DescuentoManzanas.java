import java.util.Scanner;

public class DescuentoManzanas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la cantidad de kilos de manzanas que desea comprar: ");
        double kilos = scanner.nextDouble();

        
        System.out.print("Ingrese el precio por kilo de manzanas (en U$): ");
        double precioPorKilo = scanner.nextDouble();

        
        double costoSinDescuento = kilos * precioPorKilo;

        
        double descuento = 0;
        if (kilos > 10) {
            descuento = costoSinDescuento * 0.20; 
        } else if (kilos > 5) {
            descuento = costoSinDescuento * 0.15; 
        } else if (kilos > 2) {
            descuento = costoSinDescuento * 0.10; 
        }

        
        double costoConDescuento = costoSinDescuento - descuento;

        
        System.out.println("\nResumen de la compra:");
        System.out.println("Cantidad de kilos: " + kilos);
        System.out.println("Precio por kilo: U$" + precioPorKilo);
        System.out.println("Costo sin descuento: U$" + costoSinDescuento);
        System.out.println("Descuento aplicado: U$" + descuento);
        System.out.println("Costo con descuento: U$" + costoConDescuento);

        scanner.close();
    }
}
