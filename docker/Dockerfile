# Use uma imagem base com Java 21
FROM openjdk:21-jdk-slim as build

# Defina o diretório de trabalho
WORKDIR /app

# Copie o arquivo pom.xml e baixe as dependências
COPY pom.xml .
COPY src ./src
RUN ./mvnw clean package -DskipTests

# Etapa de execução
FROM openjdk:21-jdk-slim

# Copie o JAR gerado para a nova imagem
COPY --from=build /app/target/*.jar app.jar

# Exponha a porta que sua aplicação usará
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "/app.jar"]