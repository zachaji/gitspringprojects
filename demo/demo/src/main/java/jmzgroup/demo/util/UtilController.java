package jmzgroup.demo.util;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilController {

    @GetMapping("/hello/world")
    public String sayHello(){
        return  "hello world";
    }
}
