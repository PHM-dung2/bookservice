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

select * from book;