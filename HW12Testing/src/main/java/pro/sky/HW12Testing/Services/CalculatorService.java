package pro.sky.HW12Testing.Services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService { // методы класса делают только вычисления в данном случае и ничего больше,
    // если потребуется создать строку или еще какие то методы, отличные от вычислений,
    // то необходимо создавать новый класс(ы) сервиса.

    public int sum(int num1, int num2){
        return num1 + num2;
    }
    public int subtraction(int num1, int num2){
        return num1 - num2;
    }
    public int multiply(int num1, int num2){
        return num1 * num2;
    }
    public Number divide(int num1, int num2){
        if (num2 == 0) {
            throw new IllegalArgumentException ("Ошибка!!! Делить на 0 запрещено");
        }
        return (double) num1 / num2;
    }
}


