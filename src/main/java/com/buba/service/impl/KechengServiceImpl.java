package com.buba.service.impl;

import com.buba.dao.KechengDao;
import com.buba.pojo.Kecheng;
import com.buba.service.KechengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenrui
 * @version 1.0
 * @description: TODO
 * @date 2022/6/14 08:55
 */
@Service("kechengService")
public class KechengServiceImpl implements KechengService {

    @Autowired
    private KechengDao kechengDao;

    /**
     * 根据班级id查询课程列表
     * @param cId
     * @return
     */
    public List<Kecheng> listKechengByClassId(String cId) {
        return kechengDao.listKechengAndClass();
    }
}
