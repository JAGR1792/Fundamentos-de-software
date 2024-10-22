package ejercicio2coninterfaces;
import java.time.LocalDate;

public class Nomina extends Cuenta implements IRetiro {
    private String empresa;
    private LocalDate fechaUltimoRetiro;

    public Nomina(int numeroCuenta, Titular titular, String empresa, int anioApertura) {
        super(numeroCuenta, titular, anioApertura);
        this.empresa = empresa;
        this.fechaUltimoRetiro = LocalDate.now(); // Fecha actual
    }

    @Override
    public void retiro(long valor) {
        if (valor > 0) {
            this.saldo = 1000;
            long saldoAnterior = this.saldo;
            this.saldo -= valor;
            fechaUltimoRetiro = LocalDate.now(); // Actualizar fecha
            System.out.println("Retiro exitoso en cuenta de Nómina.");
            System.out.println("Titular: " + this.titular);
            System.out.println("Saldo anterior: " + saldoAnterior);
            System.out.println("Monto retirado: " + valor);
            System.out.println("Saldo actual: " + this.saldo);
        } else {
            System.out.println("Error: No se puede retirar un valor negativo o cero.");
        }
    }
}
