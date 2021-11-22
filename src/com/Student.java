package com;

public class Student implements Comparable<Student> {

	private String Name;
	private int id;
	
	
	
	public Student(String name, int id) {
		
		Name = name;
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int compareTo(Student o) {
		
		if (id>o.id)
		return -1;
		else
			return 1;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", id=" + id + "]";
	}
	
	
	
}
