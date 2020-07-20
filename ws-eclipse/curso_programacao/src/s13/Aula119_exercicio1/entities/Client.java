package s13.Aula119_exercicio1.entities;

import java.util.Date;

public class Client {

	private String name;
	private String email;
	private Date birthDade;
	
	public Client() {
	}

	public Client(String name, String email, Date birthDade) {
		this.name = name;
		this.email = email;
		this.birthDade = birthDade;
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

	public Date getBirthDade() {
		return birthDade;
	}

	public void setBirthDade(Date birthDade) {
		this.birthDade = birthDade;
	}
	
}
