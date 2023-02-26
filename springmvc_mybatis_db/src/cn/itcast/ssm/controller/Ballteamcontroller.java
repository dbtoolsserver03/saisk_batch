package cn.itcast.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.ssm.po.original.Ballteam;
import cn.itcast.ssm.service.BallteamService;


@Controller
public class Ballteamcontroller {
	@Autowired
	private BallteamService ballteamService;
	@RequestMapping("ballTeamInit")
	public String ballteamInit()
			throws Exception {
	    return "Ballteaminfo/BallteamList";
}
	@RequestMapping("ballteamInitInsert")
	public String ballteamInitInsert()
			throws Exception {
	    return "ball teaminfo/ball teamInsert";
	}
	
	@RequestMapping("ballteaminsert")
	public String ballteamInsert(@ModelAttribute Ballteam ballteam)
			throws Exception {
		ballteamService.inserballteam(ballteam);
	    return "ball teaminfo/ball teamInsert";//"redirect:/queryball teams.action";
	}
}