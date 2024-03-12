package lesson_6.generic;

import java.util.List;
/**
 * Producer Extends Consumer Super
 *
 * */
public class Pecs {

    class Class {
    }
    class Class1 extends Class {
    }
    class Class2 extends Class1 {
    }
    class Class3 extends Class2 {
    }
    class Class4 extends Class3 {
    }
    class Class5 extends Class4 {
    }

    void extendMethod(List<? extends Class3> list) {
//        Class2 class2 = list.get(0);
//        Class4 class4 = list.get(0);
    }

    void superMethod(List<? super Class3> list) {
//        list.add(new Class2());
//        list.add(new Class4());
    }

    void superMethodWithGet(List<? super Class3> list) {
        list.get(0);
    }
}
