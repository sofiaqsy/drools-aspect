
CREATE TABLE producto (
    id bigserial primary key,
    nombre varchar(20) NOT NULL,
    tipo varchar(20) NOT NULL,
    precio double precision default NULL,
    descuento double precision default NULL

);

INSERT INTO producto(nombre, tipo, precio, descuento) VALUES('producto', 'A', 30, 5);