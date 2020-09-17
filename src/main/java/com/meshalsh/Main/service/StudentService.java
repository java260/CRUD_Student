
package com.meshalsh.Main.service;

import com.meshalsh.Main.entity.Student;
import java.util.List;


public interface StudentService {
    
    
    public List<Student> getAllStudent();
    
    public void saveStudent(Student student);
    
    public Student getStudent(int id ) ; 
    
    
    public void deleteStudent(int id );
    
}
