public class Cuenta {
    double saldo;
    String numero;
    String tipo;

    // public Cuenta(String tipo, String numero, double saldo) {
    //     this.tipo = tipo;
    //     this.numero = numero;
    //     this.saldo = saldo;
    // }

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