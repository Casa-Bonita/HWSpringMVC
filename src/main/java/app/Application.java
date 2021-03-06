package app;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class Application implements WebApplicationInitializer {

//    3. Создать Spring MVC приложение.
//    Создать главную страницу интернет-магазина с меню:
//    - бытовая техника;
//    - компьютеры и ноутбуки;
//    - смартфоны.
//
//    При клике на ссылку "бытовая техника" должна открываться страница с текстом "Раздел бытовой техники".
//    При клике на ссылку "компьютеры и ноутбуки" должна открываться страница с текстом "Раздел компьютеры и ноутбуки".
//    При клике на ссылку "смартфоны" должна открываться страница с текстом "Раздел смартфоны".

    public void onStartup(ServletContext servletContext) throws ServletException{
        // создаём конфигурацию
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        // регистрируем конфигурацию, созданную выше
        context.register(WebConfig.class);

        // создаём Dispatcher Servlet
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        // настраиваем маппинг (связывание)
        dispatcher.addMapping("/");
        // указываем, что при загрузке сервлет запустится первым
        dispatcher.setLoadOnStartup(1);

    }
}
