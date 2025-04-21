public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) { 
            /* garantiza que no se creen varias instancias si mas 
                de un hilo intenta acceder al mismo tiempo */
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
            
        return uniqueInstance;
    }
}
