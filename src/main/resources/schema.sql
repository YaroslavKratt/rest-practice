create table conference
(
  id int auto_increment primary key,
  topic varchar(255) not null,

);
create table report
(
  id int auto_increment primary key,
  conference_id int,
  foreign key (conference_id) references conference(id),
  topic varchar(255) not null
);