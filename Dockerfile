# Imagen base oficial de OpenJDK publicada por Microsoft
FROM mcr.microsoft.com/openjdk/jdk:21-ubuntu AS base

# Directorio de trabajo dentro del contenedor
WORKDIR /app
EXPOSE 3001

#Agregar .jar compilado al contendor
ADD build/libs/maestria-inventario-0.0.1-SNAPSHOT.jar inventario-docker.jar

# Comando de arranque del microservicio
ENTRYPOINT ["java", "-jar", "/app/inventario-docker.jar"]
