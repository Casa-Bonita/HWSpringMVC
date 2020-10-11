package app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// данная аннотация определяет класс как контроллер Spring MVC
public class PC_controller {

    @GetMapping("/pc")
    // данная аннотация используется для маппинга (связывания) с URL всего класса PC_controller
    // т.е. весь класс (все методы в данном Контроллере) относятся к URL-адресу "/pc".
    public String personal_computers(){
        return "pc";
    }
}
