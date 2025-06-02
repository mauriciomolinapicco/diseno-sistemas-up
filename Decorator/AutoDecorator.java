public interface Automotor {
    public int calcularPrecio();
}

public class Peque implements Automotor {
    public int calcularPrecio() {
        return 110000;
    }
}

public abstract class AutomotorDecorator implements Automotor {
    private Automotor nuevoAutomotor;

    public AutomotorDecorator(Automotor nuevoAutomotor) {
        this.nuevoAutomotor = nuevoAutomotor;
    }

    public int calcularPrecio() {
        return this.nuevoAutomotor.calcularPrecio();
    }
}

public class Entrada extends AutomotorDecorator {
    public Entrada(Automotor nuevoAutomotor) {
        super(nuevoAutomotor);
    }

    public int calcularPrecio() {
        return super.calcularPrecio() + 70;
    }
}

public class Confort extends AutomotorDecorator {
    public Confort(Automotor nuevoAutomotor) {
        super(nuevoAutomotor);
    }

    @Override
    public int calcularPrecio() {
        return super.calcularPrecio() + 15000;
    }
}

public class Limited extends AutomotorDecorator {
    private EsquemaPintura esquema;

    public Limited(EsquemaPintura e, Automotor nuevoAutomotor) {
        super(nuevoAutomotor);
        this.esquema = e;
    }

    @Override
    public int calcularPrecio() {
        return super.calcularPrecio() + 50000;
    }
}

public class TestAgenciaArgenta {
    public static void main(String[] args) {
        Automotor pequeEntrada = new Entrada(new Peque());
        System.out.println(pequeEntrada.calcularPrecio());

			//aca se esta creando un auto peque, wrapped con Confort, wrapped de nuevo con Limited
        Automotor pequeLimitado = new Limited(new Confort(new Peque()));
        System.out.println(pequeLimitado.calcularPrecio());
    }
}
