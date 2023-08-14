public class Banco {
    private Cuenta cuenta1;
    private Cuenta cuenta2;

    public Banco(Cuenta cuenta1, Cuenta cuenta2) {
        this.cuenta1 = cuenta1;
        this.cuenta2 = cuenta2;
    }

    public void realizarTransferenciaEntreCuentas(double cantidad, Cuenta origen, Cuenta destino) {
        if (cantidad > 0 && origen != null && destino != null) {
            if (origen.getSaldoCuenta() >= cantidad) {
                origen.setReintegro(cantidad);
                destino.setIngreso(cantidad);
                System.out.println("Transferencia realizada con éxito.");
            } else {
                System.out.println("Saldo insuficiente en la cuenta de origen.");
            }
        } else {
            System.out.println("Datos de transferencia inválidos.");
        }
    }

    public void imprimirNumeroCuentas() {
        long numeroCuenta1 = cuenta1 != null ? cuenta1.getNumeroDeCuenta() : -1;
        long numeroCuenta2 = cuenta2 != null ? cuenta2.getNumeroDeCuenta() : -1;

        System.out.println("Número de cuenta 1: " + numeroCuenta1);
        System.out.println("Número de cuenta 2: " + numeroCuenta2);
    }
}
