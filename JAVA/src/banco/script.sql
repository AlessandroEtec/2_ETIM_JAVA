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

insert into produto(cat_codigo,pro_descricao,pro_custo,pro_venda,pro_estoque) values (1,'Agua',1.3,2,100);
insert into produto(cat_codigo,pro_descricao,pro_custo) values (2,'X-Calabresa',7.88);
insert into produto(cat_codigo,pro_descricao,pro_custo,pro_venda) values (3,'Porção de Calabresa',12,25);
insert into produto(cat_codigo,pro_descricao,pro_custo,pro_venda) values (4,'Pizza Portuguesa',8.22,12.99);
insert into produto(cat_codigo,pro_descricao,pro_custo,pro_venda) values (5,'Picolé', 0.55,0.99);
insert into produto(cat_codigo,pro_descricao,pro_venda) values (6,'Brigadeiro',1.99);
insert into produto(cat_codigo,pro_descricao,pro_venda) values (7,'Mousse de Chocolate', 8.35);
insert into produto(cat_codigo,pro_descricao,pro_custo,pro_venda,pro_estoque) values (1,'Refrigerante Lata',2.58,3.50,86);
insert into produto(cat_codigo,pro_descricao,pro_custo,pro_venda) values (2,'X-Totó',7.32,12.79);
insert into produto(cat_codigo,pro_descricao,pro_custo,pro_venda) values (3,'X-Tudo',8.85,14.99);
insert into produto(cat_codigo,pro_descricao,pro_custo,pro_venda) values (4,'Pizza de Mussarela',8.59,12.99);
insert into produto(cat_codigo,pro_descricao,pro_custo,pro_venda) values (5,'Casquinha', 1.88, 2.90);
insert into produto(cat_codigo,pro_descricao,pro_custo,pro_venda) values (7,'Pizza de Calabresa',8.22,12.99);
insert into produto(cat_codigo,pro_descricao,pro_custo,pro_venda) values (3,'Porção de Salame',22,44.99);
insert into produto(cat_codigo,pro_descricao,pro_custo) values (6,'Pudim', 2.79);
insert into produto(cat_codigo,pro_descricao,pro_venda) values (7,'Salada de Tomate', 7.65);
insert into produto(cat_codigo,pro_descricao,pro_custo,pro_venda,pro_estoque) values (1,'Suco de Laranja',1.61,3.19,0);
insert into produto(cat_codigo,pro_descricao,pro_custo,pro_venda) values (2,'Bauru de Carne',12.77,17.00);
insert into produto(cat_codigo,pro_descricao,pro_custo,pro_venda) values (3,'Batata Frita',11,15);
insert into produto(cat_codigo,pro_descricao,pro_venda) values (7,'Salada de Alface', 4.49);
insert into produto(cat_codigo,pro_descricao,pro_venda) values (2,'Salada de Repolho', 5.15);
insert into produto(cat_codigo,pro_descricao,pro_custo) values (5,'Cascão', 3.72);

desc categoria;
desc produto;
select * from categoria;
select * from produto;

