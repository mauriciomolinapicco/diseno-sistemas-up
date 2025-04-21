public class Main {
    public static void main(String[] args) {
        Forma circulo1 = new Circulo(0, 0, 5);
        Forma circulo2 = new Circulo(7, 0, 3);
        Forma rectangulo = new Rectangulo(10, 10, 5, 5);
        
        System.out.println("Círculo1 colisiona con Círculo2: " + 
                        circulo1.colisionaCon(circulo2));
        
        System.out.println("Círculo1 colisiona con Rectángulo: " + 
                        circulo1.colisionaCon(rectangulo));
        
        System.out.println("Rectángulo colisiona con Círculo1: " + 
                        rectangulo.colisionaCon(circulo1));
    }
}
