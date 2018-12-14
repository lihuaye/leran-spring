package moe.emilia.learn.controller;

import moe.emilia.learn.pojo.SystemInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Home {

    private SystemInfo systemInfo;

    @Autowired
    public Home(SystemInfo systemInfo) {
        this.systemInfo = systemInfo;
    }

    @GetMapping("/info")
    public SystemInfo index() {
        return systemInfo;
    }
}
