package Factory;

public class Constructora {

    public Edificacion hacerEdificio(TipoEdificacion t) {
        Edificacion e;

        if (t.equals(TipoEdificacion.VIVIENDA)) {
            e = new Vivienda();
        } else if (t.equals(TipoEdificacion.COMERCIO)) {
            e = new Comercio();
        } else if (t.equals(TipoEdificacion.INDUSTRIA)) {
            e = new Industria();
        } else {
            e = null; // Agregado por seguridad si no coincide ningún tipo
        }

        return e;
    }

    public Edificacion generarEdificacion(TipoEdificacion t) {
        Edificacion e = this.hacerEdificio(t);

        if (e != null) {
            e.animarConexionServicios();
            e.animarConstruccion();
        }

        return e;
    }
}

public class AnimacionEdificios {

    Constructora constructora;

    public void correrSimulacion(TipoEdificacion tipoZona) {
        Edificacion e = constructora.generarEdificacion(tipoZona);

        if (e != null) {
            e.simularFuncionamiento();
        }
    }
}
