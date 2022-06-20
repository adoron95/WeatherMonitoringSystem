package Observables;

import Observers.Observer;

import java.util.ArrayList;


public class Observable<T> {
    protected ArrayList<Observer> observers = new ArrayList<Observer>();

    public void notifyObservers(T data) {
        for (Observer observer : observers) {
            observer.update(data);
        }
    }


    public void register(Observer observer) {
        observers.add(observer);
    }
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

}
