package com.lvzhu.springboot.lvzhu.mvc.pojo;

/**
 * @author lvzhu.
 * Time 2019-12-19 22:53
 * Desc 文件描述
 */
public class User {

	private String name;

	private Integer age;


	public User() {
	}


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

	private void init(){
		System.out.println("User is new ");
	}
}
