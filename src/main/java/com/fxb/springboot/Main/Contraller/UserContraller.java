package com.fxb.springboot.Main.Contraller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/UserContraller")
public class UserContraller {


    @RequestMapping("/HelloSpringBoot")
    @ResponseBody
    public String HelloSpringBoot(){
        System.out.println("======hello world=======");
        return "HelloSpringBoot2";

    }

}
