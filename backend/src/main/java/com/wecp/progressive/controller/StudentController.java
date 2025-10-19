package com.wecp.progressive.controller;

<<<<<<< HEAD
import com.wecp.progressive.dto.StudentDTO;
import com.wecp.progressive.entity.Student;
import com.wecp.progressive.service.impl.StudentServiceImplArraylist;
import com.wecp.progressive.service.impl.StudentServiceImplJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

=======
import com.wecp.progressive.entity.Student;
import com.wecp.progressive.repository.StudentRepository;
import com.wecp.progressive.service.StudentService;
import com.wecp.progressive.service.impl.StudentServiceImplArraylist;
import com.wecp.progressive.service.impl.StudentServiceImplJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




>>>>>>> 7b30f20d97e4c2f5521b599e2155275bdaaf09df
@RestController
@RequestMapping("/student")
public class StudentController {

<<<<<<< HEAD
    @Autowired
    StudentServiceImplArraylist studentServiceImplArraylist;

    @Autowired
    StudentServiceImplJpa studentServiceImplJpa;

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        try {
            List<Student> studentList = studentServiceImplJpa.getAllStudents();
            return new ResponseEntity<>(studentList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable int studentId) {
        try {
            Student student = studentServiceImplJpa.getStudentById(studentId);
            return new ResponseEntity<>(student, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<?> addStudent(@RequestBody Student student) {
        try {
            int studentId = studentServiceImplJpa.addStudent(student);
            return new ResponseEntity<>(studentId, HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>("An error occurred", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{studentId}")
    public ResponseEntity<?> updateStudent(@PathVariable int studentId, @RequestBody StudentDTO student) {
        try {
            student.setStudentId(studentId);
            studentServiceImplJpa.modifyStudentDetails(student);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>("An error occurred", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int studentId) {
        try {
            studentServiceImplJpa.deleteStudent(studentId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/fromArrayList")
    public ResponseEntity<List<Student>> getAllStudentFromArrayList() {
        List<Student> studentList = studentServiceImplArraylist.getAllStudents();
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    @PostMapping("/toArrayList")
    public ResponseEntity<Integer> addStudentToArrayList(@RequestBody Student student) {
        int studentListSize = studentServiceImplArraylist.addStudent(student);
        return new ResponseEntity<>(studentListSize, HttpStatus.CREATED);
    }

    @GetMapping("/fromArrayList/sorted")
    public ResponseEntity<List<Student>> getAllStudentSortedByNameFromArrayList() {
        List<Student> studentList = studentServiceImplArraylist.getAllStudentSortedByName();
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }
}
=======
@Autowired
private StudentServiceImplArraylist studentServiceImplArraylist;
// @Autowired
// private StudentServiceImplJpa studentServiceImplJpa;
@Autowired
private StudentService studentService;
@GetMapping
    public ResponseEntity<List<Student>> getAllStudents()  {
        return new ResponseEntity<>(studentServiceImplArraylist.getAllStudents(),HttpStatus.OK);
    }
//     @GetMapping("/{studentId}")
// public String getMethodName(@RequestParam String param) {
//     return new String();
// }
@GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable int studentId) throws Exception{
        return new ResponseEntity<>(studentService.getStudentById(studentId),HttpStatus.OK);
    }
// @PostMapping
// public String postMethodName(@RequestBody String entity) {
    
//     return entity;
// }

public String postMethodName(@RequestBody String entity) {
    //TODO: process POST request
    
    return entity;
}
@PostMapping
    public ResponseEntity<Integer> addStudent( @RequestBody Student student) throws Exception {
      Integer result= studentService.addStudent(student);
        
        return new ResponseEntity<>(result ,HttpStatus.CREATED);
        
    }
    @GetMapping("/fromArrayList")
    public ResponseEntity<List<Student>> getAllStudentFromArrayList() {

         return new ResponseEntity<>(studentServiceImplArraylist.getAllStudents(),HttpStatus.CREATED);
    }

// public String getMethodName(@RequestParam String param) {
//     return new String();
// }
@GetMapping("/fromArrayList/sorted")
    public ResponseEntity<List<Student>> getAllStudentSortedByNameFromArrayList() throws Exception {
        return new ResponseEntity<>(studentServiceImplArraylist.getAllStudentSortedByName(),HttpStatus.CREATED);
  }
    // @PutMapping("/{studentId}")
    // public String putMethodName(@PathVariable String id, @RequestBody String entity) {
    //     //TODO: process PUT request
        
    //     return entity;
    // }
    @PutMapping("/{studentId}")
    public ResponseEntity<Void> updateStudent(@PathVariable int studentId, @RequestBody Student student) throws Exception{
        studentService.updateStudent(student);
        return new ResponseEntity<>(HttpStatus.OK);
      
    }
    @DeleteMapping("/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int studentId) throws Exception{
        studentService.deleteStudent(studentId);
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

  
    // public String getMethodName(@RequestParam String param) {
    //     return new String();
    // }
   

    // @GetMapping("/toArrayList")
    // public String getMethodName(@RequestParam String param) {
    //     return new String();
    // }
    @PostMapping("/toArrayList")
    public ResponseEntity<Integer> addStudentToArrayList(@RequestBody Student student) {
       return new ResponseEntity<>(studentServiceImplArraylist.addStudent(student),HttpStatus.CREATED);
    }
// @GetMapping()
// public String getMethodName(@RequestParam String param) {
//     return new String();
// }

   
}
>>>>>>> 7b30f20d97e4c2f5521b599e2155275bdaaf09df
