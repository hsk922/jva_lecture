select * from tab;					-- 테이블 목록 확인
select * from seq;					-- 시퀀스 목록 확인
select * from customer;
delete from customer;

-- 테이블 삭제
drop table customer purge;

-- 예1.
-- primary key 제약조건 : not null + unique
-- 반드시 중복되지 않는 값을 저장해야 한다.	
create table customer( no number(4) primary key,
						name varchar2(20), 
						email varchar2(20), 
						tel varchar2(20) );

-- 예2.
alter  table customer add(address varchar2(50));
alter  table customer add(reg_date timestamp);-- timestamp: 객체를 만들어 입력하는 방식
--	timestamp : 연/월/일/시/분/초
--	date : 연/월/일/시

-- 번호값을 자동으로 입력시켜주는 방법
-- 독립적으로 생성해놓았다가 필요할때 적용
create sequence customer_no_seq	-- 테이블명_적용될컬럼_시퀀스
	start with 1	-- 1부터 시작 하겠다.
	increment by 1;	-- 증가치 설정
-- 위의값 두개는 기본값으로 지워도 상관없다.

	
	
	
--게시판 만들기
select * from tab;
select * from seq;
select * from board;
create table board(
	no number primary key,
	writer varchar2(20) not null,
    passwd varchar2(20) not null,
	subject varchar2(100) not null,
	content varchar2(1000) not null,
	reg_date timestamp );

create sequence board_seq
start with 1
increment by 1;	

