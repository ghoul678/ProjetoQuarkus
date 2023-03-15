-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-1');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-2');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-3');
insert into Biblioteca ( datacompra, quantidade, descricao, localestante) values( '2022-03-11', 3, 'harry poter',1.22);
insert into Biblioteca ( datacompra, quantidade, descricao, localestante) values( '2022-03-12', 10, 'harry poter',1.25);