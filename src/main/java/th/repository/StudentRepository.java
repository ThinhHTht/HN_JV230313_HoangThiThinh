package th.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.model.Student;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findStudentsByStudentName(String name);

}
