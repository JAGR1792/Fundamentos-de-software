package ejercicio2coninterfaces;
public class Vivienda extends Cuenta implements IDeposito {

    public Vivienda(int numeroCuenta, String titular) {
        super(numeroCuenta, titular);
    }

    @Override
    public void deposito(long valor) {
        if (valor > 0) {
            long saldoAnterior = this.saldo;
            this.saldo += valor;
            System.out.println("Depósito exitoso en cuenta de Vivienda.");
            System.out.println("Titular: " + this.titular);
            System.out.println("Saldo anterior: " + saldoAnterior);
            System.out.println("Monto depositado: " + valor);
            System.out.println("Saldo actual: " + this.saldo);
        } else {
            System.out.println("Error: No se puede depositar un valor negativo o cero.");
        }
    }
}
