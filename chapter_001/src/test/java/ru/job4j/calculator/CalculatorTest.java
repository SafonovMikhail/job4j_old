package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest  {
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(6D, 1D);
        double expected = 7D;
        assertThat(result, is(expected));
    }
    @Test
	public void whenDiv6On2Then1() {
		Calculator calc = new Calculator();
        double result = calc.div(6D, 2D);
        double expected = 3D;
        assertThat(result, is(expected));	
	}
	@Test
	public void whenMult6On2Then1() {
		Calculator calc = new Calculator();
        double result = calc.mult(6D, 2D);
        double expected = 12D;
        assertThat(result, is(expected));	
	}
	@Test
	public void whenSubs6On2Then1() {
		Calculator calc = new Calculator();
        double result = calc.sub(6D, 2D);
        double expected = 4D;
        assertThat(result, is(expected));	
	}

}