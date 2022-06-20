package Observers;

public class MSPressObserver implements Observer<Integer>{
    private MonitoringScreen screen;

    public MSPressObserver(MonitoringScreen screen) {
        System.out.println("MSPressObserver was created");
        this.screen = screen;
    }

    @Override
    public void update(Integer reading) {
        screen.updatePressure(reading);
    }
}
