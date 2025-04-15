public class App {
    public static void main(String[] args) throws Exception {
        TorreControl tc = new TorreControlEzeiza();

        Avion avion = new Avion();
        Helicoptero h = new Helicoptero();
        VehiculoTierra v = new VehiculoTierra();

        tc.agregarIntegrante(avion);
        tc.agregarIntegrante(h);
        tc.agregarIntegrante(v);

        tc.darOrden(v,"despejar pista");
        tc.darOrden(h, "Espera que aterrice el avion");
        tc.darOrden(avion, "aterriza");
        tc.darOrden(v,"atende al avion");
    }
}
