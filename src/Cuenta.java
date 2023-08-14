import java.util.Random;

public class Cuenta {
    private double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;

    public Cuenta(String nombreDelTitular, double saldoDeCuenta) {
        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;
        this.numeroDeCuenta = generarNumeroCuentaAleatorio();
    }

    public void setIngreso(double cantidad) {
        saldoDeCuenta += cantidad;
    }

    public void setReintegro(double cantidad) {
        if (cantidad <= saldoDeCuenta) {
            saldoDeCuenta -= cantidad;
        } else {
            System.out.println("Saldo insuficiente para realizar el reintegro.");
        }
    }

    public double getSaldoCuenta() {
        return saldoDeCuenta;
    }

    public String getDatosCuenta() {
        return "Titular: " + nombreDelTitular +
                "\nNúmero de cuenta: " + numeroDeCuenta +
                "\nSaldo: " + saldoDeCuenta;
    }

    private long generarNumeroCuentaAleatorio() {
        Random rand = new Random();
        return Math.abs(rand.nextLong());
    }

    public long getNumeroDeCuenta() {
        return 0;
    }
}
