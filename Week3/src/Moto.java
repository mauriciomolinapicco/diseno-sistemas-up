public class Moto implements Competidor{

    public String leCorreA(Competidor c){
        return c.leCorreA(this);
    }

    public String leCorreA(Auto a) {
        return "la moto le corre a un auto";
    }

    public String leCorreA(Moto m) {
        return "la moto le corre a otra moto";
    }

    public String leCorreA(Camioneta a) {
        return "la moto le corre a una camioneta";
    }
}