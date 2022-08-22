package org.comstudy21.myweb.model;

public class ReserveDTO {
	
	private int id;
	private String name;
	private String phone;
	private String rpay;
	private int rno;
	private String reservation;
	
	public ReserveDTO(){}
	
	public ReserveDTO(int id, String name, String phone, String rpay, int rno) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.rpay = rpay;
		this.rno = rno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRpay() {
		return rpay;
	}

	public void setRpay(String rpay) {
		this.rpay = rpay;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getReservation() {
		return reservation;
	}

	public void setReservation(String reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return "ReserveDTO [id=" + id + ", name=" + name + ", phone=" + phone + ", rpay=" + rpay + ", rno=" + rno
				+ ", reservation=" + reservation + "]";
	}
	
	
	
	
	
}
