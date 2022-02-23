DROP table IF EXISTS empleado;
DROP table IF EXISTS departamento;

create table departamento(
    id int auto_increment primary key,
    nombre varchar(250),
    presupuesto int);

create table empleado(
	dni varchar(9) primary key,
    nombre varchar(250),
    apellidos varchar(250),
    departamento_id int,
	foreign key (departamento_id) references departamento(id) on delete cascade on update cascade);

insert into departamento (nombre, presupuesto)values('Departamento 1', 100);
insert into departamento (nombre, presupuesto)values('Departamento 2', 200);
insert into departamento (nombre, presupuesto)values('Departamento 3', 300);
insert into departamento (nombre, presupuesto)values('Departamento 4', 400);
insert into departamento (nombre, presupuesto)values('Departamento 5', 500);

insert into empleado (dni, nombre, apellidos, departamento_id) values ('123456789','Paco','Fernandez', 1);
insert into empleado (dni, nombre, apellidos, departamento_id) values ('987654321','Ramon','Garrido', 1);
insert into empleado (dni, nombre, apellidos, departamento_id) values ('098765432','Jorge','Lopez', 2);
insert into empleado (dni, nombre, apellidos, departamento_id) values ('234567890','Miguel','Rutia', 3);
insert into empleado (dni, nombre, apellidos, departamento_id) values ('102938475','Fernando','Queralt', 4);
insert into empleado (dni, nombre, apellidos, departamento_id) values ('675849302','Manuel','Sierra', 5);

