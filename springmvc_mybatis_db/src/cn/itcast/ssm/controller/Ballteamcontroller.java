package cn.itcast.ssm.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class Ballteamcontroller {
	@RequestMapping("ballteamInit")
	public String BallteamInit()
			throws Exception {
	    return "Ballteaminfo/BallteamList";
}
}