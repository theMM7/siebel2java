package lesson_7.optional;


public class Child {

    private String name;
    private RandomObject randomObject;

    public Child(String name, RandomObject randomObject) {
        this.name = name;
        this.randomObject = randomObject;
    }

    public String getName() {
        return name;
    }

    public RandomObject getRandomObject() {
        return randomObject;
    }
}
