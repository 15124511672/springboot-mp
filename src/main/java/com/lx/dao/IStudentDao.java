package com.lx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lx.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface IStudentDao extends BaseMapper<Student>
{
   // @Select("select * from db_student where stuname = #{sname}")
   @Select("select * from db_student where stuname = '${sname}'")
    public Student findStudent(@Param("sname") String stuname);
}
