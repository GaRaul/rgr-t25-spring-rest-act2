DROP table IF EXISTS empleado;
DROP table IF EXISTS departamento;

create table departamento(
    id int auto_increment primary key,
    nombre varchar(250),
    presupuesto int);

create table empleado(
	id int auto_increment primary key,
    nombre varchar(250),
    apellidos varchar(250),
    departamento_id int,
	foreign key (departamento_id) references departamento(id) on delete cascade on update cascade);

insert into departamento (nombre, presupuesto)values('Departamento 1');
insert into departamento (nombre, presupuesto)values('Departamento 2');
insert into departamento (nombre, presupuesto)values('Departamento 3');
insert into departamento (nombre, presupuesto)values('Departamento 4');
insert into departamento (nombre, presupuesto)values('Departamento 5');

insert into articulo (nombre, apellidos, departamento_id) values ('Paco','Fernandez', 1);
insert into articulo (nombre, apellidos, departamento_id) values ('Ramon','Garrido', 1);
insert into articulo (nombre, apellidos, departamento_id) values ('Jorge','Lopez', 2);
insert into articulo (nombre, apellidos, departamento_id) values ('Miguel','Rutia', 3);
insert into articulo (nombre, apellidos, departamento_id) values ('Fernando','Queralt', 4);
insert into articulo (nombre, apellidos, departamento_id) values ('Manuel','Sierra', 5);

