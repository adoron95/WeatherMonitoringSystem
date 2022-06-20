package Observables;

import Observers.Observer;
import Observers.Trend;

public class PressureTrendSensor extends Observable<Trend> implements Observer<Integer> {
    private String type;

    private int a = 0;
    private int b = 0;
    private int c = 0;

    private Trend previousTrend = Trend.STABLE;

    public PressureTrendSensor(String type) {
        this.type = type;
    }

    public void check(){
        Trend trend = trendCalc();
        if (trend != previousTrend) {
            previousTrend = trend;
            notifyObservers(trend);
        }
    }

    private Trend trendCalc() {
        if (a < b && b < c) {
            return Trend.UP;
        } else if (a > b && b > c) {
            return Trend.DOWN;
        } else {
            return Trend.STABLE;
        }
    }

    @Override
    public void update(Integer reading) {
        a = b;
        b = c;
        c = reading;
        check();
    }
}

