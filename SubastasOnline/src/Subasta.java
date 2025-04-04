import java.util.ArrayList;
import java.util.List;

public class Subasta {
    private String articulo;
    private double precioActual;
    private double precioDeseado;
    private Usuario creador;
    private Usuario ofertanteActual;
    private List<Usuario> usuarios = new ArrayList<>();
    private boolean abierta = true;

    public Subasta(String articulo, double precioInicial, Usuario creador, double precioDeseado) {
        this.articulo = articulo;
        this.precioActual = precioInicial;
        this.creador = creador;
        this.precioDeseado = precioDeseado;
        this.usuarios.add(creador);
    }


    public void notificarUsuarios(String message) {
        for (Usuario usuario : this.usuarios) {
            usuario.notificar(message);
        }
    }


    public void notificarOferta() {
        notificarUsuarios(this.ofertanteActual.getName() + 
        " hizo una nueva oferta por el articulo " + this.articulo + 
        " por $" + this.precioActual);
    }


    public void nuevaOferta(double monto, Usuario usuario) {
        if (!abierta) {
            System.out.println("La subasta ya cerro");
            return;
        }

        if (!usuarios.contains(usuario)) {
            usuarios.add(usuario);
            //lo agrego a la lista de usuarios a los que se les va a enviar notificaciones
        }

        if (monto <= precioActual) {
            System.out.println("La oferta debe ser mayor a la oferta actual: $" + precioActual);
            return;
        }
        this.ofertanteActual = usuario;
        this.precioActual = monto;
        if (monto >= precioDeseado) {
            cerrarSubasta();
            return;
        }
        
        notificarOferta();
        return;
    }


    public void cerrarSubasta() {
        if (!abierta) {
            System.out.println("Ya esta cerrada...");
            return;
        }
        this.abierta = false;
        notificarUsuarios("La subasta por " + this.articulo + " esta cerrada.");

        if (ofertanteActual != null) {
            ofertanteActual.notificar("Felicitaciones! Ganaste la subasta por "+ this.articulo + 
                " por el monto de " + this.precioActual);
        }

        creador.notificar("La subasta por " + this.articulo + " cerro por $" + this.precioActual);
    }


    public Usuario getCreador() {
        return this.creador;
    }


    public void retirarUsuario(Usuario usuario) {
        if (usuarios.contains(usuario)) {
            usuarios.remove(usuario);
        }
    }

}
