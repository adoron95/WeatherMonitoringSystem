package Observers;

import Observables.WeatherMonitoringSystem;

public class Log {
    private WeatherMonitoringSystem ws;

    public Log(WeatherMonitoringSystem ws) {
        System.out.println("Log was created");
        this.ws = ws;

        ws.addPressureObserver(new LogPressObserver(this));
        System.out.println("LogPressObserver observes pressure");

        ws.addPressureTrendObserver(new LogPressTrendObserver(this));
        System.out.println("LogPressTrendObserver observes pressure trend");
    }

    public void updatePressure(int reading) {
        System.out.println("Log: pressure = " + reading + " millibars");
    }

    public void updatePressureTrend(Trend trend) {
        System.out.print("Log: pressure trend = ");
        switch (trend) {
            case UP:
                System.out.println("RISING");
                break;
            case DOWN:
                System.out.println("FALLING");
                break;
            case STABLE:
                System.out.println("STABLE");
                break;
        }
    }
}
