package com.siiet.lamdaexpressiondemo;

public class Parameterdemo {
	public static void main(String[] args) {
		Cube c=(a)->return{(a*a*a);};
		System.out.println("cube of anumber"+c.calculate(3));
		
		
	}

}
