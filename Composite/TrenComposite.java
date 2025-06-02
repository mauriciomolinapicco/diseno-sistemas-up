package Composite;

public interface Formacion {
    String obtenerDatos();
    String avanzar();
    String detenerse();
}

public class Vagon implements Formacion {
    private String identificador;

    public Vagon(String identificador) {
        this.identificador = identificador;
    }

    public String obtenerDatos() {
        return "Int. " + identificador;
    }

    public String avanzar() {
        return identificador + " avanza";
    }

    public String detenerse() {
        return identificador + " se detiene";
    }
}

import java.util.ArrayList;

public class Tren implements Formacion {
    private String identificador;
    private ArrayList<Formacion> list = new ArrayList<>();

    public Tren(String identificador) {
        this.identificador = identificador;
    }

    public void agregarVagon(Formacion v) {
        list.add(v);
    }

    public void quitarVagon(Formacion v) {
        list.remove(v);
    }

    public String obtenerDatos() {
        StringBuilder vagones = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            vagones.append(list.get(i).obtenerDatos()).append("|");
        }

        return identificador + " > " + vagones.toString() + "Total: " + list.size();
    }

    public String avanzar() {
        return identificador + " avanza";
    }

    public String detenerse() {
        return identificador + " se detiene";
    }
}

public class Vias {
    public static void main(String[] args) {
        Formacion v = new Vagon("X01");
        System.out.println(v.obtenerDatos());
        System.out.println(v.avanzar());

        Tren t = new Tren("1001");
        Formacion v1 = new Vagon("X02");
        Formacion v2 = new Vagon("X03");

        t.agregarVagon(v1);
        t.agregarVagon(v2);

        System.out.println(t.obtenerDatos());
        System.out.println(v.detenerse());
        System.out.println(t.avanzar());
        System.out.println(v.avanzar());
    }
}
