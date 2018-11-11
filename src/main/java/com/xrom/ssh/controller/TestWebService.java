package com.xrom.ssh.controller;


import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class TestWebService {
    public String getNameV(String name){
        return "大家好，我是："+name;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8081/Service/Service/TestWebService",new TestWebService());
        System.out.println("success!");
    }
}
