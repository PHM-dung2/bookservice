drop database if exists bookservice;
create database bookservice;
use bookservice;

create table book(
	bno int unsigned auto_increment,
    bname varchar(30) not null,
    bwriter varchar(30) not null,
    bpublisher varchar(100) not null,
    bdate datetime default now(),
    bupdate datetime default now(),
    constraint primary key( bno )
);

-- 샘플 5개
insert into book(bname, bwriter, bpublisher, bdate, bupdate) values
( '소년이 온다' , '한강' , '창비' , '2025-02-09 12:15:32' , '2025-02-09 12:52:32' ),
( '데미안', '헤르만 헤세', '민음사', '2025-02-08 10:30:00', '2025-02-08 11:00:00' ),
( '1984', '조지 오웰', '열린책들', '2025-02-07 14:45:10', '2025-02-07 15:20:30' ),
( '파친코', '이민진', '문학사상', '2025-02-06 09:10:25', '2025-02-06 09:45:50' ),
( '칼의 노래', '김훈', '문학동네', '2025-02-05 16:20:55', '2025-02-05 17:00:40' );

select * from book;

