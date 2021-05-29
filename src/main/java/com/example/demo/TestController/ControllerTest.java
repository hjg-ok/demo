package com.example.demo.TestController;

import com.example.demo.Domin.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.HashMap;

@Controller
@ResponseBody
public class ControllerTest {
    /**
     *
     */
    @PostMapping(value = "/testPost")

    public String test(@RequestBody String user) {
//        HashMap<String,String> map= new HashMap();
//        map.put("user",u.getUser());
//        map.put("pwd",u.getPwd());
//        System.out.println(u.getPwd());
//        System.out.println(u.getUser());
        System.out.println("user:" + user);
//        System.out.println("pwd:"+pwd);
        return "hello";
    }

    public String testGit(User user) {
        System.out.println("user:" + user);
        System.out.println("test Spring Git");
        return "Spring Git";
    }

}
