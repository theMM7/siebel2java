package lesson_6.generic;

public class GenericClass {

    static class Account<T> {
        private T id;

        public Account(T id) {
            this.id = id;
        }

        public T getId() {
            return id;
        }
    }

    public static void main(String[] args) {
        Account<String> stringAccount = new Account<>("123");
        String id = stringAccount.getId();

        Account<Integer> integerAccount = new Account<>(345);
        Integer accountId = integerAccount.getId();

        //Account<Double> doubleAccount = new Account<>("123");
    }
}
