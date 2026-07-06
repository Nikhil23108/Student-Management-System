package student.management.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import student.management.api.entity.Student;
import student.management.api.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping
    public Student save(@RequestBody Student student)
    {
        return service.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAll()
    {
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id)
    {
        return service.getStudent(id);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable int id,
                          @RequestBody Student student)
    {
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id)
    {
        service.deleteStudent(id);
        return "Student Deleted Successfully";
    }

    @GetMapping("/course/{course}")
    public List<Student> getByCourse(@PathVariable String course)
    {
        return service.getStudentsByCourse(course);
    }

}