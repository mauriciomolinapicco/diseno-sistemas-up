public class Camioneta implements Vehiculo{
    //cumplo con la interfaz:
    public String compiteCon(Vehiculo v) {
        return "la camioneta le corre a otro vehiculo";
    }

    //pero también agrego otras posibilidades:
    public String compiteCon(Camioneta a) {
        return "la camioneta le corre a otra camioneta";
    }

    public String compiteCon(Auto a) {
        return "la camioneta le corre a un auto";
    }

    public String compiteCon(Moto m) {
        return "la camioneta le corre a una moto";
    }
}