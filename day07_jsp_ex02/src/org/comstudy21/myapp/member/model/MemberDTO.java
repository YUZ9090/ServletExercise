package org.comstudy21.myapp.member.model;

import org.comstudy21.myapp.dbcp.DAO;

public class MemberDTO {

   private int memNo;
   private String memName;
   private String memEmail;
   private String memPassword;
   private String regDate;
   
   public MemberDTO() {
      this(0, "","","","");
   }
   public MemberDTO(int memNo, String memName, String memEmail, String memPassword, String regDate) {
      this.memNo = memNo;
      this.memName = memName;
      this.memEmail = memEmail;
      this.memPassword = memPassword;
      this.regDate = regDate;
   }
   public int getMemNo() {
      return memNo;
   }
   public void setMemNo(int memNo) {
      this.memNo = memNo;
   }
   public String getMemName() {
      return memName;
   }
   public void setMemName(String memName) {
      this.memName = memName;
   }
   public String getMemEmail() {
      return memEmail;
   }
   public void setMemEmail(String memEmail) {
      this.memEmail = memEmail;
   }
   public String getMemPassword() {
      return memPassword;
   }
   public void setMemPassword(String memPassword) {
      this.memPassword = memPassword;
   }
   public String getRegDate() {
      return regDate;
   }
   public void setRegDate(String regDate) {
      this.regDate = regDate;
   }
   @Override
   public String toString() {
      String str = "{\"memNo\":%d,\"memName\":\"%s\",\"memEmail\":\"%s\",\"memPassword\":\"%s\",\"regDate\":\"%s\"}";
      return String.format(str, memNo, memName, memEmail, memPassword, regDate);
      
   }
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + memNo;
      return result;
   }
   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      MemberDTO other = (MemberDTO) obj;
      if (memNo != other.memNo)
         return false;
      return true;
   }
}