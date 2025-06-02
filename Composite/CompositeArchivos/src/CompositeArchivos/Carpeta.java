package CompositeArchivos;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	List<Entidad> archivos = new ArrayList<>();
	private String nombre;
	private int tamanioEnBytes;

	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.tamanioEnBytes = 20; //valor ficticio para carpeta vacia 20 bytes
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getTamanio() {
		int tamanioTotal = this.tamanioEnBytes;
		for(Entidad arch : archivos) {
			tamanioTotal += arch.getTamanio();
		}
		return tamanioTotal;
	}
	
	public void addArchivo(Entidad archivo) {
		this.archivos.add(archivo);
	}
	
	public void removeArchivo(Entidad archivo) {
		this.archivos.remove(archivo);
	}

	
}
