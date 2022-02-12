package com.glxt.controller;

import com.glxt.pojo.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
@CrossOrigin
public class validateLogon {

    @PostMapping("/vir")
    public int login(@RequestBody User user) {
        System.out.println(user.toString());
        if (user.getUsername().equals("admin") && user.getPassword().equals("123456") && user.getValue().equals("0"))
        {
            System.out.println("YES!");
            return 200;
        }
        System.out.println("NO!");
        return 400;
    }

    @GetMapping("/dir")
    public String iii() {
        return "Amd Yes!";
    }
}
