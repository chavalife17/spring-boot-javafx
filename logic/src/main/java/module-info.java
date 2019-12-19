/**
 * @author edward.reyes
 */open module logic {
    exports com.project.logic.service.inf;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.boot.starter.data.jpa;
    requires spring.data.commons;
    requires spring.tx;
    requires spring.boot.starter.logging;
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    requires spring.data.jpa;

    requires transitive lombok;
    requires  org.slf4j;

    requires java.persistence;
    requires java.sql;
    requires java.xml.bind;
    requires net.bytebuddy;
    requires org.hibernate.orm.core;
    requires com.fasterxml.classmate;

}