package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World";
    }

    @RequestMapping("/richardson")
    public @ResponseBody String greetingFulano() {
        return "Hello, Richardson Silva Lima dos Santos!";
    }

    @RequestMapping("/hotfix")
    public @ResponseBody String hotfix() {
        return "hotfix";
    }

}
