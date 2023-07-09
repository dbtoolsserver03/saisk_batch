package cn.itcast.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BloodController {

	@RequestMapping("bloodInit")
	public String teacherInit()
			throws Exception {
	    return "blood/bloodList";
	}

}
