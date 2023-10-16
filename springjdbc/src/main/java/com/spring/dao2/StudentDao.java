package com.spring.dao2;

import java.util.List;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studId);
	public Student getStudent(int studentId);
	public List<Student>getAllStudents();
}
