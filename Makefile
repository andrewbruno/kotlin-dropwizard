.PHONY: build test run clean

build:
	mvn clean package

test:
	mvn test

run:
	java -jar target/kotlin-dropwizard-1.0.0.jar server config.yml

clean:
	mvn clean
