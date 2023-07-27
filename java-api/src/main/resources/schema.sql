drop table dogs if exists;

create table owners
(
    owner_id int not null auto_increment primary key,
    name varchar(70)
);

select * from owners;

create table dogs
(
    id int not null auto_increment primary key,
    name varchar(70),
   age int,
   owner_id int not null,
   FOREIGN key (owner_id) REFERENCES owners(owner_id)
);

