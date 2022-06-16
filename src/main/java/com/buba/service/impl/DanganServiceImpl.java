package com.buba.service.impl;

import com.buba.dao.DanganDao;
import com.buba.pojo.Dangan;
import com.buba.service.DanganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenrui
 * @version 1.0
 * @description: TODO
 * @date 2022/6/8 08:31
 */
@Service("danganService")
public class DanganServiceImpl implements DanganService {

    @Autowired
    private DanganDao danganDao;

    /**
     * 查询档案信息
     * @return
     */
    @Override
    public List<Dangan> listDangan(){
        return danganDao.listDangan();
    }

    /**
     * 添加学生信息
     * @param dangan
     * @return
     */
    public void insertDangan(Dangan dangan){
        danganDao.insertDangan(dangan);
        danganDao.insertDangan(dangan);
    }

}
