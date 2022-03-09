package com.lx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lx.domain.Student;

public interface IStudentService extends IService<Student> {

    public Student findStudent(String stuname);
}
