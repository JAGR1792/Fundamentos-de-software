package ejercicio2coninterfaces;
public class Ahorro extends Cuenta implements IDeposito, IRetiro {
    private long interes;

    public Ahorro(int numeroCuenta, Titular titular, long interes, int anioApertura) {
        super(numeroCuenta, titular, anioApertura);
        this.interes = interes;
    }

    @Override
    public void deposito(long valor) {
        if (valor > 0) {
            long saldoAnterior = this.saldo;
            long interes = (long) (valor * 0.03); // 3% de interés
            this.saldo += valor + interes;
            System.out.println("Depósito exitoso en cuenta de Ahorro.");
            System.out.println("Titular: " + this.titular);
            System.out.println("Saldo anterior: " + saldoAnterior);
            System.out.println("Monto depositado: " + valor + " (Interés ganado: " + interes + ")");
            System.out.println("Saldo actual: " + this.saldo);
        } else {
            System.out.println("Error: No se puede depositar un valor negativo o cero.");
        }
    }

    @Override
    public void retiro(long valor) {
        if (valor > 0 && this.saldo >= valor) {
            long saldoAnterior = this.saldo;
            this.saldo -= valor;
            System.out.println("Retiro exitoso en cuenta de Ahorro.");
            System.out.println("Titular: " + this.titular);
            System.out.println("Saldo anterior: " + saldoAnterior);
            System.out.println("Monto retirado: " + valor);
            System.out.println("Saldo actual: " + this.saldo);
        } else {
            System.out.println("Error: Fondos insuficientes o valor inválido.");
        }
    }
}