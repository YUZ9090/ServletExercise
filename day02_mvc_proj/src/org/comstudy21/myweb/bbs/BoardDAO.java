package org.comstudy21.myweb.bbs;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	private static List<BoardDTO> bbsList;
	private static int artnum=1;
	static {
		bbsList = new ArrayList<BoardDTO>();
		bbsList.add(new BoardDTO(artnum++,"게시글제목","게시글내용"));
		bbsList.add(new BoardDTO(artnum++,"테스트제목2","테스트내용2"));
	}

	//리스트뿌리기
	public List<BoardDTO> selectAll(){
		return bbsList;
	}
	
	//게시글작성
	public void write(BoardDTO dto) {
		//게시글번호는 자동으로 올라가도록설정
		dto.setNo(artnum++);
		bbsList.add(dto);
		System.out.println(bbsList);
	}
	
	public BoardDTO selectOne(BoardDTO dto) {
		return null;
	}
	
	public void update(BoardDTO dto) {
		
	}
	
	public void delete(BoardDTO dto) {
		bbsList.remove(dto);
		System.out.println(bbsList);
	}
	
	
}
