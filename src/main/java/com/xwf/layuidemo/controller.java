package com.xwf.layuidemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

        @RequestMapping(value = "/index")
        public String getIndex() {
            return "index";
        }
}
