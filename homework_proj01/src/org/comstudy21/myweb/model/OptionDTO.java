package org.comstudy21.myweb.model;

public class OptionDTO {
	
	int rno;
	String rtitle;
	int rprice;
	
	public OptionDTO() {}
	
	public OptionDTO( String rtitle, int rprice) {
		this.rtitle = rtitle;
		this.rprice = rprice;
	}
	
	public OptionDTO(int rno, String rtitle, int rprice) {
		this.rno = rno;
		this.rtitle = rtitle;
		this.rprice = rprice;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getRtitle() {
		return rtitle;
	}

	public void setRtitle(String rtitle) {
		this.rtitle = rtitle;
	}

	public int getRprice() {
		return rprice;
	}

	public void setRprice(int rprice) {
		this.rprice = rprice;
	}

	@Override
	public String toString() {
		return "OptionDTO [rno=" + rno + ", rtitle=" + rtitle + ", rprice=" + rprice + "]";
	}
	
	

}
