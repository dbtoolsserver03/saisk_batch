package cn.itcast.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {
	@RequestMapping("foodInit")
	public String foodInit()
			throws Exception {
	    return "foodinfo/foodList";
}
}