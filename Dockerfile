FROM helidon/jdk11-graalvm-maven:21.0.0 AS build

WORKDIR /app

ADD pom.xml .
ADD src src
RUN mvn -Pnative-image package

FROM scratch
WORKDIR /app

COPY --from=build /app/target/graal-logger .

ENTRYPOINT ["./graal-logger"]
