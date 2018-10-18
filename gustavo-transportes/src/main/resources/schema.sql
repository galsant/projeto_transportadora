create table objeto
(
	id integer not null,
	descricao varchar(20) not null,
	primary key(id)
);

create table registro
(
   id integer not null,
   etapa varchar(255) not null,
   status varchar(255) not null,
   localidade varchar(500) not null,
   data datetime,
   objeto_id int not null,
   primary key(id),
   foreign key(objeto_id) references objeto(id)
);