package cn.itcast.ssm.vo;

public class ErrorInfo {
	private String msgType;
	private String msgId;
	private String msgContent;
	public ErrorInfo(String msgType, String msgId, String msgContent) {
		super();
		this.msgType = msgType;
		this.msgId = msgId;
		this.msgContent = msgContent;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	// alt + shift + s

}
