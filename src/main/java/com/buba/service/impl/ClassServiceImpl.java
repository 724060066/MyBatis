package com.buba.service.impl;

import com.buba.dao.ClassDao;
import com.buba.pojo.Classes;
import com.buba.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenrui
 * @version 1.0
 * @description: TODO
 * @date 2022/6/10 09:18
 */
@Service("classServcie")
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassDao classDao;

    /**
     * 查询班级列表
     * @return
     */
    public List<Classes> listClasses() {
        return classDao.listClasses();
    }
}
