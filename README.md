# sqljdbc_basic_test
Scripts de shell y Java para probar el controlador JDBC para Microsoft SQL Server

# Instrucciones

Descargue Controlador JDBC 6.0 de Microsoft para SQL Server (sqljdbc4x.jar):
https://www.microsoft.com/es-es/download/details.aspx?id=11774

Instale el entorno de desarroll/ejecución de Java (o use el instalado en su sistema operativo):

apt-get install openjdk-7-jdk openjdk-7-jre

Para verificar si ya existe un entorno instalado ejecute el comando "java" o "javac".

Para ejecutar la prueba use el siguiente comando en Linux:

./test.sh 192.168.1.2 1433 myuser mypassword mydb

