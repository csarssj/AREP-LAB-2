#  Calculadora web

## Manual de usuario

Si se deseea hacer uso del programa lo primero que debe realizarse el clonar el repositorio almacenado en Github a través del siguiente comando:

```
git clone https://github.com/csarssj/ARREP-LAB-2.git

```
O si desea puede descargarlo como archivo zip y luego descomprimirlo en la carpeta que desee.

Una vez hecho alguno de los dos pasos anteriores, nos dirigimos a la ruta de instalación y por medio de la consola digitamos el siguiente comando:

```
mvn package

```

![image](https://github.com/csarssj/AREP-LAB-1/blob/master/resources/compilado.png)



Una vez compilado el programa esta listo para su uso, el último paso es ejecutar el programa por medio del siguiente comando en consola:

(primero ubicarse en la carpeta "miprimera-app" con el comando cd miprimera-app"

```
java -cp target/miprimera-app-1.0-SNAPSHOT.jar edu.escuelaing.arem.ASE.app.App "Ruta del archivo" 

en este ejemplo la ruta del archivo simplemente ese numeros.txt

```

A continuación un ejemplo:

![image](https://github.com/csarssj/AREP-LAB-1/blob/master/resources/compilado.png)



### Prerequisitos

Este proyecto necesita tener los siguientes progamas instalados en la máquina donde se deseea ejecutar:

```
  java version "1.8.0_251"
  Apache Maven 3.6.3
  git version 2.25.0.windows.1
  jdk1.8.0_251
```

El sistema, mas alla de facilitar el registro de las iniciativas e ideas de proyectos, es una valiosa base de conocimiento donde los diferentes actores pueden revisar si hay iniciativas, ideas o intereses similares y aunar esfuerzos para la materializacion.

### Diagrama de clases y Reporte de pruebas

[Se encuentran en este documento](https://github.com/csarssj/AREP-LAB-1/blob/master/Dise%C3%B1o.pdf)


## Construido en

* [Maven](https://maven.apache.org/) - Dependency Management

## Despliegue en heroku

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://caluladoraarem.herokuapp.com/inputdata)

## Integración continua

[![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/csarssj/AREP-LAB-2)

## Control de versiones 

[Github](https://github.com/) para el versionamiento.

## Authors

[César González](https://github.com/csarssj) 

_Fecha : 24 de enero del 2021_ 


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) 
