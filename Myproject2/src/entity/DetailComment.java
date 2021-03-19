package entity;

import java.util.Date;

public class DetailComment {

	private int wid;
	private int cid;
	private String comment;
	private Date regdate;
	private String nickname;
	private String delflag;

	public DetailComment(int wid, int cid, String comment, Date regdate, String nickname, String delflag) {
		
		this.wid = wid;
		this.cid = cid;
		this.comment = comment;
		this.regdate = regdate;
		this.nickname = nickname;
		this.delflag = delflag;
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getDelflag() {
		return delflag;
	}
	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}
	
	
}
