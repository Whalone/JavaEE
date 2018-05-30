package com.models;

/**
 * Director entity. @author MyEclipse Persistence Tools
 */

public class Director implements java.io.Serializable {

	// Fields

	private String mid;
	private String name;
	private Integer age;

	// Constructors

	/** default constructor */
	public Director() {
	}

	/** full constructor */
	public Director(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	// Property accessors

	public String getMid() {
		return this.mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}