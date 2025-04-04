public class Cuenta {
    private double saldo;
    private CalculoComision comisionStrategy;
    private String nombreTitular;
    
    public Cuenta(CalculoComision comisionStrategy, String nombreTitular) {
        this.saldo = 0;
        this.comisionStrategy = comisionStrategy;
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public void retirar(double monto) throws InsufficientFundsException {
        if (saldo >= monto) {
            this.saldo -= monto;
        } else {
            throw new InsufficientFundsException("La cuenta no tiene los suficientes fondos para retirar $" + monto);
        }
    }

    public void setComisionStrategy(CalculoComision comisionStrategy) {
        this.comisionStrategy = comisionStrategy;
    }

    public void transferir(Cuenta cuenta, double monto) {
        System.out.println("Tranfiriendo $" + monto + " de la cuenta de " + this.nombreTitular + " a la de " + cuenta.nombreTitular);
        double comision = this.comisionStrategy.calcularComision(monto);
        try {
            this.retirar(monto + comision);
            cuenta.depositar(monto);
        } catch (InsufficientFundsException e) {
            System.out.println("La transaccion fallo: " + e.getMessage());
        }
    }
}
