public class App {
    public static void main(String[] args) {
        System.out.println("=== Preparando Café ===");
        PreparacionBebida cafe = new PreparacionCafe();
        cafe.prepararBebida();
        
        System.out.println("\n=== Preparando Té ===");
        PreparacionBebida te = new PreparacionTe();
        te.prepararBebida();
    }
}
