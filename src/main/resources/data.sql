INSERT INTO categoria (nome) VALUES ('Capacetes');
INSERT INTO categoria (nome) VALUES ('Jaquetas e Equipamentos de Proteção');
INSERT INTO categoria (nome) VALUES ('Luvas');
INSERT INTO categoria (nome) VALUES ('Botas e Calçados');
INSERT INTO categoria (nome) VALUES ('Peças de Motor');
INSERT INTO categoria (nome) VALUES ('Pneus e Rodas');
INSERT INTO categoria (nome) VALUES ('Sistema de Freios');
INSERT INTO categoria (nome) VALUES ('Escapamentos');
INSERT INTO categoria (nome) VALUES ('Filtros');
INSERT INTO categoria (nome) VALUES ('Óleos e Lubrificantes');
INSERT INTO categoria (nome) VALUES ('Bateria e Sistema Elétrico');
INSERT INTO categoria (nome) VALUES ('Acessórios');
INSERT INTO categoria (nome) VALUES ('Bagageiros e Alforjes');
INSERT INTO categoria (nome) VALUES ('Ferramentas e Manutenção');
INSERT INTO categoria (nome) VALUES ('Iluminação');

-- Categoria 1: Capacetes
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Capacete AGV K1', 'Modelo esportivo com grafismos do Valentino Rossi.', 1399.90, 'AGV', 1);
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Capacete Norisk Razor', 'Capacete articulado ideal para uso urbano e viagens.', 749.50, 'Norisk', 1);

-- Categoria 2: Jaquetas e Equipamentos de Proteção
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Jaqueta X11 Iron 2', 'Jaqueta impermeável com forro térmico removível e proteções CE.', 899.00, 'X11', 2);
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Protetor de Coluna Alpinestars Nucleon', 'Protetor nível 2 para máxima segurança em pilotagem.', 650.00, 'Alpinestars', 2);

-- Categoria 3: Luvas
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Luva Alpinestars SP-8 V3', 'Luva de couro cano longo para pilotagem esportiva.', 599.90, 'Alpinestars', 3);
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Luva X11 Fit X', 'Luva cano curto ventilada para o dia a dia.', 149.00, 'X11', 3);

-- Categoria 4: Botas e Calçados
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Bota Alpinestars SMX-6 V2', 'Bota esportiva com alta proteção contra torção e impacto.', 1899.00, 'Alpinestars', 4);
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Tênis para Motociclista X11 Stage', 'Tênis casual com proteções para uso urbano.', 450.00, 'X11', 4);

-- Categoria 5: Peças de Motor
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Kit de Pistão e Anéis KMP', 'Kit para motor de Honda CG 150, alta durabilidade.', 250.80, 'KMP', 5);
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Vela de Ignição NGK Iridium', 'Vela de alta performance para melhor queima de combustível.', 89.90, 'NGK', 5);

-- Categoria 6: Pneus e Rodas
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Pneu Traseiro Michelin Pilot Street 2', 'Pneu 140/70-17 para motos de média cilindrada.', 550.00, 'Michelin', 6);
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Par de Rodas de Liga Leve Scud', 'Rodas modelo 6 pontas para Honda Titan 160.', 850.00, 'Scud', 6);

-- Categoria 7: Sistema de Freios
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Pastilha de Freio Cobreq Racing', 'Pastilha de composto cerâmico para alta performance.', 120.50, 'Cobreq', 7);
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Disco de Freio Esportivo Margarida', 'Disco de freio com design para melhor dissipação de calor.', 320.00, 'Scud', 7);

-- Categoria 8: Escapamentos
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Escapamento Esportivo Dore', 'Ponteira em alumínio com som grave e esportivo.', 480.00, 'Dore', 8);
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Escapamento Completo Power Core 4', 'Sistema completo de escapamento para motos off-road.', 1500.00, 'Pro Tork', 8);

-- Categoria 9: Filtros
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Filtro de Ar Esportivo K&N', 'Filtro de ar lavável de alto fluxo para ganho de potência.', 350.00, 'K&N', 9);
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Filtro de Óleo Fram', 'Filtro de óleo de alta qualidade para Yamaha Fazer 250.', 45.00, 'Fram', 9);

-- Categoria 10: Óleos e Lubrificantes
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Óleo Motul 5100 15W50 Semissintético', 'Óleo lubrificante de 1 litro para motores 4T.', 75.90, 'Motul', 10);
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Graxa Spray para Corrente C4 Motul', 'Lubrificante de corrente de alta aderência (Chain Lube).', 85.00, 'Motul', 10);

-- Categoria 11: Bateria e Sistema Elétrico
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Bateria Moura 7Ah selada', 'Bateria selada com tecnologia AGM, livre de manutenção.', 199.00, 'Moura', 11);
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Relé de Pisca Eletrônico', 'Relé para piscas de LED com ajuste de velocidade.', 55.00, 'Stallion', 11);

-- Categoria 12: Acessórios
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Suporte de Celular com Carregador USB', 'Suporte de guidão em alumínio com porta USB para carregar o celular.', 129.90, 'GUB', 12);
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Antena Corta Pipa Retrátil', 'Antena de segurança para proteção do motociclista.', 35.00, 'Jojafer', 12);

-- Categoria 13: Bagageiros e Alforjes
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Bauleto Givi 45 Litros', 'Baú traseiro com capacidade para dois capacetes.', 499.00, 'Givi', 13);
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Alforje Lateral em Couro Sintético', 'Par de bolsas laterais com 20 litros cada.', 380.00, 'Universal Parts', 13);

-- Categoria 14: Ferramentas e Manutenção
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Kit de Ferramentas para Moto', 'Estojo com 28 peças essenciais para pequenos reparos.', 159.90, 'EDA', 14);
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Cavalete Central para Manutenção', 'Suporte para levantar a roda traseira da moto.', 220.00, 'Coyote', 14);

-- Categoria 15: Iluminação
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Lâmpada de Farol Super LED H4', 'Lâmpada com luz branca de 8000K para melhor visibilidade.', 99.90, 'Stallion', 15);
INSERT INTO produto (nome, descricao, preco, fabricante, fk_categoria_id) VALUES ('Farol de Milha Auxiliar LED U7', 'Par de faróis auxiliares com função strobo e angel eyes.', 180.00, 'Universal Parts', 15);