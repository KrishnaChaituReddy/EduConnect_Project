package com.wecp.progressive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wecp.progressive.entity.User;
<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> bec44b4b13549dd02f89397c695618ea943c3414

public interface UserRepository extends JpaRepository<User,Integer>{


    @Query("select u from User u LEFT JOIN FETCH u.student LEFT JOIN FETCH u.teacher where u.username=:username")
<<<<<<< HEAD
    public User findByUsernameWithDetails(@Param("username")String username);
=======
    public User findByUsername(@Param("username")String username);
>>>>>>> bec44b4b13549dd02f89397c695618ea943c3414
    // public User findByTeacherId(int teacherId);
    // public User findByStudentId(int studentId);
    // public void deleteByTeacher(int teacherId);
    // public void deleteByStudentId(int studentId);
<<<<<<< HEAD
    public User findByUsername(String username);
=======
>>>>>>> bec44b4b13549dd02f89397c695618ea943c3414
}
