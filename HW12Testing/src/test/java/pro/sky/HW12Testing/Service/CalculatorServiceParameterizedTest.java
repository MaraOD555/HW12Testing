package pro.sky.HW12Testing.Service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.HW12Testing.Services.CalculatorService;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceParameterizedTest {
    private final CalculatorService calcUnderTest = new CalculatorService();

    @ParameterizedTest
    @CsvSource({"2,3,5", "5,0,5"}) // задаем параметры
    public void testSumResult(int num1, int num2, int expectedResult) { // в аргументах также результат
       long result = calcUnderTest.sum(num1, num2); //вызов метода
       assertEquals(expectedResult, result); // сравнение результата

    }
    @ParameterizedTest
    @CsvSource({"10,8,2", "3,3,0"})
    public void testSubtractResult(int num1, int num2, int expectedResult) {
            long result = calcUnderTest.subtraction(num1, num2);
            assertEquals(expectedResult, result);
    }
    @ParameterizedTest
    @CsvSource({"2,2,4", "5,8,40"})
    public void testMultiplyResult(int num1, int num2, int expectedResult) {
        long result = calcUnderTest.multiply(num1, num2);
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvSource({"2,1,2", "5,2,2.5"})
    public void testDivideResult(int num1, int num2, double expectedResult) {
        Number result = calcUnderTest.divide(num1, num2);
        assertEquals(expectedResult, result);
    }
    @ParameterizedTest
    @MethodSource("dataProvider") // аннотация для работы с поставщиком значений
    public void testSumResultWithArguments(int num1, int num2, int expectedResult) { // значения
        // в аргументы передаются из стрима
        long result = calcUnderTest.sum(num1, num2); //вызов метода
        assertEquals(expectedResult, result); // сравнение результата

    }
    private static Stream<Arguments> dataProvider() { // статический метод для передачи аргументов через стрим
        return Stream.of(
                Arguments.of("10", "5", "15"), // 1-й набор аргументов
                Arguments.of("200", "3", "203"), // 2-й набор аргументов
                Arguments.of("8", "-1", "7") // 3-й набор аргументов
        );
    }
}
