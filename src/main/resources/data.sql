-- Enderecos
INSERT INTO endereco (rua, numero, bairro, cep, cidade, estado) VALUES
    ('Rua 1º de Maio', '235', 'Centro Sul', '64001-430', 'Teresina', 'PI');

INSERT INTO endereco (rua, numero, bairro, cep, cidade, estado) VALUES
    ('Praça Antônio Monte', 'S/N', 'Centro', '64218-340', 'Parnaíba', 'PI');

INSERT INTO endereco (rua, numero, bairro, cep, cidade, estado) VALUES
    ('Praça Antenor Neiva', 'S/N', 'Bomba', '64600-000', 'Picos', 'PI');

INSERT INTO endereco (rua, numero, bairro, cep, cidade, estado) VALUES
    ('Rua João Dantas', '1161', 'Manguinha', '64800-000', 'Floriano', 'PI');

-- Hemocentros
INSERT INTO hemocentro (nome, regiao, telefone, horario_funcionamento, outros_canais, endereco_id) VALUES
    ('HEMOPI - Centro de Hematologia e Hemoterapia do Piauí', 'Nordeste', '(86) 2221-0019', 'De segunda a sexta, das 8h às 18h. Sábado, das 7h15 às 17h', NULL, 1);

INSERT INTO hemocentro (nome, regiao, telefone, horario_funcionamento, outros_canais, endereco_id) VALUES
    ('Hemocentro Regional de Parnaíba', 'Nordeste', '(86) 2221-0019', 'De segunda a sexta, das 8h às 18h. Sábado, das 7h15 às 17h', NULL, 2);

INSERT INTO hemocentro (nome, regiao, telefone, horario_funcionamento, outros_canais, endereco_id) VALUES
    ('Hemocentro Regional de Picos', 'Nordeste', '(89) 2221-0019', 'De segunda a sexta, das 8h às 18h. Sábado, das 7h15 às 17h', '(89) 2221-0742', 3);

INSERT INTO hemocentro (nome, regiao, telefone, horario_funcionamento, outros_canais, endereco_id) VALUES
    ('Hemocentro Regional de Floriano', 'Nordeste', '(89) 2221-0019', 'De segunda a sexta, das 8h às 18h. Sábado, das 7h15 às 17h', '(89) 2221-0082 (distribuição)', 4);