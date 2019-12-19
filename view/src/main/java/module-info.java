/**
 * @author edward.reyes
 */open module view {

    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.boot.starter.logging;
    requires spring.context;
    requires spring.core;
    requires spring.beans;

    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.web;
    requires logic;


}