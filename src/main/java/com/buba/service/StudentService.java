package com.buba.service;

import com.buba.pojo.Students;

import java.util.List;

public interface StudentService {

    /**
     * 查询学生列表
     * @param studentName
     * @param classId
     * @return
     */
    List<Students> listStudent(String studentName, String classId);
}
