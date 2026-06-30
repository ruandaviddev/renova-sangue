-- Enderecos
INSERT INTO endereco (rua, numero, bairro, cep, cidade, estado) VALUES
    ('Rua 1º de Maio', '235', 'Centro', '64001-430', 'Teresina', 'PI');
INSERT INTO endereco (rua, numero, bairro, cep, cidade, estado) VALUES
    ('Av. José Bastos', '3390', 'Rodolfo Teófilo', '60431-086', 'Fortaleza', 'CE');
INSERT INTO endereco (rua, numero, bairro, cep, cidade, estado) VALUES
    ('Ladeira do Hospital Geral, Andar 2º', 'S/N', 'Brotas', '40286-240', 'Salvador', 'BA');
INSERT INTO endereco (rua, numero, bairro, cep, cidade, estado) VALUES
    ('Av. Jorge de Lima', '58', 'Trapiche da Barra', '57010-300', 'Maceió', 'AL');
INSERT INTO endereco (rua, numero, bairro, cep, cidade, estado) VALUES
    ('Centro Administrativo Gov. Augusto Franco, Rua Quinze', 'S/N', 'Capucho', '49095-000', 'Aracaju', 'SE');
INSERT INTO endereco (rua, numero, bairro, cep, cidade, estado) VALUES
    ('Av. D. Pedro II', '1119', 'Torre', '58013-420', 'João Pessoa', 'PB');
INSERT INTO endereco (rua, numero, bairro, cep, cidade, estado) VALUES
    ('Rua 5 de Janeiro', 'S/N', 'Jordoá', '65040-450', 'São Luís', 'MA');
INSERT INTO endereco (rua, numero, bairro, cep, cidade, estado) VALUES
    ('Av. Alexandrino de Alencar', '1800', 'Tirol', '59015-350', 'Natal', 'RN');
INSERT INTO endereco (rua, numero, bairro, cep, cidade, estado) VALUES
    ('Rua Capibaribe, 5º andar - Prédio ATI', '147', 'São José', '50020-080', 'Recife', 'PE');

-- Hemocentros
INSERT INTO hemocentro (nome, regiao, telefone, horario_funcionamento, outros_canais, site, endereco_id) VALUES
    ('HEMOPI - Centro de Hematologia e Hemoterapia do Piauí', 'Nordeste', '(86) 2221-0019', 'De segunda a sexta, das 8h às 18h. Sábado, das 7h15 às 17h', NULL, 'https://www.hemopi.pi.gov.br/agendamento/', 1);
INSERT INTO hemocentro (nome, regiao, telefone, horario_funcionamento, outros_canais, site, endereco_id) VALUES
    ('HEMOCE - Centro de Hematologia e Hemoterapia do Ceará', 'Nordeste', '(85) 3101-2293', 'De segunda a sexta, das 8h às 17h30. Sábado, das 7h às 16h', '(85) 3101-2275', 'https://doador.hemoce.ce.gov.br/', 2);
INSERT INTO hemocentro (nome, regiao, telefone, horario_funcionamento, outros_canais, site, endereco_id) VALUES
    ('HEMOBA - Fundação de Hematologia e Hemoterapia da Bahia', 'Nordeste', '(71) 3116-5690', 'De segunda a sexta, das 8h às 17h', NULL, NULL, 3);
INSERT INTO hemocentro (nome, regiao, telefone, horario_funcionamento, outros_canais, site, endereco_id) VALUES
    ('HEMOAL - Centro de Hematologia e Hemoterapia de Alagoas', 'Nordeste', '(82) 3326-9854', 'De segunda a sexta, das 8h às 17h', NULL, NULL, 4);
INSERT INTO hemocentro (nome, regiao, telefone, horario_funcionamento, outros_canais, site, endereco_id) VALUES
    ('HEMOSE - Centro de Hemoterapia de Sergipe', 'Nordeste', '(79) 3225-8003', 'De segunda a sexta, das 8h às 17h', '(79) 3225-8002', NULL, 5);
INSERT INTO hemocentro (nome, regiao, telefone, horario_funcionamento, outros_canais, site, endereco_id) VALUES
    ('HEMOÍBA - Centro de Hematologia e Hemoterapia da Paraíba', 'Nordeste', '(83) 3133-3470', 'De segunda a sexta, das 8h às 17h', '(83) 3133-3413', NULL, 6);
