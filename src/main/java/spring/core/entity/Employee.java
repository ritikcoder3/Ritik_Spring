package spring.core.entity;

public class Employee {
	private int id;
	private String name;
	private String gender;
	private Address address;
	
	
	public Employee() {
		super();
		System.out.println("hello Employee");   // constructor calling without create object new keyword
		System.out.println("----------------");
	}
	
	

	public Employee(int id, String name, String gender, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}
	
	
	
//	public void display() 
//	{
//		System.out.println("Id : "+id);	
//		System.out.println("Name : "+name);
//		System.out.println("Gender : "+gender);
//		
//	}

}
