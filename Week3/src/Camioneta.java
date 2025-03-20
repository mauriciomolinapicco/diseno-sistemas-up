public class Camioneta implements Competidor{

    public String leCorreA(Competidor c){
        return c.leCorreA(this);
    }

    public String leCorreA(Auto a) {
        return "la camioneta le corre a un auto";
    }

    public String leCorreA(Moto m) {
        return "la camioneta le corre a una moto";
    }

    public String leCorreA(Camioneta a) {
        return "la camioneta le corre a otra camioneta";
    }
}