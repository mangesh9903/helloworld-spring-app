package com.bridgelabz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**********************************************
 * class :- Rest Controller Class
 * @author Mangesh
 * @date 30-05-2022
 *
 *********************************************/

@RequestMapping("/api/v1")
@RestController
public class UserController {

    /**
     * Method :- Method to Get Data
     * URL :- http://localhost:8081/api/v1/getData
     *
     * @return Returning ( Hello From BridgeLabz. ) message.
     */
    @GetMapping("/getData")
    public String sayHello() {
        return " Hello From BridgeLabz.";
    }

}
