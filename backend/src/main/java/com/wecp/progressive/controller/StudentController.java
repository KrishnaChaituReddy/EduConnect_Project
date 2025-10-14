package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Student;
<<<<<<< HEAD
import com.wecp.progressive.repository.StudentRepository;
=======
>>>>>>> bec44b4b13549dd02f89397c695618ea943c3414
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




@RestController
@RequestMapping("/student")
public class StudentController {
<<<<<<< HEAD

@Autowired
private StudentServiceImplArraylist studentServiceImplArraylist;
// @Autowired
// private StudentServiceImplJpa studentServiceImplJpa;
@Autowired
private StudentService studentService;
=======
//abc
//123
//tdcgfkudtxfhcgj
@Autowired
private StudentServiceImplArraylist studentServiceImplArraylist;
@Autowired
private StudentServiceImplJpa studentServiceImplJpa;
>>>>>>> bec44b4b13549dd02f89397c695618ea943c3414
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
<<<<<<< HEAD
        return new ResponseEntity<>(studentService.getStudentById(studentId),HttpStatus.OK);
=======
        return new ResponseEntity<>(studentServiceImplJpa.getStudentById(studentId),HttpStatus.OK);
>>>>>>> bec44b4b13549dd02f89397c695618ea943c3414
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
<<<<<<< HEAD
    public ResponseEntity<Integer> addStudent( @RequestBody Student student) throws Exception {
      Integer result= studentService.addStudent(student);
=======
    public ResponseEntity<Integer> addStudent( @RequestBody Student student) {
      Integer result= studentServiceImplArraylist.addStudent(student);
>>>>>>> bec44b4b13549dd02f89397c695618ea943c3414
        
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
<<<<<<< HEAD
        studentService.updateStudent(student);
=======
        studentServiceImplJpa.updateStudent(student);
>>>>>>> bec44b4b13549dd02f89397c695618ea943c3414
        return new ResponseEntity<>(HttpStatus.OK);
      
    }
    @DeleteMapping("/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int studentId) throws Exception{
<<<<<<< HEAD
        studentService.deleteStudent(studentId);
=======
        studentServiceImplJpa.deleteStudent(studentId);
>>>>>>> bec44b4b13549dd02f89397c695618ea943c3414
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
