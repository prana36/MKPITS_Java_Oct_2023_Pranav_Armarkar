package com.mkpits.thiskeyword;

public class AllDetails {
	private String myStream;
	long myMob;

	public static void main(String[] args) {
		
    AllDetails ad = new AllDetails();
    ad.getMyStream("Full Stack Devloper");
	}

	public String getMyStream(String myStream) {
		return myStream;
	}

	public void setMyStream(String myStream) {
		this.myStream = myStream;
	}

	public long getMyMob() {
		return myMob;
	}

	public void setMyMob(long myMob) {
		this.myMob = myMob;
	}

}
