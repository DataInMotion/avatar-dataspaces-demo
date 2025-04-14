FROM eclipse-temurin:17-jre-alpine

ENV USERNAME=avatar \
	HOME_DIR=/avatar \
	OPT_DIR=/opt/avatar \
	GECKO_VERSION=2.0.0

RUN mkdir -p ${OPT_DIR} && \
    mkdir -p ${OPT_DIR}/logs && \
    mkdir -p /tmp

COPY /content/ ${OPT_DIR}/

RUN mkdir ${HOME_DIR}

RUN addgroup -g 7743 -S ${USERNAME} && \
    adduser -u 7743 -h ${HOME_DIR} -s /bin/false -S ${USERNAME} -G ${USERNAME}

RUN chown -R ${USERNAME} ${OPT_DIR} && \
    chmod -R u+rwx ${OPT_DIR} && \
    chown -R ${USERNAME} /tmp && \
    chmod -R u+rw /tmp

RUN cd ${OPT_DIR}

VOLUME ${HOME_DIR}

EXPOSE 9032/tcp 
EXPOSE 9032/udp 
WORKDIR ${OPT_DIR}
USER ${USERNAME}

CMD ["java", "-Dgosh.args=--nointeractive", "-Dgecko.data.dir=/opt/avatar/runtime/data", "-Dgecko.conf.dir=/opt/avatar/runtime/etc", "-Dgecko.base.dir=/opt/avatar", "-Dgecko.log.dir=/opt/avatar/runtime/log", "-Dlogback.configurationFile=file:/opt/avatar/runtime/etc/logback.xml",  "-jar", "de.avatar.connector.isma.provider.jar"]

