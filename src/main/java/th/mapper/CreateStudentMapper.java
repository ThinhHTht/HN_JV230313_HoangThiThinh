package th.mapper;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import th.dto.CreateStudentRequest;
import th.model.Student;

import java.io.File;
import java.io.IOException;

@Component
public class CreateStudentMapper implements GennericMapper<CreateStudentRequest, Student, Student>{
    private static final String uploadPath = "C:\\Users\\admin\\Desktop\\Coding course\\Module 4\\Exam_JavaCore_Webapp\\src\\main\\webapp\\uploads";
    @Override
    public Student mapperRequestToEntity(CreateStudentRequest createStudentRequest) {
        Student student = new Student();
        if (createStudentRequest.getFile().getSize()!=0){
            student.setImageUrl(createStudentRequest.getFile().getOriginalFilename());

            try {
                FileCopyUtils.copy(createStudentRequest.getFile().getBytes(),new File(uploadPath+File.separator+createStudentRequest.getFile().getOriginalFilename()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        student.setStudentName(createStudentRequest.getStudentName());
        student.setSex(createStudentRequest.getSex());
        student.setAddress(createStudentRequest.getAddress());
        student.setBirthDay(createStudentRequest.getBirthDay());
        student.setPhoneNumber(createStudentRequest.getPhoneNumber());
        return student;
    }

    @Override
    public Student mapperEntityToResponse(Student student) {
        return null;
    }
}
