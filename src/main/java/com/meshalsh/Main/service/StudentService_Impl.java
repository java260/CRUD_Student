
package com.meshalsh.Main.service;

import com.meshalsh.Main.dao.StudentDAO;
import com.meshalsh.Main.entity.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService_Impl implements StudentService {

    
    @Autowired
    private StudentDAO studentDAO ;
    
    @Override
    @Transactional
    public List<Student> getAllStudent() {
        return studentDAO.getAllStudent() ; 
    }

    @Override
    @Transactional
    public void saveStudent(Student student) {
       studentDAO.saveStudent(student);
    }

    @Override
    @Transactional
    public Student getStudent(int id) {
        return studentDAO.getStudent(id);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
       studentDAO.deleteStudent(id);
    }
    
}
