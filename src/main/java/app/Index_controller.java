package app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index_controller {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}