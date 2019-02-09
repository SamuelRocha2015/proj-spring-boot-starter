package br.com.codenation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExemploController {

    @GetMapping("/")
    @ResponseBody
    public String home(){
        return "Primeiro exemplo usando Spring boot";
    }


    @GetMapping("/exemplo")
    @ResponseBody
    public String exemplo(){
        return "Mais um exemplo com Spring boot";
    }


}
