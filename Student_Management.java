package com.tasks;

public class Student_Management {

	private int id;
	private String name;
	private char grade;
	
	Student_Management(int id,String name,char grade){
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
    public int getId() {
        return id;
    }

	@Override
	public String toString() {
		return  "\n" + id + "\n" + name + "\n" + grade;
		
	}
}
