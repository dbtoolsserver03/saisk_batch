package cn.itcast.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.ssm.po.original.Jleague;

@Controller
public class JleagueController{

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
	@RequestMapping("jleague/japandetail")
	public String japandetail() 
			throws Exception {
	    return "jleague/japaninfo";
		}
	
	
	@RequestMapping("jleague/japaninfo")
	public String japaninfo(@ModelAttribute Jleague jleague) 
			throws Exception {
		System.out.println(jleague);
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
	
	
