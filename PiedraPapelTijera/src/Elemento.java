public interface Elemento {
    String juegaContra(Elemento e);
    String juegaContra(Piedra p);
    String juegaContra(Papel p);
    String juegaContra(Tijera t);
}
