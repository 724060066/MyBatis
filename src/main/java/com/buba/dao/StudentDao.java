package com.buba.dao;

import com.buba.pojo.Students;

import java.util.List;

public interface StudentDao {

    /**
     * 查询学生列表
     * @return
     */
    List<Students> listStudent();

    /**
     * 根据档案id查询学生信息
     * @return
     */
    Students getStudentByDanganId(String dId);
}
