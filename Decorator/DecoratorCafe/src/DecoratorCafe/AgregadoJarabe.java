package DecoratorCafe;

public class AgregadoJarabe extends CafeDecoradorAgregados {

	public AgregadoJarabe(Cafe cafe) {
		super(cafe);
	}
	
	public int precio() {
		return super.precio() + 1000;
	}

}
