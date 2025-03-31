public class CuentaCorriente implements CalculoComision {
    @Override
    public double calcularComision(double monto) {
        // comision del 1% mas un monto fijo de $500
        return (monto * 0.01) + 500;
    }
    
}
