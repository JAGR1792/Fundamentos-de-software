package ejercicio2coninterfaces;

public class Corriente extends Cuenta implements IDeposito, IRetiro {
	private long sobregiro;

	public Corriente(int numeroCuenta, String titular, long sobregiro) {
		super(numeroCuenta, titular);
		this.sobregiro = sobregiro;
	}

	@Override
	public void deposito(long valor) {
		if (valor > 0) {
			long saldoAnterior = this.saldo;
			this.saldo += valor;
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
			System.out.println("Retiro exitoso en cuenta Corriente.");
			System.out.println("Titular: " + this.titular);
			System.out.println("Saldo anterior: " + saldoAnterior);
			System.out.println("Monto retirado: " + valor);
			System.out.println("Saldo actual: " + this.saldo);
		} else {
			System.out.println("Intentos de movimientos en la cuenta Corriente:");
			System.out.println("Titular: " + this.titular);
			System.out.println("Error: Fondos insuficientes o sobregiro excedido.");
			/*
			 * Esto asegura que la suma del saldo actual (this.saldo) y el sobregiro
			 * permitido sea mayor o igual al valor a retirar, porque en nuestro banco no
			 * vamos a prestar mucha plata a gente que no la puede pagar. eso mismito
			 * sucedio en la caida de la bolsa de los Estados Unidos en 2008, prestaron
			 * mucha plata a gente que no tenia como pagarla
			 */
		}
	}
}
