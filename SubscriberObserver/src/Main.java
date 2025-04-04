

public class Main {
    public static void main(String[] args) {
        // Crear el boletín
        Newsletter newsletter = new Newsletter();

        // Crear suscriptores
        Subscriber subscriber1 = new ConcreteSubscriber("Juan");
        Subscriber subscriber2 = new ConcreteSubscriber("Ana");
        Subscriber subscriber3 = new ConcreteSubscriber("Pedro");

        // Añadir suscriptores
        newsletter.addSubscriber(subscriber1);
        newsletter.addSubscriber(subscriber2);
        newsletter.addSubscriber(subscriber3);

        // Publicar una nueva actualización
        newsletter.setLatestNews("¡Gran oferta en productos electrónicos!");

        // Eliminar un suscriptor
        newsletter.removeSubscriber(subscriber2);

        // Publicar otra actualización
        newsletter.setLatestNews("¡Nueva colección de ropa disponible!");

        // Un suscriptor fue eliminado, por lo que solo recibirán las notificaciones Juan y Pedro
    }
}
