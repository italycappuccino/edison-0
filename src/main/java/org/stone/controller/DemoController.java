package org.stone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Peter on 12/3/16.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/hi")
    public @ResponseBody String demo(){
        return "Hello World";
    }
}
