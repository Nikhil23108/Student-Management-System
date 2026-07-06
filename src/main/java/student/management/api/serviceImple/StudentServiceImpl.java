package student.management.api.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.management.api.entity.Student;
import student.management.api.repository.StudentRepository;
import student.management.api.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository repository;

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student getStudent(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(int id, Student student) {

        Student s = repository.findById(id).orElse(null);

        if(s!=null)
        {
            s.setName(student.getName());
            s.setCourse(student.getCourse());
            s.setMarks(student.getMarks());

            return repository.save(s);
        }

        return null;
    }

    @Override
    public void deleteStudent(int id) {

        repository.deleteById(id);

    }

    @Override
    public List<Student> getStudentsByCourse(String course) {

        return repository.findByCourse(course);

    }

}
