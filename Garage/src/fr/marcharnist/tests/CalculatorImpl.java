package fr.marcharnist.tests;

import fr.marcharnist.garage.Calculator;

public class CalculatorImpl implements Calculator{

	@Override
	public int multiply(int a, int b) {
		return a*b;
	}

	@Override
	public int divide(int a, int b) {
		return a/b;
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		return a-b;
	}

}
