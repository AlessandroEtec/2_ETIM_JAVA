create database if not exists venda;
use venda;

drop table if exists categoria;
drop table if exists produto;

CREATE TABLE categoria(
    cat_codigo INTEGER(5) NOT NULL auto_increment,
	cat_descricao VARCHAR(50),
	primary key(cat_codigo)
);

CREATE TABLE produto (
	pro_codigo INT NOT NULL auto_increment,
	cat_codigo INT NOT NULL,
	pro_descricao VARCHAR(50) NOT NULL,
	pro_custo DECIMAL(10,2),
	pro_venda DECIMAL(10,2),
	pro_estoque DECIMAL(10,3) DEFAULT 0,
	PRIMARY KEY (pro_codigo),
	CONSTRAINT fk_categoria FOREIGN KEY(cat_codigo) 
	REFERENCES categoria(cat_codigo)
);

INSERT INTO categoria(cat_descricao) values ('Bebidas'),('Lanches'),('Porções'),('Pizzas'),('Sorvetes'),('Doces'),('Saladas');

desc categoria;
desc produto;
select * from categoria;
select * from produto;
