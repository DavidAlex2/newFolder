package problemsToDo;

import java.util.Date;

public class Student {
	
	private int id,age;
	private String name,dept;
	public Student(int id, String name, String dept, int age) {

		this.name=name;	
		this.id=id;
		this.dept=dept;
		this.age= age;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public String getDept() {
		return dept;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}

	public  String toString() {
		return id+" "+name+" "+dept+" "+age;
	}
}	