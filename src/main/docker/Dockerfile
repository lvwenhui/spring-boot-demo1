FROM java:8
#将本地文件夹挂在当前容器
VOLUME /tmp
# springboot-demo1-0.0.1-SNAPSHOT.jar 是生成jar包的名字
ADD *.jar app.jar
RUN bash -c 'touch /app.jar'

ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
