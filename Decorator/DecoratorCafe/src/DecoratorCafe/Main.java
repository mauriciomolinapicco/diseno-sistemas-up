package DecoratorCafe;

public class Main {
	public static void main(String[] args) {
		Cafe cafe = new AgregadoCrema(new AgregadoJarabe(new TostadoIntenso()));
		System.out.println("Precio total del cafe: " + cafe.precio());
		
		Cafe cafe2 = new AgregadoLeche(new TostadoSuave());
		System.out.println("Precio del segundo cafe: " + cafe2.precio());
	}
}
