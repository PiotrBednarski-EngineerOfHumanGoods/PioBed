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
INSERT INTO movie (name, category, release_year, is_available) VALUES ('Interstellar', 'Sci-Fi', 2014, false);
INSERT INTO movie (name, category, release_year, is_available) VALUES ('The Godfather', 'Crime', 1972, false);
INSERT INTO movie (name, category, release_year, is_available) VALUES ('Shrek', 'Animation', 2001, false);
