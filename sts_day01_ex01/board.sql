CREATE TABLE USERS(
   ID VARCHAR2(8) PRIMARY KEY,
   PASSWORD VARCHAR2(8),
   NAME VARCHAR2(20),
   ROLE VARCHAR2(5)
);

INSERT INTO USERS VALUES('test', 'test123', '������', 'Admin');
INSERT INTO USERS VALUES('user1', 'user1', 'ȫ�浿', 'User');

select * from users;

CREATE TABLE BOARD (
SEQ NUMBER(5) PRIMARY KEY,
TITLE VARCHAR2(200),
WRITER VARCHAR2(20),
CONTENT VARCHAR2(2000),
REGDATE DATE DEFAULT now(),
CNT NUMBER(5) DEFAULT 0
);

INSERT INTO BOARD(SEQ, TITLE, WRITER, CONTENT) 
VALUES (1, '�����λ�','������','�氩���ϴ�. Hi^^');
INSERT INTO BOARD(SEQ, TITLE, WRITER, CONTENT) 
VALUES (2, '�ݰ����ϴ�.','ȫ�浿','���ڵǼ���. Hi^^');

SELECT * FROM BOARD;

-- mybatis
-- h2
-- commons-dbcp
-- mybatis-spring

commit