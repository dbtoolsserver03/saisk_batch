package cn.itcast.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.ssm.common.core.MyConst;
import cn.itcast.ssm.common.str.MyDateUtil;
import cn.itcast.ssm.po.custom.CustomUser;
import cn.itcast.ssm.po.original.TUser;
import cn.itcast.ssm.service.UserService;
import cn.itcast.ssm.vo.LoginBean;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;


	// 登陆
	@RequestMapping("/login")
	public String login(Model model, HttpSession session, LoginBean loginBean )
			throws Exception {
        if(loginBean.getWord() == null || loginBean.getWord().length()==0) {
		    model.addAttribute("usernamexx", loginBean.getUsername());
		    model.addAttribute("passwordyy",loginBean.getPassword());
		    model.addAttribute("loginInfo",loginBean);
		    
        	model.addAttribute("error", "没有输入验证码");
        	return "login";
        }
	    if ((loginBean.getUsername() == null || loginBean.getUsername().length() == 0)
	            && (loginBean.getPassword() == null || loginBean.getPassword().length() == 0)
	            ) {
	        return "login";
        }
		// 调用service进行用户身份验证
		TUser user = userService.findUser(loginBean.getUsername());
		if (user == null || !loginBean.getPassword().equals(user.getPassword())) {


			model.addAttribute("error", "用户名和密码不一致");
		     // 清除session
	        session.invalidate();
			return "login";
		}


		// 在session中保存用户身份信息
		session.setAttribute("username", loginBean.getUsername());
		// 重定向到商品列表页面
		return "redirect:/items/initItems.action";
	}

	

	// 登陆
	@RequestMapping("register")
	public String register()
			throws Exception {

		return "login/register";
	}

	// 登陆
	@RequestMapping("registSubmit")
	public String registSubmit(@ModelAttribute CustomUser tUser,
			Model model,
			HttpServletRequest request)
			throws Exception {


	    TUser dbRec = userService.findUser(tUser.getId());

	    if (dbRec!=null) {

	        model.addAttribute("errorMsgId", "数据库里有相同的 USER ID");
	        if (tUser.getBirthday() == null) {
	        	model.addAttribute("errorMsgId", "birthday can not null");
	        	return "/login/register";
			}
	        tUser.setBirthdayStr(MyDateUtil.getFormatDateTime(tUser.getBirthday(), MyConst.YYYY_MM_DD_MINUS));
	        model.addAttribute("tUser", tUser);
	        // 2020-02-23
//	        model.addAttribute("birthdayStr",   );
	        return "/login/register";

        } else {
//          TUser tUser = new TUser();
//          tUser.setId(request.getParameter("id"));
//          tUser.setUsername(request.getParameter("username"));
//          tUser.setPassword(request.getParameter("password"));
//          tUser.setSex(request.getParameter("sex"));
//          System.out.println(request.getParameter("birthday"));
//          //tUser.setBirthday();
            tUser.setDeleteFlg("0");
            tUser.setCreateUserId("system");
            tUser.setUpdateUserId("system");
            userService.inserUser(tUser);
        }

		return "redirect:/login";
	}

	// 退出
	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception {

		// 清除session
		session.invalidate();

		// 重定向到商品列表页面
		return "redirect:/items/queryItems.action";
	}

}
