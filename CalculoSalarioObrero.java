import java.util.Scanner;

public class CalculoSalarioObrero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese las horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();

        
        final int PAGO_POR_HORA = 5000;

        
        double salarioSemanal;
        if (horasTrabajadas <= 40) {
            salarioSemanal = horasTrabajadas * PAGO_POR_HORA;
        } else {
            int horasExtras = horasTrabajadas - 40;
            double pagoHorasExtras = horasExtras * (PAGO_POR_HORA * 1.20);
            salarioSemanal = (40 * PAGO_POR_HORA) + pagoHorasExtras;
        }

        System.out.println("El salario semanal es: $" + salarioSemanal);

        scanner.close();
    }
}