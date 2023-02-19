package cn.itcast.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import cn.itcast.ssm.po.original.FoodTable;
//import cn.itcast.ssm.service.FoodService;

@Controller
public class FoodlController {

//	@Autowired
//	private FoodService foodService;

	@RequestMapping("foodInit")
	public String foodInit()
			throws Exception {
	    return "foodinfo/foodList";
	}
	
//	
//	@RequestMapping(value = "/editFood", method = { RequestMethod.POST, RequestMethod.GET })
//	public String editItemsSubmit(Model model,  @RequestParam(value = "id", required = true,defaultValue="1") String foodId) throws Exception {
//		
//		FoodTable dbInfo = foodService.findFoodByID(foodId);
//
//		model.addAttribute("food", dbInfo);
//		return "foodinfo/foodUpdate";
//
//	}
//	
//	
//	@RequestMapping("foodInitInsert")
//	public String foodInitInsert()
//			throws Exception {
//	    return "foodinfo/foodInsert";
//	}
//	
//	
//	@RequestMapping("foodupdate")
//	public String foodupdate(@ModelAttribute FoodTable food)
//			throws Exception {
//		foodService.updateFood(food);
//	    return "redirect:/queryFoods.action";
//	}
//	
//	@RequestMapping("foodinsert")
//	public String foodInsert(@ModelAttribute FoodTable food)
//			throws Exception {
//		foodService.inserFood(food);
//	    return "redirect:/queryFoods.action";
//	}
////
////	
//	@RequestMapping("queryFoods")
//	public ModelAndView foodList(@ModelAttribute FoodTable food)
//			throws Exception {
//
////		// 调用service查找 数据库，查询商品列表
//		List<FoodTable> foodLst = foodService.findFoodList(food);
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
//		//modelAndView.addObject("foodName", food.getFoodName());
//		
//		modelAndView.addObject("food", food);
//
//		modelAndView.addObject("foodLst", foodLst);
//		modelAndView.setViewName("foodinfo/foodList");
//
//		return modelAndView;
//	
//	}
//	
//	
//	// 批量删除 商品信息
//	@RequestMapping("/deleteFoods")
//	public String deleteFoods(String[] foods_id) throws Exception {
//
//		// 从JSP传到JAVA程序有三种方法
//		// 1。传参数（JSP的NAME和参数的名称要一致）
//		// 2。通过request取值
//		// 3。通过BEAN 实现GET，SET方法取值  （推荐使用）
//
//		 String[]  foodIds=foods_id;//request.getParameterValues("foods_id");
//		// 调用service批量删除
//		 foodService.deleteItems(foodIds);
//		// 定向到查询列表
//		return "redirect:/queryFoods.action";
//
//	}
//	
	
}
