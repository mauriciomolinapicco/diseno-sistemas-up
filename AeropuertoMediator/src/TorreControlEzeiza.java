import java.util.ArrayList;
import java.util.List;

public class TorreControlEzeiza implements TorreControl{

    private List<IntegranteAeropuerto> integrantes = new ArrayList();

    @Override
    public void darOrden(IntegranteAeropuerto i, String orden) {
        IntegranteAeropuerto x = integrantes.get(integrantes.lastIndexOf(i));
        x.recibirOrder(orden);
    }

    @Override
    public void recibirConfirmacionOrden() {
        System.out.println("TC Ezeiza: registro orden cumplida...\n");

    }

    @Override
    public void agregarIntegrante(IntegranteAeropuerto i) {
      integrantes.add(i);
    }
    
}
