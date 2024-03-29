package com.websocket.demo.controller;

import com.websocket.demo.model.User;
import com.websocket.demo.model.UserResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @SendTo("/topic/user")
    @MessageMapping("/hello")
    public UserResponse userResponse(User user){
        return new UserResponse("Hello " + user.getName());
    }
//    public UserResponse getUser(User user){
//        return new UserResponse("Hello " + user.getName());
//    }
}
