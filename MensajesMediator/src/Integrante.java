
public interface Integrante {
    public void recibirMensaje(String mensaje);
    public void enviarMensaje(String mensaje);
    public void enviarMensaje(String mensaje, Integrante etiquetado);
    public String getNombre();
    public void anadirIntegrante(Integrante i);
    public void salir();
}
