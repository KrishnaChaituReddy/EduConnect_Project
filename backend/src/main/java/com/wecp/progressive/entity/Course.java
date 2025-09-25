package com.wecp.progressive.entity;

<<<<<<< HEAD
import javax.persistence.CascadeType;
=======
>>>>>>> 36ba4ae48a39846962d298c39aef58050b1b8049
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;
=======
>>>>>>> 36ba4ae48a39846962d298c39aef58050b1b8049

@Entity
public class Course {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int courseId;
private String courseName;
private String description;
<<<<<<< HEAD
@JoinColumn(name="teacher_id")
private int teacherId;
@ManyToOne (cascade = CascadeType.MERGE)
private Teacher teacher;
=======
private int teacherId;
>>>>>>> 36ba4ae48a39846962d298c39aef58050b1b8049


public Course() {
}

public int getCourseId() {
    return courseId;
}

public void setCourseId(int courseId) {
    this.courseId = courseId;
}

public String getCourseName() {
    return courseName;
}

public void setCourseName(String courseName) {
    this.courseName = courseName;
}

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

public int getTeacherId() {
    return teacherId;
}

public void setTeacherId(int teacherId) {
    this.teacherId = teacherId;
}

public Course(int courseId, String courseName, String description, int teacherId) {
    this.courseId = courseId;
    this.courseName = courseName;
    this.description = description;
    this.teacherId = teacherId;
}




}