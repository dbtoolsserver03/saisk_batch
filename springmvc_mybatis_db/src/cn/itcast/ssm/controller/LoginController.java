package cn.itcast.ssm.controller;

import java.util.ArrayList;
import java.util.List;

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
import cn.itcast.ssm.vo.ErrorInfo;
import cn.itcast.ssm.vo.LoginBean;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;


/*
 * 前台后台连动
 * 前台　JSP  Thymeleaf  DART フロント側
 * 后台　JAVA .NET       DART バック側     裏側
 *
 * 画面入力的信息，如何传到JAVA端
 * JAVA端的信息，如何传到到画面端
 */

	// 登陆
	@RequestMapping("/login")
	public String login(Model model, HttpSession session,
			@ModelAttribute LoginBean loginBean,
			String username, String password)
			throws Exception {

		List<ErrorInfo> errorLst = new ArrayList<>();

	    if ((username == null || username.length() == 0)
	            && (password == null || password.length() == 0)
	            ) {
	        return "login";
        }

		// 调用service进行用户身份验证
		TUser user = userService.findUser(username);
		if (user == null || !password.equals(user.getPassword())) {

		    model.addAttribute("usraaa", username);

		    ErrorInfo e = new ErrorInfo("E", "10001", "パスワードが誤っています。");
			errorLst.add(e);

		     // 清除session
	        session.invalidate();
		}

		if(loginBean.getValidateWord() == null || loginBean.getValidateWord().length()==0) {
			errorLst.add(new ErrorInfo("E", "10002", "暗証番号を入力してください。"));
		}

		if (!errorLst.isEmpty()) {
			model.addAttribute("errorList", errorLst);
			return "login";
		}

		// 在session中保存用户身份信息
		session.setAttribute("username", username);
		// 定向到菜单页面
		return "menu/menuInit";
		//return "redirect:/items/initItems.action";
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

	        model.addAttribute("errorMsgId", "存在している USER ID");
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
