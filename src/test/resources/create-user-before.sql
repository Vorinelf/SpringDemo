delete from user_role;
delete from usr;

insert into usr(id, active, password, username) values
(1, true, '$2a$08$aTlanu6W4gsCGSYUPYeHeOg0o4gRkBzXr6rPTm2o/6e8s5ndXMajC', 'firstUser'),
(2, true, '$2a$08$aTlanu6W4gsCGSYUPYeHeOg0o4gRkBzXr6rPTm2o/6e8s5ndXMajC', 'secondUser');

insert  into user_role(user_id, roles) values
(1, 'USER'),(1, 'ADMIN'),
(2, 'USER');