package app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// данная аннотация определяет класс как контроллер Spring MVC
public class Index_controller {

    @GetMapping("/")
    // данная аннотация используется для маппинга (связывания) с URL всего класса Index_controller
    // т.е. весь класс (все методы в данном Контроллере) относятся к URL-адресу "/".
    public String index(){
        return "index";
    }
}
