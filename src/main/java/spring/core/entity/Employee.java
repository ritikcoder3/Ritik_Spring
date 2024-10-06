package spring.core.entity;

import java.util.*;

public class Employee {
	private int id;
	private String name;
	private String gender;
	private Address address;
	private List<String> contacts;
	private Set<Integer> set;
	private Map<Integer, String> map;
	
	
	public Employee() {
		super();
		System.out.println("hello Employee");   // constructor calling without create object new keyword
		System.out.println("----------------");
	}
	
	public Employee(int id, String name, String gender, Address address, List<String> contacts, Set<Integer> set,
			Map<Integer, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.contacts = contacts;
		this.set = set;
		this.map = map;
		
	}




	public List<String> getContacts() {
		return contacts;
		
	}

	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
		
	}

	public Set<Integer> getSet() {
		return set;
	}

	public void setSet(Set<Integer> set) {
		this.set = set;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
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
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", contacts="
				+ contacts + ", set=" + set + ", map=" + map + "]";
	}
	
	
	
//	public void display() 
//	{
//		System.out.println("Id : "+id);	
//		System.out.println("Name : "+name);
//		System.out.println("Gender : "+gender);
//		
//	}

}
