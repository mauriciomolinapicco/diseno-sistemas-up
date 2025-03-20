import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;


public class PolimorfismoDinamico {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("texto");
        c.add("texto2");
        //la operación add almacenará “valor” y otros valores de manera *no contigua*
        
        c = new HashSet();
        c.add("valor");
        c.add("valor2"); //la operación add almacenará “valor” y otros valores de manera *no contigua*
    
    }
}