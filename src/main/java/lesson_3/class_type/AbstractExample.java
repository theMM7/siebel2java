package lesson_3.class_type;

public class AbstractExample {

    static abstract class Form {
        String hidingField = "Form class";
        protected final String someProtectedString = "someProtectedString";
        abstract void shapeArea();
        abstract Number someRefNumber();
        abstract int somePrimNumber();
        public void defaultMethod() {
            System.out.println("Дефолтный метод. Текст: " + someProtectedString + " " + hidingField);
        }
    }

    static class Triangle extends Form {
        String hidingField = "Triangle class";
        @Override
        void shapeArea() {
            System.out.println("0,5 основания * высоту");
        }
        @Override
        public Integer someRefNumber() {
            return 10;
        }

        @Override
        protected int somePrimNumber() {
            return 42;
        }

        @Override
        public void defaultMethod() {
            System.out.println("Дефолтный метод из класса-наследника. Текст: " + someProtectedString + " " + hidingField + " " + super.hidingField);
        }
    }

    public static void main(String[] args) {
        Form triangleForm = new Triangle();

        triangleForm.defaultMethod();
        triangleForm.shapeArea();
    }
}
