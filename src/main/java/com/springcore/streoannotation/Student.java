package com.springcore.streoannotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu")
public class Student {
	private int studentId;
	@Value("Killa pardi")
	private String studentAddress;
	
	@Value("#{listid}")
	private List<String> studentNames;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}


	public List<String> getStudentNames() {
		return studentNames;
	}


	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentAddress=" + studentAddress + ", studentNames="
				+ studentNames + "]";
	}
	
	
		

}
