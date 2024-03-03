package lesson_3.class_type.anonymous;

public class AnonymousRealization {

    public static void main(String[] args) {
        SystemInterface systemInterface = new Monitoring();
        SystemInterface errorSystem = new ErrorSystem();
        SystemInterface tracingSystem = new TracingSystem();

        systemInterface.start();
        errorSystem.start();
        tracingSystem.start();

        SystemInterface anonymousError = new SystemInterface() {
            int id = 10;

            @Override
            public void start() {
                System.out.println("Запущен процесс из анонимного класса с id=" + id);
            }
        };

        anonymousError.start();
    }
}
