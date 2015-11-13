package task02.util;

import task02.core.Timer;

/**
 * Created by Vaas on 13.11.2015.
 */
public class Deducter implements Deductable {
    private Timer timer;
    private int seconds;

    public Deducter(Timer timer, int seconds) {
        this.timer = timer;
        this.seconds = seconds;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void deduct() {
        transformSecondsToTime(transformTimeToSeconds() - seconds);
        System.out.print(timer.toString());
    }

    private int transformTimeToSeconds() {
        return timer.getHour() * 3600 + timer.getMinute() * 60 + timer.getSecond();
    }

    private void transformSecondsToTime(int seconds) {
        timer.setHour(seconds / 3600);
        seconds = seconds - timer.getHour() * 3600;
        timer.setMinute(seconds / 60);
        seconds = seconds - timer.getMinute() * 60;
        timer.setSecond(seconds);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deducter deducter = (Deducter) o;

        if (seconds != deducter.seconds) return false;
        return !(timer != null ? !timer.equals(deducter.timer) : deducter.timer != null);

    }

    @Override
    public int hashCode() {
        int result = timer != null ? timer.hashCode() : 0;
        result = 31 * result + seconds;
        return result;
    }
}
