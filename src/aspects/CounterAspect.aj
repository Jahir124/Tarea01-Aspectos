package aspects;

public aspect CounterAspect {
	private int counter = 0;
	pointcut colorChange(): execution(* app.Subject.setColor(String));
	
	after(): colorChange() {
		counter++;
		System.out.println("(Aspectj) Cantidad de cambios de color: " + counter);
	}
}
