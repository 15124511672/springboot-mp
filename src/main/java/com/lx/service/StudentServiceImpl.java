package com.lx.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lx.dao.IStudentDao;
import com.lx.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<IStudentDao, Student> implements IStudentService {
    @Autowired
    private IStudentDao studentDao;
    @Override
    public Student findStudent(String stuname) {
        return studentDao.findStudent(stuname);
    }
}
