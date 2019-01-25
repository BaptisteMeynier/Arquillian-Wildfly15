package com.javaee8.rest;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


import javax.ws.rs.ApplicationPath;


@ApplicationPath("rest")
public class MarketApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> s = new HashSet<>();
        s.add(BookResource.class);
        return s;
    }
}
