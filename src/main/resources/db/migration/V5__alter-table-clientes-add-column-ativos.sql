alter table clientes add ativo tinyint not null;
update clientes set ativo = 1;