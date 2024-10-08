public class Cuenta {
    double saldo;
    String numero;
    String tipo;

    public Cuenta() {
        this("Ahorros", "", 0);
    }

    public Cuenta(String tipo, String numero, double saldo) {
        this.tipo = tipo;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Cuenta(String tipo, String numero) {
        this(tipo, numero, 0);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    double consultarSaldo() {
        return saldo;
    }

    boolean retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    void consignar(double cantidad) {
        saldo += cantidad;
    }
}