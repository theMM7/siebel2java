package lesson_6.generic;

public class ObjectExample {

    static class IdObject{}
    static class Account {

        private Object id;
        private int sum;

        Account(Object id, int sum) {
            this.id = id;
            this.sum = sum;
        }

        public Object getId() {
            return id;
        }

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }
    }

    public static void main(String[] args) {
        Account acc1 = new Account(2334, 5000); // id - число
        int acc1Id = (int) acc1.getId();
        System.out.println(acc1Id);

        Account acc2 = new Account("sid5523", 5000);    // id - строка
        System.out.println(acc2.getId());

        Account acc3 = new Account("2345", 5000);


        if (acc3.getId() instanceof String) {
            String acc3Id = (String) acc3.getId();
            System.out.println("строка" + acc3Id);
        } else {
            int acc3Id = (int) acc3.getId();
            System.out.println("число" + acc3Id);
        }


    }
}
