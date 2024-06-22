# Use uma imagem base do OpenJDK 17.0.9 LTS para o Java
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o arquivo JAR do Spring Boot para o diretório de trabalho no contêiner
COPY target/core-1.0.0-jar-with-dependencies.jar /app/core-1.0.0-jar-with-dependencies.jar

# Comando para executar o aplicativo Spring Boot quando o contêiner iniciar
CMD ["java", "-jar", "core-1.0.0-jar-with-dependencies.jar"]