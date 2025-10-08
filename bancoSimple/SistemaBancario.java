import java.util.ArrayList;
import java.util.List;

class CuentaBancaria {
    private static int contadorCuentas = 1;
    private int id;
    private String titular;
    private double saldo;
    private List<Transaccion> transacciones;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.id = contadorCuentas++;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.transacciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            transacciones.add(new Transaccion("Depósito", monto, this));
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            transacciones.add(new Transaccion("Retiro", monto, this));
        }
    }

    public void mostrarInformacion() {
        System.out.println("Cuenta ID: " + id + ", Titular: " + titular + ", Saldo: $" + saldo);
        System.out.println("Transacciones:");
        for (Transaccion t : transacciones) {
            System.out.println("  " + t);
        }
        System.out.println();
    }
}

class Transaccion {
    private static int contadorTransacciones = 1;
    private int id;
    private String tipoOperacion;
    private double monto;
    private CuentaBancaria cuentaAsociada;

    public Transaccion(String tipoOperacion, double monto, CuentaBancaria cuenta) {
        this.id = contadorTransacciones++;
        this.tipoOperacion = tipoOperacion;
        this.monto = monto;
        this.cuentaAsociada = cuenta;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Tipo: " + tipoOperacion + ", Monto: $" + monto + ", Cuenta ID: " + cuentaAsociada.getId();
    }
}

public class SistemaBancario {
    public static void main(String[] args) {
        // Crear cuentas
        CuentaBancaria cuentaAna = new CuentaBancaria("Ana", 5000);
        CuentaBancaria cuentaLuis = new CuentaBancaria("Luis", 10000);

        // Operaciones
        cuentaAna.depositar(2000);
        cuentaAna.retirar(1000);

        cuentaLuis.retirar(3000);
        cuentaLuis.depositar(1500);

        // Mostrar información
        cuentaAna.mostrarInformacion();
        cuentaLuis.mostrarInformacion();
    }
}