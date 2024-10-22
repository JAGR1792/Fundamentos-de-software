package ejercicio2coninterfaces;
public class Vivienda extends Cuenta implements IDeposito {
    private long precioVivienda;
    private String tipoVivienda;

    public Vivienda(int numeroCuenta, Titular titular, long precioVivienda, String tipoVivienda, int anioApertura) {
        super(numeroCuenta, titular, anioApertura);
        this.precioVivienda = precioVivienda;
        this.tipoVivienda = tipoVivienda;
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
