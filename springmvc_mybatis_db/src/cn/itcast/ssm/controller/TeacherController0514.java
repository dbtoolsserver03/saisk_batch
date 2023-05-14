package cn.itcast.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherController0514 {

	@RequestMapping("teacherInit0514")
	public String teacherInit()
			throws Exception {
	    return "teacherinfo0514/teacherList0514";
	}
	
}
