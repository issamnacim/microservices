package org.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by issam on 2/27/18.
 */
@RestController
public class ServiceController {

    @GetMapping("Welcome")
    public String welcome(){
        return "Welcome to services 2 ";
    }


}
