package org.jsp.customerfoodapp;
import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false)
	private String food_item;
	@Column(nullable = false)
	private double cost;
	@CreationTimestamp
	private LocalDateTime order_time;
	@UpdateTimestamp
	private LocalDateTime delivey_time;
	@Column(nullable = false)
	private String address;
	
	@ManyToOne
	private Customer customer;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFood_item() {
		return food_item;
	}
	public void setFood_item(String food_item) {
		this.food_item = food_item;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public LocalDateTime getOrder_time() {
		return order_time;
	}
	public void setOrder_time(LocalDateTime order_time) {
		this.order_time = order_time;
	}
	public LocalDateTime getDelivey_time() {
		return delivey_time;
	}
	public void setDelivey_time(LocalDateTime delivey_time) {
		this.delivey_time = delivey_time;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "FoodOrder [id=" + id + ", food_item=" + food_item + ", cost=" + cost + ", order_time=" + order_time
				+ ", delivey_time=" + delivey_time + ", address=" + address + "]";
	}
	
	
	
	

}
