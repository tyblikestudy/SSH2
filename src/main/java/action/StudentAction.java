package action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import model.Student;
import service.StudentServerImpl;

@Controller(value="studentAction")
public class StudentAction {
	@Autowired
	private StudentServerImpl studentServerImpl;
	
	private List<Student>students=new ArrayList<>();
	private Student student;
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public String do_query(){
		students=studentServerImpl.queryAll(student);
		return "list";
	}
	public String remove(){
		studentServerImpl.delete(student);
		return "remove";
	}
	public String edit(){
		student=studentServerImpl.info(student);
		return "do_edit";
	}
	public String to_edit(){
		studentServerImpl.edit(student);
		return "to_edit";
	}
	public String add(){
		studentServerImpl.save(student);
		return "add";
	}
	public String findStudent(){
		studentServerImpl.queryAll(student);
		return "find";
	}
}
