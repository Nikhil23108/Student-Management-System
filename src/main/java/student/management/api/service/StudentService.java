package student.management.api.service;

import java.util.List;

import student.management.api.entity.Student;

public interface StudentService {
	
	 Student saveStudent(Student student);

	    List<Student> getAllStudents();

	    Student getStudent(int id);

	    Student updateStudent(int id, Student student);

	    void deleteStudent(int id);

	    List<Student> getStudentsByCourse(String course);

}
