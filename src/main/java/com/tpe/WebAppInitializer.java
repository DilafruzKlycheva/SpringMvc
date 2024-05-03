package com.tpe;
//Java tabanlı Web uygulamaları web xml dosyası ile config edilir
//bu classı web.xml yerine kullanacağız

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//DispatcherServlet konfigurasyonu için gerekli adımları gösterir
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {//dataya erişim:Hibernate, JDBC
        return new Class[]{
                RootConfig.class

        } ;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {//viewresolver, handlermapping
        return new Class[]{
                WebMvcConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {//hangi url ile gelen istekler servlet tarafından karşılanacak ayarlaması
        return new String[]{
                "/"
        };
    }
}
