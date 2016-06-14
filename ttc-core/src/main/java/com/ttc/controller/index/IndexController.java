/*
 * Copyright (c)Shanghai Easy Deal Foreign Currency Exchange Co., Ltd.
 */
package com.ttc.controller.index;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author benny
 * @date 2016/6/14
 * @description
 */
@Controller
@RequestMapping("/")
public class IndexController {

    public static Logger LOGGER= LoggerFactory.getLogger(IndexController.class);


    @RequestMapping("/index")
    public void toIndex(){
        LOGGER.debug("这个到底是为啥啊！");
    }
}
