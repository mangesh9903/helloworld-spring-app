package com.bridgelabz.controller;

import com.bridgelabz.model.User;
import org.springframework.web.bind.annotation.*;

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

    /**
     * Method :- Method to get Data Using @RequestParam
     * URL : http://localhost:8081/api/v1/getDataUsingReqParam?name=Mangesh
     *
     * @param name passing name as input
     * @return
     */
    @GetMapping("/getDataUsingReqParam")
    public String sayHello(@RequestParam(value = "name") String name) {
        return " Hello " + name + " !";
    }

    /** Method :- Method to Get Data Using @PathVariable
     * URL : http://localhost:8081/api/v1/getDataUsingPathVariable/mangesh
     * @param name passing name as input
     * @return
     */
    @GetMapping("/getDataUsingPathVariable/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return " Hello " + name + " !";
    }

    /** Method :- Method to Add User using Post Method
     * URL : http://localhost:8081/api/v1/addUser
     * @param user passing User Object as input
     * @return
     */
    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        return " Hello "+user.getFirstName()+" "+user.getLastName()+" !";
    }
}
