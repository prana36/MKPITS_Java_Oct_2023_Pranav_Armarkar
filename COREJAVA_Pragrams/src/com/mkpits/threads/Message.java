package com.mkpits.threads;

public class Message 
{
	private String msg;

	public Message(String msg) {
		
		this.msg = msg;
	}

//	@Override
//	public String toString() {
//		return "Message [msg=" + msg + "]";
//	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
