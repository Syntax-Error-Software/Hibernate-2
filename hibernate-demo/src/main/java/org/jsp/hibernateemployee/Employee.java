package org.jsp.hibernateemployee;
import javax.persistence.*;
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="name" ,nullable=false)
	private String name;
	@Column(name="phone",nullable=false,unique=true)
	private long phnone;
	@Column(nullable=false,unique=true)
	private String email;
	@Column(nullable=false)
	private String desig;
	@Column(nullable=false)
	private double salary;
	@Column(nullable=false)
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhnone() {
		return phnone;
	}
	public void setPhnone(long phnone) {
		this.phnone = phnone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phnone=" + phnone + ", email=" + email + ", desig=" + desig
				+ ", salary=" + salary + ", password=" + password + "]";
	}
	
	

}
