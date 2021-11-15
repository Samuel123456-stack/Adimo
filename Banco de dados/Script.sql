create database if not exists adimo;

CREATE USER if not exists 'adimo'@'localhost' IDENTIFIED BY 'Konex2021';
GRANT ALL PRIVILEGES ON adimo. * TO 'adimo'@'localhost';
FLUSH PRIVILEGES;

USE adimo;

CREATE TABLE usuario (
    idusu Integer AUTO_INCREMENT PRIMARY KEY,
    email varchar(50) null,
    confirma_email varchar(50) null,
    senha varchar(8) null,
    confirma_senha varchar(8) null,
    perfil varchar(30) null
);

CREATE TABLE newsletter (
    idnew Integer AUTO_INCREMENT PRIMARY KEY,
    email varchar(50)
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
("Itapegica", (SELECT c.idcid FROM cidade c WHERE c.nome = "Guarulhos")),
("Jardim Vila Galvão", (SELECT c.idcid FROM cidade c WHERE c.nome = "Guarulhos")),
("Lavras", (SELECT c.idcid FROM cidade c WHERE c.nome = "Guarulhos")),
("Macedo", (SELECT c.idcid FROM cidade c WHERE c.nome = "Guarulhos")),
("Maia", (SELECT c.idcid FROM cidade c WHERE c.nome = "Guarulhos")),
("Mato das Cobras", (SELECT c.idcid FROM cidade c WHERE c.nome = "Guarulhos")),
("Monte Carmelo", (SELECT c.idcid FROM cidade c WHERE c.nome = "Guarulhos")),
("Morro Grande", (SELECT c.idcid FROM cidade c WHERE c.nome = "Guarulhos")),
("Morros", (SELECT c.idcid FROM cidade c WHERE c.nome = "Guarulhos")),
("Paraventi", (SELECT c.idcid FROM cidade c WHERE c.nome = "Guarulhos")),
("Picanço", (SELECT c.idcid FROM cidade c WHERE c.nome = "Guarulhos")),
("Pimentas", (SELECT c.idcid FROM cidade c WHERE c.nome = "Guarulhos")),
("Ponte Grande", (SELECT c.idcid FROM cidade c WHERE c.nome = "Guarulhos")),
("Porto da Igreja", (SELECT c.idcid FROM cidade c WHERE c.nome = "Guarulhos")),
("Presidente Dutra", (SELECT c.idcid FROM cidade c WHERE c.nome = "Guarulhos")),
("Alphaville Industrial", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Alto da Boa Vista", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Alto da Lapa", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Alto da Mooca", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Alto de Pinheiros", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Americanópolis", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Anália Franco", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Aricanduva", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Artur Alvim", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Balneário Mar Paulista", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Balneário São Francisco", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Baronesa", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Barra Funda", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Barro Branco (Zona Norte)", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Bela Aliança", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Bela Vista", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Belém", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Belenzinho", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Bom Retiro", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Bosque da Saúde", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Brás", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Brasilândia", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Brooklin", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Brooklin Novo", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Brooklin Paulista", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Burgo Paulista", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Butantã", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Cambuci", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Campo Belo", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Campo Grande", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Campo Limpo", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Campos Elíseos", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Cangaíba", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Canindé", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Cantinho do Céu", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Capão do Embira", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Capão Redondo", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Carandiru", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Carrão", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Casa Verde", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Casa Verde Baixa", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Guarani", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Guarapiranga", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Higienópolis", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Horto Florestal", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Ibirapuera", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Iguatemi", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Imirim", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Indianópolis", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Instituto de Previdência", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Interlagos", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Ipiranga", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jabaquara", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jaraguá", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Bélgica", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Bom Refúgio", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Bonfiglioli", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Botucatu", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Brasil (Zona Norte)", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Brasil (Zona Sul)", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Cruzeiro", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim da Glória", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim da Laranjeira (Zona Leste)", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim da Pedreira", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim da Saúde", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Guedala", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Helena", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Herplin", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Humaitá", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Ibitirama", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Iguatemi", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Ipanema (Zona Sul)", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Íris", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Itacolomi", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Itapemirim", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Itapeva", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Iva", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Jabaquara", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Japão", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Jaraguá (São Domingos)", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Jaú (Zona Leste)", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Jua", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Kika", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Leonor", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Leonor Mendes de Barros", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Líbano", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Miriam", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Modelo", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Monjolo", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Monte Belo (Raposo Tavares)", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Monte Kemel", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Monte Verde", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Morumbi", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Penha", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Prainha", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Primavera", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Promissão", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Prudência", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Regina", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Regis", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Rincão", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Rizzo", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Sapopemba", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Shangrilá (Zona Sul)", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Soares", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Sônia Regina", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Soraia", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Suzana", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Taboão", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Taquaral", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Teresa", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Têxtil", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Três Marias", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Triana", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Ubirajara (Zona Sul)", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Umarizal", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Umuarama", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Universidade Pinheiros", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Vazani", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Vera Cruz", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Vera Cruz (Zona Leste)", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Vergueiro (Sacomã)", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Vila Carrão", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Vila Formosa", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Vila Mariana", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Vila Rica", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Virginia", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardim Vitória Régia", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jardins", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Jurubatuba", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Lajeado", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Lapa", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Lapa de Baixo", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Largo Sacomã", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Lauzane Paulista", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Liberdade", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Limão", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Limoeiro", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Luz", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Núcleo do Engordador", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Pacaembu", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Paineiras do Morumbi", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Parada de Taipas", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Parada Inglesa", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Paraíso", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Paraíso do Morumbi", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Paraisópolis", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Parelheiros", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Pari", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Parque América", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Parque Anhembi", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Penha", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Penha de França", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Perdizes", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Perus", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Pinheiros", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Piqueri", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Pirajussara", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Pirituba", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Planalto Paulista", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Pompeia", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Ponte Rasa", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Quarta Parada", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Quinta da Paineira", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Raposo Tavares", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Real Parque", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Recanto Paraíso", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("República", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Retiro Morumbi", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Rio Bonito", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Rio Pequeno", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Rolinópolis", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Sacomã", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Santa Cecília", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Santa Efigênia", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Santa Teresinha", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Santana", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Santo Amaro", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Socorro", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Sumaré", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Vila Antonina", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Vila Califórnia", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Vila Inah", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Vila Independência", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Vila Indiana", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Vila Industrial", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Vila Inglesa", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Vila Lageado", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Vila Leonor", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Vila Leopoldina", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Vila Santa Catarina", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Vila Santa Cruz (Zona Leste)", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Vila Santa Eulalia", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Vila Santa Teresa (Zona Leste)", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Vila São Nicolau", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Vila Siqueira (Zona Norte)", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Vila Socorro", (SELECT c.idcid FROM cidade c WHERE c.nome = "São Paulo")),
("Morro Marapé", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Morro Nova Cintra", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Morro Pacheco", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Morro Penha", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Morro Saboó", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Morro Santa Maria", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Morro Santa Terezinha", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Morro São Bento", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Nossa Senhora das Neves", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Outerinho", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Paquetá", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Piratininga", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Pompéia", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Ponta da Praia", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Porto Alamoa", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Porto Macuco", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos")),
("Porto Paquetá", (SELECT c.idcid FROM cidade c WHERE c.nome = "Santos"));

CREATE TABLE proprietario (
    idprop Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(50) null,
    dt_nascimento date null,
    cpf varchar(14) null,
    rg varchar(12) null,
    email varchar(50) null,
    celular varchar(15) null
);

CREATE TABLE cliente (
    idcli Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(50) null,
    dtnascimento Date null,
    cpf varchar(14) null,
    rg varchar(12) null,
    celular varchar(15) null
);

CREATE TABLE Mensagem (
    idmen Integer AUTO_INCREMENT PRIMARY KEY,
    mensagem varchar(30) null
);

CREATE TABLE agenda_visitas (
    fk_imovel_id_imo Integer,
    fk_cliente_id_cli Integer,
    id_agen Integer PRIMARY KEY,
    dt_vsita Date
);

CREATE TABLE serasa (
    idser Integer AUTO_INCREMENT PRIMARY KEY,
    situacao varchar(9)
);

CREATE TABLE imobiliaria (
    idimob Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(50),
    cofeci varchar(10),
    logradouro varchar(50),
    numero Integer,
    bairro varchar(50),
    cidade varchar(50),
    cep varchar(9)
);

CREATE TABLE imovel (
    idimov Integer AUTO_INCREMENT PRIMARY KEY,
    foto longblob null,
    logradouro varchar(50),
    numero Integer,
    complemento varchar(30),
    metragem integer,
    qtecomodos integer,
    qtevaga integer,
    descricao varchar(100),
    sobrelocalizacao varchar(100),
    fk_imob_imov Integer,
    fk_prop_imov Integer,
    fk_bai_imov Integer,
    FOREIGN KEY (fk_imob_imov) REFERENCES imobiliaria (idimob),
    FOREIGN KEY (fk_prop_imov) REFERENCES proprietario (idprop),
    FOREIGN KEY (fk_bai_imov) REFERENCES bairro (idbai)
);


CREATE TABLE inquilino (
    idqui Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(50),
    fk_imov_iqui Integer,
    FOREIGN KEY (fk_imov_iqui) REFERENCES imovel (idimov)
);

CREATE TABLE list_consulta_serasa(
    fk_ser_lis Integer,
    fk_imob_lis Integer,
    fk_cli_lis Integer,
    fk_men_lis Integer,
	FOREIGN KEY (fk_ser_lis) REFERENCES serasa (idser),
    FOREIGN KEY (fk_imob_lis) REFERENCES imobiliaria (idimob),
	FOREIGN KEY (fk_cli_lis) REFERENCES cliente (idcli),
    FOREIGN KEY (fk_men_lis) REFERENCES mensagem (idmen)
);


CREATE TABLE funcionario (
    idfunc Integer AUTO_INCREMENT PRIMARY KEY,
    nome varchar(30),
    fk_usu_fun Integer,
    fk_imob_fun Integer,
    FOREIGN KEY (fk_usu_fun) REFERENCES usuario (idusu),
    FOREIGN KEY (fk_imob_fun) REFERENCES imobiliaria (idimob)
);