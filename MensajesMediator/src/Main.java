public class Main {
    public static void main(String[] args) {
        Grupo grupo = new ConcreteGrupo();

        
        Integrante juan = new ConcreteIntegrante("Juan", grupo);
        Integrante maria = new ConcreteIntegrante("Maria", grupo);
        Integrante pedro = new ConcreteIntegrante("Pedro", grupo);

        //juan sera el admin
        grupo.setAdmin(juan);

        juan.anadirIntegrante(maria);
        maria.anadirIntegrante(pedro); //maria intenta anadir a pedro pero no es admin, por lo que no la va a dejar
        juan.anadirIntegrante(pedro);

        juan.enviarMensaje("Hola a todos!");  
        pedro.enviarMensaje("Me llamo Pedro");

        pedro.enviarMensaje("Acordate de comprar la carne!", juan);
        maria.salir();
    }
}