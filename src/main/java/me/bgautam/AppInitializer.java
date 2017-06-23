package me.bgautam;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by bishalgautam on 6/19/17.
 *
 */
public class AppInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer{


    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{Application.class, JPAConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    protected String[] getServletMappings() {
        return new String[]{"/api/*"};
    }
}
