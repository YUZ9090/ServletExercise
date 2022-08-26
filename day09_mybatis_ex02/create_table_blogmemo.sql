--idx, memo, writer, regDate, bno(¿Ü·¡Å°)
create table blogMemo(
	idx int primary key,
	memo varchar2(50),
	writer varchar2(20),
	regDate varchar2(20),
	bno int
);

insert into blogMemo(idx, memo, writer, regDate, bno)
values(001, 'memotest', 'memowriter',formatdatetime(now(),'yyyy-MM-dd'),101);
insert into blogMemo(idx, memo, writer, regDate, bno)
values(002, 'memotest2', 'memowriter2',formatdatetime(now(),'yyyy-MM-dd'),102);
insert into blogMemo(idx, memo, writer, regDate, bno)
values(003, 'memotest3', 'memowriter3',formatdatetime(now(),'yyyy-MM-dd'),103);

select * from blogMemo;

commit