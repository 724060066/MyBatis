package com.buba.service;

import com.buba.pojo.Dangan;

import java.util.List;

public interface DanganService {

    /**
     * 查询档案信息
     * @return
     */
    List<Dangan> listDangan();

    /**
     * 添加学生信息
     * @param dangan
     * @return
     */
    void insertDangan(Dangan dangan);
}
