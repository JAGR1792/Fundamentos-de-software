package ejercicio2coninterfaces;

public class Ahorro extends Cuenta implements IDeposito, IRetiro {
	private long interes;

	public Ahorro(int numeroCuenta, String titular, long interes) {
		super(numeroCuenta, titular);
		this.interes = interes;
	}
	
	public long getInteres() {
		return interes;
	} // como en realidad no mostraremos el dato en realidad es un metodo un poco inutil

	@Override
	public void deposito(long valor) {
		if (valor > 0) {
			long saldoAnterior = this.saldo;
			long interes = (long) (valor * 0.03); // 3% de interés
			/*
			 * Cabe aclarar que falta lo de el porcentaje acumulativo, pero eso no lo
			 * entendi, no tiene sentido para mi, si uno mete mucho dinero constantemente
			 * entonces si el porcentaje crece como si fuese interes compuesto, entonces
			 * tendriamos una situacion: donde el banco pierde mucha mucha plata
			 */

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
			System.out.println("Intentos de movimientos en la cuenta de Ahorro:");
			System.out.println("Titular: " + this.titular);
			System.out.println("Error: Fondos insuficientes o valor inválido."); // asi no se les ocurre meter -500 en el deposito
		}
	}
}
