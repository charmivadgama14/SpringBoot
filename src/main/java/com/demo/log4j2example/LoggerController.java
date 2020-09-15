package com.demo.log4j2example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoggerController {

    private static final Logger logger = LogManager.getLogger(LoggerController.class);

    @GetMapping("/")
    public String main(Model model) {

        logger.debug("This gives the logger debug");
        logger.info("This gives the logger info");
        logger.warn("This gives the logger warn");
        logger.error("This gives the logger error");

        return "welcome";   
        }
    }


