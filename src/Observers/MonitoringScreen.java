package Observers;

import Observables.WeatherMonitoringSystem;

public class MonitoringScreen {
    public MonitoringScreen(WeatherMonitoringSystem ws) {
        System.out.println("MonitoringScreen was created");

        ws.addTemperatureObserver(new MSTempObserver(this));
        System.out.println("MSTempObserver observes temperature");

        ws.addPressureObserver(new MSPressObserver(this));
        System.out.println("MSPressObserver observes pressure");
    }

    public void updatePressure(int reading) {
        System.out.println("MonitoringScreen: pressure = " + reading + " millibars");
    }

    public void updateTemperature(int reading) {
        System.out.println("MonitoringScreen: temperature = " + reading + " Celsius");
    }
}
