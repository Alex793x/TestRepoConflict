package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestTest {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    public String kage(String kageType){
        if (kageType.equalsIgnoreCase("Farmors Æbletærte")){
            return "Kæft en lækker kage makker, den vil jeg gerne have";
        } else {
            return "Shit, din kage sutter røv, den skal jeg ikke have....ad";
        }
    }

    public String helloWorld1() {
        return "Hello world";
    }
    public String kageComment() {
        return "ad jerg hader bare tærtekage";

    }
}
