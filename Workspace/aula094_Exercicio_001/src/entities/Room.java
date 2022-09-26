package entities;

public class Room {
	
	private String name;
	private String email;
	private int Number;
	
	public Room() {
	}
	
	public Room(String name, String email, int number) {
		this.name = name;
		this.email = email;
		Number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}
	
	public String toString() {
		return Number
				+ ": "
				+ name
				+ ", "
				+ email;
	}

}
