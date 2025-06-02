package CompositeArchivos;

public class Main {
    public static void main(String[] args) {
        Archivo archivo1 = new Archivo("documento.txt", 100);
        Archivo archivo2 = new Archivo("imagen.jpg", 500);

        Carpeta carpeta = new Carpeta("Mis Documentos");
        carpeta.addArchivo(archivo1);
        carpeta.addArchivo(archivo2);

        System.out.println("Nombre: " + archivo1.getNombre());
        System.out.println("Tamaño: " + archivo1.getTamanio() + " KB");
        System.out.println("-------");
        System.out.println("Nombre de la carpeta: " + carpeta.getNombre());
        System.out.println("Tamanio de la carpeta: " + carpeta.getTamanio());
    }
}