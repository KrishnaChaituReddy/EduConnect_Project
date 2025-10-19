package com.wecp.progressive.service.impl;
<<<<<<< HEAD
import com.wecp.progressive.entity.Enrollment;
import com.wecp.progressive.repository.CourseRepository;
import com.wecp.progressive.repository.EnrollmentRepository;
import com.wecp.progressive.repository.StudentRepository;
import com.wecp.progressive.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
=======
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.controller.EnrollmentController;
import com.wecp.progressive.entity.Enrollment;
import com.wecp.progressive.repository.EnrollmentRepository;
import com.wecp.progressive.service.EnrollmentService;
@Service
public class EnrollmentServiceImpl implements EnrollmentService {


    @Autowired
    EnrollmentRepository enrollmentRepository;
    @Override
    public List<Enrollment> getAllEnrollments() {
       return enrollmentRepository.findAll();
>>>>>>> 7b30f20d97e4c2f5521b599e2155275bdaaf09df
    }

    @Override
    public int createEnrollment(Enrollment enrollment) {
<<<<<<< HEAD
        int studentId = enrollment.getStudent().getStudentId();
        int courseId = enrollment.getCourse().getCourseId();

        if (enrollmentRepository.findByStudent_StudentIdAndCourse_CourseId(studentId, courseId).isPresent()) {
            throw new RuntimeException("Student is already enrolled in this course.");
        }

        enrollment.setEnrollmentDate(new Date());
        return enrollmentRepository.save(enrollment).getEnrollmentId();
    }

    @Override
    public void updateEnrollment(Enrollment updatedEnrollment) {
        Enrollment existingEnrollment = enrollmentRepository.findById(updatedEnrollment.getEnrollmentId())
                .orElseThrow(() -> new RuntimeException("Enrollment not found with ID: " + updatedEnrollment.getEnrollmentId()));

        existingEnrollment.setStudent(updatedEnrollment.getStudent());
        existingEnrollment.setCourse(updatedEnrollment.getCourse());
        existingEnrollment.setEnrollmentDate(new Date());

        enrollmentRepository.save(existingEnrollment);
=======
        enrollmentRepository.save(enrollment);
        return enrollment.getEnrollmentId();
    }

    @Override
    public void updateEnrollment(Enrollment enrollment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateEnrollment'");
>>>>>>> 7b30f20d97e4c2f5521b599e2155275bdaaf09df
    }

    @Override
    public Enrollment getEnrollmentById(int enrollmentId) {
<<<<<<< HEAD
        return enrollmentRepository.findById(enrollmentId)
                .orElseThrow(() -> new RuntimeException("Enrollment not found with ID: " + enrollmentId));
=======
        return enrollmentRepository.findById(enrollmentId).get();
>>>>>>> 7b30f20d97e4c2f5521b599e2155275bdaaf09df
    }

    @Override
    public List<Enrollment> getAllEnrollmentsByStudent(int studentId) {
<<<<<<< HEAD
        return enrollmentRepository.findAllByStudent_StudentId(studentId);
=======
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllEnrollmentsByStudent'");
>>>>>>> 7b30f20d97e4c2f5521b599e2155275bdaaf09df
    }

    @Override
    public List<Enrollment> getAllEnrollmentsByCourse(int courseId) {
<<<<<<< HEAD
        return enrollmentRepository.findAllByCourse_CourseId(courseId);
    }
=======
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllEnrollmentsByCourse'");
    }

>>>>>>> 7b30f20d97e4c2f5521b599e2155275bdaaf09df
}