package cn.itcast.ssm.vo;

public class LoginBean {

	// 变量名一定要和JSP里面的name相同
	 private String username;
	 private String password;
	 private String validateWord;

	public String getValidateWord() {
		return validateWord;
	}
	public void setValidateWord(String validateWord) {
		this.validateWord = validateWord;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
