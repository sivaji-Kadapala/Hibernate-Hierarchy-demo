package com.tablePerClass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("regularemployee")
public class Regular_Employee  extends Employee{

	private int bonus;  
	private double salary;
	public Regular_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Regular_Employee(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	public Regular_Employee(int bonus, double salary) {
		super();
		this.bonus = bonus;
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
