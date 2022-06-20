package Observables;

public class AlarmClockRecord {
    int interval;
    int remainingTime;
    AlarmListener alarmListener;

    public AlarmClockRecord(int interval, AlarmListener alarmListener) {
        this.interval = interval;
        this.remainingTime=interval;
        this.alarmListener = alarmListener;
    }
    public void decrement(int tickTime) {
        remainingTime -= tickTime;
    }
    public int getInterval() {
        return interval;
    }
    public AlarmListener getListener() {
        return alarmListener;
    }
    public int getRemaining() {
        return remainingTime;
    }

    public void setRemaining(int remaining) {
        this.remainingTime = remaining;
    }

}
