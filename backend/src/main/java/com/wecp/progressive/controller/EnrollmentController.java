package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Enrollment;
<<<<<<< HEAD
import com.wecp.progressive.service.impl.EnrollmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

=======
import com.wecp.progressive.service.EnrollmentService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.ResponseEntity;

import java.util.List;
>>>>>>> 7b30f20d97e4c2f5521b599e2155275bdaaf09df
@RestController
@RequestMapping("/enrollment")
public class EnrollmentController {
    @Autowired
<<<<<<< HEAD
    private EnrollmentServiceImpl enrollmentServiceImpl;

    @GetMapping
    public ResponseEntity<List<Enrollment>> getAllEnrollments() {
        try {
            List<Enrollment> enrollmentList = enrollmentServiceImpl.getAllEnrollments();
            return new ResponseEntity<>(enrollmentList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<?> createEnrollment(@RequestBody Enrollment enrollment) {
        try {
            int enrollmentId = enrollmentServiceImpl.createEnrollment(enrollment);
            return new ResponseEntity<>(enrollmentId, HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }  catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(("/{enrollmentId}"))
    public ResponseEntity<?> updateEnrollment(@PathVariable int enrollmentId, @RequestBody Enrollment enrollment) {
        try {
            enrollment.setEnrollmentId(enrollmentId);
            enrollmentServiceImpl.updateEnrollment(enrollment);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{enrollmentId}")
    public ResponseEntity<?> getEnrollmentById(@PathVariable int enrollmentId) {
        try {
            Enrollment enrollment = enrollmentServiceImpl.getEnrollmentById(enrollmentId);
            return new ResponseEntity<>(enrollment, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/student/{studentId}")
    public ResponseEntity<List<Enrollment>> getAllEnrollmentsByStudent(@PathVariable int studentId) {
        try {
            List<Enrollment> enrollmentList = enrollmentServiceImpl.getAllEnrollmentsByStudent(studentId);
            return new ResponseEntity<>(enrollmentList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/course/{courseId}")
    public ResponseEntity<List<Enrollment>> getAllEnrollmentsByCourse(@PathVariable int courseId) {
        try {
            List<Enrollment> enrollmentList = enrollmentServiceImpl.getAllEnrollmentsByCourse(courseId);
            return new ResponseEntity<>(enrollmentList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
=======
    EnrollmentService enrollmentService;


    public ResponseEntity<List<Enrollment>> getAllEnrollments() {
        return null;
    }
    @PostMapping
    public ResponseEntity<Integer> createEnrollment(@RequestBody Enrollment enrollment) {
        return new ResponseEntity<>(enrollmentService.createEnrollment(enrollment),HttpStatus.CREATED);

    }

    public ResponseEntity<Void> updateEnrollment(int enrollmentId, Enrollment enrollment) {
        return null;
    }

    public ResponseEntity<Enrollment> getEnrollmentById(int enrollmentId) {
        return null;
    }

    public ResponseEntity<List<Enrollment>> getAllEnrollmentsByStudent(int studentId) {
        return null;
    }

    public ResponseEntity<List<Enrollment>> getAllEnrollmentsByCourse(int courseId) {
        return null;
    }

}
>>>>>>> 7b30f20d97e4c2f5521b599e2155275bdaaf09df
