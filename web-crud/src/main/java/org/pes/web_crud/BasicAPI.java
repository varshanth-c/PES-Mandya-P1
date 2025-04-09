package org.pes.web_crud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicAPI {
    // @GetMapping("/")
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String greetings(){
        return "Welcome To DLithe";
    }
}
