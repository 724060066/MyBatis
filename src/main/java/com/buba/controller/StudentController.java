package com.buba.controller;

import com.buba.pojo.Classes;
import com.buba.pojo.Students;
import com.buba.service.ClassService;
import com.buba.service.StudentService;
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
 * @date 2022/6/6 15:05
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    @Qualifier("studentService")
    private StudentService studentService;

    @Autowired
    @Qualifier("classServcie")
    private ClassService classService;

    /**
     * 查询学生列表
     * @param model
     * @return
     */
    @RequestMapping("/listStudent")
    public String listStudent(Model model, String studentName, String classId){
        List<Students> studentsList = studentService.listStudent(studentName, classId);
        List<Classes> classesList = classService.listClasses();
        model.addAttribute("studentsList", studentsList);
        model.addAttribute("classesList", classesList);
        model.addAttribute("studentName", studentName);
        return "studentlist";
    }

    /**
     * 查询学生所有信息
     * @param model
     * @return
     */
    @RequestMapping("/listStudentsInfo")
    public String listStudentsInfo(Model model) {
        List<Students> studentsList = studentService.listStudentsInfo();
        model.addAttribute("studentsList", studentsList);
        return "studentinfolist";
    }

    /**
     * 添加学生信息
     * @param students
     * @return
     */
    @RequestMapping("/insertStudent")
    public String insertStudent(Students students) {
        studentService.addStudent(students);
        return null;
    }

}
