package lesson_3.class_type;

public class OuterClass {
    private String classField = "поле класса";

    public void outerMethod() {
        System.out.println("Публичный метод внешнего класса");
    }

    private void outerPrivateMethod() {
        System.out.println("Приватный метод внешнего класса");
    }

    public void methodWithLocalClass() {
        class LocalClass {
            private String field;

            public void localMethod() {
                System.out.println("Метод локального класса");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.localMethod();
    }

    static class StaticNestedClass {
        String field = "поле статичного вложенного класса";

        public void someNestedStaticMethod() {
            System.out.println("Доступ к полю " + field);
        }
    }

    public class InnerClass {
        String innerField = "поле статичного вложенного класса";
        public void someInnerMethod() {
            outerMethod();
            outerPrivateMethod();
            System.out.println("Доступ к полю " + classField + " " + innerField);
        }
    }
}
