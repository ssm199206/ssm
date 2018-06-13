
package com.jiyun.sys.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lishan on 2018/6/13.
 */
@Controller
public class UserController {

    @RequestMapping("/test")
    public String test1(){
        System.out.println("111");
        return null;
    }
}
