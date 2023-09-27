package DesignPatterns.ObserverDesignPattern;

public class Youtube {


    //Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple
    // objects about any events that happen to the object they’re observing.
    public static void main(String args[]) {

        // there is a channel with name as ch
        Channel ch = new Channel();
        Channel ch1 = new Channel();

        Subscriber s1 = new Subscriber("s1");
        Subscriber s2 = new Subscriber("s2");
        Subscriber s3 = new Subscriber("s3");
        Subscriber s4 = new Subscriber("s4");
        Subscriber s5 = new Subscriber("s5");

        ch.subscribe(s1);
        ch1.subscribe(s2);
        ch.subscribe(s3);
        ch.subscribe(s4);
        ch.subscribe(s5);

        s1.channelSubscribe(ch);
        s2.channelSubscribe(ch1);
        s3.channelSubscribe(ch);
        s4.channelSubscribe(ch);
        s5.channelSubscribe(ch);

        ch.uploadVideo("title1");
        ch1.uploadVideo("title2");
    }
}
