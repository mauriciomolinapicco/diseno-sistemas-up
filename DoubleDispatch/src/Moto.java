public class Moto implements Competidor {
    public String leCorreA(Competidor c) {
        return c.leCorreA(this);
    }
    public String leCorreA(Moto m) {
        return "El auto le corre a OTRA moto";
    }
    public String leCorreA(Auto m) {
        return "La moto le corre a un auto";
    }
    public String leCorreA(Camioneta m) {
        return "La moto le corre a una camioneta";
    }
}