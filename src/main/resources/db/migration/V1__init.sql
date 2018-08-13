
CREATE TABLE usuario (
    id bigserial primary key,
    nombre varchar(20) NOT NULL,
    apellido_paterno varchar(20) NOT NULL,
    apellido_materno varchar(20) default NULL
);