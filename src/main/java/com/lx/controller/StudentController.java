package com.lx.controller;

import com.lx.domain.Student;
import com.lx.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping
    public List<Student> queryAll()
    {
        System.out.println("-------------------");
        return studentService.list();
    }

    @GetMapping("/{stuname}")
    public Student findStudent(@PathVariable("stuname") String stuname)
    {
        return studentService.findStudent(stuname);
    }

    @PostMapping
    public boolean saveStudent(@RequestBody Student student)
    {
        return studentService.save(student);
    }
}
