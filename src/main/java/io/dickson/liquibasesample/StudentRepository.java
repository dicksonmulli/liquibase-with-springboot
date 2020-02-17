package io.dickson.liquibasesample;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    @Query("SELECT name FROM Student s WHERE s.name LIKE %:studentName%")
    String findByName(String studentName);


}
