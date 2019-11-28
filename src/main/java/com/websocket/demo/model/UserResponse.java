package com.websocket.demo.model;


// Used as the message wrapper class
public class UserResponse {
    private String response;

    public UserResponse(String response) {
        this.response = response;
    }

    public UserResponse() {
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
