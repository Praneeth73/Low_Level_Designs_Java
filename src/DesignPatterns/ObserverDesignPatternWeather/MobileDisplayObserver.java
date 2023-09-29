package DesignPatterns.ObserverDesignPatternWeather;

public class MobileDisplayObserver implements DisplayObserver{


    WeatherstationObeservable weatherstationObeservable;

    public MobileDisplayObserver(WeatherstationObeservable weatherstationObeservable){
        this.weatherstationObeservable = weatherstationObeservable;
    }

    @Override
    public void update() {
        System.out.println("Mobile Notification");
    }
}
