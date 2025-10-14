export class Student {


<<<<<<< HEAD
       studentId:number;
=======

    studentId:number;
>>>>>>> bec44b4b13549dd02f89397c695618ea943c3414
    fullName:string;
    dateOfBirth:Date|null;
    contactNumber:string;
    email:string;
    address:string;
    constructor(studentId:number,fullName:string,dateOfBirth:Date|null,contactNumber:string,email:string,address:string)
    {
        this.studentId=studentId;
        this.fullName=fullName;
        this.dateOfBirth=dateOfBirth;
        this.contactNumber=contactNumber;
        this.email=email;
        this.address=address;
    }
    logAttributes():void{
        console.log(`studentId:` ,this.studentId);
        console.log(`fullName:` ,this.fullName);
        console.log(`dateOfBirth:` ,this.dateOfBirth);
        console.log(`contactNumber:` ,this.contactNumber);
        console.log(`email:` ,this.email);
        console.log(`address:` ,this.address);
    }
}





