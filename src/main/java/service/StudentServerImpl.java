package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.StudentDaoImpl;
import model.Student;

@Service
public class StudentServerImpl {

	@Autowired
	private StudentDaoImpl studentDaoImpl;

	public List<Student> queryAll(Student student) {
		return studentDaoImpl.queryAll(student);
	}

	public void save(Student student) {
		studentDaoImpl.save(student);
	}

	public void delete(Student student) {
		studentDaoImpl.delete(student);
	}

	public void edit(Student student) {
		studentDaoImpl.edit(student);
	}

	public Student info(Student student) {
		return studentDaoImpl.info(student);
	}

}
