package com.spring.dao;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studId);
	public Student getStudent(int studentId);
}
