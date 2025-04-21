package Singleton;

/**
 * Implementación básica del patrón Singleton
 */
public class Singleton {
    // La instancia única es almacenada en un campo estático privado
    private static Singleton instancia;
    
    // Un contador para demostrar que siempre es la misma instancia
    private int contador = 0;
    
    // Constructor privado para evitar instanciación desde otras clases
    private Singleton() {
        System.out.println("Inicializando la instancia de Singleton");
    }
    
    // Método estático público que actúa como punto de acceso global
    public static Singleton getInstancia() {
        // Lazy initialization (inicialización perezosa)
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
    
    // Métodos de negocio
    public void incrementarContador() {
        contador++;
    }
    
    public int getContador() {
        return contador;
    }
    
    public void operacion() {
        System.out.println("Realizando operación importante desde Singleton");
    }
}

/**
 * Implementación thread-safe con inicialización perezosa
 */
public class SingletonThreadSafe {
    private static volatile SingletonThreadSafe instancia;
    
    private SingletonThreadSafe() {
        // Protección contra reflexión
        if (instancia != null) {
            throw new RuntimeException("Use getInstancia() para obtener la instancia");
        }
    }
    
    public static SingletonThreadSafe getInstancia() {
        // Double-checked locking para thread safety
        if (instancia == null) {
            synchronized (SingletonThreadSafe.class) {
                if (instancia == null) {
                    instancia = new SingletonThreadSafe();
                }
            }
        }
        return instancia;
    }
}

/**
 * Implementación con inicialización eager (temprana)
 */
public class SingletonEager {
    // La instancia se crea en el momento de carga de la clase
    private static final SingletonEager INSTANCIA = new SingletonEager();
    
    private SingletonEager() {}
    
    public static SingletonEager getInstancia() {
        return INSTANCIA;
    }
}

/**
 * Implementación recomendada: Holder estático
 */
public class SingletonHolder {
    private SingletonHolder() {}
    
    // Clase interna estática que mantiene la instancia
    private static class SingletonHelperHolder {
        private static final SingletonHolder INSTANCIA = new SingletonHolder();
    }
    
    public static SingletonHolder getInstancia() {
        return SingletonHelperHolder.INSTANCIA;
    }
}

/**
 * Cliente que demuestra el uso del Singleton
 */
public class MainSingleton {
    public static void main(String[] args) {
        // Obtener la instancia del Singleton
        Singleton singleton1 = Singleton.getInstancia();
        singleton1.incrementarContador();
        System.out.println("Contador desde instancia 1: " + singleton1.getContador());
        
        // Intentar obtener otra instancia del Singleton
        Singleton singleton2 = Singleton.getInstancia();
        System.out.println("Contador desde instancia 2: " + singleton2.getContador());
        
        // Incrementar desde la segunda referencia
        singleton2.incrementarContador();
        
        // Verificar que ambas variables referencian la misma instancia
        System.out.println("Contador desde instancia 1 después de incremento: " + singleton1.getContador());
        System.out.println("¿Son la misma instancia? " + (singleton1 == singleton2));
        
        // Comparar con una implementación diferente
        SingletonHolder holder1 = SingletonHolder.getInstancia();
        SingletonHolder holder2 = SingletonHolder.getInstancia();
        System.out.println("¿Holder son la misma instancia? " + (holder1 == holder2));
    }
}