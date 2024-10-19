package ejercicio2coninterfaces;

public class AppBanco {

	public static void main(String[] args) {
		// Crear las cuentas con los titulares
		Corriente cuentaCorriente = new Corriente(1001, "Jorge Garcia", 5000);
		Ahorro cuentaAhorro = new Ahorro(1002, "Santi Valledupa", 200);
		Vivienda cuentaVivienda = new Vivienda(1003, "Camilo en Tunjakistan");
		Nomina cuentaNomina = new Nomina(1004, "Ivan Rodriguez");

		// Realizar operaciones de depósito y retiro
		realizarDepositos(cuentaCorriente, cuentaAhorro, cuentaVivienda);
		realizarRetiros(cuentaCorriente, cuentaAhorro, cuentaNomina);
		probarRetirosSobregiro(cuentaCorriente, cuentaAhorro);
	}

	// Método para agrupar operaciones de depósito
	private static void realizarDepositos(Corriente cuentaCorriente, Ahorro cuentaAhorro, Vivienda cuentaVivienda) {
		System.out.println("Operaciones de Depósito:");
		System.out.println();

		cuentaCorriente.deposito(2000);
		System.out.println();

		cuentaAhorro.deposito(1000); // Aplica el interés del 3%
		System.out.println();

		cuentaVivienda.deposito(1500);
		System.out.println();
	}

	// Método para agrupar operaciones de retiro
	private static void realizarRetiros(Corriente cuentaCorriente, Ahorro cuentaAhorro, Nomina cuentaNomina) {
		System.out.println("Operaciones de Retiro:");
		System.out.println();

		cuentaCorriente.retiro(3000);
		System.out.println();

		cuentaAhorro.retiro(500);
		System.out.println();

		cuentaNomina.retiro(400);
		System.out.println();
	}

	// Método para probar retiros con sobregiro y fondos insuficientes
	private static void probarRetirosSobregiro(Corriente cuentaCorriente, Ahorro cuentaAhorro) {
		System.out.println("Prueba de retiro con sobregiro o fondos insuficientes:");
		System.out.println();

		cuentaCorriente.retiro(10000);
		/*
		 * Sobregiro no permitido aun falta aun falta hacer algo con esto, debe mandar
		 * que no se puede porque eso es mucha plata para alguien que no la pagara
		 */

		System.out.println();
		cuentaAhorro.retiro(5000);
		/*
		 * Fondos insuficientes, en este caso, ahorro debe tener 530 y como se le
		 * intenta sacar mas pues manda error
		 */
	}
}
