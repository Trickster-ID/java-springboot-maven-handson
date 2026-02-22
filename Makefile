run:
	mvn spring-boot:run

run-docker:
	docker-compose up -d

kill-docker:
	docker-compose down