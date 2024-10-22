package ejercicio2coninterfaces;
public abstract class Cuenta {
    protected int numeroCuenta;
    protected Titular titular;  
    protected long saldo;
    protected int anioApertura;

    public Cuenta(int numeroCuenta, Titular titular, int anioApertura) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0;
        this.anioApertura = anioApertura;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public Titular getTitular() {
        return titular;
    }

    public long getSaldo() {
        return saldo;
    }

    public int getAnioApertura() {
        return anioApertura;
    }

    @Override
    public String toString() {
        return "Cuenta número: " + numeroCuenta + ", titular: " + titular.getNombre() + " " + titular.getApellido() +
                ", saldo: " + saldo + ", año de apertura: " + anioApertura;
    }
}
