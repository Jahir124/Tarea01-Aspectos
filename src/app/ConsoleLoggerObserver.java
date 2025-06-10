package app;

public class ConsoleLoggerObserver implements Observer {
	@Override
	public void update(String color) {
		System.out.println("Color cambiado a: " + color);
	}
}
