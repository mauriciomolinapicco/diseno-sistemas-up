public class AdaptadorEnchufeAmericanoArgentino {
    private EnchufeAmericano enchufeAmericano;

    public AdaptadorEnchufeAmericanoArgentino(EnchufeAmericano e) {
        this.enchufeAmericano = e;
    }

    public String enchufar(EnchufeArgentino e) {
        return e.enchufar() + " Adaptando... " + enchufeAmericano.enchufar();
    }
}

