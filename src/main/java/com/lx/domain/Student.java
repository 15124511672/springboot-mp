package com.lx.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("db_student")
public class Student
{
    @TableId(type = IdType.AUTO)
    private Integer stuno;
    private String stuname;
    private Integer age;
    private String sex;
}
