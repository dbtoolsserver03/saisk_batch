package cn.itcast.ssm.controller.validation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import cn.itcast.ssm.po.original.FoodTable;
//import cn.itcast.ssm.service.FoodService;

@Controller
public class AnimalController {

//	@Autowired
//	private FoodService animalService;

	@RequestMapping("animalInit")
	public String animalInit()
			throws Exception {
	    return "animalinfo/animalList";
	}
	
//	
//	@RequestMapping(value = "/editFood", method = { RequestMethod.POST, RequestMethod.GET })
//	public String editItemsSubmit(Model model,  @RequestParam(value = "id", required = true,defaultValue="1") String animalId) throws Exception {
//		
//		FoodTable dbInfo = animalService.findFoodByID(animalId);
//
//		model.addAttribute("animal", dbInfo);
//		return "animalinfo/animalUpdate";
//
//	}
//	
//	
//	@RequestMapping("animalInitInsert")
//	public String animalInitInsert()
//			throws Exception {
//	    return "animalinfo/animalInsert";
//	}
//	
//	
//	@RequestMapping("animalupdate")
//	public String animalupdate(@ModelAttribute FoodTable animal)
//			throws Exception {
//		animalService.updateFood(animal);
//	    return "redirect:/queryFoods.action";
//	}
//	
//	@RequestMapping("animalinsert")
//	public String animalInsert(@ModelAttribute FoodTable animal)
//			throws Exception {
//		animalService.inserFood(animal);
//	    return "redirect:/queryFoods.action";
//	}
////
////	
//	@RequestMapping("queryFoods")
//	public ModelAndView animalList(@ModelAttribute FoodTable animal)
//			throws Exception {
//
////		// 调用service查找 数据库，查询商品列表
//		List<FoodTable> animalLst = animalService.findFoodList(animal);
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
//		//modelAndView.addObject("animalName", animal.getFoodName());
//		
//		modelAndView.addObject("animal", animal);
//
//		modelAndView.addObject("animalLst", animalLst);
//		modelAndView.setViewName("animalinfo/animalList");
//
//		return modelAndView;
//	
//	}
//	
//	
//	// 批量删除 商品信息
//	@RequestMapping("/deleteFoods")
//	public String deleteFoods(String[] animals_id) throws Exception {
//
//		// 从JSP传到JAVA程序有三种方法
//		// 1。传参数（JSP的NAME和参数的名称要一致）
//		// 2。通过request取值
//		// 3。通过BEAN 实现GET，SET方法取值  （推荐使用）
//
//		 String[]  animalIds=animals_id;//request.getParameterValues("animals_id");
//		// 调用service批量删除
//		 animalService.deleteItems(animalIds);
//		// 定向到查询列表
//		return "redirect:/queryFoods.action";
//
//	}
//	
	
}
