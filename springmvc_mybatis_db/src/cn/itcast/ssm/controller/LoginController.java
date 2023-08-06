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
			@ModelAttribute LoginBean loginBean)
			throws Exception {

		List<ErrorInfo> errorLst = new ArrayList<>();

	    if ((loginBean.getUname() == null || loginBean.getUname().length() == 0)
	            && (loginBean.getPasswd() == null || loginBean.getPasswd().length() == 0)
	            ) {
	        return "login";
        }

		// 调用service进行用户身份验证
		TUser user = userService.findUser(loginBean.getUname());
		if (user == null || !loginBean.getPasswd().equals(user.getPassword())) {

		    ErrorInfo e = new ErrorInfo("E", "10001", "用户名和密码不一致");
			errorLst.add(e);

		     // 清除session
	        session.invalidate();
		}

		if(loginBean.getValidateWord() == null || loginBean.getValidateWord().length()==0) {
			errorLst.add(new ErrorInfo("E", "10002", "请输入验证码"));
		}

	    if(!"1".equals(loginBean.getAgree())) {
			errorLst.add(new ErrorInfo("E", "10003", "请同意后再登陆"));
	    }

		if (!errorLst.isEmpty()) {
			model.addAttribute("errorList", errorLst);

			model.addAttribute("mybean",loginBean);

			return "login";
		}

		// 在session中保存用户身份信息
		session.setAttribute("username", loginBean.getUname());
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

		// 重定向到登陆页面
		return "redirect:/login.action";
	}

}
