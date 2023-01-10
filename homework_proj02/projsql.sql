drop table emp_comment;
drop table emp_tab;
select * from tab;

create table emp_tab(
empno number(4),
ename varchar2(20),
dept varchar2(20),
position varchar2(10),
constraint emp_tab_pk primary key(empno));

alter table emp_tab add filepath varchar(200);

drop sequence seq_emp;
create sequence seq_emp start with 1000 increment by 1;

insert into emp_tab values(seq_emp.nextVal, '박태호', '기획부', '부장', NULL);
insert into emp_tab values(seq_emp.nextVal, '손유일', '개발부', '과장', NULL);
insert into emp_tab values(seq_emp.nextVal, '오수철', '인사부', '대리', NULL);
insert into emp_tab values(seq_emp.nextVal, '안재홍', '영업부', '사원', NULL);

select * from emp_tab;

commit

create table emp_comment (
	cmtno number(4) primary key,
	content varchar2(100),
	writer varchar2(20),
	empno number(4),
	CONSTRAINT cmtno
    FOREIGN KEY (empno) -- 해당 테이블의 FK 설정
    REFERENCES emp_tab(empno) -- MOTHER 테이블의 PK와 연결
    ON DELETE CASCADE  -- MOTHER TABLE의 값 삭제시 연결된 값 삭제
);