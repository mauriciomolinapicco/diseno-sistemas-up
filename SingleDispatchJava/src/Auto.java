public class Auto implements Vehiculo{
    //cumplo con la interfaz:
    public String compiteCon(Vehiculo v){
        return "el auto le corre a otro vehiculo";
    }
    //pero también agrego otras posibilidades:
    public String compiteCon(Auto a) {
        return "el auto le corre a otro auto";
    }
    public String compiteCon(Moto m) {
        return "el auto le corre a una moto";
    }
    public String compiteCon(Camioneta a) {
        return "la auto le corre a una camioneta";
    }
}