import java.util.Scanner;

public class heladeria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantlimon = 0, cantnuez = 0, cantlulo = 0, cantfresa = 0, cantcrema = 0;
        boolean continua = true;

        while (continua) {
            boolean contvta = true;
            while (contvta) {
                mostrarMenuSabores();
                int sabor = sc.nextInt();
                sc.nextLine();
                switch (sabor) {
                    case 1:
                        cantlimon += cantidadVendida(sc, "Limón");
                        break;
                    case 2:
                        cantnuez += cantidadVendida(sc, "Nuez");
                        break;
                    case 3:
                        cantlulo += cantidadVendida(sc, "Lulo");
                        break;
                    case 4:
                        cantfresa += cantidadVendida(sc, "Fresa");
                        break;
                    case 5:
                        cantcrema += cantidadVendida(sc, "Crema");
                        break;
                    default:
                        System.out.println("Sabor no identificado error");
                }
                contvta =respuestaSN(sc, "¿desea incluir otro sabor? (S/N)");
            }
            continua = respuestaSN(sc, "¿desea procesar otra factura? (S/N)");
        }
        resumenVentas(cantlimon, cantnuez, cantlulo, cantfresa, cantcrema);
    }

    public static void mostrarMenuSabores() {
        System.out.println("***sabores***");
        System.out.println("1. Limón");
        System.out.println("2. Nuez");
        System.out.println("3. Lulo");
        System.out.println("4. Fresa");
        System.out.println("5. Crema");
    }

    public static int cantidadVendida(Scanner sc, String sabor) {
        System.out.println("cantidad vendida de " + sabor + ": ");
        int cantidad = sc.nextInt();
        sc.nextLine();
        return cantidad;
    }

    public static boolean respuestaSN(Scanner sc, String mensaje) {
        while (true) {
            System.out.println(mensaje);
            String respuesta = sc.nextLine().toUpperCase();
            if (respuesta.equals("S")) {
                return true;
            } else if (respuesta.equals("N")) {
                return false;
            } else {
                System.out.println("¡error!, ingrese N o S para continuar con el proceso");
            }
        }
    }

    public static void resumenVentas(int cantlimon, int cantnuez, int cantlulo, int cantfresa, int cantcrema) {
        System.out.println("sabror     Cantidad      valor");
        System.out.println("Limón      " + cantlimon + "        " + (cantlimon * 2500));
        System.out.println("nuez       " + cantnuez + "        " + (cantnuez * 2800));
        System.out.println("Lulo       " + cantlulo + "        " + (cantlulo * 2600));
        System.out.println("fresa      " + cantfresa + "        " + (cantfresa * 2000));
        System.out.println("crema      " + cantcrema + "        " + (cantcrema * 3000));
        int totalVentas = (cantlimon * 2500) + (cantnuez * 2800) + (cantlulo * 2600) + (cantfresa * 2000) + (cantcrema * 3000);
        System.out.println("Ventas Totales=" + totalVentas);
    }
}