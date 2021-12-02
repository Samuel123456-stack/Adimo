create database if not exists adimo;

CREATE USER if not exists 'adimo'@'localhost' IDENTIFIED BY 'Konex2021';
GRANT ALL PRIVILEGES ON adimo. * TO 'adimo'@'localhost';
FLUSH PRIVILEGES;

CREATE TABLE newsletter (
    idnew Integer AUTO_INCREMENT PRIMARY KEY,
    email varchar(50) null
);

CREATE TABLE cidade (
    idcid Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(50) not null unique
);

insert into cidade(nome)values
('São Paulo'),
('Guarulhos'),
('Santos');

CREATE TABLE bairro (
    idbai Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(50) null,
    fk_cid_bai Integer null,
	FOREIGN KEY (fk_cid_bai) REFERENCES cidade (idcid)
);

insert into bairro(nome,fk_cid_bai)values
("Butantã", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Luz", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Monte Carmelo", (SELECT c.idcid FROM cidade c WHERE c.nome = "Guarulhos")),
("Morro Grande", (SELECT c.idcid FROM cidade c WHERE c.nome = "Guarulhos")),
("Morros", (SELECT c.idcid FROM cidade c WHERE c.nome = "Guarulhos")),
("São Manoel", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Trindade", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Valongo", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Vila Belmiro", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Morumbi", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo"));

CREATE TABLE proprietario (
    idprop Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(50) null,
    cpf varchar(14) null,
    rg varchar(13) null,
    email varchar(50) null,
    celular varchar(15) null
);

insert into proprietario(nome,cpf,rg,email,celular) values('Fulano','324-323-123-09', '32-123-123-04','teste@gmail.com','11-98954-3231');

CREATE TABLE imobiliaria (
    idimob Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(50) null,
    cofeci varchar(10) null,
    logradouro varchar(50) null,
    numero Integer null,
    cep varchar(9) null,
    fk_bai_imob integer null,
	FOREIGN KEY (fk_bai_imob) REFERENCES bairro (idbai)
);

/*CREATE TABLE role(
	role_id Integer AUTO_INCREMENT PRIMARY KEY,
	role varchar(100)
);*/

CREATE TABLE funcionario (
    idfunc Integer AUTO_INCREMENT PRIMARY KEY,
    username varchar(30) null,
    senha varchar(8) null,
    nome varchar(30) null,
    /*fk_role Integer null,
    FOREIGN KEY (fk_role) REFERENCES role (role_id)*/
);

insert into funcionario(username, senha, nome) value('gabriel@adimo.com', '123456', 'Gabriel'), ('adm@adimo.com', '123456', 'Gabriel');

CREATE TABLE conveniencia (
    idconv Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(50) null
);

insert into conveniencia(nome)values
	('Academia'),('Quadras'),
    ('Próximo de mercados'),
    ('Próximo de farmácias'),
    ('Piscina'), ('Ciclovia');   

CREATE TABLE imovel (
    idimov Integer AUTO_INCREMENT PRIMARY KEY,
    foto varchar(200) null,
    logradouro varchar(50) null,
    numero Integer null,
    complemento varchar(30) null,
    cep varchar(9) null,
    tamanho integer null,
    qtecomodos integer null,
    qtevaga integer null,
    descricao varchar(200) null,
    valor decimal(7.2) null,
    fk_imob_imov Integer null,
    fk_prop_imov Integer null,
    fk_bai_imov Integer null,
    FOREIGN KEY (fk_imob_imov) REFERENCES imobiliaria (idimob),
    FOREIGN KEY (fk_prop_imov) REFERENCES proprietario (idprop),
    FOREIGN KEY (fk_bai_imov) REFERENCES bairro (idbai)
);
 
insert into imovel(foto,descricao,logradouro,numero,complemento,tamanho,qtecomodos,qtevaga,valor,fk_bai_imov,fk_prop_imov)values
	('https://www.decorfacil.com/wp-content/uploads/2017/03/20171011fachada-casa-simples-pequena-99-960x600.jpg','Residência de alto padrão de arquitetura contemporânea, possui 2 quartos, 1 suite, 1 lavabo, sala de estar e de jantar.Venha conferir este lindo imóvel, basta entrar em contato.','Rua Gália',458,'Casa',130,6,1,4600.00,10,1),
    ('https://www.imoveismartini.com.br/media/com_eshop/products/resized/image_5f74bd0cc688c_1-600x450.jpg','Residência de alto padrão de arquitetura contemporânea, possui 2 quartos, 1 suite, 1 lavabo, sala de estar e de jantar.Venha conferir este lindo imóvel, basta entrar em contato.','Rua Alice Gonsalves',410,'Casa',90,4,1,4600.00,10,1),
    ('https://www.imoveismartini.com.br/media/com_eshop/products/resized/image_6005ccaed838f_2-600x450.jpg','Residência de alto padrão de arquitetura contemporânea, possui 2 quartos, 1 suite, 1 lavabo, sala de estar e de jantar.Venha conferir este lindo imóvel, basta entrar em contato.','Rua Attillio Regulo Arena',300,'Casa',160,8,2,4500.00,10,1),
    ('https://fotos.vivadecora.com.br/decoracao-projeto-de-casa-casa-com-piscina-revistavd-173621-proportional-height_cover_medium.jpg','Residência de alto padrão de arquitetura contemporânea, possui 2 quartos, 1 suite, 1 lavabo, sala de estar e de jantar.Venha conferir este lindo imóvel, basta entrar em contato.','Rua Gália',245,'Casa',100,5,1,4800.00,10,1),
    ('https://g3s8s9z8.rocketcdn.me/wp-content/uploads/2015/05/casa-grande-a-venda-em-jaua-bahia-1.jpg','Residência de alto padrão de arquitetura contemporânea, possui 2 quartos, 1 suite, 1 lavabo, sala de estar e de jantar.Venha conferir este lindo imóvel, basta entrar em contato.','Rua Alice Gonsalves',415,'Casa',90,4,1,4700.00,10,1),
    ('https://i.pinimg.com/originals/c0/43/6b/c0436bed014705b70daad7022b9d7031.jpg','Residência de alto padrão de arquitetura contemporânea, possui 2 quartos, 1 suite, 1 lavabo, sala de estar e de jantar.Venha conferir este lindo imóvel, basta entrar em contato.','Rua Aristeu Seixas',600,'Casa',115,6,1,4000.00,10,1);

CREATE TABLE lista_conveniencias (
    fk_conv_lista integer null,
    fk_imob_lista integer null,
	FOREIGN KEY (fk_conv_lista) REFERENCES conveniencia (idconv),
    FOREIGN KEY (fk_imob_lista) REFERENCES imovel (idimov)
);
insert into lista_conveniencias(fk_conv_lista,fk_imob_lista)values
	(1,1),
    (5,1),
    (6,1),
	(1,2),
    (5,2),
    (6,2),
    (1,3),
    (2,3),
    (5,3),
    (1,4),
    (2,4),
    (6,4),
    (1,5),
    (4,5),
    (6,5),
    (1,6),
    (2,6),
    (3,6);

CREATE TABLE inquilino (
    idqui Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(50) null,
    fk_imov_iqui Integer null,
    FOREIGN KEY (fk_imov_iqui) REFERENCES imovel (idimov)
);
