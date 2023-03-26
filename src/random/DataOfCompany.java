package random;
class Member{
	String Name;
	int Age;
	String Phone_Number;
	String Address;
	int Salary;
	
	public void printSalary() {
		System.out.println(Salary);
	}
}

class Employee extends Member{
	String spealization;
}

class Manager extends Member{
	String Department;
}

public class DataOfCompany {
public static void main(String[] args) {
	Employee e = new Employee();
	e.Name= "Gaurang";
	e.Age = 23;
	e.Phone_Number = "9876543210";
	e.Address = "ahmedabad";
	e.Salary = 25000;
	e.spealization = "Java Developer";
	System.out.println(e.Name);
	System.out.println(e.Age);
	System.out.println(e.Phone_Number);
	System.out.println(e.Address);
	System.out.println(e.Salary);
	System.out.println(e.spealization);
	
	Manager m = new Manager();
	m.Department = "Accounts";
	System.out.println(m.Department);
}
}
