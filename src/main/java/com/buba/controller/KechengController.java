package com.buba.controller;

import com.buba.pojo.Kecheng;
import com.buba.service.KechengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author chenrui
 * @version 1.0
 * @description: TODO
 * @date 2022/6/14 08:52
 */
@Controller
@RequestMapping("/kecheng")
public class KechengController {

    @Autowired
    @Qualifier("kechengService")
    private KechengService kechengService;

    /**
     * 根据班级id查询课程列表
     * @param model
     * @param cId 班级id
     * @return
     */
    @RequestMapping("/listKechengByClassId")
    public String listKechengByClassId(Model model, String cId) {
        List<Kecheng> kechengList = kechengService.listKechengByClassId(cId);
        model.addAttribute("kechengList", kechengList);
        return "kechenglist";
    }
}
