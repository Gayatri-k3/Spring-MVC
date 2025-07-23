package com.xworkz.summer.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SummerInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SummerConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/submit", "/name"};
    }
}
