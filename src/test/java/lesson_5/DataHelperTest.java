package lesson_5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DataHelperTest {

    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6})
    void checkForInteger(Integer data) {
        DataHelper dataHelper = new DataHelper();

        assertThrows(RuntimeException.class, () -> dataHelper.checkForInteger(data));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void checkForIntegerByString(String value) {
        DataHelper dataHelper = new DataHelper();

        assertEquals(10, dataHelper.checkForIntegerByString(value));
    }
}