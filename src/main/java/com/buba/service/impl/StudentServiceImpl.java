package com.buba.service.impl;

import com.buba.dao.StudentDao;
import com.buba.pojo.Students;
import com.buba.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.sasl.SaslServer;
import java.util.List;

/**
 * @author chenrui
 * @version 1.0
 * @description: TODO
 * @date 2022/6/6 15:23
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    /**
     * 查询学生列表
     * @return
     */
    @Override
    public List<Students> listStudent() {
        List<Students> studentsList = studentDao.listStudent();
        return studentsList;
    }
}
