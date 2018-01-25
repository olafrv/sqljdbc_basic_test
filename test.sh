
# JDK 8
# classpath=".:sqljdbc42.jar"

# JDK 7
classpath=".:sqljdbc41.jar"

# JDK 6
# classpath=".:sqljdbc4.jar"

# $1=ip $2=port $3=user $4=password $5=database
javac -cp "$classpath" test.java && java -cp "$classpath" test $1 $2 $3 $4 $5

