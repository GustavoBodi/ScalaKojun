# Use an official Scala runtime as a parent image
FROM oarkflow/clear-sbt
# Set the working directory to /app
WORKDIR /app
# Copy the current directory contents into the container at /app
COPY . /app
# Compile the Scala code
RUN sbt run
