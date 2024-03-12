package lesson_6.generic;

public interface GenericInterface {

    interface Sender<T, R> {
        R send(T content);
    }

    class Money {}

    class Letter {}

    class Bank implements Sender<Money, Integer> {
        @Override
        public Integer send(Money content) {
            return 0;
        }
    }

    class Postman implements Sender<Letter, String> {
        @Override
        public String send(Letter content) {
            return "0";
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.send(new Money());

        Postman postman = new Postman();
        postman.send(new Letter());
    }
}
