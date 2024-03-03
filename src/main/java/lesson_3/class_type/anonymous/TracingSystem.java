package lesson_3.class_type.anonymous;

public class TracingSystem implements SystemInterface {
    @Override
    public void start() {
        System.out.println("Система трассировки стартовала");
    }
}
