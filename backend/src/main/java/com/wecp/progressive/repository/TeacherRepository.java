package com.wecp.progressive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;
=======
>>>>>>> 36ba4ae48a39846962d298c39aef58050b1b8049

import com.wecp.progressive.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher ,Integer> {
<<<<<<< HEAD

@Query("select t from Teacher t where t.id=teacherid")
 public Teacher findByTeacherId(@Param("teacherId") int teacherId);
=======
>>>>>>> 36ba4ae48a39846962d298c39aef58050b1b8049
}
