import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable } from "rxjs";
import { environment } from "src/environments/environment";
import { Injectable } from "@angular/core";
import { User } from "src/app/educonnect/models/User";
import { UserRegistrationDTO } from "src/app/educonnect/models/UserRegistrationDTO";

@Injectable({
  providedIn: "root",
})
export class AuthService {
  private loginUrl = `${environment.apiUrl}`;


  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*'
    })
  };

  constructor(private http: HttpClient) { }
// here form the user.ts it will take the required fields .it means as object it takes
  // here patital is used beacuse while sending the user object it may have some fields or not . 
  //if we pass regular object need to send the entire fields . if we use 
  //partial  type means not need
  // here it call the backend userlogin controller.

  login(user: Partial<User>): Observable<{ [key: string]: string }> {
    return this.http.post<{ token: string }>(
      `${this.loginUrl}/user/login`,
      user,
      this.httpOptions
    );
  }

  getToken() {
    return localStorage.getItem("token");
  }

  getRole() {
    return localStorage.getItem("role");
  }

  logout(): void {
    localStorage.removeItem('token');
    localStorage.removeItem('role');
    localStorage.removeItem('user_id');
    localStorage.removeItem('student_id');
    localStorage.removeItem('teacher_id');
  }

  createUser(user: UserRegistrationDTO): Observable<any> {
    return this.http.post<UserRegistrationDTO>(`${this.loginUrl}/user/register`, user);
  }
}
