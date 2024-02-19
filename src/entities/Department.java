package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private int payDay;
	private Address address;
	private List<Employee> employees;

	public Department() {

		employees = new ArrayList<>();
	};

	public Department(String name, int payDay, Address address, List<Employee> employees) {
		this.name = name;
		this.payDay = payDay;
		this.setAddress(address);
		this.employees = employees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployees() {
        return employees;
    }
	
	
	public void addEmployee(Employee employee) {
		if(employees == null) {
			employees = new ArrayList<>();
		}
       employees.add(employee);
	}

	public void removeEmployee(Employee employee) {

	}

	public double payroll() {
		double totalPayroll = 0;
		for (Employee employee : employees) {
			totalPayroll += employee.getSalary();
		}
		return totalPayroll;
	}

	@Override
    public String toString() {
        return "Department{" + "name='" + name + '\'' + ", payDay=" + payDay + ", employees=" + employees + '}';
    }


}
