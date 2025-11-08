package Batch21.codingques;

public class Employee {
	
	int empid;
	String name;
	int age;
	String gender;
	String  dept;
	int yrOfJoining;
	double salary;
	
	
	
	
	
	public Employee(int empid,String name,int age, String gender, String dept, int yrOfJoining, double salary) {
		super();
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.yrOfJoining = yrOfJoining;
		this.salary = salary;
		this.name = name;
		this.empid= empid;
	}


	
	public int getempid() {
		return empid;
	}
	public void setempid(int empid) {
		this.empid = age;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getYrOfJoining() {
		return yrOfJoining;
	}
	public void setYrOfJoining(int yrOfJoining) {
		this.yrOfJoining = yrOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept
				+ ", yrOfJoining=" + yrOfJoining + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
	
	

}
