package com.buba.controller;

import com.buba.pojo.Students;
import com.buba.service.StudentService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.Action;
import java.util.List;

/**
 * @author chenrui
 * @version 1.0
 * @description: TODO
 * @date 2022/6/6 15:05
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;

    /**
     * 查询学生列表
     * @param model
     * @return
     */
    @RequestMapping("/listStudent")
    public String listStudent(Model model){
        List<Students> studentsList = studentService.listStudent();
        model.addAttribute("studentsList", studentsList);
        return "studentlist";
    }
}
