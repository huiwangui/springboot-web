package com.hxjc.springboot.service.impl;

import com.hxjc.springboot.mapper.StudentMapper;
import com.hxjc.springboot.model.Student;
import com.hxjc.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * creater: 13116
 * create time: 2018/8/12
 * describe:
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private StudentMapper studentMapper;
    @Override
    public List<Student> getAllStudent() {
        return studentMapper.selectAllStudent();
    }
}
