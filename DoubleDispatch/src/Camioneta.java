public class Camioneta implements Competidor {
    public String leCorreA(Competidor c) {
        return c.leCorreA(this);
    }

    public String leCorreA(Moto m) {
        return "La camioneta le corre a una moto";
    }

    public String leCorreA(Auto m) {
        return "La camioneta le corre a un auto";
    }

    public String leCorreA(Camioneta m) {
        return "La camioneta le corre a otra camioneta";
    }
}