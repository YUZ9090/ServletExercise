package org.comstudy21.day09;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogMemo {
//��� ���
	//idx, memo, writer, regDate, bno(�ܷ�Ű) ,
	private int idx;
	private String memo;
	private String writer;
	private String regDate;
	private int bno;
}
