package DesignPatterns.ObserverDesignPatternWeather;


public class Weather {

    public static void main(String[] args) {

        WeatherstationObeservable weatherstationObeservable =  new WeatherStationObservaleconcrete();

        DisplayObserver observerTV = new TvDisplayObserver(weatherstationObeservable);
        DisplayObserver observerMobile = new MobileDisplayObserver(weatherstationObeservable);

        weatherstationObeservable.add(observerTV);
        weatherstationObeservable.add(observerMobile);

        weatherstationObeservable.setTemp(10);

    }
}
