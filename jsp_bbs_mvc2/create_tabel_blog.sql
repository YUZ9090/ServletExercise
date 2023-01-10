
drop table blog;
create table blog (
id number(11) not null primary key,
title varchar2(100) not null,
writer varchar2(50) not null,
content varchar2(1000)
);

drop sequence seq_blog;
create sequence seq_blog start with 1 increment by 1;
select seq_blog.nextval from dual;
select seq_blog.currval from dual;

insert into blog(id, title, writer, content)
values(seq_blog.nextval, 'test','tester','test...');
insert into blog(id, title, writer, content)
values(seq_blog.nextval, 'test2','tester2','test2...');

commit


drop table board;
create table board (
num number(10) not null primary key,
author varchar2(100),
email varchar2(200),
title varchar2(500),
content varchar2(4000),
passwd varchar2(12)
);

drop sequence seq_bbs;
create sequence seq_bbs start with 1 increment by 1;
select seq_bbs.nextval from dual;
select seq_bbs.currval from dual;

select * from board;


insert into board(num, author, email, title, content, passwd)
values(seq_bbs.nextval, 'tiger','ti@ger.com','title1','content1','1234');
insert into board(num, author, email, title, content, passwd)
values(seq_bbs.nextval, 'buffalo','bu@ffa.com','title2','content2','1234');
insert into board(num, author, email, title, content, passwd)
values(seq_bbs.nextval, 'buffalo2','bu@ffa.com2','title3','content4','1234');