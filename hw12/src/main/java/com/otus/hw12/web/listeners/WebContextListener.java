package com.otus.hw12.web.listeners;

import com.otus.hw12.connector.DbConnector;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class WebContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        DbConnector.connect();
    }

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        DbConnector.disconnect();
    }
}
