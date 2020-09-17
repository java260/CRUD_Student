
package com.meshalsh.Main.dao;

import com.meshalsh.Main.entity.Student;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO_Impl  implements StudentDAO{

    
   
    private EntityManager entityManager ;
    
    
     // inject EntityManager
    @Autowired
    public StudentDAO_Impl(EntityManager ent){
        this.entityManager = ent ;
    }
    
    @Override
    public List<Student> getAllStudent() {
        Session session = entityManager.unwrap(Session.class);
        
        Query <Student> q = session.createQuery("FROM Student" , Student.class);
        
        List<Student> s = q.getResultList();
        
        return s ;
    }

    @Override
    public void saveStudent(Student student) {
       
         Session session = entityManager.unwrap(Session.class); 
         
         session.saveOrUpdate(student);
    }

    @Override
    public Student getStudent(int id) {
       Session session = entityManager.unwrap(Session.class);
       
       Student s = session.get(Student.class, id);
       
       return s ;
    }

    @Override
    public void deleteStudent(int id) {
       Session session = entityManager.unwrap(Session.class);
       
       Query q = session.createQuery("DELETE FROM Student WHERE id=:studentId");
       
       q.setParameter("studentId", id);
       q.executeUpdate();
    }
    
}
