package th.model;

import com.google.protobuf.Internal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String address;
    private Date birthDay;
    private String imageUrl;
    @Column(length = 15)
    private String phoneNumber;
    private boolean sex;
    @Column(length = 100)
    private String studentName;
}
