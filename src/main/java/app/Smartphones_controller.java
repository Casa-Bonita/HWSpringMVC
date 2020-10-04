package app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Smartphones_controller {

    @GetMapping("/smart")
    public String smartphones(){
        return "smartphone";
    }
}
