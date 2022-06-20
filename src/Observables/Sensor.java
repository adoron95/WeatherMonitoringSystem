package Observables;

public abstract class Sensor extends Observable<Integer> {
    protected int lastCheck = 0;
    protected int interval;

    protected String type;

    public Sensor(String type, int interval) {
        this.type = type;
        this.interval = interval;

    }

    public abstract int read();

    public void check() {
        int temp = read();
        if (lastCheck != temp) {
            lastCheck = temp;
            notifyObservers(lastCheck);
        }
    }
}
