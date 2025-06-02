public class App {
    public static void main(String[] args) {
        MicroondasFacade microwave = new MicroondasFacade();

        System.out.println("Descongelar:");
        System.out.println(microwave.descongelar());
        System.out.println("-----------------------------");

        System.out.println("Entibiar:");
        System.out.println(microwave.entibiar());
        System.out.println("-----------------------------");

        System.out.println("Calentar:");
        System.out.println(microwave.calentar());
    }
}
