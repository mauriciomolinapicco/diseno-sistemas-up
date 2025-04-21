public class Prueba {
    public static void main(String[] args) {
    Auto a = new Auto();
    Vehiculo v = new Moto();
    System.out.println(a.compiteCon(v));
    }        //Va a imprimir "el auto compite con el vehiculo" y no con la moto. 
        // Esto es porque la llamada compite con se establecion en tiempo de compilacion
        // JAVA no soporta el envio multiple de mensajes o multiple dispatch, solo Single Dispatch
    
        // a = new Auto();
        // v = new Moto();
        // System.out.println(a.compiteCon(v));
        //se soluciona asi pero no es correcto, ya que se debe programar contra la interfaz

        //SOLUCION, IMPLEMENTAR MEJOR LA INTERFAZ (double dispatch), DIRECTORIO DOUBLE DISPATCH
}