package Observers;

public class MSTempObserver implements Observer<Integer>{
    private MonitoringScreen screen;

    public MSTempObserver(MonitoringScreen screen) {
        System.out.println("MSTempObserver was created");
        this.screen = screen;
    }

    @Override
    public void update(Integer reading) {
        screen.updateTemperature(reading);
    }
}

