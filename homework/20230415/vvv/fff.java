package vvvvvvv1;

public class fff {
	public String name;
	private double salary;
	
	public Employee (String empName) {
			name = empName;
	}
	
	public void setSalary(double empSalary) {
			salary = empSalary;
	}
	public void printEmpInfo (String empName double empSalary) {
		system.out.printIN("name: " + empName + "\nSalary: " + empSalary);
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Cody");
		emp1.setSalary(10000.0);
		emp1.printEmpInfo();
	}

}
