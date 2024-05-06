package th.service;

import th.dto.CreateStudentRequest;
import th.dto.UpdateStudentRequest;
import th.model.Student;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface StudentService {
    List<Student> findAll();
    void save(CreateStudentRequest request);
    void delete(int studentId);

    Student findById(int studentId);

    void update(UpdateStudentRequest request);

    List<Student> findByName(String name);



}
