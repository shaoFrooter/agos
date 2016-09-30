package feng.mvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by sfeng on 2016/9/30.
 */
//public class HelloWorldInitializer implements WebApplicationInitializer {
//
//    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
//        AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext();
//
//        ctx.register(HelloWorldConfiguration.class);
//        ctx.setServletContext(servletContext);
//
//        ServletRegistration.Dynamic servlet=servletContext.addServlet("dispatcher",new DispatcherServlet(ctx));
//        servlet.setLoadOnStartup(1);
//        servlet.addMapping("/");
//    }
//}

public class HelloWorldInitializer{

        }
