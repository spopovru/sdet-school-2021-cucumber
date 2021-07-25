package ru.nspk.demo;

import lombok.Getter;
import lombok.Setter;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;

public class Calculator {

    @Getter @Setter
    private Double argument1 = null;
    @Getter @Setter
    private Double argument2 = null;
    @Getter
    private Double result;
				
    public void executeAddition() {
        checkArguments();
        result = getArgument1() + getArgument2();
    }

    public void executeSubtraction() {
        checkArguments();
        result = getArgument1() - getArgument2();
    }

    public void executeMultiplication() {
        checkArguments();
	    result = getArgument1() * getArgument2();
    }

    public void executeDivision() {
        checkArguments();
        assertNotEquals(getArgument2(), 0.0, "При делении второй аргумент не может быть нулём");
        result = getArgument1() / getArgument2();
    }

    public void executeAddition(Double argument1, Double argument2) {
        setArgument1(argument1);
        setArgument2(argument2);
        executeAddition();
    }

    public void executeSubtraction(Double argument1, Double argument2) {
        setArgument1(argument1);
        setArgument2(argument2);
        executeSubtraction();
    }

    public void executeMultiplication(Double argument1, Double argument2) {
        setArgument1(argument1);
        setArgument2(argument2);
        executeMultiplication();
    }

    public void executeDivision(Double argument1, Double argument2) {
        setArgument1(argument1);
        setArgument2(argument2);
        executeDivision();
    }

    private void checkArguments() {
        assertNotNull(getArgument1(), "Первый аргумент не может быть null");
        assertNotNull(getArgument2(), "Второй аргумент не может быть null");
    }

}
