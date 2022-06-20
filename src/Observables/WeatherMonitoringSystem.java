package Observables;


import Nimbus1.Nimbus1PressureSensor;
import Nimbus1.Nimbus1TemperatureSensor;
import Observers.Observer;

public class WeatherMonitoringSystem {
    // region Singleton
    private static WeatherMonitoringSystem instance = null;

    private WeatherMonitoringSystem() {
        addPressureObserver(this.pressureTrend);
        System.out.println("PressureTrendSensor observes pressure");
    }

    public static WeatherMonitoringSystem theInstance() {
        if (instance == null) {
            System.out.println("WeatherMonitoringSystem was created");
            instance = new WeatherMonitoringSystem();
        }
        return instance;
    }
    // endregion

    private Sensor pressure = new Nimbus1PressureSensor("pressure", 1100);
    private Sensor temperature = new Nimbus1TemperatureSensor("temperature", 700);
    private PressureTrendSensor pressureTrend = new PressureTrendSensor("pressure trend");
    public void addPressureTrendObserver(Observer observer) {
        this.pressureTrend.register(observer);
    }

    public void addTemperatureObserver(Observer observer) {
        this.temperature.register(observer);
    }

    public void addPressureObserver(Observer observer) {

        this.pressure.register(observer);
    }


}
