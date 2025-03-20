public class Moto implements Vehiculo{
    //cumplo con la interfaz:
    public String compiteCon(Vehiculo v) {
        return "la moto le corre a otro vehiculo";
    }

    //pero también agrego otras posibilidades:
    public String compiteCon(Moto m){
        return "la moto le corre a otra moto";
    }

    public String compiteCon(Auto a){
        return "la moto le corre a un auto";
    }

    public String compiteCon(Camioneta a){
        return "la moto le corre a una camioneta";
    }
}