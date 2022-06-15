package com.buba.service;

import com.buba.pojo.Dangan;
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

    /**
     * 查询学生所有信息
     * @return
     */
    List<Students> listStudentsInfo();

    /**
     * 添加学生信息
     * @param students
     */
    void insertStudent(Students students);

}
