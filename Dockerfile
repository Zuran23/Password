# Use openjdk base image
FROM openjdk:23

# Set the working directory to /app
WORKDIR /app

# Copy all files from the src directory into the container's /app directory
COPY src/ /app/

# Compile all Java files inside the /app directory
RUN javac *.java

# Set the default command to run the Java program (assuming you want to run HelloWorld)
CMD ["java", "HelloWorld"]

FROM openjdk:23
WORKDIR /app
COPY src/ /app/
RUN javac *.java
CMD ["java", "HelloWorld"]
