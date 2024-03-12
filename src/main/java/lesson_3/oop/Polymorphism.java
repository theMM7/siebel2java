package lesson_3.oop;

public class Polymorphism {

    public static class Car {
        public void drive() {
            System.out.println("поехали");
        }
    }

    public static class Lada extends Car {
        @Override
        public void drive() {
            System.out.println("vi-vi-vi");;
        }
    }

    public static class BMW extends Car {
        @Override
        public void drive() {
            System.out.println("vrvrv");
        }

        public void drift() {
            System.out.println("вжух и жженые колеса");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        Car lada = new Lada();
        Car bmw = new BMW();

        execute(car);
        execute(lada);
        execute(bmw);

        BMW bmwCar = new BMW();
        bmwCar.drift();
    }

    private static void execute(Car car) {
        car.drive();
    }
}
