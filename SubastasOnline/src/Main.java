public class Main {

    public static void main(String[] args) {
        Usuario creador = new Usuario("Pepe");
        Usuario usuario1 = new Usuario("Pepa");
        Usuario usuario2 = new Usuario("Juan");
        Usuario usuario3 = new Usuario("Ricardo");

        Subasta subasta = creador.crearSubasta("Remera de Messi", 10000, 15000);

        usuario1.hacerOferta(subasta, 12000);
        usuario2.hacerOferta(subasta, 13000);
        usuario3.hacerOferta(subasta, 14000);
        usuario1.hacerOferta(subasta, 16000);

        usuario2.hacerOferta(subasta, 17000);

        creador.cerrarSubasta(subasta);


        System.out.println("--- Segunda subasta ---");
        Subasta subasta2 = usuario1.crearSubasta("iPhone 13", 500, 800);
        usuario2.hacerOferta(subasta2, 600);
        usuario3.hacerOferta(subasta2, 700);
        usuario2.retirarse(subasta2); //se retira entonces no recibira mas notificaciones
        usuario1.cerrarSubasta(subasta2);  // El creador la cierra


    }
}
