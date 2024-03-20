package lesson_7.lambda;

public interface Operation<T, R> {
    R execute(T first, T second);
}
