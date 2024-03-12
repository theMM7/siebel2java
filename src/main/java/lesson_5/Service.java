package lesson_5;

public class Service {

    private final DataHelper dataHelper;

    public Service(DataHelper dataHelper) {
        this.dataHelper = dataHelper;
    }

    public int sum(Request request) {
        Integer first = request.getFirst();
        Integer second = request.getSecond();
        System.out.println(">> sum() first " + first + " second " + second);

        if (first == null) {
            throw new RuntimeException("Первый параметр равен нулю");
        }

        if (second == null) {
            System.out.println("Обнаружено пустое значение. Берем дефолтное");
            second = Fetcher.getDefaultValue();
        }

        if (first > second) {
            System.out.println("Обращение к сервису DataHelper");

            try {
                first = dataHelper.checkForInteger(second);
            } catch (RuntimeException e) {
                throw new RuntimeException("Произошла ошибка при обращении к сервису DataHelper");
            }

            System.out.println("Полученное значение: " + first);
        }

        int result = first + second;

        System.out.println("<< sum() result " + result);

        return result;
    }
}
