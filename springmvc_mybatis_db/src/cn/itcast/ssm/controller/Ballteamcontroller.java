package cn.itcast.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Ballteamcontroller {
	@RequestMapping("ballTeamInit")
	public String ballteamInit()
			throws Exception {
	    return "Ballteaminfo/BallteamList";
}
}