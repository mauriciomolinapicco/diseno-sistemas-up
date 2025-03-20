public class Piedra implements Elemento {
    public String toString() {
        return "Piedra";
    }
    public String juegaContra(Elemento e) {
        // TODO Auto-generated method stub
        return e.juegaContra(this);
    }
    public String juegaContra(Piedra p) {
        // TODO Auto-generated method stub
        return "EMPATE";
    }
    public String juegaContra(Papel p) {
        // TODO Auto-generated method stub
        return "PERDISTE. Piedra pierde contra papel";
    }
    public String juegaContra(Tijera t) {
        // TODO Auto-generated method stub
        return "GANASTE. Piedra gana contra tijera.";
    }
}
