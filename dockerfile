# Use official OpenJDK image
FROM openjdk:17-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Java file into the container
COPY HelloWorld.java .

# Compile the Java file
RUN javac HelloWorld.java

# Run the compiled Java class
CMD ["java", "HelloWorld"]
