fmt:

	mvn com.spotify.fmt:fmt-maven-plugin:format

run-axon:

	cd src/main/docker/ && docker compose -f docker-compose-axonserver-se.yml up