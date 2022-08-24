
drop table member;
create table member(
   memNo int primary key, 
   memName varchar2(20), 
   memEmail varchar2(60), 
   memPassword varchar2(50), 
   regDate varchar2(20)
);

-- memNo, memName, memEmail, memPassword, regDate
insert into member(memNo, memName, memEmail, memPassword, regDate)
values(1, 'KIM','kim@kim.com','kim','2022-08-21');
insert into member(memNo, memName, memEmail, memPassword, regDate)
values(2, 'LEE','lee@lee.com','lee','2022-08-22');
insert into member(memNo, memName, memEmail, memPassword, regDate)
values(3, 'park','park@comstudy21.com','aprk','2022-08-23');

commit

select * from member;