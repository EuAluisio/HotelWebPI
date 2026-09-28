CREATE DATABASE IF NOT EXISTS hotelwebpi;
USE hotelwebpi;

CREATE TABLE cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);

CREATE TABLE quarto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(50) NOT NULL,
    preco DECIMAL(10,2) NOT NULL
);

CREATE TABLE reserva (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente_id INT NOT NULL,
    quarto_id INT NOT NULL,
    data_entrada DATE NOT NULL,
    data_saida DATE NOT NULL,

    CONSTRAINT fk_cliente
        FOREIGN KEY (cliente_id)
        REFERENCES cliente(id),

    CONSTRAINT fk_quarto
        FOREIGN KEY (quarto_id)
        REFERENCES quarto(id)
);

INSERT INTO cliente (nome, email)
VALUES
('Aluísio', 'aluisio@email.com'),
('Maria', 'maria@email.com');

INSERT INTO quarto (tipo, preco)
VALUES
('Standard', 150.00),
('Luxo', 300.00),
('Suíte Master', 500.00);

INSERT INTO reserva (
    cliente_id,
    quarto_id,
    data_entrada,
    data_saida
)
VALUES
(1, 3, '2026-09-15', '2026-09-20');