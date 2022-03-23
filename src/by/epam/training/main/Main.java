package by.epam.training.main;

import by.epam.training.entity.Triangle;

public class Main {
	public static void main(String[] args) {
		
		Triangle triangle1 = new Triangle();
		Triangle triangle2 = new Triangle(5,6,7);
		
		System.out.println(triangle1);
		System.out.println(triangle2);
		
	}
}
