import { formatCurrency } from "@angular/common";
import { Student } from "../../models/Student";
import { Component } from "@angular/core";

@Component(
    {
        selector:"student-root",
        templateUrl:"./studentcreate.component.html",
        styleUrls:["./studentcreate.component.scss"]
    }
)
export class StudentCreateComponent {

    student:Student;
    // {
    //     studentId: 0,
    //     fullName: '',
    //     dateOfBirth: null,
    //     contactNumber: '',
    //     email: '',
    //     address: '',
        
    // };
    successMessage:string|null;
    errorMessage:string|null;
    constructor()
    {
        // this.student=new Student(1,"name",new Date("2003-08-23"),"12121","s@gmail.com","dqd");
        this.student=new Student(0,"",null,"","","");
        this.successMessage=null;
        this.errorMessage=null;
    }
    onSubmit():void{
        
        
        if(!this.student.fullName.trim()  ||!this.student.email.trim()  ||!this.student.contactNumber.trim() || this.student.studentId===null||!this.student.dateOfBirth)
        {
            // if(!this.student.fullName ||this.student.fullName.trim()|| !this.student.address  || !this.student.email ||this.student.email.trim() || !this.student.contactNumber ||this.student.contactNumber.trim() || this.student.studentId===null)
            //     {
            this.errorMessage='Please fill all fields.';
            this.successMessage=null;
        }
        else
        {
           
            this.successMessage='Student created successfully!';
            this.errorMessage=null;
        }

    }
    // resetForm():void{
    //     this.student= new Student(
    //     fullName:'',
    //     dateOfBirth:null,
    //     contactNumber:'',
    //     email:'',
    //     address:''
    //     )
    resetForm():void
    {
        this.student=new Student(0,'',null,'','','');
    
        this.successMessage=null;
        this.errorMessage=null;

        
    }
 
}
