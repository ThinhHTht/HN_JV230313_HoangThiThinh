package th.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import th.dto.UpdateStudentRequest;
import th.model.Student;
import th.service.StudentService;

import java.io.File;
import java.io.IOException;

@Component
public class UpdateStudentMapper implements GennericMapper<UpdateStudentRequest, Student, Student> {
    private static final String uploadPath = "C:\\Users\\admin\\Desktop\\Coding course\\Module 4\\Exam_JavaCore_Webapp\\src\\main\\webapp\\uploads";
    @Autowired
    private StudentService service;
    @Override
    public Student mapperRequestToEntity(UpdateStudentRequest updateStudentRequest) {
        // chuyển đổi request thành entity
        Student student = new Student();
        if (updateStudentRequest.getFile().getSize()!=0){
            // upload file
            student.setImageUrl(updateStudentRequest.getFile().getOriginalFilename());

            try {
                FileCopyUtils.copy(updateStudentRequest.getFile().getBytes(),new File(uploadPath+File.separator+updateStudentRequest.getFile().getOriginalFilename()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else {
            student.setImageUrl(service.findById(updateStudentRequest.getStudentId()).getImageUrl());
        }
        student.setStudentId(updateStudentRequest.getStudentId());
        student.setStudentName(updateStudentRequest.getStudentName());
        student.setSex(updateStudentRequest.isSex());
        student.setAddress(updateStudentRequest.getAddress());
        student.setBirthDay(updateStudentRequest.getBirthDay());
        student.setPhoneNumber(updateStudentRequest.getPhoneNumber());
        return student;
    }

    @Override
    public Student mapperEntityToResponse(Student student) {
        return null;
    }
}
