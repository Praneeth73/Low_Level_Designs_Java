package DesignPatterns.ObserverDesignPattern;

public class Subscriber {

    private String name;
    Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(Subscriber i) {
        System.out.println("Sub " + name + " video uploaded");
    }

    public void channelSubscribe(Channel ch) {
        channel = ch;
    }

}
