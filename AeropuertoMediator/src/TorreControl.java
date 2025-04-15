public interface TorreControl {
    public void darOrden(IntegranteAeropuerto i, String orden);
    public void recibirConfirmacionOrden();
    public void agregarIntegrante(IntegranteAeropuerto i);
}