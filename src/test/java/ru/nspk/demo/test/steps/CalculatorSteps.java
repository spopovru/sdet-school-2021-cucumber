package ru.nspk.demo.test.steps;

import io.cucumber.java.ru.Дано;
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
	
	@Когда("выполнена операция вычитания")
	public void executeSubtraction() {
		calculator.executeSubtraction();
	}
	
	@Когда("^выполнена операция вычитания чисел (.+) и (.+)$")
	public void executeSubtraction(Double argument1, Double argument2) {
		calculator.executeSubtraction(argument1, argument2);
	}
    
	@Когда("выполнена операция умножения")
	public void executeMultiplication() {
		calculator.executeMultiplication();
	}
	
	@Когда("^выполнена операция умножения чисел (.+) и (.+)$")
	public void executeMultiplication(Double argument1, Double argument2) {
		calculator.executeMultiplication(argument1, argument2);
	}
	
	@Когда("выполнена операция деления")
	public void executeDivision() {
		calculator.executeDivision();
	}
	
	@Когда("^выполнена операция деления чисел (.+) и (.+)$")
	public void executeDivision(Double argument1, Double argument2) {
		calculator.executeDivision(argument1, argument2);
	}

    @Тогда("результат равен {double}")
    public void assertCurrentResult(Double exceptedResult) {
        Assert.assertEquals(calculator.getResult(), exceptedResult);
    }
}


