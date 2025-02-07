run : package
	java -Done-jar.main.class=com.mooreb.use_basic_stats.App -jar target/use_basic_stats-1.0-SNAPSHOT.one-jar.jar

package :
	mvn package

clean :
	mvn clean

.PHONY: run package clean
