package cucumber.steps;

import cucumber.StringUtils;
import io.cucumber.java.ru.Тогда;
import io.cucumber.java.ru.Когда;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsSteps {
    private String inputString;
    private int result;

    @Когда("я передаю строку {string}")
    public void передаюСтроку(String str) {
        inputString = str;
    }

    @Тогда("количество чисел равно {int}")
    public void количествоЧиселРавно(int expected) {
        result = StringUtils.countDigits(inputString);
        assertEquals(expected, result);
    }

    @Тогда("количество букв равно {int}")
    public void количествоБуквРавно(int expected) {
        result = StringUtils.countLetters(inputString);
        assertEquals(expected, result);
    }

    @Тогда("количество пробелов равно {int}")
    public void количествоПробеловРавно(int expected) {
        result = StringUtils.countSpaces(inputString);
        assertEquals(expected, result);
    }

    @Тогда("количество гласных равно {int}")
    public void количествоГласныхРавно(int expected) {
        result = StringUtils.countVowels(inputString);
        assertEquals(expected, result);
    }
}