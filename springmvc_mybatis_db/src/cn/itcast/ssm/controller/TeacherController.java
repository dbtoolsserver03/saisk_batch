package cn.itcast.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.ssm.po.original.TeacherTable;
import cn.itcast.ssm.service.TeacherService;

@Controller
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	@RequestMapping("teacherInit")
	public String teacherInit()
			throws Exception {
		System.out.println(1111);
	    return "teacherinfo/teachertInsert";
	}
	
	
	@RequestMapping("teacherinsert")
	public String teacherInsert(@ModelAttribute TeacherTable teacher)
			throws Exception {
		teacherService.inserTeacher(teacher);
	    return "teacherinfo/teachertInsert";
	}

}
