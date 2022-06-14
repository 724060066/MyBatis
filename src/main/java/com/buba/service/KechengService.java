package com.buba.service;

import com.buba.pojo.Kecheng;

import java.util.List;

public interface KechengService {

    /**
     * 根据班级id查询课程列表
     * @param cId
     * @return
     */
    List<Kecheng> listKechengByClassId(String cId);
}
