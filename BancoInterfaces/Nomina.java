package ejercicio2coninterfaces;

public class Nomina extends Cuenta implements IRetiro {

	public Nomina(int numeroCuenta, String titular) {
		super(numeroCuenta, titular);
	}

	@Override
	public void retiro(long valor) {
		if (valor > 0) {
			this.saldo = 1000;
			/*
			 * La cuenta inicia con algo de dinero porque como no se le puede depositar
			 * significa que se quedara en ceros si no la inicializamos en un valor
			 */
			long saldoAnterior = this.saldo;
			this.saldo -= valor;
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
