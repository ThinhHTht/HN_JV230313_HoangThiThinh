package th.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class UpdateStudentRequest {
    private int studentId;
    private String address;
    private Date birthDay;
    private MultipartFile file;
    private String phoneNumber;
    private boolean sex;
    private String studentName;
}
