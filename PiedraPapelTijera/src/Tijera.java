public class Tijera implements Elemento{
    public String toString() {
        return "Tijera";
    }
    public String juegaContra(Elemento e) {
        // TODO Auto-generated method stub
        return e.juegaContra(this);
    }
    public String juegaContra(Piedra p) {
        // TODO Auto-generated method stub
        return "PERDISTE. Tijera pierde contra piedra";
    }
    public String juegaContra(Papel p) {
        // TODO Auto-generated method stub
        return "GANASTE. Tijera gana contra Piedra";
    }
    public String juegaContra(Tijera t) {
        // TODO Auto-generated method stub
        return "EMPATE";
    }
}
