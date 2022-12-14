package org.comstudy21.myweb.bbs;

public class BoardDTO {
	
	//게시글번호, 제목, 내용
	int no;
	String title;
	String article;
	int readnum;
	   
	public BoardDTO() {}

	   
	public BoardDTO(int no, String title, String article) {
		super();
		this.no = no;
		this.title = title;
		this.article = article;
	}


	@Override
	public String toString() {
		return "BoardDTO [no=" + no + ", title=" + title + ", article=" + article + "]";
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}

}
