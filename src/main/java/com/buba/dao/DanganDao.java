package com.buba.dao;

import com.buba.pojo.Dangan;

import java.util.List;

/**
 * @author chenrui
 * @version 1.0
 * @description: TODO
 * @date 2022/6/8 08:32
 */
public interface DanganDao {

    /**
     * 查询档案信息
     * @return
     */
    List<Dangan> listDangan();

    Dangan getDanganById(String id);
}
