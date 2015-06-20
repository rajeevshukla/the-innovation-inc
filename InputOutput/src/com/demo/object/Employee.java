package com.demo.object;

import java.io.Serializable;

public class Employee  implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7304849930877736216L;
	private int id;
	private String name;
	private int age;
	private float salary;
	
	transient private Address address;
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(int id,String name,int age) {
          this.id=id;
          this.name=name;
          this.age=age;
          System.out.println("inside constructor.");
	}

	
	
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	
	
}
