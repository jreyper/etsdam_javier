

# UT1-A3 Practicando Git

***Nombre:*** Javier
***Curso:*** 1ºDAM 

### ÍNDICE

+ [Introducción](#id1)
+ [Objetivos](#id2)
+ [Material empleado](#id3)
+ [Desarrollo](#id4)
+ [Conclusiones](#id5)


#### ***Introducción***. <a name="id1"></a>

Esta práctica muestra el uso básico de Git mediante la creación de un repositorio, gestión de ramas,
uso de tags, resolución de conflictos y configuración de archivos ignorados.

#### ***Objetivos***. <a name="id2"></a>

Los objetivos que buscamos son practicar con Git y la terminal.

#### ***Material empleado***. <a name="id3"></a>

En esta práctica para realizarla se ha empleado una cuenta en github, acceso a internet, una maquina virtual con 
el sistema operativo linux, un editor de texto como "nano" o "vi",ficheros y carpetas creadas en el proceso,
ramas, tags,comandos,etc.... 

#### ***Desarrollo***. <a name="id4"></a>

Primero saco la clave ssh ya que no habia trabajado antes en esta maquina y la pegue en github.

<img src="img/img1ssh.jpeg">

Seguidamente cloné el repositorio de "my-proyecto" y el de "etsdam_javier"
añadí el archivo README.md en el repositorio de etsdam_javier.

<img src="img/img2 clone.jpeg">
<img src="img/img3 clone2.jpeg">

Hecho todo eso creé el fichero que pedía llamado privado.txt y una carpeta llamada privada las cuales después había que añadirlas al fichero .gitignore y aparecen en el repositorio.

<img src="img/img5 privado.jpeg">

Después había que crear otro fichero llamado 1.txt en el que pornerle "Hola".

<img src="img/img6 txt1.jpeg">

Segudamente crear otra rama y poner "adios" en el mismo fichero lo que dio un conflicto ya después solucionado con unos comandos.

<img src="img/img7 tag.jpeg">
<img src="img/img8 merge.jpeg">
<img src="img/img9 conflicto.jpeg">

Después te pedía el listado de ramas

<img src="img/img10 lista merge.jpeg">

Y finalmente te pedia que eliminaras la rama

<img src="img/img11 eliminacion rama.jpeg">



> ***IMPORTANTE:*** si estamos capturando una terminal no hace falta capturar todo el escritorio y es importante que se vea el nombre de usuario.

En esta práctica he tenido varios problemas pero los he solucionado como por ejemplo que puse el archivo README.md en una carpeta que no iba y lo tuve que quitar usando el comando "rm -r 'archivo'"
y moviendolo a la otra carpeta correspondiente con el comando "mv~/'ubicacion'". 

#### ***Conclusiones***. <a name="id5"></a>

En esta práctica me ha ayudado a practicar y recordar comandos lo que me va a facilitar la asignatura mucho más y aunque haya tenido poco tiempo para hacer esta práctica creo que me ha servido mucho. 
