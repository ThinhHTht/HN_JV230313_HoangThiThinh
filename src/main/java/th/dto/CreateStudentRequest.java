package th.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Column;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CreateStudentRequest {
    private String address;
    private Date birthDay;
    private MultipartFile file;
    private String phoneNumber;
    private Boolean sex;
    private String studentName;
}
