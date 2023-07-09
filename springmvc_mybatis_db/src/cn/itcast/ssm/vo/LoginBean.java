package cn.itcast.ssm.vo;

public class LoginBean {

	// 变量名一定要和JSP里面的name相同
	 private String uname;
	 private String passwd;
	 private String validateWord;
	 private String agree;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getValidateWord() {
		return validateWord;
	}
	public void setValidateWord(String validateWord) {
		this.validateWord = validateWord;
	}
	public String getAgree() {
		return agree;
	}
	public void setAgree(String agree) {
		this.agree = agree;
	}


}
