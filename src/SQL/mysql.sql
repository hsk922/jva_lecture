
--테이블 삭제
--MySQL은 purge를 붙이지 않는다.
drop table board;

--테이블 생성
create table customer( no int(4) auto_increment primary key, 
						name varchar(20), 
						email varchar(20), 
						tel varchar(20) , 
						address varchar(50), 
						reg_date timestamp);
						
