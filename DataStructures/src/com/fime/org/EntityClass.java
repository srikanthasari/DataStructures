package com.fime.org;

public class EntityClass {
	private int id;
	private String name;

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

	public EntityClass(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "EntityClass [id=" + id + ", name=" + name + "]";
	}

}
