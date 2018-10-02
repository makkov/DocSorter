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

INSERT INTO operator (name) VALUES ('Ivanov');
INSERT INTO operator (name) VALUES ('Petrov');
INSERT INTO operator (name) VALUES ('Sidorov');

INSERT INTO document (cat_id, operator_id) VALUES (1, 3);
INSERT INTO document (cat_id, operator_id) VALUES (2, 2);
INSERT INTO document (cat_id, operator_id) VALUES (3, 1);
INSERT INTO document (cat_id, operator_id) VALUES (1, 3);
INSERT INTO document (cat_id, operator_id) VALUES (2, 2);
INSERT INTO document (cat_id, operator_id) VALUES (3, 1);

INSERT INTO value (doc_id, field_id, info) VALUES (1, 1, 'zavtra');
