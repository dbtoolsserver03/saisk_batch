package cn.itcast.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CardController {

	@RequestMapping("cardInit")
	public String cardInit()
			throws Exception {
	    return "cardInfo/cardList";
	}
}
