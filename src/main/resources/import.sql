insert into address(address_id, street, state, country) values(1L, '분당구', '경기도', '대한민국');
insert into address(address_id, street, state, country) values(2L, '강남구', '서울특별시', '대한민국');
insert into account(id, name, email, password, address_id) values(1,'wonwoo','wonwoo@test.com','qwer', 1L);
insert into account(id, name, email, password, address_id) values(2,'kevin','kevin@test.com','asdf', 2L);
insert into account(id, name, email, password, address_id) values(3,'wonwoo1','kevin@test.com','qwqw',1L);

