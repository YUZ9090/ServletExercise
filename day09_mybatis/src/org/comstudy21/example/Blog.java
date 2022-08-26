package org.comstudy21.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {

	//bno, title, writer, regDate
	private int bno;	//댓글의 외래키가 될거
	private String title;
	private String writer;
	private String regDate;
	
	
	
}
