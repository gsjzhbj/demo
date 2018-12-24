package com.example.demo;

import com.example.demo.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    IUserService userService;
    @RequestMapping("/")
    public String index(){
        try {
            String userType=userService.getUserDataByType("type");
            logger.debug(userType);
            System.out.println(userType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "info";
    }
}
