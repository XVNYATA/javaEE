package org.fkjava.domain;

public class Dog {
	
	private String name;
	private String sex;
	private Integer age;
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
	
	

}
