package s14.Aula131_exercicio1.entities;

import s14.Aula131_exercicio1.entities.enums.Color;

public abstract class Shape {

	protected Color color;
	
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public abstract Double area();
	
	@Override
	public String toString() {
		return String.format("%.2f", area());
	}
	
}
