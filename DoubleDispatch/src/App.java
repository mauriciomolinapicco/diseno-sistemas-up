public class App {
    public static void main(String[] args) throws Exception {
        Competidor moto = new Moto();
        Competidor camioneta = new Camioneta();
        Competidor auto = new Auto();
        Competidor c = new Auto();  // Puedes cambiar esto a cualquier vehículo

        // Imprimir las competiciones
        System.out.println(c.leCorreA(moto));       // El auto compite contra la moto
        System.out.println(c.leCorreA(camioneta));  // El auto compite contra la camioneta
        System.out.println(c.leCorreA(auto));       // El auto compite contra otro auto
    }
}
