package DecoratorCafe;

public class AgregadoLeche extends CafeDecoradorAgregados {

	public AgregadoLeche(Cafe cafe) {
		super(cafe);
	}
	
	public int precio() {
		return super.precio() + 700;
	}

}
