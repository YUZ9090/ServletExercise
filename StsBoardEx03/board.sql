

select * from board;

create table board (
seq number(5) primary key,
title varchar2(200),
writer varchar2(20),
content varchar2(2000),
regdate date default now(),
cnt number(5) default 0
);

INSERT INTO BOARD(SEQ,TITLE,WRITER,CONTENT)
VALUES ((select nvl(max(seq),0)+1 from board),'newtitle','newwriter','newcontent');

UPDATE BOARD SET TITLE='���ƿ�' , WRITER='�̼���',CONTENT = '�Խ������ƿ�' WHERE SEQ=3;

DELETE FROM board WHERE SEQ=3;

SELECT * FROM board WHERE SEQ=2

SELECT * FORM BOARD ORDER BY SEQ DESC;

commit