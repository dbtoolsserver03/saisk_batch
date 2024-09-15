package cn.itcast.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.ssm.po.original.BloodTable;
import cn.itcast.ssm.service.SaiBloodService;

@Controller
public class SaiBloodController {

	@Autowired
	private SaiBloodService saiBloodService;

	@RequestMapping("saiBloodInit")
	public String bloodInit()
			throws Exception {
	    return "saiblood/saiMyBloodList";
	}

	@RequestMapping("saiBloodInitInsert")
	public String bloodInitInsert()
			throws Exception {
	    return "saiblood/saiMyBloodInsert";
	}


	@RequestMapping("saiBloodInsert")
	public String saiBloodInsert(@ModelAttribute BloodTable blood)
			throws Exception {
		saiBloodService.inserSaiBlood(blood);
		return "saiblood/saiMyBloodList";
	}
}
