

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
    successMessage:string|null=null;
    errorMessage:string|null=null;
    constructor()
    {
        // this.student=new Student(1,"name",new Date("2003-08-23"),"12121","s@gmail.com","dqd");
        this.student=new Student(0,'',null,'','','');
        // this.successMessage=null;
        // this.errorMessage=null;
    }
    onSubmit():void{
        if(this.student.fullName &&this.student.email &&this.student.contactNumber && this.student.address)
        {
            // if(!this.student.fullName ||this.student.fullName.trim()|| !this.student.address  || !this.student.email ||this.student.email.trim() || !this.student.contactNumber ||this.student.contactNumber.trim() || this.student.studentId===null)
            //     {
           
            this.successMessage='Student created successfully!';
            this.errorMessage=null;
           this.student.logAttributes();
        }
        else
        {
            this.errorMessage='Please fill in all required fields.';
            this.successMessage=null;
            
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
// import { Component } from "@angular/core";
// import { NgForm } from "@angular/forms";
// import { Student } from "../../models/Student";

// @Component({
//   selector: "student-root",
//   templateUrl: "./studentcreate.component.html",
//   styleUrls: ["./studentcreate.component.scss"]
// })
// export class StudentCreateComponent {
//   student: Student = new Student(0, "", null, "", "", "");
//   successMessage: string | null = null;
//   errorMessage: string | null = null;

//   constructor() {}

//   onSubmit(form: NgForm): void {
//     if (form.invalid) {
//       this.errorMessage = "Please fill all required fields correctly.";
//       this.successMessage = null;
//     } else {
//       this.successMessage = "Student created successfully!";
//       this.errorMessage = null;
//     }
//   }

//   resetForm(form: NgForm): void {
//     form.resetForm();
//     this.student = new Student(0, "", null, "", "", "");
//     this.successMessage = null;
//     this.errorMessage = null;
//   }
// }
