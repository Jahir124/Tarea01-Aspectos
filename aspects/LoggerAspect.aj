package aspects;

public aspect LoggerAspect {
    pointcut colorChange(String color): execution(* app.Subject.setColor(String)) && args(color);

    after(String color): colorChange(color) {
        System.out.println("[AspectJ] El color cambió a: " + color);
    }
}
