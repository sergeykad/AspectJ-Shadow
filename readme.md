The commands below assume aspect-demo-1.0.0-SNAPSHOT.jar, aspect-demo-1.0.0-SNAPSHOT-all.jar and aspectjweaver.jar are in the current directory

To run with shadow jar: `java -javaagent:aspect-demo-1.0.0-SNAPSHOT-all.jar -jar aspect-demo-1.0.0-SNAPSHOT-all.jar`

To run with regular jars: `java -javaagent:aspectjweaver.jar -jar aspect-demo-1.0.0-SNAPSHOT.jar` 