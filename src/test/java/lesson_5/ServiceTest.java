package lesson_5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ServiceTest {

    @Mock
    private DataHelper dataHelper;

    @InjectMocks
    private Service service;

    @Test
    @DisplayName("Сумма единицы и двойки")
    void sum() {
        int result = service.sum(new Request(1, 2));

        assertEquals(3, result);
        assertNotEquals(5, result);
    }

    @Test
    @DisplayName("Вызывается метод, результатом которого является ошибка")
    void sumException() {
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> service.sum(new Request(null, 2)));

        assertEquals("Первый параметр равен нулю", runtimeException.getMessage());
    }

    @Test
    @DisplayName("Вызывается метод с дефолтным значением")
    void sumWithDefaultValue() {
        int result = service.sum(new Request(10, null));

        assertEquals(20, result);
    }

    @Test
    void sumWithDataHelper() {
        when(dataHelper.checkForInteger(anyInt())).thenReturn(100);

        int result = service.sum(new Request(100, 10));

        assertEquals(110, result);
    }

    @Test
    void sumWithDataHelperException() {
        when(dataHelper.checkForInteger(anyInt())).thenThrow(RuntimeException.class);

        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> service.sum(new Request(100, 10)));

        assertEquals("Произошла ошибка при обращении к сервису DataHelper", runtimeException.getMessage());
    }

    @ParameterizedTest
    @MethodSource("fetchData")
    void parameteraziedTests(Request request, int expectedResult) {
        int actualResult = service.sum(request);

        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> fetchData() {
        return Stream.of(
                Arguments.arguments(new Request(10, 10), 20),
                Arguments.arguments(new Request(100, 200), 300),
                Arguments.arguments(new Request(1000, 2000), 3000));
    }
}