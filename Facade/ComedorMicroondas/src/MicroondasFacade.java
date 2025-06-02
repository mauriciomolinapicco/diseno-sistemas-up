public class MicroondasFacade {
    private Potencia potencia;
    private Rotacion rotacion;
    private TiempoCoccion coccion;
    
    public MicroondasFacade() {
        this.potencia = new Potencia();
        this.rotacion = new Rotacion();
        this.coccion = new TiempoCoccion();
    }

    public String descongelar() {
        String mensaje = this.potencia.darPotencia(3);
        mensaje += this.rotacion.girar(4);
        mensaje += this.coccion.cocinarXTiempo(5);
        return mensaje;
    }

    public String entibiar() {
        String mensaje = this.potencia.darPotencia(4);
        mensaje += this.rotacion.girar(3);
        mensaje += this.coccion.cocinarXTiempo(2);
        return mensaje;
    }

    public String calentar() {
        String mensaje = this.potencia.darPotencia(9);
        mensaje += this.rotacion.girar(2);
        mensaje += this.coccion.cocinarXTiempo(3);
        return mensaje;
    }

}
