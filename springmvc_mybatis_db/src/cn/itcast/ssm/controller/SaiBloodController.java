package cn.itcast.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SaiBloodController {

	@RequestMapping("saiBloodInit")
	public String teacherInit()
			throws Exception {
	    return "saiBlood/saiBloodList";
	}

}
