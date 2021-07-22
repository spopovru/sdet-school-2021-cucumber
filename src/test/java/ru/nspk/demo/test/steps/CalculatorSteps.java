package ru.nspk.demo.test.steps;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Пусть;
import io.cucumber.java.ru.Тогда;
import org.testng.Assert;
import ru.nspk.demo.Calculator;

public class CalculatorSteps {

    private Calculator calculator = new Calculator();

    @Пусть("первый аргумент равен {double}")
    public void setArgument1(Double argument1) {
        calculator.setArgument1(argument1);
    }

    @Пусть("второй аргумент равен {double}")
    public void setArgument2(Double argument2) {
        calculator.setArgument2(argument2);
    }

    @Когда("выполнена операция сложения")
    public void executeAddition() {
        calculator.executeAddition();
    }

    @Когда("^выполнена операция сложения чисел (.+) и (.+)$")
    public void executeAddition(Double argument1, Double argument2) {
        calculator.executeAddition(argument1, argument2);
    }

    @Тогда("результат равен {double}")
    public void assertCurrentResult(Double exceptedResult) {
        Assert.assertEquals(calculator.getResult(), exceptedResult);
    }

}


