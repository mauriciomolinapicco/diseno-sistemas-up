public class Avion implements IntegranteAeropuerto {

    private TorreControl torre = new TorreControlEzeiza();

    @Override
    public void recibirOrder(String orden) {
        System.out.println("Soy un avion y recibi la orden: " + orden);
        System.out.println("cumplido");
        enviarConfirmacionOrdenCumplida();
    }

    @Override
    public void enviarConfirmacionOrdenCumplida() {
        torre.recibirConfirmacionOrden();
    }
}
