CREATE DATABASE IF NOT EXISTS piobed;
USE piobed;

CREATE TABLE IF NOT EXISTS movie (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    category VARCHAR(255) NOT NULL,
    release_year INT,
    is_available BOOLEAN NOT NULL DEFAULT FALSE,
    PRIMARY KEY (id)
);

INSERT INTO movie (name, category, release_year, is_available)
VALUES
('Inception', 'SCI_FI', 2010, false),
('Shrek', 'ANIMATION', 2001, false),
('The Godfather', 'DRAMA', 1972, true),
('Interstellar', 'SCI_FI', 2014, false),
('Forrest Gump', 'DRAMA', 1994, true);

SELECT * FROM movie;
