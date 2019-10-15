package com.company.entities;

public class Customer {
	private int id;
	private String name;
	private String surname;
	private String passport;

	public Customer(int id, String name, String surname, String passport) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.passport = passport;
	}

	public Customer() {
	}

	public int getId() { return id; }

	public void setId(int id) { this.id = id; }

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public String getSurname() { return surname; }

	public void setSurname(String surname) { this.surname = surname; }

	public String getPassport() { return passport; }

	public void setPassport(String passport) { this.passport = passport; }

	@Override
	public String toString() {
		return "Customer{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", passport='" + passport + '\'' +
				'}';
	}
}
