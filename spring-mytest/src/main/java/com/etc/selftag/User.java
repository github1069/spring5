package com.etc.selftag;

/**
 * @author root
 * @create 2021/10/3 21:11
 */
public class User {
	private String name;
	private Integer age;
	private String email;
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				", email='" + email + '\'' +
				", phone='" + phone + '\'' +
				'}';
	}
}
