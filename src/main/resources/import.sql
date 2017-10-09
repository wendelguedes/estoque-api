--> Inicializando alguns produtos....
insert into produto (id,codigo, nome, marca) values (1,'NT0123', 'Notebook i7', 'DELL');
insert into produto (id,codigo, nome, marca) values (2,'CAR123', 'FIESTA', 'FORD');

--> Inicializando alguns estoques....
insert into estoque (id,nome) values (1,'DEPOSITO PRINCIPAL');
insert into estoque (id,nome) values (2,'DEPOSITO SECUNDARIO');

--> Inserindo alguns entradas no estoque
insert into item_estoque (id,estoque_id,produto_id,quantidade,data) values (1,1,1,100,sysdate());
insert into item_estoque (id,estoque_id,produto_id,quantidade,data) values (2,1,1,150,sysdate());
insert into item_estoque (id,estoque_id,produto_id,quantidade,data) values (3,2,2,100,sysdate());
insert into item_estoque (id,estoque_id,produto_id,quantidade,data) values (4,2,2,150,sysdate());