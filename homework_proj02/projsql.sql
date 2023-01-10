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

insert into emp_tab values(seq_emp.nextVal, '����ȣ', '��ȹ��', '����', NULL);
insert into emp_tab values(seq_emp.nextVal, '������', '���ߺ�', '����', NULL);
insert into emp_tab values(seq_emp.nextVal, '����ö', '�λ��', '�븮', NULL);
insert into emp_tab values(seq_emp.nextVal, '����ȫ', '������', '���', NULL);

select * from emp_tab;

commit

create table emp_comment (
	cmtno number(4) primary key,
	content varchar2(100),
	writer varchar2(20),
	empno number(4),
	CONSTRAINT cmtno
    FOREIGN KEY (empno) -- �ش� ���̺��� FK ����
    REFERENCES emp_tab(empno) -- MOTHER ���̺��� PK�� ����
    ON DELETE CASCADE  -- MOTHER TABLE�� �� ������ ����� �� ����
);