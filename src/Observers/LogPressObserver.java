package Observers;

public class LogPressObserver implements Observer<Integer>{
    private Log log;

    public LogPressObserver(Log log) {
        System.out.println("LogPressObserver was created");
        this.log = log;
    }

    @Override
    public void update(Integer reading) {
        log.updatePressure(reading);
    }
}
