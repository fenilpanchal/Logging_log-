package com.example.log.Controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogController {
    @GetMapping("/log")
    public String logExample() {
        log.info("Info log");
        log.debug("Debug log");
        log.trace("Trace log");
        log.warn("Warning log");
        log.error("Error log");
        return "The API is working in console ! ";
    }

}
