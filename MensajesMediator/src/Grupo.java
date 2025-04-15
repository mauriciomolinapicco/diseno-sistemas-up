public interface Grupo {
    public void broadcastMensaje(String mensaje, Integrante I);
    public void broadcastMensaje(String mensaje, ConcreteIntegrante concreteIntegrante, Integrante etiquetado);
    public void anadirIntegrante(Integrante i, Integrante creador);
    public void setAdmin(Integrante admin);
    public void removerIntegrante(Integrante i);
}