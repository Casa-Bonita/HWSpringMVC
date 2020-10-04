package app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HA_controller {

    @GetMapping("/ha")
    public String home_appliances(){
        return "home_appliances";
    }
}
