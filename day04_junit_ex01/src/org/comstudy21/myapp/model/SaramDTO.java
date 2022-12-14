package org.comstudy21.myapp.model;

public class SaramDTO {

	private int id;
	private String name;
	private String phone;
	private String email;
	
	public SaramDTO() {}

	public SaramDTO(int id, String name, String phone, String email) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		//나중을 위해 json 형식으로 바꾸기
		//return "{id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + "}";
		return String.format("{\"id\":%d,\"name\":\"%s\",\"phone\":\"%s\",\"email\":\"%s\"}", id,name,phone, email);
		//이클립스에선 {"id":%d,"name":"%s","phone":"%s","email":"%s"} 이걸 그냥 붙여넣기하면 알아서 역슬래시넣어준당. 복사한다음 다시붙여넣어보장
		
		
	}
	
	
}
