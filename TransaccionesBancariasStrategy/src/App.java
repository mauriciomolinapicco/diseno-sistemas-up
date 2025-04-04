public class App {
    public static void main(String[] args) throws Exception {
        Cuenta c1 = new Cuenta(new CajaAhorro(), "Mauricio Molina");
        Cuenta c2 = new Cuenta(new CuentaCorriente(), "Juan Perez");
        
        c1.depositar(50000);
        System.out.println("Saldo de mauricio: $" + c1.getSaldo());
        System.out.println("Saldo de juan: $" + c2.getSaldo());

        c1.transferir(c2, 10000);
        System.out.println("Saldo de mauricio: $" + c1.getSaldo());
        System.out.println("Saldo de juan: $" + c2.getSaldo());

        // Intercambio el metodo de calculo de comisiones gracias al patron strategy
        c1.setComisionStrategy(new CuentaCorriente());

        c1.transferir(c2, 10000);
        System.out.println("Saldo de mauricio: $" + c1.getSaldo());
        System.out.println("Saldo de juan: $" + c2.getSaldo());

        //intento transferir una cantidad mayor a la que tiene
        c1.transferir(c2, 100000);
    }
}
