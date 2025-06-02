package DecoratorCafe;

public abstract class CafeDecoradorAgregados implements Cafe {
	private Cafe cafe;
	
	public CafeDecoradorAgregados(Cafe cafe) {
		this.cafe = cafe;
	}

	public int precio() {
		return this.cafe.precio();
	}
	
}
