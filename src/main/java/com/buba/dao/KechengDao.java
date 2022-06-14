package com.buba.dao;

import com.buba.pojo.Kecheng;

import java.util.List;

public interface KechengDao {

    /**
     * 根据班级id查询课程列表
     * @param cId
     * @return
     */
    List<Kecheng> listKechengByClassId(String cId);

    List<Kecheng> listKechengAndClass();
}
