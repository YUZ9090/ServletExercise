package org.comstudy21.myweb.people.model;

public class PeopleDTO {
   private int pno; // number primary key,
   private String name; // varchar2(50) not null,
   private String phone; // char(13) not null,
   private String rpay; // char(1),
   private int rno; // number,

   public PeopleDTO() {
      this(0,"","","",0);
   }

   public PeopleDTO(int pno, String name, String phone, String rpay, int rno) {
      this.pno = pno;
      this.name = name;
      this.phone = phone;
      this.rpay = rpay;
      this.rno = rno;
   }

   public int getPno() {
      return pno;
   }

   public void setPno(int pno) {
      this.pno = pno;
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

   @Override
   public String toString() {
      return "PeopleDTO [pno=" + pno + ", name=" + name + ", phone=" + phone + ", rpay=" + rpay + ", rno=" + rno
            + "]";
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + ((phone == null) ? 0 : phone.hashCode());
      result = prime * result + pno;
      result = prime * result + rno;
      result = prime * result + ((rpay == null) ? 0 : rpay.hashCode());
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
      PeopleDTO other = (PeopleDTO) obj;
      if (name == null) {
         if (other.name != null)
            return false;
      } else if (!name.equals(other.name))
         return false;
      if (phone == null) {
         if (other.phone != null)
            return false;
      } else if (!phone.equals(other.phone))
         return false;
      if (pno != other.pno)
         return false;
      if (rno != other.rno)
         return false;
      if (rpay == null) {
         if (other.rpay != null)
            return false;
      } else if (!rpay.equals(other.rpay))
         return false;
      return true;
   }
}