package app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// данная аннотация определяет класс как контроллер Spring MVC
public class HA_controller {

    @GetMapping("/ha")
    // данная аннотация используется для маппинга (связывания) с URL всего класса HA_controller
    // т.е. весь класс (все методы в данном Контроллере) относятся к URL-адресу "/ha".
    public String home_appliances(){
        return "home_appliances";
    }
}
