package DesignPatterns.ObserverDesignPatternWeather;


import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservaleconcrete implements WeatherstationObeservable{


    List<DisplayObserver> displayObserverList = new ArrayList<>();
    int currentTemp =0;

    @Override
    public void add(DisplayObserver displayObserver) {
        displayObserverList.add(displayObserver);
    }

    @Override
    public void remove(DisplayObserver displayObserver) {
        displayObserverList.remove(displayObserver);
    }

    @Override
    public void notifyOthers() {

        for (DisplayObserver sub : displayObserverList) {
            sub.update();
        }
    }

    @Override
    public void setTemp(int newTemp) {
        currentTemp =  newTemp;
        notifyOthers();
    }
}
