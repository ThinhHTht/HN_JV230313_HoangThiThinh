package th.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.dto.CreateStudentRequest;
import th.dto.UpdateStudentRequest;
import th.mapper.CreateStudentMapper;
import th.mapper.UpdateStudentMapper;
import th.model.Student;
import th.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{
    @Autowired
    private StudentRepository repository;
    @Autowired
    private CreateStudentMapper createStudentMapper;
    @Autowired
    private UpdateStudentMapper updateStudentMapper;

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(CreateStudentRequest request) {
       Student newStudent = createStudentMapper.mapperRequestToEntity(request);
       repository.save(newStudent);
    }

    @Override
    public void delete(int studentId) {
        repository.deleteById(studentId);
    }

    @Override
    public Student findById(int studentId) {
        return repository.findById(studentId).orElse(null);
    }

    @Override
    public void update(UpdateStudentRequest request) {
        repository.save(updateStudentMapper.mapperRequestToEntity(request));
    }

    @Override
    public List<Student> findByName(String name) {
        return repository.findStudentsByStudentName(name);
    }

}
