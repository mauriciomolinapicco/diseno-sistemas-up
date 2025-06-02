package CompositeArchivos;

public class Archivo implements Entidad {
	private String nombre;
	private int tamanioEnBytes;
	
	public Archivo(String nombre, int tamanio) {
		this.nombre = nombre;
		this.tamanioEnBytes = tamanio;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public int getTamanio() {
		return tamanioEnBytes;
	}
}
