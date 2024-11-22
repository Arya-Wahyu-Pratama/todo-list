module TodoListApp {
    requires spring.context;
    requires spring.beans;
    requires java.sql;
    requires org.slf4j;
    requires javafx.fxml;
    requires javafx.graphics;

    opens todoapp;
    opens todoapp.entities;
    opens todoapp.config;
    opens todoapp.repositories;
    opens todoapp.services;
    opens todoapp.views;
}