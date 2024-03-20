package lesson_7.optional;

import java.util.Optional;

public class OptionalExample {

    private static final String DEFAULT_VALUE = "Default name";

    public static void main(String[] args) {
        //String randomObjectName = initialize().getChild().getRandomObject().getName();


//        if (initParent != null) {
//            Child child = initParent.getChild();
//            if (child != null) {
//                RandomObject randomObject = child.getRandomObject();
//                if (randomObject != null) {
//                    String name = randomObject.getName();
//                    if (name != null && !name.isEmpty()) {
//                        System.out.println("Значение параметра name=" + name);
//                    }
//                }
//            }
//        }

        Parent initParent = initialize();

        String string = Optional.ofNullable(initParent)
                .map(Parent::getChild)
                .map(Child::getRandomObject)
                .map(RandomObject::getName)
                .filter(name -> !name.isEmpty())
                .orElse(DEFAULT_VALUE);


    }

    private static Parent initialize() {
        RandomObject randomObject = new RandomObject("randomName");
        Child child = new Child("childName", randomObject);
        //return new Parent("parentName", child);
        return null;
    }
}
