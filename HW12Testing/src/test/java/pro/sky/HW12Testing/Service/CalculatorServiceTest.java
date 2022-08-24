package pro.sky.HW12Testing.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.HW12Testing.Services.CalculatorService;

public class CalculatorServiceTest {
    private final CalculatorService calcUnderTest = new CalculatorService();

    @Test
    public void testSumResult() {
        int a = 2; int b = 3; //набор параметров для теста 1
        int expectedResult1 = 5;
        int c = 5; int d = 0; //набор параметров для теста 2
        int expectedResult2 = 5;

        long result1 = calcUnderTest.sum(a, b);
        long result2 = calcUnderTest.sum(c, d);

        Assertions.assertEquals(expectedResult1, result1); // сравнение результата1
        Assertions.assertEquals(expectedResult2, result2); // сравнение результата2
    }
    @Test
    public void testSubtractResult() {
        int a = 10; int b = 8; //набор параметров для теста 1
        int expectedResult1 = 2;
        int c = 3; int d = 3; //набор параметров для теста 2
        int expectedResult2 = 0;

        long result1 = calcUnderTest.subtraction(a, b);
        long result2 = calcUnderTest.subtraction(c, d);

        Assertions.assertEquals(expectedResult1, result1); // сравнение результата1
        Assertions.assertEquals(expectedResult2, result2); // сравнение результата2
    }
    @Test
    public void testMultiplyResult() {
        int a = 2;
        int b = 2; //набор параметров для теста 1
        int expectedResult1 = 4;
        int c = 5;
        int d = 8; //набор параметров для теста 2
        int expectedResult2 = 40;

        long result1 = calcUnderTest.multiply(a, b);
        long result2 = calcUnderTest.multiply(c, d);

        Assertions.assertEquals(expectedResult1, result1); // сравнение результата1
        Assertions.assertEquals(expectedResult2, result2); // сравнение результата2
    }
    @Test
    public void testDivideResult() {
        int a = 2; int b = 1; //набор параметров для теста 1
        double expectedResult1 = 2;
        int c = 5; int d = 2; //набор параметров для теста 2
        double expectedResult2 = 2.5;

        Number result1 = calcUnderTest.divide(a, b);
        Number result2 = calcUnderTest.divide(c, d);

        Assertions.assertEquals(expectedResult1, result1); // сравнение результата1
        Assertions.assertEquals(expectedResult2, result2); // сравнение результата2
    }
    @Test
    public void testDivideByZero() {
       int a = 15; int b = 0;
       IllegalArgumentException thrown =  Assertions.assertThrows(IllegalArgumentException.class,
               ()-> calcUnderTest.divide(a, b)); //мы ожидаем, IllegalArgumentException в блоке кода
      }
}
