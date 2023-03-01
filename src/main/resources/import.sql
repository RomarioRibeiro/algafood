insert into cozinha(nome) values('Tailandesa');
insert into cozinha(nome) values('Indiana');

insert into restaurante (nome, taxa_frete, cozinha_id) values ('Thai Gourmet', 10, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Thai Delivery', 9.50, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Tuk Tuk Comida Indiana', 15, 2);



insert into forma_pagamento (descricao) values ('Pagamento Com Cartão');
insert into forma_pagamento (descricao) values ('Pagamento Com Dinheiro');

insert into permissao(nome, descricao) values ('Administrador' , 'controle total');
insert into permissao(nome, descricao) values ('Usuario' , 'controla Cozinha e restaurante');
insert into permissao(nome, descricao) values ('Cliente' , 'controla restaurante');

insert into estado(nome) values('São Paulo');
insert into estado(nome) values('Rio de janeiro');
insert into estado(nome) values('Amazonas');

insert into cidade(nome, estado_id) values ('São Luiz' , 1);
insert into cidade(nome, estado_id) values ('Lapa' , 2);
insert into cidade(nome, estado_id) values ('Lagoas' , 3);