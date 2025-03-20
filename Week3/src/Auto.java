public class Auto implements Competidor{

    public String leCorreA(Competidor c){
        return c.leCorreA(this);
    }

    public String leCorreA(Auto a) {
        return "el auto le corre a otro auto";
    }

    public String leCorreA(Moto m) {
        return "el auto le corre a una moto";
    }

    public String leCorreA(Camioneta a) {
        return "la auto le corre a una camioneta";
    }
}