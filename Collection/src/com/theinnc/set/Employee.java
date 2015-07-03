package com.theinnc.set;

public class Employee implements  Comparable<Employee>{

	private int id;
	private String name;
	private double salary;
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {

		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals method");
		Employee employee=(Employee)obj;
		return this.id==employee.getId();
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}

	@Override
	public int compareTo(Employee paramT) {
	
		if(this.getId()>paramT.getId()){
			return 1;
		}else if(this.getId()<paramT.getId()){
			return -1;
		}else {
			return 0;
		}
		
	}


}
