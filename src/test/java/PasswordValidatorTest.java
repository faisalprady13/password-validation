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

    @ParameterizedTest
    @CsvSource({"asd,false", "asd1,true", "asd1qwe2,true", "'1',true", "'',false", ",false",})
    void containsDigit(String password, boolean expected) {
        assertEquals(expected, PasswordValidator.containsDigit(password));
    }

    @ParameterizedTest
    @CsvSource({"asd,false", "Asd,true", "ASD,false", "'1',false", "'',false", ",false",})
    void containsUpperAndLower(String password, boolean expected) {
        assertEquals(expected, PasswordValidator.containsUpperAndLower(password));
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