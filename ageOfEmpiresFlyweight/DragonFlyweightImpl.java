package ageOfEmpiresFlyweight;

public class DragonFlyweightImpl implements PersonajeFlyweight {

    private int vida;
    private int nivelAtaque;
    private int capacidadDefensa;
    private int nivelMagia;

    public DragonFlyweightImpl() {
        this.vida = 100;
        this.nivelAtaque = 80;
        this.capacidadDefensa = 40;
        this.nivelMagia = 0;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(int ataque) {
        this.nivelAtaque = ataque;
    }

    public int getCapacidadDefensa() {
        return capacidadDefensa;
    }

    public void setCapacidadDefensa(int defensa) {
        this.capacidadDefensa = defensa;
    }

    public int getNivelMagia() {
        return nivelMagia;
    }

    public void setNivelMagia(int magia) {
        this.nivelMagia = magia;
    }

    @Override
    public String toString() {
        return "Dragon FLYWGT [vida=" + vida + ", nivelAtaque=" + nivelAtaque +
               ", capacidadDefensa=" + capacidadDefensa + ", nivelMagia=" + nivelMagia + "]";
    }
}
