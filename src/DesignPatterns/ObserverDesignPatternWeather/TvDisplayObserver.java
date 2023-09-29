package DesignPatterns.ObserverDesignPatternWeather;


public class TvDisplayObserver implements DisplayObserver{

    WeatherstationObeservable weatherstationObeservable;

    public TvDisplayObserver(WeatherstationObeservable weatherstationObeservable){
        this.weatherstationObeservable = weatherstationObeservable;
    }


    @Override
    public void update() {
        System.out.println("TV notification");
    }
}
