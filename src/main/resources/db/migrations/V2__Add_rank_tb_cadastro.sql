-- V2: Migrations para adicionar a coluna de Rank na tabela de Cadastro

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);
