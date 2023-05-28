package cn.itcast.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.itcast.ssm.po.original.Jleague;
import cn.itcast.ssm.service.JleagueService;

@Controller
public class JleagueController {

	@Autowired
	JleagueService jLeagueService;

	@RequestMapping("jleague")
	public String jleague()
			throws Exception {
		return "jleague/japanlogin";
	}

	@RequestMapping("jleague/japanlogin")
	public String japanlogin()
			throws Exception {
		return "jleague/japanlogin2";
	}

	@RequestMapping("jleague/japanlogin2")
	public String japanlogin2()
			throws Exception {
		return "jleague/japandetail";
	}

	@RequestMapping("jleague/japansearch")
	public String japansearch(@ModelAttribute Jleague jleague, Model model)
			throws Exception {

		List<Jleague> lst = jLeagueService.findJleagueList(jleague);

		model.addAttribute("jleagueLst", lst);
		model.addAttribute("aaa", "123");
		model.addAttribute("obj", jleague);
		return "jleague/japandetail";
	}

	@RequestMapping("jleague/japandetail")
	public String japandetail(Model model)
			throws Exception {
		
		model.addAttribute("mode", "insert_mode");
		return "jleague/japaninfo";
	}
	
	
	
	/**
	 * 更新実行
	 * @param jleague
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("jleague/updatejapaninfo")
	public String updatejapaninfo(@ModelAttribute Jleague jleague)
			throws Exception {
		jLeagueService.updateJleague(jleague);
		return "jleague/japandetail";
	}
	
	
	/**
	 * 新規追加実行
	 * @param jleague
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("jleague/japaninfo")
	public String japaninfo(@ModelAttribute Jleague jleague)
			throws Exception {
		jLeagueService.inserJleague(jleague);
		return "jleague/japandetail";
	}
	
	
	/**
	 * 修正画面
	 * @param model
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="jleague/editJleague", method = { RequestMethod.POST, RequestMethod.GET })
	public String editJleague(Model model,@RequestParam String id) throws Exception {
		Jleague jLeague = jLeagueService.findJleagueByID(id);
		model.addAttribute("obj", jLeague);
		model.addAttribute("mode", "update_mode");
		
		return "jleague/japaninfo";
	}
	
	/**
	 * 詳細画面
	 * @param model
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="jleague/viewJleague", method = { RequestMethod.POST, RequestMethod.GET })
	public String viewJleague(Model model,@RequestParam String id) throws Exception {
		Jleague jLeague = jLeagueService.findJleagueByID(id);
		model.addAttribute("obj", jLeague);
		model.addAttribute("mode", "view_mode");
		return "jleague/japaninfo";
	}
	
	@RequestMapping("jleague/deleteJleague")
	public String deleteJleague(String[] chk_select) throws Exception {

		// 从JSP传到JAVA程序有三种方法
		// 1。传参数（JSP的NAME和参数的名称要一致）
		// 2。通过request取值
		// 3。通过BEAN 实现GET，SET方法取值  （推荐使用）

		// 调用service批量删除
		jLeagueService.deleteItems(chk_select);
		return "jleague/japandetail";

	}
}
//
//	
//	
//	@RequestMapping(value = "/editCar", method = { RequestMethod.POST, RequestMethod.GET })
//	public String editItemsSubmit(Model model,  @RequestParam(value = "id", required = true,defaultValue="1") String teacherId) throws Exception {
//		
//		CarTable dbInfo = teacherService.findCarByID(teacherId);
//
//		model.addAttribute("teacher", dbInfo);
//		return "teacherinfo/teacherUpdate";
//
//	}
//	
//	
//	@RequestMapping("teacherInitInsert")
//	public String teacherInitInsert()
//			throws Exception {
//	    return "teacherinfo/teacherInsert";
//	}
//	
//	
//	@RequestMapping("teacherupdate")
//	public String teacherupdate(@ModelAttribute CarTable teacher)
//			throws Exception {
//		teacherService.updateCar(teacher);
//	    return "redirect:/queryCars.action";
//	}
//	
//	@RequestMapping("teacherinsert")
//	public String teacherInsert(@ModelAttribute CarTable teacher)
//			throws Exception {
//		teacherService.inserCar(teacher);
//	    return "redirect:/queryCars.action";
//	}
////
////	
//	@RequestMapping("queryCars")
//	public ModelAndView teacherList(@ModelAttribute CarTable teacher)
//			throws Exception {
//
////		// 调用service查找 数据库，查询商品列表
//		List<CarTable> teacherLst = teacherService.findCarList(teacher);
//
//		// 返回ModelAndView
//		ModelAndView modelAndView = new ModelAndView();
//		// 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
////		modelAndView.addObject("voItemPic", voItem);
//		// 指定视图
//		// 下边的路径，如果在视图解析器中配置jsp路径的前缀和jsp路径的后缀，修改为
//		// modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
//		// 上边的路径配置可以不在程序中指定jsp路径的前缀和jsp路径的后缀
//		
//		//modelAndView.addObject("teacherName", teacher.getCarName());
//		
//		modelAndView.addObject("teacher", teacher);
//
//		modelAndView.addObject("teacherLst", teacherLst);
//		modelAndView.setViewName("teacherinfo/teacherList");
//
//		return modelAndView;
//	
//	}
//	
//	
//	// 批量删除 商品信息
//	@RequestMapping("/deleteCars")
//	public String deleteCars(String[] teachers_id) throws Exception {
//
//		// 从JSP传到JAVA程序有三种方法
//		// 1。传参数（JSP的NAME和参数的名称要一致）
//		// 2。通过request取值
//		// 3。通过BEAN 实现GET，SET方法取值  （推荐使用）
//
//		 String[]  teacherIds=teachers_id;//request.getParameterValues("teachers_id");
//		// 调用service批量删除
//		 teacherService.deleteItems(teacherIds);
//		// 定向到查询列表
//		return "redirect:/queryCars.action";
//
//	}
	
	
