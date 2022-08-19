package org.comstudy21.myweb.member;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MemberDAO {
   private static List<MemberDTO> memberList;
   private static int sequence=1;
   static {
      memberList = new ArrayList<MemberDTO>();
      memberList.add( new MemberDTO(sequence++,"KIM","010-1111-1111"));
      memberList.add( new MemberDTO(sequence++,"LEE","010-1111-2222"));
      memberList.add( new MemberDTO(sequence++,"PARK","010-1111-3333"));
 
   }
   
   public List<MemberDTO> selectAll() {
      return memberList;
   }
   
   public void insert(MemberDTO dto) {
	   dto.setNo(sequence++);
	   memberList.add(dto);
	   //System.out.println(memberList);
      
   }
   
   public MemberDTO selectOne(MemberDTO dto) {
      return null;
   }
   
   public void update(MemberDTO dto) {
      
   }
   
   public void delete(MemberDTO dto) {
      
   }
}