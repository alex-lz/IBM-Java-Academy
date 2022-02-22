package pattern.command;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public abstract class Command implements Delayed, Runnable {
	
	private static Clock clock = Clock.systemUTC();
	
	private final Instant runAt;
	
	protected Command(Duration duration) {
		this.runAt = clock.instant().plusMillis(duration.toMillis());
	}
	
	@Override
	public int compareTo(Delayed o) {
		return runAt.compareTo(((Command)o).runAt);
	}
	
	@Override
	public long getDelay(TimeUnit unit) {
		long delayInMillis = runAt.toEpochMilli() - clock.millis();
		return unit.convert(delayInMillis, TimeUnit.MILLISECONDS);
	}
	
	public String timeToRun() {
		return runAt.toString();
	}

}
