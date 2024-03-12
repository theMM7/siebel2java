package lesson_6.generic;

import lesson_3.oop.Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class WildCards {


    static class Account<T> {

        private T id;

        public Account(T id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        String first = "123";
        Object second = first;

        //System.out.println(second);

        List<String> stringList = new ArrayList<>();
        //List<Object> objectList = stringList;

        List<Polymorphism.Car> carList = new ArrayList<>();
        carList.add(new Polymorphism.BMW());
        carList.add(new Polymorphism.Lada());

        execute(carList);
      //  secondExecute(carList);

        List<Polymorphism.BMW> bmwList = new ArrayList<>(); //List<Object>
        bmwList.add(new Polymorphism.BMW());
        bmwList.add(new Polymorphism.BMW());
        bmwList.add(new Polymorphism.BMW());

        List<String> strings = new ArrayList<>();
        //execute(bmwList);
        secondExecute(bmwList);

        System.out.println("Сравнение коллекций: " + (carList.getClass() == strings.getClass()));
    }

    static void execute(List<Polymorphism.Car> carList) {
        for (Polymorphism.Car car : carList) {
            car.drive();
        }
    }

    //List<T extends Polymorphism.Car> = List<Polymorphism.Car>
    static <T extends Polymorphism.Car> void secondExecute(List<T> carList) {
        for (T car : carList) {
            car.drive();
        }
    }
}
