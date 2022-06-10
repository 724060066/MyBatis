package com.buba.controller;

import com.buba.pojo.Classes;
import com.buba.service.ClassService;
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
 * @date 2022/6/10 09:16
 */
@Controller
@RequestMapping("/classes")
public class ClassController {

    @Autowired
    @Qualifier("classServcie")
    private ClassService classService;

    @RequestMapping("/listClasses")
    public String listClasses(Model model) {

        List<Classes> classesList = classService.listClasses();
        model.addAttribute("classesList", classesList);

        return "classlist";
    }
}
