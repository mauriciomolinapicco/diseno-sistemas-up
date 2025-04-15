public class ConcreteIntegrante implements Integrante {
    private String nombre;
    private Grupo grupo;

    public ConcreteIntegrante(String nombre, Grupo grupo) {
        this.nombre = nombre;
        this.grupo = grupo;
    }


    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("Soy "+this.nombre+" y recibi el mensaje");
    }


    @Override
    public String getNombre() {
        return this.nombre;
    }


    @Override
    public void anadirIntegrante(Integrante i) {
        grupo.anadirIntegrante(i, this);
    }


    @Override
    public void enviarMensaje(String mensaje, Integrante etiquetado) {
        grupo.broadcastMensaje(mensaje, this, etiquetado);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        grupo.broadcastMensaje(mensaje, this);
    }


    @Override
    public void salir() {
        grupo.removerIntegrante(this);
    }
}
