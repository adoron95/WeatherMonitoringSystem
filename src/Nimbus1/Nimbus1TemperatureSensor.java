package Nimbus1;

import Observables.Sensor;
import Observables.SensorAlarmListener;

import java.util.Random;

public class Nimbus1TemperatureSensor extends Sensor {
    private Random rnd = RandomSupplier.getRnd();

    public Nimbus1TemperatureSensor(String type, int interval) {
        super(type, interval);
        Nimbus1Clock.theInstance().register(interval, new SensorAlarmListener(this));
        System.out.println(this.type + " registered to clock");
    }

    @Override
    public int read() {
        return rnd.nextInt(40);
    }

}
