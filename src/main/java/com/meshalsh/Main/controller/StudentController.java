
package com.meshalsh.Main.controller;

import com.meshalsh.Main.entity.Student;
import com.meshalsh.Main.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {
    
    
    
    // Inject Student Service 
    @Autowired
    private StudentService studentService ; 
    
    
    
    @RequestMapping("/list")
    public String getStudents(Model model){
         List <Student> listStudent = studentService.getAllStudent();
         model.addAttribute("student", listStudent); 
         return "list-page"  ; 
    }
    
    
    @GetMapping("/addStudent")
    public String showFormForSaveStudent(Model model){
        
        Student s = new Student();
        model.addAttribute("student", s);
        return "form-student" ; 
    }
    
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student s ){
        
        studentService.saveStudent(s);
        
        return "redirect:/student/list" ; 
    }
    
    
    @GetMapping("/showFormForEdit")
    public String showFormForEdit(@RequestParam("studentId") int id , Model model){
        
        Student s = studentService.getStudent(id);
        
        model.addAttribute("student", s);
        
        return "form-student" ;
    }
    

    
    @GetMapping("/delete")
    public String deleteStudent(@RequestParam("studentId") int id){
        
        studentService.deleteStudent(id);
        
        return "redirect:/student/list" ;
    }
    
   
    
}
