

public class ConcreteSubscriber implements Subscriber {
    private String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        // TODO Auto-generated method stub
        System.out.println(name + " recibio una actualizacion: " + message);
    }
}
