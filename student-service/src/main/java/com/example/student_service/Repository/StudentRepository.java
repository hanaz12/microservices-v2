package com.example.student_service.Repository;

import com.example.student_service.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
List<Student> findAllBySchoolId(Integer schoolId);
}
