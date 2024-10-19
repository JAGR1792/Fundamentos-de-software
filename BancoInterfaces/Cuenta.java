package ejercicio2coninterfaces;

public abstract class Cuenta {
    protected int numeroCuenta;
    protected String titular;
    protected long saldo;

    public Cuenta(int numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0; 
    }

    @Override
    public String toString() {
        return "Cuent numero: " + numeroCuenta + ", titular: " + titular + ", saldo: " + saldo;
    }
}
