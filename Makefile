fmt:

	mvn com.spotify.fmt:fmt-maven-plugin:format

kafka-run:

	cd src/main/docker && docker compose -f docker-compose-kafka.yml up -d
	cd src/main/docker && docker compose -f docker-compose-axonserver-se.yml up -d