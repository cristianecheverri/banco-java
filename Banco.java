
import java.util.ArrayList;

public class Banco {
    ArrayList<Cuenta> cuentas;

    public Banco() {
        this.cuentas = new ArrayList<>();
    }

    public Cuenta buscarCuenta(String numero) {
        // for(int i = 0; i < this.cuentas.size(); i++) {
        //     if (numero.equals(cuentas.get(i).getNumero())) {
        //         return this.cuentas.get(i);
        //     }
        // }

        for (Cuenta cuenta : this.cuentas) {
            if (cuenta.getNumero().equals(numero)) {
                return cuenta;
            }
        }
        return null;
    }

    public boolean adicionarCuenta(String numero, double saldoInicial, String tipo) {
        // if (this.buscarCuenta(numero) != null) {
        //     return false;
        // } else {
        //     Cuenta cuenta = new Cuenta(tipo, numero, saldoInicial);
        //     cuentas.add(cuenta);
        //     return true;
        // }

        Cuenta cuentaBuscar = this.buscarCuenta(numero);
        if (cuentaBuscar == null) {
            Cuenta cuenta = new Cuenta(tipo, numero, saldoInicial);
            return cuentas.add(cuenta);
        } else {
            return false;
        }
    }

    public double consultarTotalDinero() {
        double total = 0;

        for (Cuenta cuenta : this.cuentas) {
            total += cuenta.consultarSaldo();
        }

        for (int i = 0; i < this.cuentas.size(); i++) {
            total += cuentas.get(i).getSaldo();
        }

        return total;
    }
}
