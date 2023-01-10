package org.comstudy21.myapp.bbs;



public class BoardDTO {

	
	
	private int num;
	private String author;
	private String email;
	private String title;
	private String content;
	private String passwd;
	
	public BoardDTO() {
		this(0, "", "", "", "", "");
	}
	
	
	public BoardDTO(int num, String author, String email, String title, String content, String passwd
			) {
		this.num = num;
		this.author = author;
		this.email = email;
		this.title = title;
		this.content = content;
		this.passwd = passwd;
	}


	public void setNum(int num2) {
		this.num = num2;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}


	public int getNum() {
		return num;
	}


	public String getAuthor() {
		return author;
	}


	public String getEmail() {
		return email;
	}


	public String getTitle() {
		return title;
	}


	public String getContent() {
		return content;
	}


	public String getPasswd() {
		return passwd;
	}


	@Override
	public String toString() {
		return "BoardDTO [num=" + num + ", author=" + author + ", email=" + email + ", title=" + title + ", content="
				+ content + ", passwd=" + passwd + "]";
	}




	
	
}
