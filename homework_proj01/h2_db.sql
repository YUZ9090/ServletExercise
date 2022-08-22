-- Mother table
drop table product;
create table product (
rno number(4) primary key,
rtitle varchar2(100) not null,
rprice number(7)
);

drop sequence seq_product;
create sequence seq_product start with 100;
-------------------------------------------------
insert into product(rno, rtitle, rprice)
values (NEXTVAL('seq_product'), '���ɿ���', 150000);
insert into product(rno, rtitle, rprice)
values (NEXTVAL('seq_product'), '���Ό��', 190000);
insert into product(rno, rtitle, rprice)
values (NEXTVAL('seq_product'), '�ָ����ɿ���', 160000);
insert into product(rno, rtitle, rprice)
values (NEXTVAL('seq_product'), 'Ǯ�ڽ�', 160000);



-- Child table
drop table people;
create table people (
pno number primary key,
name varchar2(50) not null,
phone char(13) not null,
rpay char(1),
rno number,
constraint people_fk
foreign key (rno)
references product(rno)
on delete cascade
);

drop sequence seq_people;
create sequence seq_people start with 1000;

insert into people(pno, name, phone, rpay, rno)
values(NEXTVAL('seq_people'), '������', '010-1111-1111', 'T', (select max(rno) from product));
insert into people(pno, name, phone, rpay, rno)
values(NEXTVAL('SEQ_PEOPLE'), '�����', '010-1111-1112', 'F', (select max(rno)-1 from product));
insert into people(pno, name, phone, rpay, rno)
values(NEXTVAL('SEQ_PEOPLE'), '�����', '010-1111-1113', 'F', (select max(rno)-2 from product));
values(NEXTVAL('SEQ_PEOPLE'), '�⵿��', '010-1111-1113', 'F', (select max(rno)-2 from product));

select * from tab;
select * from seq;


select * from product;
select * from people;

commit

rollback;