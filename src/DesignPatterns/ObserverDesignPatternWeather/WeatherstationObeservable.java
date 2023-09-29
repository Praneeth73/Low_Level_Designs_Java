package DesignPatterns.ObserverDesignPatternWeather;

public interface WeatherstationObeservable {

    void add(DisplayObserver displayObserver);
    void remove(DisplayObserver displayObserver);
    void notifyOthers();
    void setTemp(int temp);
}
