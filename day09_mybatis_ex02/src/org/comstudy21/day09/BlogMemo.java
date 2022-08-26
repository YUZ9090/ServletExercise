package org.comstudy21.day09;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogMemo {
//댓글 기능
	//idx, memo, writer, regDate, bno(외래키) ,
	private int idx;
	private String memo;
	private String writer;
	private String regDate;
	private int bno;
}
