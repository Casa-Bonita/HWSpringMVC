package app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// данная аннотация определяет класс как контроллер Spring MVC
public class Smartphones_controller {

    @GetMapping("/smart")
    // данная аннотация используется для маппинга (связывания) с URL всего класса Smartphones_controller
    // т.е. весь класс (все методы в данном Контроллере) относятся к URL-адресу "/smart".
    public String smartphones(){
        return "smartphone";
    }
}
