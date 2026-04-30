import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @ParameterizedTest
    @CsvSource({"1234567,false", "12345678,true", "123456789,true", "'',false", ",false", "'    s       a',false"})
    void hasMinLength(String password, boolean expected) {
        assertEquals(expected, PasswordValidator.hasMinLength(password, 8));
    }

    @Test
    void containsDigit() {
    }

    @Test
    void containsUpperAndLower() {
    }

    @Test
    void isCommonPassword() {
    }

    @Test
    void containsSpecialChar() {
    }

    @Test
    void isValid() {
    }
}