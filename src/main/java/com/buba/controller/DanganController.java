package com.buba.controller;

import com.buba.pojo.Dangan;
import com.buba.service.DanganService;
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
 * @date 2022/6/8 08:29
 */
@Controller
@RequestMapping("/dangan")
public class DanganController {

    @Autowired
    @Qualifier("danganService")
    private DanganService danganService;

    /**
     * 查询档案信息列表
     * @param model
     * @return
     */
    @RequestMapping("/listDangan")
    public String listDangan(Model model) {
        List<Dangan> danganList = danganService.listDangan();
        model.addAttribute("danganList", danganList);
        return "danganlist";
    }
}
