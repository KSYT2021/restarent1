package com.yts.restarent1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fd")
public class Restarent1Controller {

    @GetMapping("")
    String welcomeMsz(){
        return "welcome to fd services";
    }
}
