package task02.util;

import task02.core.Timer;

/**
 * Created by Union.one on 13.11.2015.
 */
public class Transformer {
    private Timer timer;

    public Transformer(Timer timer) {
        this.timer = timer;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public int transformTimeToSeconds() {
        return timer.getHour() * 3600 + timer.getMinute() * 60 + timer.getSecond();
    }

    public void transformSecondsToTime(int seconds) {
        timer.setHour(seconds / 3600);
        seconds = seconds - timer.getHour() * 3600;
        timer.setMinute(seconds / 60);
        seconds = seconds - timer.getMinute() * 60;
        timer.setSecond(seconds);
    }

    @Override
    public String toString() {
        return "Transformer{" +
                "timer=" + timer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transformer that = (Transformer) o;

        return !(timer != null ? !timer.equals(that.timer) : that.timer != null);

    }

    @Override
    public int hashCode() {
        return timer != null ? timer.hashCode() : 0;
    }
