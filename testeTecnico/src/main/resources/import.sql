INSERT INTO tb_endereco(logradouro, cep, numero, cidade) VALUES ('Rua Tal', '00000-000', 400, 'São Paulo');
INSERT INTO tb_endereco(logradouro, cep, numero, cidade) VALUES ('Rua Avenida', '11111-111', 401, 'São Paulo');
INSERT INTO tb_endereco(logradouro, cep, numero, cidade) VALUES ('Avenida Tal', '22222-222', 402, 'São Paulo');
INSERT INTO tb_endereco(logradouro, cep, numero, cidade) VALUES ('Avenida Rua', '33333-333', 403, 'São Paulo');

INSERT INTO tb_pessoa(endereco_id, nome, data_nascimento, endereco_principal) VALUES (1, 'Maria', '1990-08-08', TRUE);
INSERT INTO tb_pessoa(endereco_id, nome, data_nascimento, endereco_principal) VALUES (2, 'Maria', '1990-08-08', FALSE);
INSERT INTO tb_pessoa(endereco_id, nome, data_nascimento, endereco_principal) VALUES (3, 'Maria', '1990-08-08', FALSE);
INSERT INTO tb_pessoa(endereco_id, nome, data_nascimento, endereco_principal) VALUES (4, 'Marcos', '1999-03-10', TRUE);