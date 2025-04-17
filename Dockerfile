# Usar uma imagem base do OpenJDK
FROM ubuntu/jre:21-24.04_stable as build

# Definir o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copiar o arquivo pom.xml e o wrapper do Maven
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn

# Copiar a pasta src
COPY src ./src

# Garantir que o wrapper do Maven tenha permissões de execução
RUN chmod +x mvnw

# Executar o Maven para compilar o projeto
RUN ./mvnw clean package -DskipTests

# Usar uma imagem base do JRE para executar o aplicativo
FROM ubuntu/jre:21-24.04_stable

# Definir o diretório de trabalho
WORKDIR /app

# Copiar o JAR gerado do estágio de build
COPY --from=build /app/target/your-app.jar app.jar

# Comando para executar o aplicativo
CMD ["java", "-jar", "app.jar"]