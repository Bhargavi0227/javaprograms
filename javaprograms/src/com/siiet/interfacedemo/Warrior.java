package com.siiet.interfacedemo;

public class Warrior  {
	public void use() {
	System.out.println("welcome");
	}
	public void attack() {
		System.out.println("attack");
		
	}
	public static void main(String[] args) {
		Warrior w=new Warrior();
		w.attack();
		w.use();
	}
	

}
