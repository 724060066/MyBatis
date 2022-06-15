package com.buba.dao;

import com.buba.pojo.Students;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {

    /**
     * 查询学生列表
     * @param studentName
     * @param classId
     * @return
     */
    List<Students> listStudent(@Param("studentName") String studentName, @Param("classId") String classId);

    /**
     * 根据档案id查询学生信息
     * @return
     */
    Students getStudentByDanganId(String dId);

    /**
     * 查询学生所有信息
     * @return
     */
    List<Students> listStudentsInfo();
}
