package lesson_3.class_type;

public class NestedExample {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        staticNestedClass.someNestedStaticMethod();

        OuterClass outerClass = new OuterClass();
        outerClass.outerMethod();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.someInnerMethod();
    }

}
