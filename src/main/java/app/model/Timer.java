package app.model;

import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class Timer {

    private final LocalDateTime time;

    public Timer() {
        this.time = LocalDateTime.now();
    }

    public LocalDateTime getTime() {
        return time;
    }
}