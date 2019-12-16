package com.derp;

import java.util.ArrayList;

import com.derp.Student;

public class StudentDataUtil {
	public static ArrayList<Student> getStudents() {
	ArrayList<Student> studentArr = new ArrayList<>();
	//String[] Students = {"Pete", "Rithwik", "Yousuf","Noah","Andrew"};
	studentArr.add(new Student("Peter","Baker","Banned"));
	studentArr.add(new Student("Noah","Zentz","Owner"));
	return studentArr;
	}
}
