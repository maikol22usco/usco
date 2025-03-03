import java.util.Scanner;

public class PlanificacionFinanciera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el saldo actual del capital (en U$): ");
        double saldoActual = scanner.nextDouble();

        double prestamo = 0;
        double nuevoSaldo = saldoActual;

        
        if (saldoActual < 0) {
            prestamo = 10000 - saldoActual;
            nuevoSaldo = 10000;
        } else if (saldoActual <= 20000) {
            prestamo = 20000 - saldoActual;
            nuevoSaldo = 20000;
        }

        
        if (prestamo > 0) {
            System.out.println("Se solicitará un préstamo de U$" + prestamo);
        } else {
            System.out.println("No se necesita solicitar un préstamo.");
        }

        
        double presupuesto = nuevoSaldo;
        double equipoComputo = 5000;
        double mobiliario = 2000;
        double resto = presupuesto - (equipoComputo + mobiliario);
        double insumos = resto / 2;
        double incentivos = resto / 2;

        
        System.out.println("Distribución del presupuesto:");
        System.out.println("Equipo de cómputo: U$" + equipoComputo);
        System.out.println("Mobiliario: U$" + mobiliario);
        System.out.println("Insumos: U$" + insumos);
        System.out.println("Incentivos al personal: U$" + incentivos);

        scanner.close();
    }
}
