
package com.meshalsh.Main.dao;

import com.meshalsh.Main.entity.Student;
import java.util.List;


public interface StudentDAO {
    
    
    public List<Student> getAllStudent();
    
    public void saveStudent(Student student);
    
    public Student getStudent(int id ) ; 
    
    public void deleteStudent(int id );
    
    
}
