public class Usuario implements UsuarioInterface{
    private String name;

    public Usuario(String name) {
        this.name = name;
    }

    @Override
    public void notificar(String notificacion) {
        System.out.println(this.name + " tiene una nueva notificacion: " + notificacion);
    }

    public Subasta crearSubasta(String articulo, double precioInicial, double precioDeseado) {
        return new Subasta(articulo, precioInicial, this, precioDeseado);
    }

    public void cerrarSubasta(Subasta subasta) {
        if (this != subasta.getCreador()) {
            System.out.println("No sos el creador, no la podes cerrar");
            return;
        }
        subasta.cerrarSubasta();

    }

    public void hacerOferta(Subasta subasta, double monto) {
        subasta.nuevaOferta(monto, this);
    }

    public void retirarse(Subasta subasta) {
        subasta.retirarUsuario(this);
    }

    public String getName() {
        return this.name;
    }
}
