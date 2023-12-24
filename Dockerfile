From openjdk:8
RUN apt-get update && \
    apt-get upgrade -y && \
    apt-get install -y git && \
    apt-get install maven -y
copy "./" /usr/sandesh/code/FirstMicro/
WORKDIR /usr/sandesh/code/FirstMicro/
CMD ["./entrypoint.sh"]
