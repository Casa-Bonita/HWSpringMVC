package app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PC_controller {

    @GetMapping("/pc")
    public String personal_computers(){
        return "pc";
    }
}
