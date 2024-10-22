package ejercicio2coninterfaces;
import java.util.ArrayList;

public class AppBanco {

    public static void main(String[] args) {
        // Crear un arreglo dinámico para las cuentas
        ArrayList<Cuenta> cuentas = new ArrayList<>();

        // Crear objetos Titular
        Titular titular1 = new Titular(1, "Jorge", "Garcia", "jorge@gmail.com");
        Titular titular2 = new Titular(2, "Santi", "de Valledupar", "santi@gmail.com");
        Titular titular3 = new Titular(3, "Camilo", "en Tunjakistan", "camilo@gmail.com");
        Titular titular4 = new Titular(4, "Ivan", "Rodriguez", "ivan@gmail.com");

        // Crear instancias de las cuentas y añadirlas al arreglo dinámico
        cuentas.add(new Corriente(1001, titular1, 5000, 2020));
        cuentas.add(new Ahorro(1002, titular2, 2, 2019));
        cuentas.add(new Vivienda(1003, titular3, 300000, "Casa", 2018));
        cuentas.add(new Nomina(1004, titular4, "Empresa ABC", 2021));

        // Mostrar los datos de las cuentas en el formato solicitado
        System.out.println("Datos de las cuentas en el banco:");
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta.getNumeroCuenta() + " - " +
                               cuenta.getAnioApertura() + " - " +
                               cuenta.getTitular().getNombre() + " " +
                               cuenta.getTitular().getApellido() + " - " +
                               cuenta.getClass().getSimpleName());
        }
    }
}