INSERT INTO hemocentro (nome, regiao, telefone, horario_funcionamento, outros_canais, site, endereco_id) VALUES
    ('HEMOMAR - Centro de Hematologia e Hemoterapia do Maranhão', 'Nordeste', '(98) 3216-1139', 'De segunda a sexta, das 8h às 17h', '(98) 3216-1100', NULL, 7);
INSERT INTO hemocentro (nome, regiao, telefone, horario_funcionamento, outros_canais, site, endereco_id) VALUES
    ('HEMONORTE - Centro de Hematologia e Hemoterapia do Rio Grande do Norte', 'Nordeste', '(84) 3232-6701', 'De segunda a sexta, das 8h às 17h', NULL, NULL, 8);
INSERT INTO hemocentro (nome, regiao, telefone, horario_funcionamento, outros_canais, site, endereco_id) VALUES
    ('HEMOPE - Fundação de Hematologia e Hemoterapia de Pernambuco', 'Nordeste', '(81) 3182-4912', 'De segunda a sexta, das 8h às 17h', NULL, NULL, 9);

-- Relatos
INSERT INTO relato (nome_autor, tipo_sanguineo, texto_relato, data_criacao, hemocentro_id) VALUES
    ('Maria Júlia de Castro', 'O+', 'Ver a bolsa sendo preenchida me enche de gratidão. Sei que em algum lugar, uma pessoa vai receber uma segunda chance.', '2026-01-15 10:30:00', 1);

INSERT INTO relato (nome_autor, tipo_sanguineo, texto_relato, data_criacao, hemocentro_id) VALUES
    ('João Pedro Almeida', 'A+', 'Comecei a doar depois que minha avó precisou de transfusão. Hoje é um compromisso mensal na minha vida.', '2026-01-20 14:15:00', 1);

INSERT INTO relato (nome_autor, tipo_sanguineo, texto_relato, data_criacao, hemocentro_id) VALUES
    ('Ana Beatriz Souza', 'AB-', 'Sou doadora rara e isso me faz sentir ainda mais responsável. Cada doação minha pode ser essencial para alguém.', '2026-02-03 09:00:00', 2);

INSERT INTO relato (nome_autor, tipo_sanguineo, texto_relato, data_criacao, hemocentro_id) VALUES
    ('Carlos Eduardo Lima', 'O-', 'Doador universal aqui! Já perdi a conta de quantas vezes doei, mas cada vez é gratificante como a primeira.', '2026-02-10 16:45:00', 2);

INSERT INTO relato (nome_autor, tipo_sanguineo, texto_relato, data_criacao, hemocentro_id) VALUES
    ('Fernanda Costa', 'B+', 'No início tinha medo de agulha, hoje incentivo todos os meus amigos a doarem também. É rápido e salva vidas.', '2026-02-18 11:20:00', 3);

INSERT INTO relato (nome_autor, tipo_sanguineo, texto_relato, data_criacao, hemocentro_id) VALUES
    ('Rafael Santos', 'A-', 'Minha esposa precisou de sangue no parto e isso mudou minha perspectiva sobre doação. Agora sou doador frequente.', '2026-03-01 08:30:00', 1);

INSERT INTO relato (nome_autor, tipo_sanguineo, texto_relato, data_criacao, hemocentro_id) VALUES
    ('Juliana Pereira', 'B-', 'Doar sangue é um dos atos mais simples e poderosos que podemos fazer. Recomendo a todos que possam.', '2026-03-12 13:00:00', 2);

INSERT INTO relato (nome_autor, tipo_sanguineo, texto_relato, data_criacao, hemocentro_id) VALUES
    ('Pedro Henrique Oliveira', 'AB+', 'Já são 10 doações e pretendo continuar. É emocionante saber que ajudei pessoas que nunca vou conhecer.', '2026-03-25 15:30:00', 3);

INSERT INTO relato (nome_autor, tipo_sanguineo, texto_relato, data_criacao, hemocentro_id) VALUES
    ('Camila Rodrigues', 'O+', 'Levei meus filhos para verem o processo de doação. Quero que eles cresçam entendendo a importância desse gesto.', '2026-04-02 10:00:00', 1);