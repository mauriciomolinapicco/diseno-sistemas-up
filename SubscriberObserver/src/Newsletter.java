

import java.util.ArrayList;
import java.util.List;

public class Newsletter {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String news;

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this.news);
        }
    }

    public void setLatestNews(String news) {
        this.news = news;
        System.out.println("Nueva noticia publicada: " + news);
        notifySubscribers();
    }
}
