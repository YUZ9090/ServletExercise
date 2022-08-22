package org.comstudy21.myweb.product.model;

public class ProductDTO {
	private int rno;
	private String rtitle;
	private int rpirce;
	
	public ProductDTO() {}

	public ProductDTO(int rno, String rtitle, int rpirce) {
		this.rno = rno;
		this.rtitle = rtitle;
		this.rpirce = rpirce;
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

	public int getRpirce() {
		return rpirce;
	}

	public void setRpirce(int rpirce) {
		this.rpirce = rpirce;
	}

	@Override
	public String toString() {
		return "ProductDTO [rno=" + rno + ", rtitle=" + rtitle + ", rpirce=" + rpirce + "]";
	}
	
	
}
