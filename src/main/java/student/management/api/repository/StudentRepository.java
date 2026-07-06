package student.management.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import student.management.api.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
    List<Student> findByCourse(String course);

}
