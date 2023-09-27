package DesignPatterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private String title;
    private List<Subscriber> subscriberList = new ArrayList<>();


    public void subscribe(Subscriber subscriber) {

        subscriberList.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }


    public void notifysubcribers() {

        for (Subscriber sub : subscriberList) {
            sub.update(sub);
        }

    }

    public void uploadVideo(String title) {
        this.title = title;
        notifysubcribers();

    }
}
