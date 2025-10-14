import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';  
import { StudentSampleComponent } from './educonnect/components/studentsample/studentsample.component';
import { TeacherSampleComponent } from './educonnect/components/teachersample/teachersample.component';
<<<<<<< HEAD
import { FormsModule } from '@angular/forms';
=======
>>>>>>> bec44b4b13549dd02f89397c695618ea943c3414

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    StudentSampleComponent,
<<<<<<< HEAD
    TeacherSampleComponent,
    FormsModule
=======
    TeacherSampleComponent
>>>>>>> bec44b4b13549dd02f89397c695618ea943c3414
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
