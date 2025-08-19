package com.example.student_service.Service;

import com.example.student_service.Model.Student;
import com.example.student_service.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public List<Student> findAllStudentsBySchool(Integer schoolId) {
        return studentRepository.findAllBySchoolId(schoolId);
    }
}

