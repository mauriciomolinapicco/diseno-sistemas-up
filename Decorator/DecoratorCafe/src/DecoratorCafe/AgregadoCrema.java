package DecoratorCafe;

public class AgregadoCrema extends CafeDecoradorAgregados {

	public AgregadoCrema(Cafe cafe) {
		super(cafe);
	}
	
	public int precio() {
		return super.precio() + 1200;
	}

}
