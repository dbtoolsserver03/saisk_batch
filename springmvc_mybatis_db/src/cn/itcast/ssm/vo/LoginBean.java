package cn.itcast.ssm.vo;

public class LoginBean {

	// 变量名一定要和JSP里面的name相同
	 private String username; 
	 private String password;
	 private String word;
	 private String agree;
	 
	public String getAgree() {
		return agree;
	}
	public void setAgree(String agree) {
		this.agree = agree;
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
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	 
}
