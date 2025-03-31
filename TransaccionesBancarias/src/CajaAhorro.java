public class CajaAhorro implements CalculoComision{
    @Override
    public double calcularComision(double monto) {
        //comision de 3%
        return monto * 0.03;
    }
}
