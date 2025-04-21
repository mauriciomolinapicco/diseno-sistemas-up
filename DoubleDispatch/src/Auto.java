public class Auto implements Competidor {

    public String leCorreA(Competidor c) {
        return c.leCorreA(this);
    }

    public String leCorreA(Moto m) {
        return "El auto le corre a la moto";
    }

    public String leCorreA(Auto m) {
        return "El auto le corre a OTRO auto";
    }

    public String leCorreA(Camioneta m) {
        return "El auto le corre a una camioneta";
    }
}