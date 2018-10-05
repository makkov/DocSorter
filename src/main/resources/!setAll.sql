INSERT INTO category (name) VALUES ('akt');
INSERT INTO category (name) VALUES ('schet');
INSERT INTO category (name) VALUES ('dop.soglahenie');

--delete from category where id = 2;

insert into field (name, cat_id) values ('data', 1);
insert into field (name, cat_id) values ('aktoviy zal', 1);
insert into field (name, cat_id) values ('platelshil scheta', 2);
insert into field (name, cat_id) values ('scetovod', 2);
insert into field (name, cat_id) values ('summa', 2);
insert into field (name, cat_id) values ('o chem rech', 3);

INSERT INTO role (name) VALUES ('admin');
INSERT INTO role (name) VALUES ('operator');

INSERT INTO operator (login, password, name, "isActive", role_id) VALUES ('qwer', '1', 'Ivanov', true, 1);
INSERT INTO operator (login, password, name, "isActive", role_id) VALUES ('asdf', '2', 'Petrov', false, 2);
INSERT INTO operator (login, password, name, "isActive", role_id) VALUES ('zxcv', '33', 'Sidorov', true, 2);

INSERT INTO document (cat_id, operator_id, name) VALUES (1, 3, '№ 1');
INSERT INTO document (cat_id, operator_id, name) VALUES (2, 2, '№ 2');
INSERT INTO document (cat_id, operator_id, name) VALUES (3, 1, '№ 3');
INSERT INTO document (cat_id, operator_id, name) VALUES (1, 3, '№ 4');
INSERT INTO document (cat_id, operator_id, name) VALUES (2, 2, '№ 5');
INSERT INTO document (cat_id, operator_id, name) VALUES (3, 1, '№ 6');

INSERT INTO value (doc_id, field_id, info) VALUES (1, 1, 'zavtra');
