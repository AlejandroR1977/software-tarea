# Ingeniería de Software I

![](https://img.shields.io/github/stars/pandao/editor.md.svg) ![](https://img.shields.io/github/forks/pandao/editor.md.svg) ![](https://img.shields.io/github/tag/pandao/editor.md.svg) ![](https://img.shields.io/github/release/pandao/editor.md.svg) ![](https://img.shields.io/github/issues/pandao/editor.md.svg) ![](https://img.shields.io/bower/v/editor.md.svg)

### = Tarea [Base de Datos] =

------------

### Instrucciones
Implementar las clases, ya sea abstracta o interface, para manipular dos bases de datos:

1.- MariaDB
2.- MySQL

Definir los métodos comunes
Definir los métodos distintos

>La idea es que se pueda reemplazar la base de datos sin hacer cambios en los lugares donde se use una instancia de base de datos

------------

##### Integrantes
- Albino Espindola Jesus David
- Fontes Fernandez Alejandro
- Juvera Rodriguez Walter Alejandro
- López López Pedro Antonio
- Ulloa Mada Daniel Elias

------------
####Desarrollo
Para el desarrollo de la actividad se utilizo el lenguaje de programación Java donde se creo una clase abstracta llamada Basedatos que sirve como plantilla para establecer los métodos y atributos generales que las clases MySQL y MariaDB deben implementar.

------------
####Requisitos
- Java
- Docker
------------

####Ejecución
1. Clonamos el repositorio
2. Abrimos la terminal y los desplazamos hacia el directorio donde se encuentre el proyecto.
3. Nos aseguramos de que el archivo "init.sql" este en la misma carpeta que el archivo "docker-compose.yml"
4. Ejecutamos el siguiente comando: `$ docker-compose up -d`
5. Corremos el código con el editor de código de nuestra preferencia.

------------

##### Base de Datos [unison]
La base de datos "unison" unicamente contiene una sola tabla llamada "alumno"

##### Tabla [alumno]

| id      | nombre | apellido |
| --------- | -----:| |
| 1  | Jesus | Albino | 
| 2  | Alejandro | Fontes |
| 3  | Alejandro | Juvera |
| 4  | Pedro | Lopez |
| 5  | Daniel | Ulloa |
