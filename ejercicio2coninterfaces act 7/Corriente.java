package ejercicio2coninterfaces;
import java.time.LocalDate;

public class Corriente extends Cuenta implements IDeposito, IRetiro {
    private long sobregiro;
    private LocalDate fechaUltimoMovimiento;

    public Corriente(int numeroCuenta, Titular titular, long sobregiro, int anioApertura) {
        super(numeroCuenta, titular, anioApertura);
        this.sobregiro = sobregiro;
        this.fechaUltimoMovimiento = LocalDate.now(); // Fecha actual
    }

    @Override
    public void deposito(long valor) {
        if (valor > 0) {
            long saldoAnterior = this.saldo;
            this.saldo += valor;
            fechaUltimoMovimiento = LocalDate.now(); // Actualizar fecha
            System.out.println("Depósito exitoso en cuenta Corriente.");
            System.out.println("Titular: " + this.titular);
            System.out.println("Saldo anterior: " + saldoAnterior);
            System.out.println("Monto depositado: " + valor);
            System.out.println("Saldo actual: " + this.saldo);
        } else {
            System.out.println("Error: No se puede depositar un valor negativo o cero.");
        }
    }

    @Override
    public void retiro(long valor) {
        if (valor > 0 && this.saldo + sobregiro >= valor) {
            long saldoAnterior = this.saldo;
            this.saldo -= valor;
            fechaUltimoMovimiento = LocalDate.now(); // Actualizar fecha
            System.out.println("Retiro exitoso en cuenta Corriente.");
            System.out.println("Titular: " + this.titular);
            System.out.println("Saldo anterior: " + saldoAnterior);
            System.out.println("Monto retirado: " + valor);
            System.out.println("Saldo actual: " + this.saldo);
        } else {
            System.out.println("Intentos de movimientos en la cuenta Corriente:");
            System.out.println("Titular: " + this.titular);
            System.out.println("Error: Fondos insuficientes o sobregiro excedido.");
        }
    }
}
