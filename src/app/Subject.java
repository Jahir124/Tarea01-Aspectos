package app;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private final List<Observer> observers = new ArrayList<>();
	private String color;
	
	public void addObserver(Observer o){
		observers.add(o);
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
		notifyAllObservers();
	}
	
	private void notifyAllObservers() {
		for(Observer o: observers) {
			o.update(color);
		}
	} 
}
