package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// указываем, что это конфигурация
@Configuration
// включаем MVC
@EnableWebMvc
// указываем пакет где находятся другие Spring Bean, контроллеры, ApplicationContext, DispatcherServlet
// поиск осуществляется в этом пакете
@ComponentScan(basePackages = "app")

public class WebConfig implements WebMvcConfigurer {

    @Bean (name = "viewResolver")
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        // указываем, где будут находиться веб-страницы
        resolver.setPrefix("/WEB-INF/");
        // указываем формат View, который будет использоваться
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
