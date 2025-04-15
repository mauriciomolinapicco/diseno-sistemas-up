import java.util.ArrayList;
import java.util.List;

public class ConcreteGrupo implements Grupo {

    private List<Integrante> integrantes = new ArrayList<>();
    private Integrante administrador;

    @Override
    public void setAdmin(Integrante administrador) {
        this.administrador = administrador;
        if (!integrantes.contains(administrador)) {
            integrantes.add(administrador);
        }
    }

    @Override
    public void broadcastMensaje(String mensaje, Integrante i) {
        System.out.println("Enviando mensaje de " + i.getNombre() + ": " + mensaje);
        String str = i.getNombre() + ": " + mensaje;  

        if (integrantes.isEmpty()) {
            System.out.println("No hay integrantes en el grupo para enviar el mensaje.");
        } else {
            for (Integrante integrante : integrantes) {
                integrante.recibirMensaje(str);
            }
        }
    }

    @Override
    public void broadcastMensaje(String mensaje, ConcreteIntegrante i, Integrante etiquetado) {
        String str = "@" + etiquetado.getNombre() + " " + mensaje;
        broadcastMensaje(str, i);
    }

    @Override
    public void anadirIntegrante(Integrante i, Integrante creador) {
        if (creador == administrador) {
            integrantes.add(i);
            System.out.println("Integrante anadido: " + i.getNombre());  
        } else {
            System.out.println(creador.getNombre() + ": no eres administrador, por lo que no puedes agregar participantes");
        }
        
    }

    @Override
    public void removerIntegrante(Integrante i) {
        if (integrantes.contains(i)) {
            integrantes.remove(i);
            broadcastMensaje(i.getNombre() + " se ha retirado del grupo", i);
        } else {
            System.out.println(i.getNombre() + " no está en el grupo.");
        }
        }
}