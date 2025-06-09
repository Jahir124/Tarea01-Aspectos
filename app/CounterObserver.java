package app;

public class CounterObserver implements Observer {
	private int counter = 0;
	
	@Override
	public void update(String color) {
		counter++;
		System.out.println("Cantidad de cambios de color: " + counter);
	}
}
