package s13.Aula113_exemplo1.entities;

import java.util.Date;

import s13.Aula113_exemplo1.entities.enums.OrderStatus;

public class Order {
	
	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	public Order() {}

	public Order(Integer id, Date moent, OrderStatus status) {
		this.id = id;
		this.moment = moent;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoent() {
		return moment;
	}

	public void setMoent(Date moent) {
		this.moment = moent;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
}
