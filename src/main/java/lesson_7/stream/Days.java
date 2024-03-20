package lesson_7.stream;

public enum Days {
    MONDAY("code Monday"),
    FRIDAY("code Friday");

    Days(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }
}
