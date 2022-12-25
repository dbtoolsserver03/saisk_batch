package cn.itcast.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.original.TeacherTable;
import cn.itcast.ssm.service.TeacherService;

@Controller
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	@RequestMapping("teacherInit")
	public String teacherInit()
			throws Exception {
	    return "teacherinfo/teacherList";
	}
	
	
	@RequestMapping(value = "/editTeacher", method = { RequestMethod.POST, RequestMethod.GET })
	public String editItemsSubmit(Model model,  @RequestParam(value = "id", required = true,defaultValue="1") String teacherId) throws Exception {
		
		TeacherTable dbInfo = teacherService.findTeacherByID(teacherId);

		model.addAttribute("teacher", dbInfo);
		return "teacherinfo/teacherUpdate";

	}
	
	
	@RequestMapping("teacherInitInsert")
	public String teacherInitInsert()
			throws Exception {
	    return "teacherinfo/teacherInsert";
	}
	
	
	@RequestMapping("teacherupdate")
	public String teacherupdate(@ModelAttribute TeacherTable teacher)
			throws Exception {
		teacherService.updateTeacher(teacher);
	    return "redirect:/queryTeachers.action";
	}
	
	@RequestMapping("teacherinsert")
	public String teacherInsert(@ModelAttribute TeacherTable teacher)
			throws Exception {
		teacherService.inserTeacher(teacher);
	    return "redirect:/queryTeachers.action";
	}
//
//	
	@RequestMapping("queryTeachers")
	public ModelAndView teacherList(@ModelAttribute TeacherTable teacher)
			throws Exception {

//		// 调用service查找 数据库，查询商品列表
		List<TeacherTable> teacherLst = teacherService.findTeacherList(teacher);

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
//		modelAndView.addObject("voItemPic", voItem);
		// 指定视图
		// 下边的路径，如果在视图解析器中配置jsp路径的前缀和jsp路径的后缀，修改为
		// modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		// 上边的路径配置可以不在程序中指定jsp路径的前缀和jsp路径的后缀
		
		//modelAndView.addObject("teacherName", teacher.getTeacherName());
		
		modelAndView.addObject("teacher", teacher);

		modelAndView.addObject("teacherLst", teacherLst);
		modelAndView.setViewName("teacherinfo/teacherList");

		return modelAndView;
	
	}
	
	
	// 批量删除 商品信息
	@RequestMapping("/deleteTeachers")
	public String deleteTeachers(String[] teachers_id) throws Exception {

		// 从JSP传到JAVA程序有三种方法
		// 1。传参数（JSP的NAME和参数的名称要一致）
		// 2。通过request取值
		// 3。通过BEAN 实现GET，SET方法取值  （推荐使用）

		 String[]  teacherIds=teachers_id;//request.getParameterValues("teachers_id");
		// 调用service批量删除
		 teacherService.deleteItems(teacherIds);
		// 定向到查询列表
		return "redirect:/queryTeachers.action";

	}
	
	
}
