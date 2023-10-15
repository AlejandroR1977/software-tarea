CREATE DATABASE IF NOT EXISTS unison;
USE unison;
CREATE TABLE alumno(id INT AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(50), apellido VARCHAR(50));
INSERT INTO alumno(nombre, apellido) VALUES("Jesus", "Albino"), ("Alejandro", "Fontes"), ("Alejandro","Juvera"), ("Pedro", "Lopez"), ("Daniel", "Ulloa");
