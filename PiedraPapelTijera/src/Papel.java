public class Papel implements Elemento {
    public String toString() {
        return "Papel";
    }
    public String juegaContra(Elemento e) {
        // TODO Auto-generated method stub
        return e.juegaContra(this);
    }
    public String juegaContra(Piedra p) {
        // TODO Auto-generated method stub
        return "GANASTE. Papel le gana a piedra";
    }
    public String juegaContra(Papel p) {
        // TODO Auto-generated method stub
        return "EMPATE";
    }
    public String juegaContra(Tijera t) {
        // TODO Auto-generated method stub
        return "PERDISTE. Papel pierde contra tijera";
    }
}
