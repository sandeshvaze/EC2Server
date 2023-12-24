#!/usr/bin/env sh

echo "Running entry point script"
java -jar target/EC2Server-0.0.1-SNAPSHOT.jar.jar

# now wait infinitely for a "docker stop", that should be the only way to stop this container
while sleep 1
do
  echo waiting for this container to be terminated
  # if needed, launch your app again (in case it has been terminated and not relaunched automatically)
  
done

